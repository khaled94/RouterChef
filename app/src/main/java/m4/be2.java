package m4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import androidx.fragment.app.b1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import t3.w;

/* loaded from: classes.dex */
public final class be2 extends te2 {
    public final bs A;

    /* renamed from: c */
    public final sw f6483c;

    /* renamed from: d */
    public final ff2[] f6484d;

    /* renamed from: e */
    public final yl2 f6485e;

    /* renamed from: f */
    public final xo1 f6486f;

    /* renamed from: g */
    public final je2 f6487g;

    /* renamed from: h */
    public final ec1<rx> f6488h;

    /* renamed from: m */
    public final gk2 f6493m;

    /* renamed from: n */
    public final eg2 f6494n;

    /* renamed from: o */
    public final Looper f6495o;
    public final jm2 p;

    /* renamed from: q */
    public final g11 f6496q;

    /* renamed from: r */
    public int f6497r;

    /* renamed from: s */
    public int f6498s;

    /* renamed from: t */
    public boolean f6499t;

    /* renamed from: u */
    public int f6500u;

    /* renamed from: v */
    public sw f6501v;

    /* renamed from: w */
    public lm f6502w;

    /* renamed from: x */
    public ze2 f6503x;
    public int y;

    /* renamed from: z */
    public long f6504z;

    /* renamed from: l */
    public final boolean f6492l = true;

    /* renamed from: i */
    public final CopyOnWriteArraySet<f72> f6489i = new CopyOnWriteArraySet<>();

    /* renamed from: k */
    public final List<ae2> f6491k = new ArrayList();
    public bl2 B = new bl2(new int[0], new Random());

    /* renamed from: b */
    public final am2 f6482b = new am2(new gf2[2], new kl2[2], tf0.f14040b, null);

    /* renamed from: j */
    public final d30 f6490j = new d30();

