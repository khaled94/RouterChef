package m4;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.view.MotionEvent;
import android.view.View;
import d.b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import r2.d;

/* loaded from: classes.dex */
public final class q7 implements s7 {
    public static q7 G;
    public volatile boolean D;
    public final int F;

    /* renamed from: s */
    public final Context f12716s;

    /* renamed from: t */
    public final ft1 f12717t;

    /* renamed from: u */
    public final kt1 f12718u;

    /* renamed from: v */
    public final mt1 f12719v;

    /* renamed from: w */
    public final h8 f12720w;

    /* renamed from: x */
    public final zr1 f12721x;
    public final Executor y;

    /* renamed from: z */
    public final np0 f12722z;
    public volatile long B = 0;
    public final Object C = new Object();
    public volatile boolean E = false;
    public final CountDownLatch A = new CountDownLatch(1);

    public q7(Context context, zr1 zr1Var, ft1 ft1Var, kt1 kt1Var, mt1 mt1Var, h8 h8Var, Executor executor, mz1 mz1Var, int i10) {
        this.f12716s = context;
        this.f12721x = zr1Var;
        this.f12717t = ft1Var;
        this.f12718u = kt1Var;
        this.f12719v = mt1Var;
        this.f12720w = h8Var;
        this.y = executor;
        this.F = i10;
        this.f12722z = new np0(this, mz1Var, 1);
    }

    @Deprecated
    public static synchronized q7 h(String str, Context context, Executor executor, boolean z10, boolean z11) {
        q7 q7Var;
        synchronized (q7.class) {
            if (G == null) {
                bs1 bs1Var = new bs1();
                bs1Var.f6610t = Boolean.FALSE;
                bs1Var.f6611u = Boolean.TRUE;
                Objects.requireNonNull(str, "Null clientVersion");
                bs1Var.f6609s = str;
                bs1Var.f6610t = Boolean.valueOf(z10);
                as1 a10 = bs1Var.a();
                zr1 a11 = zr1.a(context, executor, z11);
                yr<Boolean> yrVar = es.Q1;
                jo joVar = jo.f10145d;
                z7 z7Var = ((Boolean) joVar.f10148c.a(yrVar)).booleanValue() ? new z7((ConnectivityManager) context.getSystemService("connectivity")) : null;
                ms1 a12 = ms1.a(context, executor, a11, a10);
                g8 g8Var = new g8(context);
                h8 h8Var = new h8(a10, a12, new t8(context, g8Var), g8Var, z7Var);
                int i10 = b.i(context, a11);
                mz1 mz1Var = new mz1();
                q7 q7Var2 = new q7(context, a11, new ft1(context, i10), new kt1(context, i10, new o7(a11, 0), ((Boolean) joVar.f10148c.a(es.f8190s1)).booleanValue()), new mt1(context, h8Var, a11, mz1Var), h8Var, executor, mz1Var, i10);
                G = q7Var2;
                q7Var2.j();
                G.k();
            }
            q7Var = G;
        }
        return q7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r3.x().D().equals(r4.D()) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(m4.q7 r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.q7.i(m4.q7):void");
    }

    @Override // m4.s7
    public final void a(MotionEvent motionEvent) {
        dt1 a10 = this.f12719v.a();
        if (a10 != null) {
            try {
                a10.a(motionEvent);
            } catch (lt1 e10) {
                this.f12721x.c(e10.f10992s, -1L, e10);
            }
        }
    }

    @Override // m4.s7
    public final void b(View view) {
        this.f12720w.f9133c.c(view);
    }

    @Override // m4.s7
    public final String c(Context context) {
        String e10;
        k();
        dt1 a10 = this.f12719v.a();
        if (a10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a10) {
                Map<String, Object> a11 = a10.f7637c.a();
                HashMap hashMap = (HashMap) a11;
                hashMap.put("f", "q");
                hashMap.put("ctx", context);
                hashMap.put("aid", null);
                e10 = dt1.e(a10.f(a11));
            }
            this.f12721x.e(5001, System.currentTimeMillis() - currentTimeMillis, e10);
            return e10;
        }
        return "";
    }

