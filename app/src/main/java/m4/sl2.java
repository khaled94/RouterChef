package m4;

/* loaded from: classes.dex */
public final class sl2 implements Comparable<sl2> {

    /* renamed from: s */
    public final boolean f13738s;

    /* renamed from: t */
    public final boolean f13739t;

    /* renamed from: u */
    public final boolean f13740u;

    /* renamed from: v */
    public final boolean f13741v;

    /* renamed from: w */
    public final int f13742w;

    /* renamed from: x */
    public final int f13743x;
    public final int y;

    /* renamed from: z */
    public final int f13744z;

    public sl2(t tVar, pl2 pl2Var, int i10, String str) {
        int i11;
        boolean z10 = false;
        this.f13739t = ul2.c(i10, false);
        int i12 = tVar.f13864d;
        this.f13740u = 1 == (i12 & 1);
        this.f13741v = (i12 & 2) != 0;
        gw1<String> s10 = pl2Var.f12092g.isEmpty() ? gw1.s("") : pl2Var.f12092g;
        int i13 = 0;
        while (true) {
            if (i13 >= s10.size()) {
                i13 = Integer.MAX_VALUE;
                i11 = 0;
                break;
            }
            i11 = ul2.a(tVar, s10.get(i13), false);
            if (i11 > 0) {
                break;
            }
            i13++;
        }
        this.f13742w = i13;
        this.f13743x = i11;
        int bitCount = Integer.bitCount(0);
        this.y = bitCount;
        int a10 = ul2.a(tVar, str, ul2.b(str) == null);
        this.f13744z = a10;
        if (i11 > 0 || ((pl2Var.f12092g.isEmpty() && bitCount > 0) || this.f13740u || (this.f13741v && a10 > 0))) {
            z10 = true;
        }
        this.f13738s = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [m4.nx1, java.util.Comparator] */
    /* renamed from: b */
    public final int compareTo(sl2 sl2Var) {
        xv1 d5 = xv1.f15479a.d(this.f13739t, sl2Var.f13739t);
        Integer valueOf = Integer.valueOf(this.f13742w);
        Integer valueOf2 = Integer.valueOf(sl2Var.f13742w);
        ex1 ex1Var = ex1.f8300s;
        ?? r42 = nx1.f11953s;
        xv1 d10 = d5.c(valueOf, valueOf2, r42).b(this.f13743x, sl2Var.f13743x).b(this.y, sl2Var.y).d(this.f13740u, sl2Var.f13740u);
        Boolean valueOf3 = Boolean.valueOf(this.f13741v);
        Boolean valueOf4 = Boolean.valueOf(sl2Var.f13741v);
        if (this.f13743x != 0) {
            ex1Var = r42;
        }
        xv1 b10 = d10.c(valueOf3, valueOf4, ex1Var).b(this.f13744z, sl2Var.f13744z);
        if (this.y == 0) {
            b10 = b10.e();
        }
        return b10.a();
    }
}
