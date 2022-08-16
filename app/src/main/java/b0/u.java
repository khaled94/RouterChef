package b0;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final Context f2461a;

    /* renamed from: b */
    public final NotificationManager f2462b;

    static {
        new HashSet();
    }

    public u(Context context) {
        this.f2461a = context;
        this.f2462b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f2462b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2461a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2461a.getApplicationInfo();
        String packageName = this.f2461a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
