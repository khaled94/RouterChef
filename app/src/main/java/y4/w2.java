package y4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import d4.m;
import h4.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import m3.a;
import org.checkerframework.dataflow.qual.Pure;
import s.b;
import s4.b1;
import s4.c5;
import s4.n5;
import s4.o5;
import s4.s5;
import s4.v4;
import s4.x4;

/* loaded from: classes.dex */
public final class w2 implements k3 {
    public static volatile w2 Z;
    public final s1 A;
    public final u2 B;
    public final q5 C;
    public final h6 D;
    public final n1 E;
    public final c F;
    public final p4 G;
    public final f4 H;
    public final m0 I;
    public final j4 J;
    public final String K;
    public m1 L;
    public e5 M;
    public k N;
    public k1 O;
    public Boolean Q;
    public long R;
    public volatile Boolean S;
    public Boolean T;
    public Boolean U;
    public int W;
    public final long Y;

    /* renamed from: s */
    public final Context f20786s;

    /* renamed from: t */
    public final String f20787t;

    /* renamed from: u */
    public final String f20788u;

    /* renamed from: v */
    public final String f20789v;

    /* renamed from: w */
    public final boolean f20790w;

    /* renamed from: x */
    public final a f20791x;
    public final e y;

    /* renamed from: z */
    public final g2 f20792z;
    public boolean P = false;
    public final AtomicInteger X = new AtomicInteger(0);
    public volatile boolean V = true;

