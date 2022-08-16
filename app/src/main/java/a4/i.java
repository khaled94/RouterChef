package a4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import j4.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b */
    public static boolean f140b = false;

    /* renamed from: c */
    public static boolean f141c = false;

    /* renamed from: a */
    public static final AtomicBoolean f139a = new AtomicBoolean();

    /* renamed from: d */
    public static final AtomicBoolean f142d = new AtomicBoolean();

    public static Context a(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean b(Context context) {
        try {
            if (!f141c) {
                try {
                    PackageInfo d5 = c.a(context).d("com.google.android.gms", 64);
                    j.a(context);
                    if (d5 == null || j.d(d5, false) || !j.d(d5, true)) {
                        f140b = false;
                    } else {
                        f140b = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
            }
            return f140b || !"user".equals(Build.TYPE);
        } finally {
            f141c = true;
        }
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
