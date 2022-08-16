package m4;

/* loaded from: classes.dex */
public final class tp2 implements to2 {

    /* renamed from: d */
    public vo2 f14132d;

    /* renamed from: e */
    public mp2 f14133e;

    /* renamed from: g */
    public ln0 f14135g;

    /* renamed from: h */
    public bp2 f14136h;

    /* renamed from: i */
    public int f14137i;

    /* renamed from: j */
    public int f14138j;

    /* renamed from: k */
    public sp2 f14139k;

    /* renamed from: l */
    public int f14140l;

    /* renamed from: m */
    public long f14141m;

    /* renamed from: a */
    public final byte[] f14129a = new byte[42];

    /* renamed from: b */
    public final dd f14130b = new dd(new byte[32768], 0);

    /* renamed from: c */
    public final zo2 f14131c = new zo2();

    /* renamed from: f */
    public int f14134f = 0;

    public final void a() {
        long j3 = this.f14141m;
        bp2 bp2Var = this.f14136h;
        int i10 = ls1.f10971a;
        this.f14133e.e((j3 * 1000000) / bp2Var.f6591e, 1, this.f14140l, 0, null);
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        h32.a(uo2Var, false);
        byte[] bArr = new byte[4];
        ((qo2) uo2Var).o(bArr, 0, 4, false);
        return ((((((long) bArr[2]) & 255) << 8) | (((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16))) | (((long) bArr[3]) & 255)) == 1716281667;
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f14132d = vo2Var;
        this.f14133e = vo2Var.p(0, 1);
        vo2Var.y();
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f14134f = 0;
        } else {
            sp2 sp2Var = this.f14139k;
            if (sp2Var != null) {
                sp2Var.c(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f14141m = j11;
        this.f14140l = 0;
        this.f14130b.e(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
        r1.h(r5);
        r5 = r26.f14131c.f16302a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0346 A[LOOP:3: B:98:0x01ee->B:117:0x0346, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int, boolean] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r27, m4.gp2 r28) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.tp2.h(m4.uo2, m4.gp2):int");
    }
}
