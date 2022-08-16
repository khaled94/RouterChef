package a4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.lifecycle.h0;
import com.google.android.gms.dynamite.DynamiteModule;
import d4.m;
import java.util.Objects;
import javax.annotation.Nullable;
import k4.b;

/* loaded from: classes.dex */
public final class j {
    @Nullable

    /* renamed from: c */
    public static j f143c;

    /* renamed from: a */
    public final Context f144a;

    /* renamed from: b */
    public volatile String f145b;

    public j(Context context) {
        this.f144a = context.getApplicationContext();
    }

    public static j a(Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (j.class) {
            if (f143c == null) {
                r rVar = x.f156a;
                synchronized (x.class) {
                    if (x.f160e == null) {
                        x.f160e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f143c = new j(context);
            }
        }
        return f143c;
    }

    @Nullable
    public static final t c(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (tVarArr[i10].equals(uVar)) {
                return tVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? c(packageInfo, w.f155a) : c(packageInfo, w.f155a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(int i10) {
        f0 f0Var;
        int length;
        boolean z10;
        f0 f0Var2;
        ApplicationInfo applicationInfo;
        String str;
        Throwable e10;
        a0 j12;
        String[] packagesForUid = this.f144a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            f0Var = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    m.h(f0Var);
                    break;
                }
                String str2 = packagesForUid[i11];
                String str3 = "null pkg";
                if (str2 == null) {
                    f0Var = f0.b(str3);
                } else if (!str2.equals(this.f145b)) {
                    r rVar = x.f156a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            x.b();
                            z10 = x.f158c.e();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } finally {
                        }
                    } catch (RemoteException | DynamiteModule.a e11) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        z10 = false;
                    }
                    if (z10) {
                        boolean b10 = i.b(this.f144a);
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            m.h(x.f160e);
                            try {
                                x.b();
                                try {
                                    j12 = x.f158c.j1(new y(str2, b10, false, new b(x.f160e), false));
                                } catch (RemoteException e12) {
                                    e10 = e12;
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                    str = "module call";
                                }
                            } catch (DynamiteModule.a e13) {
                                e10 = e13;
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                String valueOf = String.valueOf(e10.getMessage());
                                str = valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: ");
                            }
                            if (j12.f111s) {
                                f0Var2 = f0.f134d;
                            } else {
                                str = j12.f112t;
                                if (str == null) {
                                    str = "error checking package certificate";
                                }
                                if (h0.e(j12.f113u) == 4) {
                                    e10 = new PackageManager.NameNotFoundException();
                                    f0Var2 = f0.c(str, e10);
                                } else {
                                    f0Var2 = f0.b(str);
                                }
                            }
                        } finally {
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = this.f144a.getPackageManager().getPackageInfo(str2, 64);
                            boolean b11 = i.b(this.f144a);
                            if (packageInfo != null) {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    str3 = "single cert required";
                                } else {
                                    u uVar = new u(packageInfo.signatures[0].toByteArray());
                                    String str4 = packageInfo.packageName;
                                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        f0 a10 = x.a(str4, uVar, b11, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        if (a10.f135a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                f0 a11 = x.a(str4, uVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                if (a11.f135a) {
                                                    str3 = "debuggable release cert app rejected";
                                                }
                                            } finally {
                                            }
                                        }
                                        f0Var2 = a10;
                                    } finally {
                                    }
                                }
                            }
                            f0Var2 = f0.b(str3);
                        } catch (PackageManager.NameNotFoundException e14) {
                            f0Var = f0.c(str2.length() != 0 ? "no pkg ".concat(str2) : new String("no pkg "), e14);
                        }
                    }
                    if (f0Var2.f135a) {
                        this.f145b = str2;
                    }
                    f0Var = f0Var2;
                } else {
                    f0Var = f0.f134d;
                }
                if (f0Var.f135a) {
                    break;
                }
                i11++;
            }
        } else {
            f0Var = f0.b("no pkgs");
        }
        if (!f0Var.f135a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (f0Var.f137c != null) {
                Log.d("GoogleCertificatesRslt", f0Var.a(), f0Var.f137c);
            } else {
                Log.d("GoogleCertificatesRslt", f0Var.a());
            }
        }
        return f0Var.f135a;
    }
}
