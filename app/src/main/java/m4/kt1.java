package m4;

import android.content.Context;
import android.content.SharedPreferences;
import e9.d;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class kt1 {

    /* renamed from: f */
    public static final Object f10572f = new Object();

    /* renamed from: a */
    public final Context f10573a;

    /* renamed from: b */
    public final SharedPreferences f10574b;

    /* renamed from: c */
    public final String f10575c;

    /* renamed from: d */
    public final ts1 f10576d;

    /* renamed from: e */
    public boolean f10577e;

    public kt1(Context context, int i10, ts1 ts1Var, boolean z10) {
        this.f10577e = false;
        this.f10573a = context;
        this.f10575c = Integer.toString(i10 - 1);
        this.f10574b = context.getSharedPreferences("pcvmspf", 0);
        this.f10576d = ts1Var;
        this.f10577e = z10;
    }

    public static String d(x9 x9Var) {
        y9 y = z9.y();
        String E = x9Var.x().E();
        if (y.f9884u) {
            y.m();
            y.f9884u = false;
        }
        z9.F((z9) y.f9883t, E);
        String D = x9Var.x().D();
        if (y.f9884u) {
            y.m();
            y.f9884u = false;
        }
        z9.H((z9) y.f9883t, D);
        long v10 = x9Var.x().v();
        if (y.f9884u) {
            y.m();
            y.f9884u = false;
        }
        z9.J((z9) y.f9883t, v10);
        long x10 = x9Var.x().x();
        if (y.f9884u) {
            y.m();
            y.f9884u = false;
        }
        z9.G((z9) y.f9883t, x10);
        long w10 = x9Var.x().w();
        if (y.f9884u) {
            y.m();
            y.f9884u = false;
        }
        z9.I((z9) y.f9883t, w10);
        return d.b(y.k().d().e());
    }

    public final boolean a(x9 x9Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f10572f) {
            if (!r2.d.l(new File(c(x9Var.x().E()), "pcbc"), x9Var.y().e())) {
                g(4020, currentTimeMillis);
                return false;
            }
            String d5 = d(x9Var);
            SharedPreferences.Editor edit = this.f10574b.edit();
            edit.putString(f(), d5);
            boolean commit = edit.commit();
            if (commit) {
                g(5015, currentTimeMillis);
            } else {
                g(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean b(x9 x9Var, np0 np0Var) {
        boolean z10;
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f10572f) {
            z9 h10 = h(1);
            String E = x9Var.x().E();
            if (h10 != null && h10.E().equals(E)) {
                g(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File c10 = c(E);
            if (c10.exists()) {
                String str = "1";
                if (true != c10.isDirectory()) {
                    str = "0";
                }
                String str2 = "1";
                if (true != c10.isFile()) {
                    str2 = "0";
                }
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                String sb2 = sb.toString();
                ts1 ts1Var = this.f10576d;
                if (ts1Var != null) {
                    ts1Var.c(4023, currentTimeMillis2, sb2);
                }
                g(4015, currentTimeMillis2);
            } else if (!c10.mkdirs()) {
                String str3 = "1";
                if (true != c10.canWrite()) {
                    str3 = "0";
                }
                String concat = str3.length() != 0 ? "cw:".concat(str3) : new String("cw:");
                ts1 ts1Var2 = this.f10576d;
                if (ts1Var2 != null) {
                    ts1Var2.c(4024, currentTimeMillis2, concat);
                }
                g(4015, currentTimeMillis2);
                return false;
            }
            File c11 = c(E);
            File file = new File(c11, "pcam.jar");
            File file2 = new File(c11, "pcbc");
            if (!r2.d.l(file, x9Var.z().e())) {
                g(4016, currentTimeMillis);
                return false;
            } else if (!r2.d.l(file2, x9Var.y().e())) {
                g(4017, currentTimeMillis);
                return false;
            } else {
                if (np0Var != null) {
                    try {
                        z10 = ((mz1) np0Var.f11881t).a(file);
                    } catch (GeneralSecurityException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        g(4018, currentTimeMillis);
                        r2.d.k(c11);
                        return false;
                    }
                }
                String d5 = d(x9Var);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.f10574b.getString(f(), null);
                SharedPreferences.Editor edit = this.f10574b.edit();
                edit.putString(f(), d5);
                if (string != null) {
                    edit.putString(e(), string);
                }
                if (!edit.commit()) {
                    g(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                z9 h11 = h(1);
                if (h11 != null) {
                    hashSet.add(h11.E());
                }
                z9 h12 = h(2);
                if (h12 != null) {
                    hashSet.add(h12.E());
                }
                for (File file3 : new File(this.f10573a.getDir("pccache", 0), this.f10575c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        r2.d.k(file3);
                    }
                }
                g(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final File c(String str) {
        return new File(new File(this.f10573a.getDir("pccache", 0), this.f10575c), str);
    }

    public final String e() {
        String valueOf = String.valueOf(this.f10575c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    public final String f() {
        String valueOf = String.valueOf(this.f10575c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    public final void g(int i10, long j3) {
        ts1 ts1Var = this.f10576d;
        if (ts1Var != null) {
            ts1Var.b(i10, j3);
        }
    }

    public final z9 h(int i10) {
        SharedPreferences sharedPreferences;
        String str;
        int i11;
        if (i10 == 1) {
            sharedPreferences = this.f10574b;
            str = f();
        } else {
            sharedPreferences = this.f10574b;
            str = e();
        }
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] j3 = d.j(string);
            l82 l82Var = n82.f11571t;
            return z9.C(n82.D(j3, 0, j3.length), this.f10577e ? z82.a() : z82.b());
        } catch (NullPointerException unused) {
            i11 = 2029;
            g(i11, currentTimeMillis);
            return null;
        } catch (RuntimeException unused2) {
            i11 = 2032;
            g(i11, currentTimeMillis);
            return null;
        } catch (x92 unused3) {
            return null;
        }
    }
}
