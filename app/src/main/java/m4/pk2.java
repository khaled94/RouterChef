package m4;

import a6.f;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class pk2 implements tj2, vo2, wm2, an2, xk2 {

    /* renamed from: c0 */
    public static final Map<String, String> f12543c0;

    /* renamed from: d0 */
    public static final t f12544d0;
    public final q72 A;
    public sj2 F;
    public oq2 G;
    public boolean J;
    public boolean K;
    public boolean L;
    public ok2 M;
    public jp2 N;
    public boolean P;
    public boolean R;
    public boolean S;
    public int T;
    public long V;
    public boolean X;
    public int Y;
    public boolean Z;

    /* renamed from: a0 */
    public boolean f12545a0;

    /* renamed from: b0 */
    public final pm2 f12546b0;

    /* renamed from: s */
    public final Uri f12547s;

    /* renamed from: t */
    public final kq0 f12548t;

    /* renamed from: u */
    public final ai2 f12549u;

    /* renamed from: v */
    public final ek2 f12550v;

    /* renamed from: w */
    public final wh2 f12551w;

    /* renamed from: x */
    public final tk2 f12552x;
    public final long y;

    /* renamed from: z */
    public final cn2 f12553z = new cn2();
    public final h21 B = new h21();
    public final kb0 C = new kb0(this, 1);
    public final ib D = new ib(this, 5);
    public final Handler E = ls1.x();
    public nk2[] I = new nk2[0];
    public yk2[] H = new yk2[0];
    public long W = -9223372036854775807L;
    public long U = -1;
    public long O = -9223372036854775807L;
    public int Q = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f12543c0 = Collections.unmodifiableMap(hashMap);
        kq2 kq2Var = new kq2();
        kq2Var.f10533a = "icy";
        kq2Var.f10542j = "application/x-icy";
        f12544d0 = new t(kq2Var);
    }

    public pk2(Uri uri, kq0 kq0Var, q72 q72Var, ai2 ai2Var, wh2 wh2Var, ek2 ek2Var, tk2 tk2Var, pm2 pm2Var, int i10) {
        this.f12547s = uri;
        this.f12548t = kq0Var;
        this.f12549u = ai2Var;
        this.f12551w = wh2Var;
        this.f12550v = ek2Var;
        this.f12552x = tk2Var;
        this.f12546b0 = pm2Var;
        this.y = i10;
        this.A = q72Var;
    }

    public final void A(int i10) {
        v();
        boolean[] zArr = this.M.f12192b;
        if (!this.X || !zArr[i10] || this.H[i10].m(false)) {
            return;
        }
        this.W = 0L;
        this.X = false;
        this.S = true;
        this.V = 0L;
        this.Y = 0;
        for (yk2 yk2Var : this.H) {
            yk2Var.l(false);
        }
        sj2 sj2Var = this.F;
        Objects.requireNonNull(sj2Var);
        sj2Var.l(this);
    }

    public final void B() {
        lk2 lk2Var = new lk2(this, this.f12547s, this.f12548t, this.A, this, this.B);
        if (this.K) {
            r01.h(C());
            long j3 = this.O;
            if (j3 != -9223372036854775807L && this.W > j3) {
                this.Z = true;
                this.W = -9223372036854775807L;
                return;
            }
            jp2 jp2Var = this.N;
            Objects.requireNonNull(jp2Var);
            long j10 = jp2Var.d(this.W).f9408a.f10526b;
            long j11 = this.W;
            lk2Var.f10897g.f8999a = j10;
            lk2Var.f10900j = j11;
            lk2Var.f10899i = true;
            lk2Var.f10904n = false;
            for (yk2 yk2Var : this.H) {
                yk2Var.f15823r = this.W;
            }
            this.W = -9223372036854775807L;
        }
        this.Y = s();
        cn2 cn2Var = this.f12553z;
        Objects.requireNonNull(cn2Var);
        Looper myLooper = Looper.myLooper();
        r01.d(myLooper);
        cn2Var.f7082c = null;
        new ym2(cn2Var, myLooper, lk2Var, this, SystemClock.elapsedRealtime()).b(0L);
        gs0 gs0Var = lk2Var.f10901k;
        ek2 ek2Var = this.f12550v;
        Uri uri = gs0Var.f9017a;
        Collections.emptyMap();
        nj2 nj2Var = new nj2();
        long j12 = lk2Var.f10900j;
        long j13 = this.O;
        Objects.requireNonNull(ek2Var);
        ek2.g(j12);
        ek2.g(j13);
        ek2Var.f(nj2Var, new w3((t) null));
    }

    public final boolean C() {
        return this.W != -9223372036854775807L;
    }

    public final boolean D() {
        return this.S || C();
    }

    @Override // m4.tj2, m4.al2
    public final long a() {
        long j3;
        boolean z10;
        long j10;
        v();
        boolean[] zArr = this.M.f12192b;
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.W;
        }
        if (this.L) {
            int length = this.H.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10]) {
                    yk2 yk2Var = this.H[i10];
                    synchronized (yk2Var) {
                        z10 = yk2Var.f15826u;
                    }
                    if (!z10) {
                        yk2 yk2Var2 = this.H[i10];
                        synchronized (yk2Var2) {
                            j10 = yk2Var2.f15825t;
                        }
                        j3 = Math.min(j3, j10);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = t();
        }
        return j3 == Long.MIN_VALUE ? this.V : j3;
    }

    @Override // m4.tj2, m4.al2
    public final boolean b(long j3) {
        if (!this.Z) {
            if (!(this.f12553z.f7082c != null) && !this.X && (!this.K || this.T != 0)) {
                boolean b10 = this.B.b();
                if (this.f12553z.a()) {
                    return b10;
                }
                B();
                return true;
            }
        }
        return false;
    }

    @Override // m4.tj2, m4.al2
    public final long c() {
        if (this.T == 0) {
            return Long.MIN_VALUE;
        }
        return a();
    }

    @Override // m4.tj2
    public final s70 d() {
        v();
        return this.M.f12191a;
    }

    @Override // m4.tj2, m4.al2
    public final void e(long j3) {
    }

    @Override // m4.tj2
    public final long f(long j3, hf2 hf2Var) {
        v();
        if (!this.N.f()) {
            return 0L;
        }
        hp2 d5 = this.N.d(j3);
        long j10 = d5.f9408a.f10525a;
        long j11 = d5.f9409b.f10525a;
        long j12 = hf2Var.f9227a;
        if (j12 == 0 && hf2Var.f9228b == 0) {
            return j3;
        }
        long j13 = j3 - j12;
        if (((j12 ^ j3) & (j3 ^ j13)) < 0) {
            j13 = Long.MIN_VALUE;
        }
        long j14 = hf2Var.f9228b;
        long j15 = j3 + j14;
        if (((j14 ^ j15) & (j3 ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z10 = true;
        boolean z11 = j13 <= j10 && j10 <= j15;
        if (j13 > j11 || j11 > j15) {
            z10 = false;
        }
        if (!z11 || !z10) {
            if (!z11) {
                return z10 ? j11 : j13;
            }
        } else if (Math.abs(j10 - j3) > Math.abs(j11 - j3)) {
            return j11;
        }
        return j10;
    }

    @Override // m4.tj2
    public final long g() {
        if (this.S) {
            if (!this.Z && s() <= this.Y) {
                return -9223372036854775807L;
            }
            this.S = false;
            return this.V;
        }
        return -9223372036854775807L;
    }

    public final void h() {
        IOException iOException;
        cn2 cn2Var = this.f12553z;
        int i10 = this.Q == 7 ? 6 : 3;
        IOException iOException2 = cn2Var.f7082c;
        if (iOException2 == null) {
            ym2<? extends lk2> ym2Var = cn2Var.f7081b;
            if (ym2Var != null && (iOException = ym2Var.f15843v) != null && ym2Var.f15844w > i10) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    @Override // m4.tj2
    public final void i() {
        h();
        if (!this.Z || this.K) {
            return;
        }
        throw mq.a("Loading finished before preparation is complete.", null);
    }

    @Override // m4.tj2
    public final long j(long j3) {
        v();
        boolean[] zArr = this.M.f12192b;
        if (true != this.N.f()) {
            j3 = 0;
        }
        this.S = false;
        this.V = j3;
        if (C()) {
            this.W = j3;
            return j3;
        }
        if (this.Q != 7) {
            int length = this.H.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.H[i10].n(j3, false) || (!zArr[i10] && this.L)) {
                }
            }
            return j3;
        }
        this.X = false;
        this.W = j3;
        this.Z = false;
        if (this.f12553z.a()) {
            for (yk2 yk2Var : this.H) {
                yk2Var.k();
            }
            ym2<? extends lk2> ym2Var = this.f12553z.f7081b;
            r01.d(ym2Var);
            ym2Var.a(false);
        } else {
            this.f12553z.f7082c = null;
            for (yk2 yk2Var2 : this.H) {
                yk2Var2.l(false);
            }
        }
        return j3;
    }

    @Override // m4.tj2, m4.al2
    public final boolean k() {
        boolean z10;
        if (this.f12553z.a()) {
            h21 h21Var = this.B;
            synchronized (h21Var) {
                z10 = h21Var.f9086s;
            }
            return z10;
        }
        return false;
    }

    @Override // m4.vo2
    public final void l(jp2 jp2Var) {
        this.E.post(new pe(this, jp2Var, 2, null));
    }

    @Override // m4.tj2
    public final void m(sj2 sj2Var, long j3) {
        this.F = sj2Var;
        this.B.b();
        B();
    }

    @Override // m4.tj2
    public final void n(long j3) {
        long j10;
        int i10;
        v();
        if (C()) {
            return;
        }
        boolean[] zArr = this.M.f12193c;
        int length = this.H.length;
        for (int i11 = 0; i11 < length; i11++) {
            yk2 yk2Var = this.H[i11];
            boolean z10 = zArr[i11];
            vk2 vk2Var = yk2Var.f15807a;
            synchronized (yk2Var) {
                int i12 = yk2Var.f15820n;
                j10 = -1;
                if (i12 != 0) {
                    long[] jArr = yk2Var.f15818l;
                    int i13 = yk2Var.p;
                    if (j3 >= jArr[i13]) {
                        int o10 = yk2Var.o(i13, (!z10 || (i10 = yk2Var.f15822q) == i12) ? i12 : i10 + 1, j3, false);
                        if (o10 != -1) {
                            j10 = yk2Var.h(o10);
                        }
                    }
                }
            }
            vk2Var.a(j10);
        }
    }

    @Override // m4.tj2
    public final long o(kl2[] kl2VarArr, boolean[] zArr, zk2[] zk2VarArr, boolean[] zArr2, long j3) {
        kl2 kl2Var;
        v();
        ok2 ok2Var = this.M;
        s70 s70Var = ok2Var.f12191a;
        boolean[] zArr3 = ok2Var.f12193c;
        int i10 = this.T;
        for (int i11 = 0; i11 < kl2VarArr.length; i11++) {
            zk2 zk2Var = zk2VarArr[i11];
            if (zk2Var != null && (kl2VarArr[i11] == null || !zArr[i11])) {
                int i12 = ((mk2) zk2Var).f11235a;
                r01.h(zArr3[i12]);
                this.T--;
                zArr3[i12] = false;
                zk2VarArr[i11] = null;
            }
        }
        boolean z10 = !this.R ? j3 != 0 : i10 == 0;
        for (int i13 = 0; i13 < kl2VarArr.length; i13++) {
            if (zk2VarArr[i13] == null && (kl2Var = kl2VarArr[i13]) != null) {
                r01.h(kl2Var.f10481c.length == 1);
                r01.h(kl2Var.f10481c[0] == 0);
                p60 p60Var = kl2Var.f10479a;
                int i14 = 0;
                while (true) {
                    if (i14 >= s70Var.f13533a) {
                        i14 = -1;
                        break;
                    } else if (s70Var.f13534b[i14] == p60Var) {
                        break;
                    } else {
                        i14++;
                    }
                }
                r01.h(!zArr3[i14]);
                this.T++;
                zArr3[i14] = true;
                zk2VarArr[i13] = new mk2(this, i14);
                zArr2[i13] = true;
                if (!z10) {
                    yk2 yk2Var = this.H[i14];
                    z10 = !yk2Var.n(j3, true) && yk2Var.f15821o + yk2Var.f15822q != 0;
                }
            }
        }
        if (this.T == 0) {
            this.X = false;
            this.S = false;
            if (this.f12553z.a()) {
                for (yk2 yk2Var2 : this.H) {
                    yk2Var2.k();
                }
                ym2<? extends lk2> ym2Var = this.f12553z.f7081b;
                r01.d(ym2Var);
                ym2Var.a(false);
            } else {
                for (yk2 yk2Var3 : this.H) {
                    yk2Var3.l(false);
                }
            }
        } else if (z10) {
            j3 = j(j3);
            for (int i15 = 0; i15 < zk2VarArr.length; i15++) {
                if (zk2VarArr[i15] != null) {
                    zArr2[i15] = true;
                }
            }
        }
        this.R = true;
        return j3;
    }

    @Override // m4.vo2
    public final mp2 p(int i10, int i11) {
        return u(new nk2(i10, false));
    }

    public final void q(lk2 lk2Var, long j3, long j10, boolean z10) {
        Uri uri = lk2Var.f10893c.f10143c;
        nj2 nj2Var = new nj2();
        ek2 ek2Var = this.f12550v;
        long j11 = lk2Var.f10900j;
        long j12 = this.O;
        Objects.requireNonNull(ek2Var);
        ek2.g(j11);
        ek2.g(j12);
        ek2Var.c(nj2Var, new w3((t) null));
        if (!z10) {
            w(lk2Var);
            for (yk2 yk2Var : this.H) {
                yk2Var.l(false);
            }
            if (this.T <= 0) {
                return;
            }
            sj2 sj2Var = this.F;
            Objects.requireNonNull(sj2Var);
            sj2Var.l(this);
        }
    }

    public final void r(lk2 lk2Var, long j3, long j10) {
        jp2 jp2Var;
        if (this.O == -9223372036854775807L && (jp2Var = this.N) != null) {
            boolean f10 = jp2Var.f();
            long t10 = t();
            long j11 = t10 == Long.MIN_VALUE ? 0L : t10 + 10000;
            this.O = j11;
            this.f12552x.p(j11, f10, this.P);
        }
        Uri uri = lk2Var.f10893c.f10143c;
        nj2 nj2Var = new nj2();
        ek2 ek2Var = this.f12550v;
        long j12 = lk2Var.f10900j;
        long j13 = this.O;
        Objects.requireNonNull(ek2Var);
        ek2.g(j12);
        ek2.g(j13);
        ek2Var.d(nj2Var, new w3((t) null));
        w(lk2Var);
        this.Z = true;
        sj2 sj2Var = this.F;
        Objects.requireNonNull(sj2Var);
        sj2Var.l(this);
    }

    public final int s() {
        yk2[] yk2VarArr;
        int i10 = 0;
        for (yk2 yk2Var : this.H) {
            i10 += yk2Var.f15821o + yk2Var.f15820n;
        }
        return i10;
    }

    public final long t() {
        yk2[] yk2VarArr;
        long j3;
        long j10 = Long.MIN_VALUE;
        for (yk2 yk2Var : this.H) {
            synchronized (yk2Var) {
                j3 = yk2Var.f15825t;
            }
            j10 = Math.max(j10, j3);
        }
        return j10;
    }

    public final mp2 u(nk2 nk2Var) {
        int length = this.H.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (nk2Var.equals(this.I[i10])) {
                return this.H[i10];
            }
        }
        pm2 pm2Var = this.f12546b0;
        Looper looper = this.E.getLooper();
        ai2 ai2Var = this.f12549u;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(ai2Var);
        yk2 yk2Var = new yk2(pm2Var, ai2Var);
        yk2Var.f15811e = this;
        int i11 = length + 1;
        nk2[] nk2VarArr = (nk2[]) Arrays.copyOf(this.I, i11);
        nk2VarArr[length] = nk2Var;
        int i12 = ls1.f10971a;
        this.I = nk2VarArr;
        yk2[] yk2VarArr = (yk2[]) Arrays.copyOf(this.H, i11);
        yk2VarArr[length] = yk2Var;
        this.H = yk2VarArr;
        return yk2Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void v() {
        r01.h(this.K);
        Objects.requireNonNull(this.M);
        Objects.requireNonNull(this.N);
    }

    public final void w(lk2 lk2Var) {
        if (this.U == -1) {
            this.U = lk2Var.f10902l;
        }
    }

    public final void x() {
        t tVar;
        if (this.f12545a0 || this.K || !this.J || this.N == null) {
            return;
        }
        yk2[] yk2VarArr = this.H;
        int length = yk2VarArr.length;
        int i10 = 0;
        while (true) {
            t tVar2 = null;
            if (i10 < length) {
                yk2 yk2Var = yk2VarArr[i10];
                synchronized (yk2Var) {
                    if (!yk2Var.f15828w) {
                        tVar2 = yk2Var.f15829x;
                    }
                }
                if (tVar2 == null) {
                    return;
                }
                i10++;
            } else {
                this.B.a();
                int length2 = this.H.length;
                p60[] p60VarArr = new p60[length2];
                boolean[] zArr = new boolean[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    yk2 yk2Var2 = this.H[i11];
                    synchronized (yk2Var2) {
                        tVar = yk2Var2.f15828w ? null : yk2Var2.f15829x;
                    }
                    Objects.requireNonNull(tVar);
                    String str = tVar.f13871k;
                    boolean e10 = rp.e(str);
                    boolean z10 = e10 || rp.f(str);
                    zArr[i11] = z10;
                    this.L = z10 | this.L;
                    oq2 oq2Var = this.G;
                    if (oq2Var != null) {
                        if (e10 || this.I[i11].f11824b) {
                            ln0 ln0Var = tVar.f13869i;
                            ln0 ln0Var2 = ln0Var == null ? new ln0(oq2Var) : ln0Var.a(oq2Var);
                            kq2 kq2Var = new kq2(tVar);
                            kq2Var.f10540h = ln0Var2;
                            tVar = new t(kq2Var);
                        }
                        if (e10 && tVar.f13865e == -1 && tVar.f13866f == -1 && oq2Var.f12271s != -1) {
                            kq2 kq2Var2 = new kq2(tVar);
                            kq2Var2.f10537e = oq2Var.f12271s;
                            tVar = new t(kq2Var2);
                        }
                    }
                    Objects.requireNonNull((f) this.f12549u);
                    int i12 = tVar.f13874n != null ? 1 : 0;
                    kq2 kq2Var3 = new kq2(tVar);
                    kq2Var3.C = i12;
                    p60VarArr[i11] = new p60(new t(kq2Var3));
                }
                this.M = new ok2(new s70(p60VarArr), zArr);
                this.K = true;
                sj2 sj2Var = this.F;
                Objects.requireNonNull(sj2Var);
                sj2Var.h(this);
                return;
            }
        }
    }

    @Override // m4.vo2
    public final void y() {
        this.J = true;
        this.E.post(this.C);
    }

    public final void z(int i10) {
        v();
        ok2 ok2Var = this.M;
        boolean[] zArr = ok2Var.f12194d;
        if (!zArr[i10]) {
            t tVar = ok2Var.f12191a.f13534b[i10].f12410a[0];
            ek2 ek2Var = this.f12550v;
            rp.a(tVar.f13871k);
            long j3 = this.V;
            Objects.requireNonNull(ek2Var);
            ek2.g(j3);
            ek2Var.b(new w3(tVar));
            zArr[i10] = true;
        }
    }
}
