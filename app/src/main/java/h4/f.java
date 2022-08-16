package h4;

import android.os.Build;

/* loaded from: classes.dex */
public final class f {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
