package m4;

/* loaded from: classes.dex */
public final class b1 implements h1 {
    public long A;
    public long B;
    public long C;
    public long D;

    /* renamed from: s */
    public final g1 f6314s;

    /* renamed from: t */
    public final long f6315t;

    /* renamed from: u */
    public final long f6316u;

    /* renamed from: v */
    public final j1 f6317v;

    /* renamed from: w */
    public int f6318w;

    /* renamed from: x */
    public long f6319x;
    public long y;

    /* renamed from: z */
    public long f6320z;

    public b1(j1 j1Var, long j3, long j10, long j11, long j12, boolean z10) {
        r01.f(j3 >= 0 && j10 > j3);
        this.f6317v = j1Var;
        this.f6315t = j3;
        this.f6316u = j10;
        if (j11 == j10 - j3 || z10) {
            this.f6319x = j12;
            this.f6318w = 4;
        } else {
            this.f6318w = 0;
        }
        this.f6314s = new g1();
    }

    @Override // m4.h1
    public final /* bridge */ /* synthetic */ jp2 b() {
        if (this.f6319x != 0) {
            return new a1(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    @Override // m4.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(m4.uo2 r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b1.c(m4.uo2):long");
    }

    @Override // m4.h1
    public final void d(long j3) {
        this.f6320z = ls1.u(j3, 0L, this.f6319x - 1);
        this.f6318w = 2;
        this.A = this.f6315t;
        this.B = this.f6316u;
        this.C = 0L;
        this.D = this.f6319x;
    }
}
