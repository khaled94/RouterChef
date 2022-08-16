package m4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Objects;
import n9.d;
import z3.v;

/* loaded from: classes.dex */
public final class se implements we, gf {
    public final v A;
    public ve G;
    public nc H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public lf N;
    public long O;
    public boolean[] P;
    public boolean[] Q;
    public boolean R;
    public long T;
    public int V;
    public boolean W;
    public boolean X;
    public final eg Y;

    /* renamed from: s */
    public final Uri f13608s;

    /* renamed from: t */
    public final bg f13609t;

    /* renamed from: u */
    public final int f13610u;

    /* renamed from: v */
    public final Handler f13611v;

    /* renamed from: w */
    public final te f13612w;

    /* renamed from: x */
    public final xe f13613x;
    public final long y;

    /* renamed from: z */
    public final mg f13614z = new mg();
    public final og B = new og();
    public final ne C = new ne(this, 0);
    public final ib D = new ib(this, 1);
    public final Handler E = new Handler();
    public long U = -9223372036854775807L;
    public final SparseArray F = new SparseArray();
    public long S = -1;

    public se(Uri uri, bg bgVar, ic[] icVarArr, int i10, Handler handler, te teVar, xe xeVar, eg egVar, int i11) {
        this.f13608s = uri;
        this.f13609t = bgVar;
        this.f13610u = i10;
        this.f13611v = handler;
        this.f13612w = teVar;
        this.f13613x = xeVar;
        this.Y = egVar;
        this.y = i11;
        this.A = new v(icVarArr, this);
    }

