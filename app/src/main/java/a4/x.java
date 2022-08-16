package a4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import d4.j0;
import d4.k0;
import d4.l0;
import d4.m;
import e9.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import k4.b;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c */
    public static volatile l0 f158c;

    /* renamed from: e */
    public static Context f160e;

    /* renamed from: a */
    public static final r f156a = new r(t.c0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: b */
    public static final s f157b = new s(t.c0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: d */
    public static final Object f159d = new Object();

    static {
        new p(t.c0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new q(t.c0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    }

    public static f0 a(final String str, final t tVar, final boolean z10, boolean z11) {
        try {
            b();
            m.h(f160e);
            try {
                return f158c.Y1(new c0(str, tVar, z10, z11), new b(f160e.getPackageManager())) ? f0.f134d : new e0(new Callable() { // from class: a4.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z12 = z10;
                        String str2 = str;
                        t tVar2 = tVar;
                        int i10 = 0;
                        Object[] objArr = new Object[5];
                        objArr[0] = true != (!z12 && x.a(str2, tVar2, true, false).f135a) ? "not allowed" : "debug cert rejected";
                        objArr[1] = str2;
                        while (true) {
                            if (i10 >= 2) {
                                messageDigest = null;
                                break;
                            }
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-1");
                            } catch (NoSuchAlgorithmException unused) {
                            }
                            if (messageDigest != null) {
                                break;
                            }
                            i10++;
                        }
                        m.h(messageDigest);
                        objArr[2] = d.b(messageDigest.digest(tVar2.e0()));
                        objArr[3] = Boolean.valueOf(z12);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return f0.c("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            String valueOf = String.valueOf(e11.getMessage());
            return f0.c(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
        }
    }

    public static void b() {
        l0 l0Var;
        if (f158c != null) {
            return;
        }
        m.h(f160e);
        synchronized (f159d) {
            if (f158c == null) {
                IBinder b10 = DynamiteModule.c(f160e, DynamiteModule.f2945c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                int i10 = k0.f3888s;
                if (b10 == null) {
                    l0Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    l0Var = queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(b10);
                }
                f158c = l0Var;
            }
        }
    }
}