    @Override // m4.s7
    public final void d(int i10, int i11, int i12) {
    }

    @Override // m4.s7
    public final String e(Context context, View view) {
        String e10;
        k();
        dt1 a10 = this.f12719v.a();
        if (a10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a10) {
                Map<String, Object> b10 = a10.f7637c.b();
                HashMap hashMap = (HashMap) b10;
                hashMap.put("f", "v");
                hashMap.put("ctx", context);
                hashMap.put("aid", null);
                hashMap.put("view", view);
                hashMap.put("act", null);
                e10 = dt1.e(a10.f(b10));
            }
            this.f12721x.e(5002, System.currentTimeMillis() - currentTimeMillis, e10);
            return e10;
        }
        return "";
    }

    @Override // m4.s7
    public final String f(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // m4.s7
    public final String g(Context context, String str, View view, Activity activity) {
        String e10;
        k();
        dt1 a10 = this.f12719v.a();
        if (a10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a10) {
                h8 h8Var = a10.f7637c;
                Map<String, Object> b10 = h8Var.b();
                ((HashMap) b10).put("lts", Long.valueOf(h8Var.f9133c.a()));
                HashMap hashMap = (HashMap) b10;
                hashMap.put("f", "c");
                hashMap.put("ctx", context);
                hashMap.put("cs", str);
                hashMap.put("aid", null);
                hashMap.put("view", view);
                hashMap.put("act", activity);
                e10 = dt1.e(a10.f(b10));
            }
            this.f12721x.e(5000, System.currentTimeMillis() - currentTimeMillis, e10);
            return e10;
        }
        return "";
    }

    public final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        et1 l10 = l();
        if (l10 == null) {
            this.f12721x.d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (!this.f12719v.b(l10)) {
        } else {
            this.E = true;
            this.A.countDown();
        }
    }

    public final void k() {
        et1 et1Var;
        if (!this.D) {
            synchronized (this.C) {
                try {
                    if (!this.D) {
                        if ((System.currentTimeMillis() / 1000) - this.B < 3600) {
                            return;
                        }
                        mt1 mt1Var = this.f12719v;
                        synchronized (mt1Var.f11305f) {
                            dt1 dt1Var = mt1Var.f11304e;
                            et1Var = dt1Var != null ? dt1Var.f7636b : null;
                        }
                        boolean z10 = true;
                        if (et1Var != null) {
                            if (et1Var.f8261a.w() - (System.currentTimeMillis() / 1000) < 3600) {
                            }
                        }
                        int i10 = this.F - 1;
                        if (i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6) {
                            z10 = false;
                        }
                        if (z10) {
                            this.y.execute(new p7(this, 0));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final et1 l() {
        int i10 = this.F - 1;
        et1 et1Var = null;
        if (!(i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6)) {
            return null;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8174q1)).booleanValue()) {
            kt1 kt1Var = this.f12718u;
            Objects.requireNonNull(kt1Var);
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (kt1.f10572f) {
                z9 h10 = kt1Var.h(1);
                if (h10 == null) {
                    kt1Var.g(4022, currentTimeMillis);
                } else {
                    File c10 = kt1Var.c(h10.E());
                    File file = new File(c10, "pcam.jar");
                    if (!file.exists()) {
                        file = new File(c10, "pcam");
                    }
                    File file2 = new File(c10, "pcbc");
                    File file3 = new File(c10, "pcopt");
                    kt1Var.g(5016, currentTimeMillis);
                    et1Var = new et1(h10, file, file2, file3);
                }
            }
            return et1Var;
        }
        ft1 ft1Var = this.f12717t;
        z9 b10 = ft1Var.b(1);
        if (b10 == null) {
            return null;
        }
        String E = b10.E();
        File f10 = d.f(E, "pcam.jar", ft1Var.c());
        if (!f10.exists()) {
            f10 = d.f(E, "pcam", ft1Var.c());
        }
        return new et1(b10, f10, d.f(E, "pcbc", ft1Var.c()), d.f(E, "pcopt", ft1Var.c()));
    }
}
