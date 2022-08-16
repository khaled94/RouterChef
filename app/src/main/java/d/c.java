package d;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import b0.g;
import b0.h;
import e9.f;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;
import k1.a;
import l0.b;
import m3.p;
import m4.ar0;
import m4.e62;
import m4.i12;
import m4.o52;
import m4.r01;
import m4.vj0;
import m4.x90;
import m4.zv1;
import n9.r;
import s4.aa;
import s4.s5;
import s4.t5;
import s4.u5;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class c implements ar0, d1 {

    /* renamed from: s */
    public static final r f3665s = new r("REMOVED_TASK");

    /* renamed from: t */
    public static final r f3666t = new r("CLOSED_EMPTY");

    /* renamed from: u */
    public static final /* synthetic */ c f3667u = new c();

    /* renamed from: v */
    public static final vj0 f3668v = new vj0(1);

    /* renamed from: w */
    public static volatile x90 f3669w = new x90();

    /* renamed from: x */
    public static final /* synthetic */ c f3670x = new c();

    public static int a(Context context, String str) {
        int i10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d5 = g.d(str);
        if (d5 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (Process.myUid() == myUid && b.a(context.getPackageName(), packageName)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c10 = h.c(context);
                    i10 = h.a(c10, d5, Binder.getCallingUid(), packageName);
                    if (i10 == 0) {
                        i10 = h.a(c10, d5, myUid, h.b(context));
                    }
                } else {
                    i10 = g.c((AppOpsManager) g.a(context, AppOpsManager.class), d5, packageName);
                }
            } else {
                i10 = g.c((AppOpsManager) g.a(context, AppOpsManager.class), d5, packageName);
            }
            if (i10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static boolean b(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static final int c(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i10 / 0.75f) + 1.0f);
    }

    public static boolean d(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    public static final Map e(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        f.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static s5 f(s5 s5Var) {
        return ((s5Var instanceof u5) || (s5Var instanceof t5)) ? s5Var : s5Var instanceof Serializable ? new t5(s5Var) : new u5(s5Var);
    }

    public static void g(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public static void i(o52 o52Var) {
        zv1.i(k(o52Var.z().A()));
        j(o52Var.z().B());
        if (o52Var.C() != 2) {
            e62 y = o52Var.v().y();
            Logger logger = i12.f9506a;
            synchronized (i12.class) {
                a a10 = i12.i(y.z()).a();
                if (!((Boolean) i12.f9509d.get(y.z())).booleanValue()) {
                    String valueOf = String.valueOf(y.z());
                    throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
                }
                a10.a(y.y());
            }
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String j(int i10) {
        int i11 = i10 - 2;
        if (i11 != 1) {
            if (i11 == 2) {
                return "HmacSha384";
            }
            if (i11 == 3) {
                return "HmacSha256";
            }
            if (i11 == 4) {
                return "HmacSha512";
            }
            if (i11 != 5) {
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(r01.a(i10))));
            }
            return "HmacSha224";
        }
        return "HmacSha1";
    }

    public static int k(int i10) {
        int i11 = i10 - 2;
        if (i11 != 2) {
            if (i11 == 3) {
                return 2;
            }
            if (i11 == 4) {
                return 3;
            }
            if (i10 == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(i11)));
        }
        return 1;
    }

    public static int l(int i10) {
        int i11 = i10 - 2;
        if (i11 != 1) {
            int i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    if (i10 == 1) {
                        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(i11)));
                }
            }
            return i12;
        }
        return 1;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((p) obj).a();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().a());
    }
}