    public w2(n3 n3Var) {
        String str;
        q1 q1Var;
        Context context;
        Bundle bundle;
        Context context2 = n3Var.f20595a;
        a aVar = new a(context2);
        this.f20791x = aVar;
        c4.a.f2667s = aVar;
        this.f20786s = context2;
        this.f20787t = n3Var.f20596b;
        this.f20788u = n3Var.f20597c;
        this.f20789v = n3Var.f20598d;
        this.f20790w = n3Var.f20602h;
        this.S = n3Var.f20599e;
        this.K = n3Var.f20604j;
        boolean z10 = true;
        b1 b1Var = n3Var.f20601g;
        if (b1Var != null && (bundle = b1Var.y) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.T = (Boolean) obj;
            }
            Object obj2 = b1Var.y.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.U = (Boolean) obj2;
            }
        }
        synchronized (n5.f18018f) {
            v4 v4Var = n5.f18019g;
            final Context applicationContext = context2.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            if (v4Var == null || v4Var.f18147a != applicationContext) {
                x4.c();
                o5.b();
                synchronized (c5.class) {
                    c5 c5Var = c5.f17752c;
                    if (c5Var != null && (context = c5Var.f17753a) != null && c5Var.f17754b != null) {
                        context.getContentResolver().unregisterContentObserver(c5.f17752c.f17754b);
                    }
                    c5.f17752c = null;
                }
                n5.f18019g = new v4(applicationContext, d.c.f(new s5() { // from class: s4.g5
                    @Override // s4.s5
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object zza() {
                        /*
                            Method dump skipped, instructions count: 328
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: s4.g5.zza():java.lang.Object");
                    }
                }));
                n5.f18020h.incrementAndGet();
            }
        }
        this.F = c.f5072a;
        Long l10 = n3Var.f20603i;
        this.Y = l10 != null ? l10.longValue() : System.currentTimeMillis();
        this.y = new e(this);
        g2 g2Var = new g2(this);
        g2Var.k();
        this.f20792z = g2Var;
        s1 s1Var = new s1(this);
        s1Var.k();
        this.A = s1Var;
        h6 h6Var = new h6(this);
        h6Var.k();
        this.D = h6Var;
        this.E = new n1(new m3(this));
        this.I = new m0(this);
        p4 p4Var = new p4(this);
        p4Var.i();
        this.G = p4Var;
        f4 f4Var = new f4(this);
        f4Var.i();
        this.H = f4Var;
        q5 q5Var = new q5(this);
        q5Var.i();
        this.C = q5Var;
        j4 j4Var = new j4(this);
        j4Var.k();
        this.J = j4Var;
        u2 u2Var = new u2(this);
        u2Var.k();
        this.B = u2Var;
        b1 b1Var2 = n3Var.f20601g;
        if (b1Var2 != null && b1Var2.f17734t != 0) {
            z10 = false;
        }
        if (context2.getApplicationContext() instanceof Application) {
            f4 u10 = u();
            if (((w2) u10.f20505s).f20786s.getApplicationContext() instanceof Application) {
                Application application = (Application) ((w2) u10.f20505s).f20786s.getApplicationContext();
                if (u10.f20447u == null) {
                    u10.f20447u = new d4(u10);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(u10.f20447u);
                    application.registerActivityLifecycleCallbacks(u10.f20447u);
                    q1Var = ((w2) u10.f20505s).C().F;
                    str = "Registered activity lifecycle callback";
                }
            }
            u2Var.q(new v2(this, n3Var, 0));
        }
        q1Var = C().A;
        str = "Application context is not an Application";
        q1Var.a(str);
        u2Var.q(new v2(this, n3Var, 0));
    }

    public static final void i() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void j(f2 f2Var) {
        if (f2Var != null) {
            if (f2Var.f20444t) {
                return;
            }
            String valueOf = String.valueOf(f2Var.getClass());
            throw new IllegalStateException(b.b(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void k(j3 j3Var) {
        if (j3Var != null) {
            if (j3Var.m()) {
                return;
            }
            String valueOf = String.valueOf(j3Var.getClass());
            throw new IllegalStateException(b.b(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
        throw new IllegalStateException("Component not created");
    }

    public static w2 t(Context context, b1 b1Var, Long l10) {
        Bundle bundle;
        if (b1Var != null && (b1Var.f17737w == null || b1Var.f17738x == null)) {
            b1Var = new b1(b1Var.f17733s, b1Var.f17734t, b1Var.f17735u, b1Var.f17736v, null, null, b1Var.y, null);
        }
        Objects.requireNonNull(context, "null reference");
        m.h(context.getApplicationContext());
        if (Z == null) {
            synchronized (w2.class) {
                if (Z == null) {
                    Z = new w2(new n3(context, b1Var, l10));
                }
            }
        } else if (b1Var != null && (bundle = b1Var.y) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            m.h(Z);
            Z.S = Boolean.valueOf(b1Var.y.getBoolean("dataCollectionDefaultEnabled"));
        }
        m.h(Z);
        return Z;
    }

    @Override // y4.k3
    @Pure
    public final u2 B() {
        k(this.B);
        return this.B;
    }

    @Override // y4.k3
    @Pure
    public final s1 C() {
        k(this.A);
        return this.A;
    }

    public final void a() {
        this.X.incrementAndGet();
    }

    @Override // y4.k3
    @Pure
    public final Context b() {
        return this.f20786s;
    }

    @Override // y4.k3
    @Pure
    public final h4.a c() {
        return this.F;
    }

    @Override // y4.k3
    @Pure
    public final a d() {
        return this.f20791x;
    }

    public final boolean e() {
        return this.S != null && this.S.booleanValue();
    }

    public final boolean f() {
        return l() == 0;
    }

    @Pure
    public final boolean g() {
        return TextUtils.isEmpty(this.f20787t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.R) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            r7 = this;
            boolean r0 = r7.P
            if (r0 == 0) goto Ld2
            y4.u2 r0 = r7.B()
            r0.g()
            java.lang.Boolean r0 = r7.Q
            if (r0 == 0) goto L33
            long r1 = r7.R
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L33
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lcb
            h4.c r0 = r7.F
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r7.R
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lcb
        L33:
            h4.c r0 = r7.F
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.R = r0
            y4.h6 r0 = r7.z()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.R(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L7e
            y4.h6 r0 = r7.z()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.R(r3)
            if (r0 == 0) goto L7e
            android.content.Context r0 = r7.f20786s
            j4.b r0 = j4.c.a(r0)
            boolean r0 = r0.e()
            if (r0 != 0) goto L7c
            y4.e r0 = r7.y
            boolean r0 = r0.x()
            if (r0 != 0) goto L7c
            android.content.Context r0 = r7.f20786s
            boolean r0 = y4.h6.X(r0)
            if (r0 == 0) goto L7e
            android.content.Context r0 = r7.f20786s
            boolean r0 = y4.h6.Y(r0)
            if (r0 == 0) goto L7e
        L7c:
            r0 = r1
            goto L7f
        L7e:
            r0 = r2
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.Q = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcb
            y4.h6 r0 = r7.z()
            y4.k1 r3 = r7.p()
            java.lang.String r3 = r3.m()
            y4.k1 r4 = r7.p()
            r4.h()
            java.lang.String r4 = r4.D
            y4.k1 r5 = r7.p()
            r5.h()
            java.lang.String r6 = r5.E
            d4.m.h(r6)
            java.lang.String r5 = r5.E
            boolean r0 = r0.K(r3, r4, r5)
            if (r0 != 0) goto Lc5
            y4.k1 r0 = r7.p()
            r0.h()
            java.lang.String r0 = r0.D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc4
            goto Lc5
        Lc4:
            r1 = r2
        Lc5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.Q = r0
        Lcb:
            java.lang.Boolean r0 = r7.Q
            boolean r0 = r0.booleanValue()
            return r0
        Ld2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.w2.h():boolean");
    }

    public final int l() {
        B().g();
        if (this.y.v()) {
            return 1;
        }
        Boolean bool = this.U;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        B().g();
        if (!this.V) {
            return 8;
        }
        Boolean p = s().p();
        if (p != null) {
            return p.booleanValue() ? 0 : 3;
        }
        e eVar = this.y;
        a aVar = ((w2) eVar.f20505s).f20791x;
        Boolean r10 = eVar.r("firebase_analytics_collection_enabled");
        if (r10 != null) {
            return r10.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.T;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.y.s(null, f1.T) || this.S == null || this.S.booleanValue()) ? 0 : 7;
    }

    @Pure
    public final m0 m() {
        m0 m0Var = this.I;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final e n() {
        return this.y;
    }

    @Pure
    public final k o() {
        k(this.N);
        return this.N;
    }

    @Pure
    public final k1 p() {
        j(this.O);
        return this.O;
    }

    @Pure
    public final m1 q() {
        j(this.L);
        return this.L;
    }

    @Pure
    public final n1 r() {
        return this.E;
    }

    @Pure
    public final g2 s() {
        g2 g2Var = this.f20792z;
        if (g2Var != null) {
            return g2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final f4 u() {
        j(this.H);
        return this.H;
    }

    @Pure
    public final j4 v() {
        k(this.J);
        return this.J;
    }

    @Pure
    public final p4 w() {
        j(this.G);
        return this.G;
    }

    @Pure
    public final e5 x() {
        j(this.M);
        return this.M;
    }

    @Pure
    public final q5 y() {
        j(this.C);
        return this.C;
    }

    @Pure
    public final h6 z() {
        h6 h6Var = this.D;
        if (h6Var != null) {
            return h6Var;
        }
        throw new IllegalStateException("Component not created");
    }
}