    @SuppressLint({"HandlerLeak"})
    public be2(ff2[] ff2VarArr, yl2 yl2Var, gk2 gk2Var, le2 le2Var, jm2 jm2Var, eg2 eg2Var, hf2 hf2Var, g32 g32Var, g11 g11Var, Looper looper, te2 te2Var, sw swVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = ls1.f10975e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        b1.b(sb, "Init ", hexString, " [ExoPlayerLib/2.15.1] [", str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = ff2VarArr.length;
        this.f6484d = ff2VarArr;
        Objects.requireNonNull(yl2Var);
        this.f6485e = yl2Var;
        this.f6493m = gk2Var;
        this.p = jm2Var;
        this.f6494n = eg2Var;
        boolean z10 = true;
        this.f6495o = looper;
        this.f6496q = g11Var;
        this.f6488h = new ec1<>(new CopyOnWriteArraySet(), looper, g11Var, new tz(te2Var));
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19, 29};
        for (int i10 = 0; i10 < 11; i10++) {
            int i11 = iArr[i10];
            r01.h(!false);
            sparseBooleanArray.append(i11, true);
        }
        r01.h(true);
        sparseBooleanArray.append(28, true);
        io2 io2Var = swVar.f13832a;
        for (int i12 = 0; i12 < io2Var.b(); i12++) {
            int a10 = io2Var.a(i12);
            r01.h(true);
            sparseBooleanArray.append(a10, true);
        }
        r01.h(true);
        io2 io2Var2 = new io2(sparseBooleanArray);
        this.f6483c = new sw(io2Var2);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i13 = 0; i13 < io2Var2.b(); i13++) {
            int a11 = io2Var2.a(i13);
            r01.h(true);
            sparseBooleanArray2.append(a11, true);
        }
        r01.h(true);
        sparseBooleanArray2.append(3, true);
        r01.h(true);
        sparseBooleanArray2.append(9, true);
        r01.h(true);
        this.f6501v = new sw(new io2(sparseBooleanArray2));
        this.f6502w = lm.f10918s;
        this.y = -1;
        bn1 bn1Var = (bn1) g11Var;
        this.f6486f = (xo1) bn1Var.a(looper, null);
        bs bsVar = new bs(this);
        this.A = bsVar;
        this.f6503x = ze2.h(this.f6482b);
        if (eg2Var.f7899x != null && !eg2Var.f7896u.f7393b.isEmpty()) {
            z10 = false;
        }
        r01.h(z10);
        eg2Var.f7899x = te2Var;
        eg2Var.y = new xo1(new Handler(looper, null));
        ec1<gg2> ec1Var = eg2Var.f7898w;
        eg2Var.f7898w = new ec1<>(ec1Var.f7783d, looper, ec1Var.f7780a, new w(eg2Var, te2Var));
        this.f6488h.a(eg2Var);
        Handler handler = new Handler(looper);
        hm2 hm2Var = ((rm2) jm2Var).f13396t;
        hm2Var.a(eg2Var);
        hm2Var.f9380a.add(new gm2(handler, eg2Var));
        this.f6487g = new je2(ff2VarArr, yl2Var, this.f6482b, le2Var, jm2Var, eg2Var, hf2Var, g32Var, looper, bn1Var, bsVar);
    }

    public static long q(ze2 ze2Var) {
        j40 j40Var = new j40();
        d30 d30Var = new d30();
        ze2Var.f16165a.n(ze2Var.f16166b.f8973a, d30Var);
        long j3 = ze2Var.f16167c;
        if (j3 == -9223372036854775807L) {
            Objects.requireNonNull(ze2Var.f16165a.e(d30Var.f7204c, j40Var, 0L));
            return 0L;
        }
        return j3;
    }

    public static boolean v(ze2 ze2Var) {
        return ze2Var.f16169e == 3 && ze2Var.f16176l && ze2Var.f16177m == 0;
    }

    @Override // m4.te2
    public final int e() {
        if (m()) {
            return this.f6503x.f16166b.f8974b;
        }
        return -1;
    }

    @Override // m4.te2
    public final int f() {
        if (m()) {
            return this.f6503x.f16166b.f8975c;
        }
        return -1;
    }

    @Override // m4.te2
    public final int g() {
        int o10 = o();
        if (o10 == -1) {
            return 0;
        }
        return o10;
    }

    @Override // m4.te2
    public final int h() {
        if (this.f6503x.f16165a.o()) {
            return 0;
        }
        ze2 ze2Var = this.f6503x;
        return ze2Var.f16165a.a(ze2Var.f16166b.f8973a);
    }

    @Override // m4.te2
    public final long i() {
        if (m()) {
            ze2 ze2Var = this.f6503x;
            ze2Var.f16165a.n(ze2Var.f16166b.f8973a, this.f6490j);
            ze2 ze2Var2 = this.f6503x;
            if (ze2Var2.f16167c != -9223372036854775807L) {
                return xf2.c(0L) + xf2.c(this.f6503x.f16167c);
            }
            Objects.requireNonNull(ze2Var2.f16165a.e(g(), this.f14039a, 0L));
            return xf2.c(0L);
        }
        return j();
    }

    @Override // m4.te2
    public final long j() {
        return xf2.c(p(this.f6503x));
    }

    @Override // m4.te2
    public final long k() {
        return xf2.c(this.f6503x.f16181r);
    }

    @Override // m4.te2
    public final z40 l() {
        return this.f6503x.f16165a;
    }

    @Override // m4.te2
    public final boolean m() {
        return this.f6503x.f16166b.a();
    }

    public final void n(o62 o62Var) {
        ze2 ze2Var = this.f6503x;
        ze2 a10 = ze2Var.a(ze2Var.f16166b);
        a10.f16180q = a10.f16182s;
        a10.f16181r = 0L;
        ze2 f10 = a10.f(1);
        if (o62Var != null) {
            f10 = f10.e(o62Var);
        }
        ze2 ze2Var2 = f10;
        this.f6497r++;
        ((ho1) this.f6487g.f9948z.a(6)).a();
        u(ze2Var2, 0, 1, false, ze2Var2.f16165a.o() && !this.f6503x.f16165a.o(), 4, p(ze2Var2), -1);
    }

    public final int o() {
        if (this.f6503x.f16165a.o()) {
            return this.y;
        }
        ze2 ze2Var = this.f6503x;
        return ze2Var.f16165a.n(ze2Var.f16166b.f8973a, this.f6490j).f7204c;
    }

    public final long p(ze2 ze2Var) {
        if (ze2Var.f16165a.o()) {
            return xf2.b(this.f6504z);
        }
        if (ze2Var.f16166b.a()) {
            return ze2Var.f16182s;
        }
        z40 z40Var = ze2Var.f16165a;
        uj2 uj2Var = ze2Var.f16166b;
        long j3 = ze2Var.f16182s;
        r(z40Var, uj2Var, j3);
        return j3;
    }

    public final long r(z40 z40Var, uj2 uj2Var, long j3) {
        z40Var.n(uj2Var.f8973a, this.f6490j);
        return j3;
    }

    public final Pair<Object, Long> s(z40 z40Var, int i10, long j3) {
        if (z40Var.o()) {
            this.y = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f6504z = j3;
            return null;
        }
        if (i10 == -1 || i10 >= z40Var.c()) {
            i10 = z40Var.g(false);
            Objects.requireNonNull(z40Var.e(i10, this.f14039a, 0L));
            j3 = xf2.c(0L);
        }
        return z40Var.l(this.f14039a, this.f6490j, i10, xf2.b(j3));
    }

    public final ze2 t(ze2 ze2Var, z40 z40Var, Pair<Object, Long> pair) {
        List<ln0> list;
        int i10;
        ze2 ze2Var2;
        long j3;
        r01.f(z40Var.o() || pair != null);
        z40 z40Var2 = ze2Var.f16165a;
        ze2 g10 = ze2Var.g(z40Var);
        if (z40Var.o()) {
            uj2 uj2Var = ze2.f16164t;
            uj2 uj2Var2 = ze2.f16164t;
            long b10 = xf2.b(this.f6504z);
            s70 s70Var = s70.f13532d;
            am2 am2Var = this.f6482b;
            pu1 pu1Var = gw1.f9058t;
            ze2 a10 = g10.b(uj2Var2, b10, b10, b10, 0L, s70Var, am2Var, gx1.f9060w).a(uj2Var2);
            a10.f16180q = a10.f16182s;
            return a10;
        }
        Object obj = g10.f16166b.f8973a;
        int i11 = ls1.f10971a;
        boolean z10 = !obj.equals(pair.first);
        uj2 uj2Var3 = z10 ? new uj2(pair.first) : g10.f16166b;
        long longValue = ((Long) pair.second).longValue();
        long b11 = xf2.b(i());
        if (!z40Var2.o()) {
            z40Var2.n(obj, this.f6490j);
        }
        if (z10 || longValue < b11) {
            r01.h(!uj2Var3.a());
            s70 s70Var2 = z10 ? s70.f13532d : g10.f16172h;
            am2 am2Var2 = z10 ? this.f6482b : g10.f16173i;
            if (z10) {
                pu1 pu1Var2 = gw1.f9058t;
                list = gx1.f9060w;
            } else {
                list = g10.f16174j;
            }
            ze2 a11 = g10.b(uj2Var3, longValue, longValue, longValue, 0L, s70Var2, am2Var2, list).a(uj2Var3);
            a11.f16180q = longValue;
            return a11;
        }
        if (i10 == 0) {
            int a12 = z40Var.a(g10.f16175k.f8973a);
            if (a12 != -1 && z40Var.d(a12, this.f6490j, false).f7204c == z40Var.n(uj2Var3.f8973a, this.f6490j).f7204c) {
                return g10;
            }
            z40Var.n(uj2Var3.f8973a, this.f6490j);
            long b12 = uj2Var3.a() ? this.f6490j.b(uj2Var3.f8974b, uj2Var3.f8975c) : this.f6490j.f7205d;
            ze2Var2 = g10.b(uj2Var3, g10.f16182s, g10.f16182s, g10.f16168d, b12 - g10.f16182s, g10.f16172h, g10.f16173i, g10.f16174j).a(uj2Var3);
            j3 = b12;
        } else {
            r01.h(!uj2Var3.a());
            long max = Math.max(0L, g10.f16181r - (longValue - b11));
            long j10 = g10.f16180q;
            if (g10.f16175k.equals(g10.f16166b)) {
                j10 = longValue + max;
            }
            ze2Var2 = g10.b(uj2Var3, longValue, longValue, longValue, max, g10.f16172h, g10.f16173i, g10.f16174j);
            j3 = j10;
        }
        ze2Var2.f16180q = j3;
        return ze2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0425, code lost:
        if (r4.e(g(), r40.f14039a, 0).f9841g != false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(final m4.ze2 r41, int r42, final int r43, boolean r44, boolean r45, final int r46, long r47, int r49) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.be2.u(m4.ze2, int, int, boolean, boolean, int, long, int):void");
    }

    public final void w(int i10, long j3) {
        z40 z40Var = this.f6503x.f16165a;
        if (i10 < 0 || (!z40Var.o() && i10 >= z40Var.c())) {
            throw new q0();
        }
        int i11 = 1;
        this.f6497r++;
        if (!m()) {
            if (this.f6503x.f16169e != 1) {
                i11 = 2;
            }
            int g10 = g();
            ze2 t10 = t(this.f6503x.f(i11), z40Var, s(z40Var, i10, j3));
            ((ho1) this.f6487g.f9948z.b(3, new ie2(z40Var, i10, xf2.b(j3)))).a();
            u(t10, 0, 1, true, true, 1, p(t10), g10);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        he2 he2Var = new he2(this.f6503x);
        he2Var.a(1);
        be2 be2Var = (be2) this.A.f6607s;
        be2Var.f6486f.d(new vz(be2Var, he2Var));
    }

    public final long x() {
        long b10;
        if (!m()) {
            z40 z40Var = this.f6503x.f16165a;
            if (z40Var.o()) {
                return -9223372036854775807L;
            }
            b10 = z40Var.e(g(), this.f14039a, 0L).f9845k;
        } else {
            ze2 ze2Var = this.f6503x;
            uj2 uj2Var = ze2Var.f16166b;
            ze2Var.f16165a.n(uj2Var.f8973a, this.f6490j);
            b10 = this.f6490j.b(uj2Var.f8974b, uj2Var.f8975c);
        }
        return xf2.c(b10);
    }

    public final cf2 y(bf2 bf2Var) {
        je2 je2Var = this.f6487g;
        z40 z40Var = this.f6503x.f16165a;
        g();
        return new cf2(je2Var, bf2Var, this.f6487g.B);
    }
}
