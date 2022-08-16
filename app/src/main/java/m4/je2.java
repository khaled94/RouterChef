package m4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class je2 implements Handler.Callback, sj2, zl2, xe2, s42, af2 {
    public final HandlerThread A;
    public final Looper B;
    public final j40 C;
    public final d30 D;
    public final long E;
    public final j52 F;
    public final ArrayList<ge2> G;
    public final g11 H;
    public final qe2 I;
    public final ye2 J;
    public hf2 K;
    public ze2 L;
    public he2 M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public ie2 Y;
    public long Z;

    /* renamed from: a0 */
    public int f9937a0;

    /* renamed from: b0 */
    public boolean f9938b0;

    /* renamed from: c0 */
    public o62 f9939c0;

    /* renamed from: d0 */
    public final bs f9940d0;

    /* renamed from: e0 */
    public final g32 f9941e0;

    /* renamed from: s */
    public final ff2[] f9942s;

    /* renamed from: t */
    public final Set<ff2> f9943t;

    /* renamed from: v */
    public final yl2 f9945v;

    /* renamed from: w */
    public final am2 f9946w;

    /* renamed from: x */
    public final le2 f9947x;
    public final jm2 y;

    /* renamed from: z */
    public final xo1 f9948z;
    public int S = 0;
    public boolean T = false;
    public boolean O = false;

    /* renamed from: u */
    public final sz1[] f9944u = new sz1[2];

    public je2(ff2[] ff2VarArr, yl2 yl2Var, am2 am2Var, le2 le2Var, jm2 jm2Var, eg2 eg2Var, hf2 hf2Var, g32 g32Var, Looper looper, g11 g11Var, bs bsVar) {
        this.f9940d0 = bsVar;
        this.f9942s = ff2VarArr;
        this.f9945v = yl2Var;
        this.f9946w = am2Var;
        this.f9947x = le2Var;
        this.y = jm2Var;
        this.K = hf2Var;
        this.f9941e0 = g32Var;
        this.H = g11Var;
        this.E = le2Var.zza();
        le2Var.b();
        ze2 h10 = ze2.h(am2Var);
        this.L = h10;
        this.M = new he2(h10);
        for (int i10 = 0; i10 < 2; i10++) {
            ff2VarArr[i10].f(i10);
            this.f9944u[i10] = ff2VarArr[i10].i();
        }
        this.F = new j52(this, g11Var);
        this.G = new ArrayList<>();
        this.f9943t = Collections.newSetFromMap(new IdentityHashMap());
        this.C = new j40();
        this.D = new d30();
        yl2Var.f15837a = this;
        yl2Var.f15838b = jm2Var;
        this.f9938b0 = true;
        Handler handler = new Handler(looper);
        this.I = new qe2(eg2Var, handler);
        this.J = new ye2(this, eg2Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.A = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.B = looper2;
        this.f9948z = (xo1) ((bn1) g11Var).a(looper2, this);
    }

    public static boolean C(ff2 ff2Var) {
        return ff2Var.p() != 0;
    }

    public static boolean E(ze2 ze2Var, d30 d30Var) {
        uj2 uj2Var = ze2Var.f16166b;
        z40 z40Var = ze2Var.f16165a;
        return z40Var.o() || z40Var.n(uj2Var.f8973a, d30Var).f7206e;
    }

    public static final void H(cf2 cf2Var) {
        synchronized (cf2Var) {
        }
        try {
            cf2Var.f6818a.k(cf2Var.f6820c, cf2Var.f6821d);
        } finally {
            cf2Var.c(true);
        }
    }

    public static final void I(ff2 ff2Var) {
        ff2Var.C();
        if (!(ff2Var instanceof fl2)) {
            return;
        }
        fl2 fl2Var = (fl2) ff2Var;
        throw null;
    }

    public static t[] J(kl2 kl2Var) {
        int length = kl2Var != null ? kl2Var.f10481c.length : 0;
        t[] tVarArr = new t[length];
        for (int i10 = 0; i10 < length; i10++) {
            tVarArr[i10] = kl2Var.f10482d[i10];
        }
        return tVarArr;
    }

    public static Object K(j40 j40Var, d30 d30Var, int i10, boolean z10, Object obj, z40 z40Var, z40 z40Var2) {
        int a10 = z40Var.a(obj);
        int b10 = z40Var.b();
        int i11 = 0;
        int i12 = a10;
        int i13 = -1;
        while (true) {
            if (i11 >= b10 || i13 != -1) {
                break;
            }
            i12 = z40Var.i(i12, d30Var, j40Var, i10, z10);
            if (i12 == -1) {
                i13 = -1;
                break;
            }
            i13 = z40Var2.a(z40Var.f(i12));
            i11++;
        }
        if (i13 == -1) {
            return null;
        }
        return z40Var2.f(i13);
    }

    public static Pair Q(z40 z40Var, ie2 ie2Var, int i10, boolean z10, j40 j40Var, d30 d30Var) {
        Pair<Object, Long> l10;
        long j3;
        int i11;
        z40 z40Var2 = ie2Var.f9618a;
        if (z40Var.o()) {
            return null;
        }
        z40 z40Var3 = true == z40Var2.o() ? z40Var : z40Var2;
        try {
            l10 = z40Var3.l(j40Var, d30Var, ie2Var.f9619b, ie2Var.f9620c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (z40Var.equals(z40Var3)) {
            return l10;
        }
        if (z40Var.a(l10.first) == -1) {
            Object K = K(j40Var, d30Var, i10, z10, l10.first, z40Var3, z40Var);
            if (K != null) {
                i11 = z40Var.n(K, d30Var).f7204c;
                j3 = -9223372036854775807L;
            }
            return null;
        } else if (!z40Var3.n(l10.first, d30Var).f7206e || z40Var3.e(d30Var.f7204c, j40Var, 0L).f9846l != z40Var3.a(l10.first)) {
            return l10;
        } else {
            int i12 = z40Var.n(l10.first, d30Var).f7204c;
            j3 = ie2Var.f9620c;
            i11 = i12;
        }
        return z40Var.l(j40Var, d30Var, i11, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
        if (r5 > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
        if (r8 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
        if (r0 < 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
        if (r0 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
        if (r3 >= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
        if (r5 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        r8 = r6.G.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r5 >= r6.G.size()) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
        r0 = r6.G.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
        r6.f9937a0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x013e -> B:58:0x0131). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0140 -> B:59:0x0132). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.je2.A():void");
    }

    public final boolean B() {
        ne2 ne2Var = this.I.f12826j;
        if (ne2Var == null) {
            return false;
        }
        return (!ne2Var.f11640d ? 0L : ne2Var.f11637a.c()) != Long.MIN_VALUE;
    }

    public final boolean D() {
        ne2 ne2Var = this.I.f12824h;
        long j3 = ne2Var.f11642f.f12134e;
        if (ne2Var.f11640d) {
            if (j3 == -9223372036854775807L || this.L.f16182s < j3) {
                return true;
            }
            return !F();
        }
        return false;
    }

    public final boolean F() {
        ze2 ze2Var = this.L;
        return ze2Var.f16176l && ze2Var.f16177m == 0;
    }

    public final boolean G(z40 z40Var, uj2 uj2Var) {
        if (!uj2Var.a() && !z40Var.o()) {
            z40Var.e(z40Var.n(uj2Var.f8973a, this.D).f7204c, this.C, 0L);
            if (this.C.b()) {
                j40 j40Var = this.C;
                if (j40Var.f9841g && j40Var.f9838d != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long L(z40 z40Var, Object obj, long j3) {
        z40Var.e(z40Var.n(obj, this.D).f7204c, this.C, 0L);
        j40 j40Var = this.C;
        if (j40Var.f9838d != -9223372036854775807L && j40Var.b()) {
            j40 j40Var2 = this.C;
            if (j40Var2.f9841g) {
                long j10 = j40Var2.f9839e;
                int i10 = ls1.f10971a;
                return xf2.b((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - this.C.f9838d) - j3;
            }
        }
        return -9223372036854775807L;
    }

    public final long M() {
        long j3 = this.L.f16180q;
        ne2 ne2Var = this.I.f12826j;
        if (ne2Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.Z - ne2Var.f11651o));
    }

    public final long N(uj2 uj2Var, long j3, boolean z10) {
        qe2 qe2Var = this.I;
        return O(uj2Var, j3, qe2Var.f12824h != qe2Var.f12825i, z10);
    }

    public final long O(uj2 uj2Var, long j3, boolean z10, boolean z11) {
        qe2 qe2Var;
        w();
        this.Q = false;
        if (z11 || this.L.f16169e == 3) {
            t(2);
        }
        ne2 ne2Var = this.I.f12824h;
        ne2 ne2Var2 = ne2Var;
        while (ne2Var2 != null && !uj2Var.equals(ne2Var2.f11642f.f12130a)) {
            ne2Var2 = ne2Var2.f11648l;
        }
        if (z10 || ne2Var != ne2Var2 || (ne2Var2 != null && ne2Var2.f11651o + j3 < 0)) {
            ff2[] ff2VarArr = this.f9942s;
            for (int i10 = 0; i10 < 2; i10++) {
                a(ff2VarArr[i10]);
            }
            if (ne2Var2 != null) {
                while (true) {
                    qe2Var = this.I;
                    if (qe2Var.f12824h == ne2Var2) {
                        break;
                    }
                    qe2Var.d();
                }
                qe2Var.o(ne2Var2);
                ne2Var2.f11651o = 0L;
                b();
            }
        }
        qe2 qe2Var2 = this.I;
        if (ne2Var2 != null) {
            qe2Var2.o(ne2Var2);
            if (!ne2Var2.f11640d) {
                ne2Var2.f11642f = ne2Var2.f11642f.b(j3);
            } else if (ne2Var2.f11641e) {
                long j10 = ne2Var2.f11637a.j(j3);
                ne2Var2.f11637a.n(j10 - this.E);
                j3 = j10;
            }
            o(j3);
            j();
        } else {
            qe2Var2.l();
            o(j3);
        }
        e(false);
        this.f9948z.e(2);
        return j3;
    }

    public final Pair<uj2, Long> P(z40 z40Var) {
        long j3 = 0;
        if (z40Var.o()) {
            uj2 uj2Var = ze2.f16164t;
            return Pair.create(ze2.f16164t, 0L);
        }
        Pair<Object, Long> l10 = z40Var.l(this.C, this.D, z40Var.g(this.T), -9223372036854775807L);
        uj2 k10 = this.I.k(z40Var, l10.first);
        long longValue = ((Long) l10.second).longValue();
        if (k10.a()) {
            z40Var.n(k10.f8973a, this.D);
            if (-1 == this.D.a(-1)) {
                this.D.d();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(k10, Long.valueOf(j3));
    }

    public final ze2 R(uj2 uj2Var, long j3, long j10, long j11, boolean z10, int i10) {
        gw1<Object> gw1Var;
        am2 am2Var;
        s70 s70Var;
        s70 s70Var2;
        am2 am2Var2;
        gw1<Object> gw1Var2;
        this.f9938b0 = this.f9938b0 || j3 != this.L.f16182s || !uj2Var.equals(this.L.f16166b);
        n();
        ze2 ze2Var = this.L;
        s70 s70Var3 = ze2Var.f16172h;
        am2 am2Var3 = ze2Var.f16173i;
        List<ln0> list = ze2Var.f16174j;
        if (this.J.f15669i) {
            ne2 ne2Var = this.I.f12824h;
            if (ne2Var == null) {
                s70Var2 = s70.f13532d;
            } else {
                s70Var2 = ne2Var.f11649m;
            }
            if (ne2Var == null) {
                am2Var2 = this.f9946w;
            } else {
                am2Var2 = ne2Var.f11650n;
            }
            kl2[] kl2VarArr = am2Var2.f6207e;
            dw1 dw1Var = new dw1();
            boolean z11 = false;
            for (kl2 kl2Var : kl2VarArr) {
                if (kl2Var != null) {
                    ln0 ln0Var = kl2Var.f10482d[0].f13869i;
                    if (ln0Var == null) {
                        dw1Var.n(new ln0(new ym0[0]));
                    } else {
                        dw1Var.n(ln0Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                gw1Var2 = dw1Var.p();
            } else {
                pu1 pu1Var = gw1.f9058t;
                gw1Var2 = gx1.f9060w;
            }
            if (ne2Var != null) {
                oe2 oe2Var = ne2Var.f11642f;
                if (oe2Var.f12132c != j10) {
                    ne2Var.f11642f = oe2Var.a(j10);
                }
            }
            gw1Var = gw1Var2;
            s70Var = s70Var2;
            am2Var = am2Var2;
        } else if (!uj2Var.equals(ze2Var.f16166b)) {
            s70 s70Var4 = s70.f13532d;
            am2 am2Var4 = this.f9946w;
            pu1 pu1Var2 = gw1.f9058t;
            s70Var = s70Var4;
            am2Var = am2Var4;
            gw1Var = gx1.f9060w;
        } else {
            s70Var = s70Var3;
            am2Var = am2Var3;
            gw1Var = list;
        }
        if (z10) {
            he2 he2Var = this.M;
            if (!he2Var.f9209d || he2Var.f9210e == 5) {
                he2Var.f9206a = true;
                he2Var.f9209d = true;
                he2Var.f9210e = i10;
            } else {
                r01.f(i10 == 5);
            }
        }
        return this.L.b(uj2Var, j3, j10, j11, M(), s70Var, am2Var, gw1Var);
    }

    public final void a(ff2 ff2Var) {
        if (!(ff2Var.p() != 0)) {
            return;
        }
        j52 j52Var = this.F;
        if (ff2Var == j52Var.f9856u) {
            j52Var.f9857v = null;
            j52Var.f9856u = null;
            j52Var.f9858w = true;
        }
        if (ff2Var.p() == 2) {
            ff2Var.B();
        }
        ff2Var.o();
        this.X--;
    }

    public final void b() {
        c(new boolean[2]);
    }

    public final void c(boolean[] zArr) {
        me2 me2Var;
        ne2 ne2Var = this.I.f12825i;
        am2 am2Var = ne2Var.f11650n;
        for (int i10 = 0; i10 < 2; i10++) {
            if (!am2Var.b(i10) && this.f9943t.remove(this.f9942s[i10])) {
                this.f9942s[i10].u();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (am2Var.b(i11)) {
                boolean z10 = zArr[i11];
                ff2 ff2Var = this.f9942s[i11];
                if (!C(ff2Var)) {
                    qe2 qe2Var = this.I;
                    ne2 ne2Var2 = qe2Var.f12825i;
                    boolean z11 = ne2Var2 == qe2Var.f12824h;
                    am2 am2Var2 = ne2Var2.f11650n;
                    gf2 gf2Var = am2Var2.f6204b[i11];
                    t[] J = J(am2Var2.f6207e[i11]);
                    boolean z12 = F() && this.L.f16169e == 3;
                    boolean z13 = !z10 && z12;
                    this.X++;
                    this.f9943t.add(ff2Var);
                    ff2Var.g(gf2Var, J, ne2Var2.f11639c[i11], this.Z, z13, z11, ne2Var2.e(), ne2Var2.f11651o);
                    ff2Var.k(11, new de2(this));
                    j52 j52Var = this.F;
                    Objects.requireNonNull(j52Var);
                    me2 h10 = ff2Var.h();
                    if (h10 != null && h10 != (me2Var = j52Var.f9857v)) {
                        if (me2Var != null) {
                            throw o62.b(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        j52Var.f9857v = h10;
                        j52Var.f9856u = ff2Var;
                        h10.b((pt) j52Var.f9854s.f8435w);
                    }
                    if (z12) {
                        ff2Var.S();
                    }
                } else {
                    continue;
                }
            }
        }
        ne2Var.f11643g = true;
    }

    public final void d(IOException iOException, int i10) {
        o62 o62Var = new o62(0, iOException, i10, null, -1, null, 4, false);
        ne2 ne2Var = this.I.f12824h;
        if (ne2Var != null) {
            o62Var = o62Var.a(ne2Var.f11642f.f12130a);
        }
        x90.e("ExoPlayerImplInternal", "Playback error", o62Var);
        v(false, false);
        this.L = this.L.e(o62Var);
    }

    public final void e(boolean z10) {
        ne2 ne2Var = this.I.f12826j;
        uj2 uj2Var = ne2Var == null ? this.L.f16166b : ne2Var.f11642f.f12130a;
        boolean z11 = !this.L.f16175k.equals(uj2Var);
        if (z11) {
            this.L = this.L.a(uj2Var);
        }
        ze2 ze2Var = this.L;
        ze2Var.f16180q = ne2Var == null ? ze2Var.f16182s : ne2Var.c();
        this.L.f16181r = M();
        if ((z11 || z10) && ne2Var != null && ne2Var.f11640d) {
            this.f9947x.h(this.f9942s, ne2Var.f11650n.f6207e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(m4.z40 r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.je2.f(m4.z40, boolean):void");
    }

    public final void g(pt ptVar, boolean z10) {
        i(ptVar, ptVar.f12619a, true, z10);
    }

    @Override // m4.sj2
    public final void h(tj2 tj2Var) {
        ((ho1) this.f9948z.b(8, tj2Var)).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r48.I.h() != r48.I.g()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0888, code lost:
        if (r48.f9947x.e(M(), r48.F.c().f12619a, r48.Q, r29) == false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x08ac, code lost:
        if (r3 == false) goto L458;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0426 A[Catch: all -> 0x04ba, TryCatch #7 {all -> 0x04ba, blocks: (B:183:0x041c, B:185:0x0426, B:187:0x042b, B:189:0x0432, B:190:0x0435, B:192:0x043c, B:194:0x0446, B:196:0x044e, B:200:0x0458, B:202:0x0462, B:204:0x0472, B:207:0x047b, B:212:0x048b, B:216:0x0495), top: B:573:0x041c }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07d1 A[Catch: RuntimeException -> 0x0a26, IOException -> 0x0a51, mq0 -> 0x0a56, mq -> 0x0a5b, uh2 -> 0x0a73, o62 -> 0x0a7c, TryCatch #6 {RuntimeException -> 0x0a26, mq -> 0x0a5b, mq0 -> 0x0a56, o62 -> 0x0a7c, uh2 -> 0x0a73, IOException -> 0x0a51, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:8:0x001c, B:12:0x0023, B:14:0x0027, B:19:0x0034, B:20:0x0038, B:21:0x003c, B:22:0x0040, B:26:0x0047, B:28:0x0050, B:30:0x005e, B:31:0x0063, B:32:0x006e, B:33:0x007f, B:34:0x0093, B:35:0x00a6, B:37:0x00b5, B:38:0x00b9, B:39:0x00c6, B:41:0x00d5, B:42:0x00f1, B:43:0x00ff, B:44:0x0104, B:45:0x010d, B:47:0x011f, B:48:0x012b, B:49:0x013f, B:51:0x014b, B:55:0x0158, B:56:0x015d, B:57:0x016c, B:61:0x0173, B:63:0x017b, B:65:0x017f, B:67:0x0184, B:69:0x018c, B:71:0x0194, B:72:0x0197, B:74:0x019c, B:81:0x01a9, B:82:0x01aa, B:86:0x01b1, B:89:0x01c1, B:92:0x01d3, B:93:0x01d8, B:95:0x01ef, B:97:0x01f3, B:99:0x0201, B:103:0x020b, B:105:0x0210, B:107:0x0216, B:111:0x021e, B:113:0x0226, B:115:0x0249, B:119:0x0252, B:121:0x0274, B:122:0x0277, B:123:0x027a, B:125:0x027e, B:127:0x028e, B:129:0x0294, B:130:0x0298, B:132:0x029c, B:133:0x02a1, B:134:0x02a6, B:135:0x02aa, B:137:0x02b4, B:138:0x02c6, B:140:0x02d1, B:142:0x02df, B:144:0x02eb, B:145:0x02f3, B:147:0x02ff, B:149:0x0327, B:150:0x0347, B:151:0x034b, B:152:0x035d, B:159:0x0368, B:160:0x0369, B:161:0x0370, B:162:0x0378, B:163:0x038d, B:165:0x03ac, B:166:0x03cb, B:170:0x03df, B:172:0x03ef, B:174:0x0402, B:176:0x040c, B:210:0x0484, B:229:0x04ca, B:230:0x04d0, B:231:0x04d1, B:233:0x04df, B:236:0x04e9, B:238:0x04f8, B:240:0x0504, B:242:0x0533, B:243:0x053a, B:244:0x053e, B:246:0x0542, B:247:0x054c, B:248:0x054f, B:251:0x0559, B:253:0x055f, B:256:0x0565, B:259:0x0570, B:261:0x0575, B:264:0x0583, B:266:0x0589, B:267:0x0590, B:268:0x0593, B:270:0x059b, B:272:0x05a9, B:274:0x05bb, B:276:0x05c5, B:279:0x05ce, B:281:0x05d6, B:282:0x05d9, B:286:0x05e0, B:288:0x05ea, B:290:0x05f4, B:292:0x0605, B:294:0x060b, B:295:0x0615, B:296:0x0618, B:298:0x061e, B:301:0x0623, B:303:0x0628, B:305:0x0630, B:307:0x0636, B:309:0x063c, B:313:0x064a, B:314:0x064e, B:315:0x0651, B:316:0x0654, B:318:0x065c, B:320:0x0664, B:323:0x0669, B:324:0x0675, B:326:0x067a, B:328:0x0682, B:332:0x0693, B:334:0x0699, B:335:0x06b3, B:337:0x06b9, B:339:0x06be, B:341:0x06c3, B:343:0x06c7, B:345:0x06cd, B:347:0x06d1, B:349:0x06d9, B:351:0x06df, B:353:0x06e9, B:356:0x06ef, B:357:0x06f2, B:358:0x073f, B:363:0x074e, B:365:0x075a, B:366:0x075f, B:368:0x076d, B:369:0x0781, B:371:0x0786, B:374:0x078f, B:376:0x0796, B:380:0x079f, B:382:0x07a9, B:388:0x07b8, B:390:0x07be, B:400:0x07d1, B:401:0x07d4, B:402:0x07d8, B:403:0x07df, B:405:0x07e5, B:409:0x07ed, B:411:0x07f5, B:413:0x07f9, B:414:0x0804, B:416:0x080a, B:417:0x0810, B:419:0x0817, B:421:0x081b, B:426:0x0826, B:428:0x082a, B:430:0x083c, B:431:0x0842, B:433:0x0850, B:437:0x0859, B:439:0x0863, B:445:0x086e, B:447:0x088a, B:449:0x0896, B:450:0x089a, B:452:0x08a1, B:454:0x08a5, B:458:0x08ae, B:460:0x08bc, B:462:0x08c4, B:464:0x08ce, B:465:0x08d3, B:466:0x08d8, B:467:0x08dd, B:468:0x08e0, B:471:0x08e8, B:473:0x08ec, B:475:0x08f4, B:477:0x0902, B:478:0x0909, B:479:0x090d, B:481:0x0913, B:483:0x091c, B:486:0x0923, B:487:0x092a, B:488:0x092b, B:490:0x0933, B:491:0x0939, B:493:0x093f, B:495:0x0946, B:497:0x094d, B:499:0x0951, B:502:0x0959, B:503:0x0961, B:504:0x0964, B:508:0x096b, B:509:0x0971, B:511:0x0977, B:513:0x097d, B:514:0x09d8, B:515:0x09e0, B:516:0x09e7, B:520:0x09ee, B:521:0x09f6, B:525:0x0a14), top: B:574:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0896 A[Catch: RuntimeException -> 0x0a26, IOException -> 0x0a51, mq0 -> 0x0a56, mq -> 0x0a5b, uh2 -> 0x0a73, o62 -> 0x0a7c, TryCatch #6 {RuntimeException -> 0x0a26, mq -> 0x0a5b, mq0 -> 0x0a56, o62 -> 0x0a7c, uh2 -> 0x0a73, IOException -> 0x0a51, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:8:0x001c, B:12:0x0023, B:14:0x0027, B:19:0x0034, B:20:0x0038, B:21:0x003c, B:22:0x0040, B:26:0x0047, B:28:0x0050, B:30:0x005e, B:31:0x0063, B:32:0x006e, B:33:0x007f, B:34:0x0093, B:35:0x00a6, B:37:0x00b5, B:38:0x00b9, B:39:0x00c6, B:41:0x00d5, B:42:0x00f1, B:43:0x00ff, B:44:0x0104, B:45:0x010d, B:47:0x011f, B:48:0x012b, B:49:0x013f, B:51:0x014b, B:55:0x0158, B:56:0x015d, B:57:0x016c, B:61:0x0173, B:63:0x017b, B:65:0x017f, B:67:0x0184, B:69:0x018c, B:71:0x0194, B:72:0x0197, B:74:0x019c, B:81:0x01a9, B:82:0x01aa, B:86:0x01b1, B:89:0x01c1, B:92:0x01d3, B:93:0x01d8, B:95:0x01ef, B:97:0x01f3, B:99:0x0201, B:103:0x020b, B:105:0x0210, B:107:0x0216, B:111:0x021e, B:113:0x0226, B:115:0x0249, B:119:0x0252, B:121:0x0274, B:122:0x0277, B:123:0x027a, B:125:0x027e, B:127:0x028e, B:129:0x0294, B:130:0x0298, B:132:0x029c, B:133:0x02a1, B:134:0x02a6, B:135:0x02aa, B:137:0x02b4, B:138:0x02c6, B:140:0x02d1, B:142:0x02df, B:144:0x02eb, B:145:0x02f3, B:147:0x02ff, B:149:0x0327, B:150:0x0347, B:151:0x034b, B:152:0x035d, B:159:0x0368, B:160:0x0369, B:161:0x0370, B:162:0x0378, B:163:0x038d, B:165:0x03ac, B:166:0x03cb, B:170:0x03df, B:172:0x03ef, B:174:0x0402, B:176:0x040c, B:210:0x0484, B:229:0x04ca, B:230:0x04d0, B:231:0x04d1, B:233:0x04df, B:236:0x04e9, B:238:0x04f8, B:240:0x0504, B:242:0x0533, B:243:0x053a, B:244:0x053e, B:246:0x0542, B:247:0x054c, B:248:0x054f, B:251:0x0559, B:253:0x055f, B:256:0x0565, B:259:0x0570, B:261:0x0575, B:264:0x0583, B:266:0x0589, B:267:0x0590, B:268:0x0593, B:270:0x059b, B:272:0x05a9, B:274:0x05bb, B:276:0x05c5, B:279:0x05ce, B:281:0x05d6, B:282:0x05d9, B:286:0x05e0, B:288:0x05ea, B:290:0x05f4, B:292:0x0605, B:294:0x060b, B:295:0x0615, B:296:0x0618, B:298:0x061e, B:301:0x0623, B:303:0x0628, B:305:0x0630, B:307:0x0636, B:309:0x063c, B:313:0x064a, B:314:0x064e, B:315:0x0651, B:316:0x0654, B:318:0x065c, B:320:0x0664, B:323:0x0669, B:324:0x0675, B:326:0x067a, B:328:0x0682, B:332:0x0693, B:334:0x0699, B:335:0x06b3, B:337:0x06b9, B:339:0x06be, B:341:0x06c3, B:343:0x06c7, B:345:0x06cd, B:347:0x06d1, B:349:0x06d9, B:351:0x06df, B:353:0x06e9, B:356:0x06ef, B:357:0x06f2, B:358:0x073f, B:363:0x074e, B:365:0x075a, B:366:0x075f, B:368:0x076d, B:369:0x0781, B:371:0x0786, B:374:0x078f, B:376:0x0796, B:380:0x079f, B:382:0x07a9, B:388:0x07b8, B:390:0x07be, B:400:0x07d1, B:401:0x07d4, B:402:0x07d8, B:403:0x07df, B:405:0x07e5, B:409:0x07ed, B:411:0x07f5, B:413:0x07f9, B:414:0x0804, B:416:0x080a, B:417:0x0810, B:419:0x0817, B:421:0x081b, B:426:0x0826, B:428:0x082a, B:430:0x083c, B:431:0x0842, B:433:0x0850, B:437:0x0859, B:439:0x0863, B:445:0x086e, B:447:0x088a, B:449:0x0896, B:450:0x089a, B:452:0x08a1, B:454:0x08a5, B:458:0x08ae, B:460:0x08bc, B:462:0x08c4, B:464:0x08ce, B:465:0x08d3, B:466:0x08d8, B:467:0x08dd, B:468:0x08e0, B:471:0x08e8, B:473:0x08ec, B:475:0x08f4, B:477:0x0902, B:478:0x0909, B:479:0x090d, B:481:0x0913, B:483:0x091c, B:486:0x0923, B:487:0x092a, B:488:0x092b, B:490:0x0933, B:491:0x0939, B:493:0x093f, B:495:0x0946, B:497:0x094d, B:499:0x0951, B:502:0x0959, B:503:0x0961, B:504:0x0964, B:508:0x096b, B:509:0x0971, B:511:0x0977, B:513:0x097d, B:514:0x09d8, B:515:0x09e0, B:516:0x09e7, B:520:0x09ee, B:521:0x09f6, B:525:0x0a14), top: B:574:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0933 A[Catch: RuntimeException -> 0x0a26, IOException -> 0x0a51, mq0 -> 0x0a56, mq -> 0x0a5b, uh2 -> 0x0a73, o62 -> 0x0a7c, TryCatch #6 {RuntimeException -> 0x0a26, mq -> 0x0a5b, mq0 -> 0x0a56, o62 -> 0x0a7c, uh2 -> 0x0a73, IOException -> 0x0a51, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:8:0x001c, B:12:0x0023, B:14:0x0027, B:19:0x0034, B:20:0x0038, B:21:0x003c, B:22:0x0040, B:26:0x0047, B:28:0x0050, B:30:0x005e, B:31:0x0063, B:32:0x006e, B:33:0x007f, B:34:0x0093, B:35:0x00a6, B:37:0x00b5, B:38:0x00b9, B:39:0x00c6, B:41:0x00d5, B:42:0x00f1, B:43:0x00ff, B:44:0x0104, B:45:0x010d, B:47:0x011f, B:48:0x012b, B:49:0x013f, B:51:0x014b, B:55:0x0158, B:56:0x015d, B:57:0x016c, B:61:0x0173, B:63:0x017b, B:65:0x017f, B:67:0x0184, B:69:0x018c, B:71:0x0194, B:72:0x0197, B:74:0x019c, B:81:0x01a9, B:82:0x01aa, B:86:0x01b1, B:89:0x01c1, B:92:0x01d3, B:93:0x01d8, B:95:0x01ef, B:97:0x01f3, B:99:0x0201, B:103:0x020b, B:105:0x0210, B:107:0x0216, B:111:0x021e, B:113:0x0226, B:115:0x0249, B:119:0x0252, B:121:0x0274, B:122:0x0277, B:123:0x027a, B:125:0x027e, B:127:0x028e, B:129:0x0294, B:130:0x0298, B:132:0x029c, B:133:0x02a1, B:134:0x02a6, B:135:0x02aa, B:137:0x02b4, B:138:0x02c6, B:140:0x02d1, B:142:0x02df, B:144:0x02eb, B:145:0x02f3, B:147:0x02ff, B:149:0x0327, B:150:0x0347, B:151:0x034b, B:152:0x035d, B:159:0x0368, B:160:0x0369, B:161:0x0370, B:162:0x0378, B:163:0x038d, B:165:0x03ac, B:166:0x03cb, B:170:0x03df, B:172:0x03ef, B:174:0x0402, B:176:0x040c, B:210:0x0484, B:229:0x04ca, B:230:0x04d0, B:231:0x04d1, B:233:0x04df, B:236:0x04e9, B:238:0x04f8, B:240:0x0504, B:242:0x0533, B:243:0x053a, B:244:0x053e, B:246:0x0542, B:247:0x054c, B:248:0x054f, B:251:0x0559, B:253:0x055f, B:256:0x0565, B:259:0x0570, B:261:0x0575, B:264:0x0583, B:266:0x0589, B:267:0x0590, B:268:0x0593, B:270:0x059b, B:272:0x05a9, B:274:0x05bb, B:276:0x05c5, B:279:0x05ce, B:281:0x05d6, B:282:0x05d9, B:286:0x05e0, B:288:0x05ea, B:290:0x05f4, B:292:0x0605, B:294:0x060b, B:295:0x0615, B:296:0x0618, B:298:0x061e, B:301:0x0623, B:303:0x0628, B:305:0x0630, B:307:0x0636, B:309:0x063c, B:313:0x064a, B:314:0x064e, B:315:0x0651, B:316:0x0654, B:318:0x065c, B:320:0x0664, B:323:0x0669, B:324:0x0675, B:326:0x067a, B:328:0x0682, B:332:0x0693, B:334:0x0699, B:335:0x06b3, B:337:0x06b9, B:339:0x06be, B:341:0x06c3, B:343:0x06c7, B:345:0x06cd, B:347:0x06d1, B:349:0x06d9, B:351:0x06df, B:353:0x06e9, B:356:0x06ef, B:357:0x06f2, B:358:0x073f, B:363:0x074e, B:365:0x075a, B:366:0x075f, B:368:0x076d, B:369:0x0781, B:371:0x0786, B:374:0x078f, B:376:0x0796, B:380:0x079f, B:382:0x07a9, B:388:0x07b8, B:390:0x07be, B:400:0x07d1, B:401:0x07d4, B:402:0x07d8, B:403:0x07df, B:405:0x07e5, B:409:0x07ed, B:411:0x07f5, B:413:0x07f9, B:414:0x0804, B:416:0x080a, B:417:0x0810, B:419:0x0817, B:421:0x081b, B:426:0x0826, B:428:0x082a, B:430:0x083c, B:431:0x0842, B:433:0x0850, B:437:0x0859, B:439:0x0863, B:445:0x086e, B:447:0x088a, B:449:0x0896, B:450:0x089a, B:452:0x08a1, B:454:0x08a5, B:458:0x08ae, B:460:0x08bc, B:462:0x08c4, B:464:0x08ce, B:465:0x08d3, B:466:0x08d8, B:467:0x08dd, B:468:0x08e0, B:471:0x08e8, B:473:0x08ec, B:475:0x08f4, B:477:0x0902, B:478:0x0909, B:479:0x090d, B:481:0x0913, B:483:0x091c, B:486:0x0923, B:487:0x092a, B:488:0x092b, B:490:0x0933, B:491:0x0939, B:493:0x093f, B:495:0x0946, B:497:0x094d, B:499:0x0951, B:502:0x0959, B:503:0x0961, B:504:0x0964, B:508:0x096b, B:509:0x0971, B:511:0x0977, B:513:0x097d, B:514:0x09d8, B:515:0x09e0, B:516:0x09e7, B:520:0x09ee, B:521:0x09f6, B:525:0x0a14), top: B:574:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x093f A[Catch: RuntimeException -> 0x0a26, IOException -> 0x0a51, mq0 -> 0x0a56, mq -> 0x0a5b, uh2 -> 0x0a73, o62 -> 0x0a7c, TryCatch #6 {RuntimeException -> 0x0a26, mq -> 0x0a5b, mq0 -> 0x0a56, o62 -> 0x0a7c, uh2 -> 0x0a73, IOException -> 0x0a51, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:8:0x001c, B:12:0x0023, B:14:0x0027, B:19:0x0034, B:20:0x0038, B:21:0x003c, B:22:0x0040, B:26:0x0047, B:28:0x0050, B:30:0x005e, B:31:0x0063, B:32:0x006e, B:33:0x007f, B:34:0x0093, B:35:0x00a6, B:37:0x00b5, B:38:0x00b9, B:39:0x00c6, B:41:0x00d5, B:42:0x00f1, B:43:0x00ff, B:44:0x0104, B:45:0x010d, B:47:0x011f, B:48:0x012b, B:49:0x013f, B:51:0x014b, B:55:0x0158, B:56:0x015d, B:57:0x016c, B:61:0x0173, B:63:0x017b, B:65:0x017f, B:67:0x0184, B:69:0x018c, B:71:0x0194, B:72:0x0197, B:74:0x019c, B:81:0x01a9, B:82:0x01aa, B:86:0x01b1, B:89:0x01c1, B:92:0x01d3, B:93:0x01d8, B:95:0x01ef, B:97:0x01f3, B:99:0x0201, B:103:0x020b, B:105:0x0210, B:107:0x0216, B:111:0x021e, B:113:0x0226, B:115:0x0249, B:119:0x0252, B:121:0x0274, B:122:0x0277, B:123:0x027a, B:125:0x027e, B:127:0x028e, B:129:0x0294, B:130:0x0298, B:132:0x029c, B:133:0x02a1, B:134:0x02a6, B:135:0x02aa, B:137:0x02b4, B:138:0x02c6, B:140:0x02d1, B:142:0x02df, B:144:0x02eb, B:145:0x02f3, B:147:0x02ff, B:149:0x0327, B:150:0x0347, B:151:0x034b, B:152:0x035d, B:159:0x0368, B:160:0x0369, B:161:0x0370, B:162:0x0378, B:163:0x038d, B:165:0x03ac, B:166:0x03cb, B:170:0x03df, B:172:0x03ef, B:174:0x0402, B:176:0x040c, B:210:0x0484, B:229:0x04ca, B:230:0x04d0, B:231:0x04d1, B:233:0x04df, B:236:0x04e9, B:238:0x04f8, B:240:0x0504, B:242:0x0533, B:243:0x053a, B:244:0x053e, B:246:0x0542, B:247:0x054c, B:248:0x054f, B:251:0x0559, B:253:0x055f, B:256:0x0565, B:259:0x0570, B:261:0x0575, B:264:0x0583, B:266:0x0589, B:267:0x0590, B:268:0x0593, B:270:0x059b, B:272:0x05a9, B:274:0x05bb, B:276:0x05c5, B:279:0x05ce, B:281:0x05d6, B:282:0x05d9, B:286:0x05e0, B:288:0x05ea, B:290:0x05f4, B:292:0x0605, B:294:0x060b, B:295:0x0615, B:296:0x0618, B:298:0x061e, B:301:0x0623, B:303:0x0628, B:305:0x0630, B:307:0x0636, B:309:0x063c, B:313:0x064a, B:314:0x064e, B:315:0x0651, B:316:0x0654, B:318:0x065c, B:320:0x0664, B:323:0x0669, B:324:0x0675, B:326:0x067a, B:328:0x0682, B:332:0x0693, B:334:0x0699, B:335:0x06b3, B:337:0x06b9, B:339:0x06be, B:341:0x06c3, B:343:0x06c7, B:345:0x06cd, B:347:0x06d1, B:349:0x06d9, B:351:0x06df, B:353:0x06e9, B:356:0x06ef, B:357:0x06f2, B:358:0x073f, B:363:0x074e, B:365:0x075a, B:366:0x075f, B:368:0x076d, B:369:0x0781, B:371:0x0786, B:374:0x078f, B:376:0x0796, B:380:0x079f, B:382:0x07a9, B:388:0x07b8, B:390:0x07be, B:400:0x07d1, B:401:0x07d4, B:402:0x07d8, B:403:0x07df, B:405:0x07e5, B:409:0x07ed, B:411:0x07f5, B:413:0x07f9, B:414:0x0804, B:416:0x080a, B:417:0x0810, B:419:0x0817, B:421:0x081b, B:426:0x0826, B:428:0x082a, B:430:0x083c, B:431:0x0842, B:433:0x0850, B:437:0x0859, B:439:0x0863, B:445:0x086e, B:447:0x088a, B:449:0x0896, B:450:0x089a, B:452:0x08a1, B:454:0x08a5, B:458:0x08ae, B:460:0x08bc, B:462:0x08c4, B:464:0x08ce, B:465:0x08d3, B:466:0x08d8, B:467:0x08dd, B:468:0x08e0, B:471:0x08e8, B:473:0x08ec, B:475:0x08f4, B:477:0x0902, B:478:0x0909, B:479:0x090d, B:481:0x0913, B:483:0x091c, B:486:0x0923, B:487:0x092a, B:488:0x092b, B:490:0x0933, B:491:0x0939, B:493:0x093f, B:495:0x0946, B:497:0x094d, B:499:0x0951, B:502:0x0959, B:503:0x0961, B:504:0x0964, B:508:0x096b, B:509:0x0971, B:511:0x0977, B:513:0x097d, B:514:0x09d8, B:515:0x09e0, B:516:0x09e7, B:520:0x09ee, B:521:0x09f6, B:525:0x0a14), top: B:574:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x097d A[Catch: RuntimeException -> 0x0a26, IOException -> 0x0a51, mq0 -> 0x0a56, mq -> 0x0a5b, uh2 -> 0x0a73, o62 -> 0x0a7c, TryCatch #6 {RuntimeException -> 0x0a26, mq -> 0x0a5b, mq0 -> 0x0a56, o62 -> 0x0a7c, uh2 -> 0x0a73, IOException -> 0x0a51, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:8:0x001c, B:12:0x0023, B:14:0x0027, B:19:0x0034, B:20:0x0038, B:21:0x003c, B:22:0x0040, B:26:0x0047, B:28:0x0050, B:30:0x005e, B:31:0x0063, B:32:0x006e, B:33:0x007f, B:34:0x0093, B:35:0x00a6, B:37:0x00b5, B:38:0x00b9, B:39:0x00c6, B:41:0x00d5, B:42:0x00f1, B:43:0x00ff, B:44:0x0104, B:45:0x010d, B:47:0x011f, B:48:0x012b, B:49:0x013f, B:51:0x014b, B:55:0x0158, B:56:0x015d, B:57:0x016c, B:61:0x0173, B:63:0x017b, B:65:0x017f, B:67:0x0184, B:69:0x018c, B:71:0x0194, B:72:0x0197, B:74:0x019c, B:81:0x01a9, B:82:0x01aa, B:86:0x01b1, B:89:0x01c1, B:92:0x01d3, B:93:0x01d8, B:95:0x01ef, B:97:0x01f3, B:99:0x0201, B:103:0x020b, B:105:0x0210, B:107:0x0216, B:111:0x021e, B:113:0x0226, B:115:0x0249, B:119:0x0252, B:121:0x0274, B:122:0x0277, B:123:0x027a, B:125:0x027e, B:127:0x028e, B:129:0x0294, B:130:0x0298, B:132:0x029c, B:133:0x02a1, B:134:0x02a6, B:135:0x02aa, B:137:0x02b4, B:138:0x02c6, B:140:0x02d1, B:142:0x02df, B:144:0x02eb, B:145:0x02f3, B:147:0x02ff, B:149:0x0327, B:150:0x0347, B:151:0x034b, B:152:0x035d, B:159:0x0368, B:160:0x0369, B:161:0x0370, B:162:0x0378, B:163:0x038d, B:165:0x03ac, B:166:0x03cb, B:170:0x03df, B:172:0x03ef, B:174:0x0402, B:176:0x040c, B:210:0x0484, B:229:0x04ca, B:230:0x04d0, B:231:0x04d1, B:233:0x04df, B:236:0x04e9, B:238:0x04f8, B:240:0x0504, B:242:0x0533, B:243:0x053a, B:244:0x053e, B:246:0x0542, B:247:0x054c, B:248:0x054f, B:251:0x0559, B:253:0x055f, B:256:0x0565, B:259:0x0570, B:261:0x0575, B:264:0x0583, B:266:0x0589, B:267:0x0590, B:268:0x0593, B:270:0x059b, B:272:0x05a9, B:274:0x05bb, B:276:0x05c5, B:279:0x05ce, B:281:0x05d6, B:282:0x05d9, B:286:0x05e0, B:288:0x05ea, B:290:0x05f4, B:292:0x0605, B:294:0x060b, B:295:0x0615, B:296:0x0618, B:298:0x061e, B:301:0x0623, B:303:0x0628, B:305:0x0630, B:307:0x0636, B:309:0x063c, B:313:0x064a, B:314:0x064e, B:315:0x0651, B:316:0x0654, B:318:0x065c, B:320:0x0664, B:323:0x0669, B:324:0x0675, B:326:0x067a, B:328:0x0682, B:332:0x0693, B:334:0x0699, B:335:0x06b3, B:337:0x06b9, B:339:0x06be, B:341:0x06c3, B:343:0x06c7, B:345:0x06cd, B:347:0x06d1, B:349:0x06d9, B:351:0x06df, B:353:0x06e9, B:356:0x06ef, B:357:0x06f2, B:358:0x073f, B:363:0x074e, B:365:0x075a, B:366:0x075f, B:368:0x076d, B:369:0x0781, B:371:0x0786, B:374:0x078f, B:376:0x0796, B:380:0x079f, B:382:0x07a9, B:388:0x07b8, B:390:0x07be, B:400:0x07d1, B:401:0x07d4, B:402:0x07d8, B:403:0x07df, B:405:0x07e5, B:409:0x07ed, B:411:0x07f5, B:413:0x07f9, B:414:0x0804, B:416:0x080a, B:417:0x0810, B:419:0x0817, B:421:0x081b, B:426:0x0826, B:428:0x082a, B:430:0x083c, B:431:0x0842, B:433:0x0850, B:437:0x0859, B:439:0x0863, B:445:0x086e, B:447:0x088a, B:449:0x0896, B:450:0x089a, B:452:0x08a1, B:454:0x08a5, B:458:0x08ae, B:460:0x08bc, B:462:0x08c4, B:464:0x08ce, B:465:0x08d3, B:466:0x08d8, B:467:0x08dd, B:468:0x08e0, B:471:0x08e8, B:473:0x08ec, B:475:0x08f4, B:477:0x0902, B:478:0x0909, B:479:0x090d, B:481:0x0913, B:483:0x091c, B:486:0x0923, B:487:0x092a, B:488:0x092b, B:490:0x0933, B:491:0x0939, B:493:0x093f, B:495:0x0946, B:497:0x094d, B:499:0x0951, B:502:0x0959, B:503:0x0961, B:504:0x0964, B:508:0x096b, B:509:0x0971, B:511:0x0977, B:513:0x097d, B:514:0x09d8, B:515:0x09e0, B:516:0x09e7, B:520:0x09ee, B:521:0x09f6, B:525:0x0a14), top: B:574:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [m4.i01, m4.jm2] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r49) {
        /*
            Method dump skipped, instructions count: 2822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.je2.handleMessage(android.os.Message):boolean");
    }

    public final void i(pt ptVar, float f10, boolean z10, boolean z11) {
        int i10;
        je2 je2Var = this;
        if (z10) {
            if (z11) {
                je2Var.M.a(1);
            }
            ze2 ze2Var = je2Var.L;
            je2Var = this;
            je2Var.L = new ze2(ze2Var.f16165a, ze2Var.f16166b, ze2Var.f16167c, ze2Var.f16168d, ze2Var.f16169e, ze2Var.f16170f, ze2Var.f16171g, ze2Var.f16172h, ze2Var.f16173i, ze2Var.f16174j, ze2Var.f16175k, ze2Var.f16176l, ze2Var.f16177m, ptVar, ze2Var.f16180q, ze2Var.f16181r, ze2Var.f16182s, ze2Var.f16179o, ze2Var.p);
        }
        float f11 = ptVar.f12619a;
        ne2 ne2Var = je2Var.I.f12824h;
        while (true) {
            i10 = 0;
            if (ne2Var == null) {
                break;
            }
            kl2[] kl2VarArr = ne2Var.f11650n.f6207e;
            int length = kl2VarArr.length;
            while (i10 < length) {
                kl2 kl2Var = kl2VarArr[i10];
                i10++;
            }
            ne2Var = ne2Var.f11648l;
        }
        ff2[] ff2VarArr = je2Var.f9942s;
        while (i10 < 2) {
            ff2 ff2Var = ff2VarArr[i10];
            if (ff2Var != null) {
                ff2Var.n(f10, ptVar.f12619a);
            }
            i10++;
        }
    }

    public final void j() {
        boolean z10;
        if (!B()) {
            z10 = false;
        } else {
            ne2 ne2Var = this.I.f12826j;
            long j3 = 0;
            long c10 = !ne2Var.f11640d ? 0L : ne2Var.f11637a.c();
            ne2 ne2Var2 = this.I.f12826j;
            if (ne2Var2 != null) {
                j3 = Math.max(0L, c10 - (this.Z - ne2Var2.f11651o));
            }
            if (ne2Var != this.I.f12824h) {
                long j10 = ne2Var.f11642f.f12131b;
            }
            z10 = this.f9947x.d(j3, this.F.c().f12619a);
        }
        this.R = z10;
        if (z10) {
            ne2 ne2Var3 = this.I.f12826j;
            long j11 = this.Z;
            r01.h(ne2Var3.p());
            ne2Var3.f11637a.b(j11 - ne2Var3.f11651o);
        }
        x();
    }

    public final void k() {
        he2 he2Var = this.M;
        ze2 ze2Var = this.L;
        boolean z10 = he2Var.f9206a | (he2Var.f9207b != ze2Var);
        he2Var.f9206a = z10;
        he2Var.f9207b = ze2Var;
        if (z10) {
            be2 be2Var = (be2) this.f9940d0.f6607s;
            be2Var.f6486f.d(new vz(be2Var, he2Var));
            this.M = new he2(this.L);
        }
    }

    @Override // m4.sj2
    public final /* bridge */ /* synthetic */ void l(al2 al2Var) {
        ((ho1) this.f9948z.b(9, (tj2) al2Var)).a();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.HashSet, java.util.Set<m4.we2>] */
    public final void m(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j3;
        uj2 uj2Var;
        boolean z14;
        List list;
        this.f9948z.c();
        o62 o62Var = null;
        this.f9939c0 = null;
        this.Q = false;
        j52 j52Var = this.F;
        j52Var.f9859x = false;
        ff ffVar = j52Var.f9854s;
        if (ffVar.f8431s) {
            ffVar.a(ffVar.zza());
            ffVar.f8431s = false;
        }
        this.Z = 0L;
        ff2[] ff2VarArr = this.f9942s;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                a(ff2VarArr[i10]);
            } catch (RuntimeException | o62 e10) {
                x90.e("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            ff2[] ff2VarArr2 = this.f9942s;
            for (int i11 = 0; i11 < 2; i11++) {
                ff2 ff2Var = ff2VarArr2[i11];
                if (this.f9943t.remove(ff2Var)) {
                    try {
                        ff2Var.u();
                    } catch (RuntimeException e11) {
                        x90.e("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.X = 0;
        ze2 ze2Var = this.L;
        uj2 uj2Var2 = ze2Var.f16166b;
        long j10 = ze2Var.f16182s;
        long j11 = (this.L.f16166b.a() || E(this.L, this.D)) ? this.L.f16167c : this.L.f16182s;
        if (z11) {
            this.Y = null;
            Pair<uj2, Long> P = P(this.L.f16165a);
            uj2 uj2Var3 = (uj2) P.first;
            long longValue = ((Long) P.second).longValue();
            z14 = !uj2Var3.equals(this.L.f16166b);
            uj2Var = uj2Var3;
            j3 = longValue;
            j11 = -9223372036854775807L;
        } else {
            z14 = false;
            uj2Var = uj2Var2;
            j3 = j10;
        }
        this.I.l();
        this.R = false;
        ze2 ze2Var2 = this.L;
        z40 z40Var = ze2Var2.f16165a;
        int i12 = ze2Var2.f16169e;
        if (!z13) {
            o62Var = ze2Var2.f16170f;
        }
        o62 o62Var2 = o62Var;
        s70 s70Var = z14 ? s70.f13532d : ze2Var2.f16172h;
        am2 am2Var = z14 ? this.f9946w : ze2Var2.f16173i;
        if (z14) {
            pu1 pu1Var = gw1.f9058t;
            list = gx1.f9060w;
        } else {
            list = ze2Var2.f16174j;
        }
        this.L = new ze2(z40Var, uj2Var, j11, j3, i12, o62Var2, false, s70Var, am2Var, list, uj2Var, ze2Var2.f16176l, ze2Var2.f16177m, ze2Var2.f16178n, j3, 0L, j3, this.W, false);
        if (z12) {
            ye2 ye2Var = this.J;
            for (ve2 ve2Var : ye2Var.f15667g.values()) {
                try {
                    ve2Var.f14665a.e(ve2Var.f14666b);
                } catch (RuntimeException e12) {
                    x90.e("MediaSourceList", "Failed to release child source.", e12);
                }
                ve2Var.f14665a.f(ve2Var.f14667c);
                ve2Var.f14665a.g(ve2Var.f14667c);
            }
            ye2Var.f15667g.clear();
            ye2Var.f15668h.clear();
            ye2Var.f15669i = false;
        }
    }

    public final void n() {
        ne2 ne2Var = this.I.f12824h;
        boolean z10 = false;
        if (ne2Var != null && ne2Var.f11642f.f12136g && this.O) {
            z10 = true;
        }
        this.P = z10;
    }

    public final void o(long j3) {
        kl2[] kl2VarArr;
        ne2 ne2Var = this.I.f12824h;
        if (ne2Var != null) {
            j3 += ne2Var.f11651o;
        }
        this.Z = j3;
        this.F.f9854s.a(j3);
        ff2[] ff2VarArr = this.f9942s;
        for (int i10 = 0; i10 < 2; i10++) {
            ff2 ff2Var = ff2VarArr[i10];
            if (C(ff2Var)) {
                ff2Var.j(this.Z);
            }
        }
        for (ne2 ne2Var2 = this.I.f12824h; ne2Var2 != null; ne2Var2 = ne2Var2.f11648l) {
            for (kl2 kl2Var : ne2Var2.f11650n.f6207e) {
            }
        }
    }

    public final void p(z40 z40Var, z40 z40Var2) {
        if (!z40Var.o() || !z40Var2.o()) {
            int size = this.G.size() - 1;
            if (size < 0) {
                Collections.sort(this.G);
                return;
            }
            Objects.requireNonNull(this.G.get(size));
            xf2.b(-9223372036854775807L);
            throw null;
        }
    }

    public final void q(long j3, long j10) {
        this.f9948z.c();
        this.f9948z.f15435a.sendEmptyMessageAtTime(2, j3 + j10);
    }

    public final void r(boolean z10) {
        uj2 uj2Var = this.I.f12824h.f11642f.f12130a;
        long O = O(uj2Var, this.L.f16182s, true, false);
        if (O != this.L.f16182s) {
            ze2 ze2Var = this.L;
            this.L = R(uj2Var, O, ze2Var.f16167c, ze2Var.f16168d, z10, 5);
        }
    }

    public final void s(boolean z10, int i10, boolean z11, int i11) {
        kl2[] kl2VarArr;
        this.M.a(z11 ? 1 : 0);
        he2 he2Var = this.M;
        he2Var.f9206a = true;
        he2Var.f9211f = true;
        he2Var.f9212g = i11;
        this.L = this.L.d(z10, i10);
        this.Q = false;
        for (ne2 ne2Var = this.I.f12824h; ne2Var != null; ne2Var = ne2Var.f11648l) {
            for (kl2 kl2Var : ne2Var.f11650n.f6207e) {
            }
        }
        if (!F()) {
            w();
            A();
            return;
        }
        int i12 = this.L.f16169e;
        if (i12 == 3) {
            u();
            this.f9948z.e(2);
        } else if (i12 == 2) {
            this.f9948z.e(2);
        }
    }

    public final void t(int i10) {
        ze2 ze2Var = this.L;
        if (ze2Var.f16169e != i10) {
            this.L = ze2Var.f(i10);
        }
    }

    public final void u() {
        this.Q = false;
        j52 j52Var = this.F;
        j52Var.f9859x = true;
        j52Var.f9854s.d();
        ff2[] ff2VarArr = this.f9942s;
        for (int i10 = 0; i10 < 2; i10++) {
            ff2 ff2Var = ff2VarArr[i10];
            if (C(ff2Var)) {
                ff2Var.S();
            }
        }
    }

    public final void v(boolean z10, boolean z11) {
        m(z10 || !this.U, false, true, false);
        this.M.a(z11 ? 1 : 0);
        this.f9947x.g();
        t(1);
    }

    public final void w() {
        j52 j52Var = this.F;
        j52Var.f9859x = false;
        ff ffVar = j52Var.f9854s;
        if (ffVar.f8431s) {
            ffVar.a(ffVar.zza());
            ffVar.f8431s = false;
        }
        ff2[] ff2VarArr = this.f9942s;
        for (int i10 = 0; i10 < 2; i10++) {
            ff2 ff2Var = ff2VarArr[i10];
            if (C(ff2Var) && ff2Var.p() == 2) {
                ff2Var.B();
            }
        }
    }

    public final void x() {
        ne2 ne2Var = this.I.f12826j;
        boolean z10 = this.R || (ne2Var != null && ne2Var.f11637a.k());
        ze2 ze2Var = this.L;
        if (z10 != ze2Var.f16171g) {
            this.L = new ze2(ze2Var.f16165a, ze2Var.f16166b, ze2Var.f16167c, ze2Var.f16168d, ze2Var.f16169e, ze2Var.f16170f, z10, ze2Var.f16172h, ze2Var.f16173i, ze2Var.f16174j, ze2Var.f16175k, ze2Var.f16176l, ze2Var.f16177m, ze2Var.f16178n, ze2Var.f16180q, ze2Var.f16181r, ze2Var.f16182s, ze2Var.f16179o, ze2Var.p);
        }
    }

    public final void y(z40 z40Var, uj2 uj2Var, z40 z40Var2, uj2 uj2Var2, long j3) {
        if (!z40Var.o() && G(z40Var, uj2Var)) {
            z40Var.e(z40Var.n(uj2Var.f8973a, this.D).f7204c, this.C, 0L);
            g32 g32Var = this.f9941e0;
            sc scVar = this.C.f9843i;
            int i10 = ls1.f10971a;
            Objects.requireNonNull(g32Var);
            long j10 = scVar.f13585a;
            g32Var.f8732c = xf2.b(-9223372036854775807L);
            g32Var.f8735f = xf2.b(-9223372036854775807L);
            g32Var.f8736g = xf2.b(-9223372036854775807L);
            g32Var.f8739j = 0.97f;
            g32Var.f8738i = 1.03f;
            g32Var.c();
            if (j3 != -9223372036854775807L) {
                g32 g32Var2 = this.f9941e0;
                g32Var2.f8733d = L(z40Var, uj2Var.f8973a, j3);
                g32Var2.c();
                return;
            }
            if (ls1.f(!z40Var2.o() ? z40Var2.e(z40Var2.n(uj2Var2.f8973a, this.D).f7204c, this.C, 0L).f9835a : null, this.C.f9835a)) {
                return;
            }
            g32 g32Var3 = this.f9941e0;
            g32Var3.f8733d = -9223372036854775807L;
            g32Var3.c();
            return;
        }
        float f10 = this.F.c().f12619a;
        pt ptVar = this.L.f16178n;
        if (f10 == ptVar.f12619a) {
            return;
        }
        this.F.b(ptVar);
    }

    public final void z(s70 s70Var, am2 am2Var) {
        this.f9947x.h(this.f9942s, am2Var.f6207e);
    }
}
