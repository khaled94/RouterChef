package h4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static Boolean f5073a;

    /* renamed from: b */
    public static Boolean f5074b;

    /* renamed from: c */
    public static Boolean f5075c;

    /* renamed from: d */
    public static Boolean f5076d;

    /* renamed from: e */
    public static Boolean f5077e;

    public static boolean a(Context context) {
        if (f5075c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f5075c = Boolean.valueOf(z10);
        }
        return f5075c.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f5073a == null) {
            f5073a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f5073a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (b(context)) {
            if (!(Build.VERSION.SDK_INT >= 24)) {
                return true;
            }
            if (d(context) && !f.a()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (f5074b == null) {
            f5074b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f5074b.booleanValue();
    }
}
