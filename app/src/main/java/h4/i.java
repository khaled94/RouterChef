package h4;

import a4.j;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import j4.b;
import j4.c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {
    public static boolean a(Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            j a10 = j.a(context);
            Objects.requireNonNull(a10);
            if (packageInfo == null) {
                return false;
            }
            if (!j.d(packageInfo, false)) {
                if (!j.d(packageInfo, true)) {
                    return false;
                }
                if (!a4.i.b(a10.f144a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i10, String str) {
        b a10 = c.a(context);
        Objects.requireNonNull(a10);
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f5450a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