    public final int a() {
        int size = this.F.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            ef efVar = ((hf) this.F.valueAt(i11)).f9213a;
            i10 += efVar.f7830j + efVar.f7829i;
        }
        return i10;
    }

    public final long b() {
        int size = this.F.size();
        long j3 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            j3 = Math.max(j3, ((hf) this.F.valueAt(i10)).e());
        }
        return j3;
    }

    public final void c(qe qeVar) {
        if (this.S == -1) {
            this.S = qeVar.f12814i;
        }
    }

    public final void d() {
        nc ncVar;
        qe qeVar = new qe(this, this.f13608s, this.f13609t, this.A, this.B);
        boolean z10 = true;
        if (this.J) {
            d.i(g());
            long j3 = this.O;
            if (j3 != -9223372036854775807L && this.U >= j3) {
                this.W = true;
                this.U = -9223372036854775807L;
                return;
            }
            long a10 = this.H.a(this.U);
            long j10 = this.U;
            qeVar.f12810e.f10709a = a10;
            qeVar.f12813h = j10;
            qeVar.f12812g = true;
            this.U = -9223372036854775807L;
        }
        this.V = a();
        int i10 = this.f13610u;
        int i11 = 6;
        if (i10 != -1) {
            i11 = i10;
        } else if (!this.J || this.S != -1 || ((ncVar = this.H) != null && ncVar.zza() != -9223372036854775807L)) {
            i11 = 3;
        }
        mg mgVar = this.f13614z;
        Objects.requireNonNull(mgVar);
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            z10 = false;
        }
        d.i(z10);
        new kg(mgVar, myLooper, qeVar, this, i11, SystemClock.elapsedRealtime()).b(0L);
    }

    @Override // m4.we
    public final long e() {
        long j3;
        if (this.W) {
            return Long.MIN_VALUE;
        }
        if (g()) {
            return this.U;
        }
        if (this.R) {
            int size = this.F.size();
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                if (this.Q[i10]) {
                    j3 = Math.min(j3, ((hf) this.F.valueAt(i10)).e());
                }
            }
        } else {
            j3 = b();
        }
        return j3 == Long.MIN_VALUE ? this.T : j3;
    }

    @Override // m4.we
    public final long f() {
        if (this.L) {
            this.L = false;
            return this.T;
        }
        return -9223372036854775807L;
    }

    public final boolean g() {
        return this.U != -9223372036854775807L;
    }

    public final void h() {
        this.I = true;
        this.E.post(this.C);
    }

    public final hf i(int i10) {
        hf hfVar = (hf) this.F.get(i10);
        if (hfVar == null) {
            hf hfVar2 = new hf(this.Y);
            hfVar2.f9222j = this;
            this.F.put(i10, hfVar2);
            return hfVar2;
        }
        return hfVar;
    }

    @Override // m4.we
    public final lf j() {
        return this.N;
    }

    public final void k(nc ncVar) {
        this.H = ncVar;
        this.E.post(this.C);
    }

    public final /* bridge */ void l(qe qeVar, boolean z10) {
        c(qeVar);
        if (z10 || this.M <= 0) {
            return;
        }
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((hf) this.F.valueAt(i10)).g(this.P[i10]);
        }
        this.G.b(this);
    }

    @Override // m4.we
    public final void p() {
        this.f13614z.a();
    }

    @Override // m4.we, m4.Cif
    public final boolean q(long j3) {
        boolean z10 = false;
        if (this.W || (this.J && this.M == 0)) {
            return false;
        }
        og ogVar = this.B;
        synchronized (ogVar) {
            if (!ogVar.f12153a) {
                ogVar.f12153a = true;
                ogVar.notifyAll();
                z10 = true;
            }
        }
        if (this.f13614z.b()) {
            return z10;
        }
        d();
        return true;
    }

    @Override // m4.we
    public final void r(long j3) {
    }

    @Override // m4.we
    public final long s(long j3) {
        if (true != this.H.c()) {
            j3 = 0;
        }
        this.T = j3;
        int size = this.F.size();
        boolean g10 = true ^ g();
        int i10 = 0;
        while (true) {
            if (!g10) {
                this.U = j3;
                this.W = false;
                if (this.f13614z.b()) {
                    this.f13614z.f11183b.a(false);
                } else {
                    for (int i11 = 0; i11 < size; i11++) {
                        ((hf) this.F.valueAt(i11)).g(this.P[i11]);
                    }
                }
            } else if (i10 >= size) {
                break;
            } else {
                if (this.P[i10]) {
                    g10 = ((hf) this.F.valueAt(i10)).h(j3, false);
                }
                i10++;
            }
        }
        this.L = false;
        return j3;
    }

    @Override // m4.we
    public final long t(of[] ofVarArr, boolean[] zArr, re[] reVarArr, boolean[] zArr2, long j3) {
        of ofVar;
        d.i(this.J);
        for (int i10 = 0; i10 < ofVarArr.length; i10++) {
            re reVar = reVarArr[i10];
            if (reVar != null && (ofVarArr[i10] == null || !zArr[i10])) {
                int i11 = reVar.f13259a;
                d.i(this.P[i11]);
                this.M--;
                this.P[i11] = false;
                ((hf) this.F.valueAt(i11)).f();
                reVarArr[i10] = null;
            }
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < ofVarArr.length; i12++) {
            if (reVarArr[i12] == null && (ofVar = ofVarArr[i12]) != null) {
                int[] iArr = ofVar.f12139b;
                int length = iArr.length;
                d.i(iArr[0] == 0);
                lf lfVar = this.N;
                kf kfVar = ofVar.f12138a;
                int i13 = 0;
                while (true) {
                    if (i13 >= lfVar.f10746a) {
                        i13 = -1;
                        break;
                    } else if (lfVar.f10747b[i13] == kfVar) {
                        break;
                    } else {
                        i13++;
                    }
                }
                d.i(!this.P[i13]);
                this.M++;
                this.P[i13] = true;
                reVarArr[i12] = new re(this, i13);
                zArr2[i12] = true;
                z10 = true;
            }
        }
        if (!this.K) {
            int size = this.F.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (!this.P[i14]) {
                    ((hf) this.F.valueAt(i14)).f();
                }
            }
        }
        if (this.M == 0) {
            this.L = false;
            if (this.f13614z.b()) {
                this.f13614z.f11183b.a(false);
            }
        } else if (!this.K ? j3 != 0 : z10) {
            j3 = s(j3);
            for (int i15 = 0; i15 < reVarArr.length; i15++) {
                if (reVarArr[i15] != null) {
                    zArr2[i15] = true;
                }
            }
        }
        this.K = true;
        return j3;
    }

    @Override // m4.we
    public final void u(ve veVar, long j3) {
        this.G = veVar;
        og ogVar = this.B;
        synchronized (ogVar) {
            if (!ogVar.f12153a) {
                ogVar.f12153a = true;
                ogVar.notifyAll();
            }
        }
        d();
    }

    @Override // m4.we, m4.Cif
    public final long zza() {
        if (this.M == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }
}
