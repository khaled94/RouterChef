package j4;

import android.content.Context;
import h4.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static Context f5448a;

    /* renamed from: b */
    public static Boolean f5449b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f5448a;
            if (context2 != null && (bool2 = f5449b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f5449b = null;
            if (!f.a()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f5449b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f5448a = applicationContext;
                return f5449b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f5449b = bool;
            f5448a = applicationContext;
            return f5449b.booleanValue();
        }
    }
}
