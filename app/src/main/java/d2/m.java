package d2;

import android.content.Context;
import android.os.PowerManager;
import d7.a;
import java.util.WeakHashMap;
import t1.h;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final String f3762a = h.e("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f3763b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String c10 = a.c("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, c10);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f3763b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, c10);
        }
        return newWakeLock;
    }
}
