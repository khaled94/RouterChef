package m4;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class y implements to2 {

    /* renamed from: a */
    public final dd f15516a;

    /* renamed from: b */
    public final fp2 f15517b;

    /* renamed from: c */
    public final cp2 f15518c;

    /* renamed from: d */
    public final b00 f15519d;

    /* renamed from: e */
    public final so2 f15520e;

    /* renamed from: f */
    public vo2 f15521f;

    /* renamed from: g */
    public mp2 f15522g;

    /* renamed from: h */
    public mp2 f15523h;

    /* renamed from: i */
    public int f15524i;

    /* renamed from: j */
    public ln0 f15525j;

    /* renamed from: k */
    public long f15526k;

    /* renamed from: l */
    public long f15527l;

    /* renamed from: m */
    public long f15528m;

    /* renamed from: n */
    public int f15529n;

    /* renamed from: o */
    public a0 f15530o;
    public boolean p;

    public y() {
        this(0);
    }

    public y(int i10) {
        this.f15516a = new dd(10);
        this.f15517b = new fp2();
        this.f15518c = new cp2();
        this.f15526k = -9223372036854775807L;
        this.f15519d = new b00();
        so2 so2Var = new so2();
        this.f15520e = so2Var;
        this.f15523h = so2Var;
    }

    public final long a(long j3) {
        return ((j3 * 1000000) / this.f15517b.f8619d) + this.f15526k;
    }

    public final a0 b(uo2 uo2Var) {
        ((qo2) uo2Var).o((byte[]) this.f15516a.f7311d, 0, 4, false);
        this.f15516a.h(0);
        this.f15517b.a(this.f15516a.l());
        return new v(uo2Var.c(), uo2Var.b(), this.f15517b);
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        return f(uo2Var, true);
    }

    public final boolean d(uo2 uo2Var) {
        a0 a0Var = this.f15530o;
        if (a0Var != null) {
            long a10 = a0Var.a();
            if (a10 != -1 && uo2Var.g() > a10 - 4) {
                return true;
            }
        }
        try {
            return !uo2Var.o((byte[]) this.f15516a.f7311d, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f15521f = vo2Var;
        mp2 p = vo2Var.p(0, 1);
        this.f15522g = p;
        this.f15523h = p;
        this.f15521f.y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if (r20 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
        ((m4.qo2) r19).q(r5 + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r19.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
        r18.f15524i = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(m4.uo2 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.y.f(m4.uo2, boolean):boolean");
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.f15524i = 0;
        this.f15526k = -9223372036854775807L;
        this.f15527l = 0L;
        this.f15529n = 0;
        a0 a0Var = this.f15530o;
        if (!(a0Var instanceof w)) {
            return;
        }
        w wVar = (w) a0Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025f  */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r36, m4.gp2 r37) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.y.h(m4.uo2, m4.gp2):int");
    }
}
