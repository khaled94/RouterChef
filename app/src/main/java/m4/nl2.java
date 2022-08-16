package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class nl2 implements Comparable<nl2> {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;

    /* renamed from: s */
    public final String f11830s;

    /* renamed from: t */
    public final pl2 f11831t;

    /* renamed from: u */
    public final boolean f11832u;

    /* renamed from: v */
    public final int f11833v;

    /* renamed from: w */
    public final int f11834w;

    /* renamed from: x */
    public final int f11835x;
    public final int y;

    /* renamed from: z */
    public final int f11836z;

    public nl2(t tVar, pl2 pl2Var, int i10) {
        int i11;
        int i12;
        int i13;
        this.f11831t = pl2Var;
        this.f11830s = ul2.b(tVar.f13863c);
        int i14 = 0;
        this.f11832u = ul2.c(i10, false);
        int i15 = 0;
        while (true) {
            i11 = Integer.MAX_VALUE;
            if (i15 >= pl2Var.f12090e.size()) {
                i12 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            }
            i12 = ul2.a(tVar, pl2Var.f12090e.get(i15), false);
            if (i12 > 0) {
                break;
            }
            i15++;
        }
        this.f11834w = i15;
        this.f11833v = i12;
        this.f11835x = Integer.bitCount(0);
        this.A = 1 != (tVar.f13864d & 1) ? false : true;
        this.B = tVar.f13883x;
        this.C = tVar.y;
        this.D = tVar.f13867g;
        String[] m10 = ls1.m();
        int i16 = 0;
        while (true) {
            if (i16 >= m10.length) {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
            i13 = ul2.a(tVar, m10[i16], false);
            if (i13 > 0) {
                break;
            }
            i16++;
        }
        this.y = i16;
        this.f11836z = i13;
        while (true) {
            if (i14 < pl2Var.f12091f.size()) {
                String str = tVar.f13871k;
                if (str != null && str.equals(pl2Var.f12091f.get(i14))) {
                    i11 = i14;
                    break;
                }
                i14++;
            } else {
                break;
            }
        }
        this.E = i11;
    }

    /* renamed from: b */
    public final int compareTo(nl2 nl2Var) {
        fx1<Integer> fx1Var;
        if (this.f11832u) {
            fx1Var = ul2.f14450e;
        } else {
            fx1Var = ul2.f14450e.a();
        }
        xv1 d5 = xv1.f15479a.d(this.f11832u, nl2Var.f11832u);
        Integer valueOf = Integer.valueOf(this.f11834w);
        Integer valueOf2 = Integer.valueOf(nl2Var.f11834w);
        nx1 nx1Var = nx1.f11953s;
        xv1 c10 = d5.c(valueOf, valueOf2, nx1Var).b(this.f11833v, nl2Var.f11833v).b(this.f11835x, nl2Var.f11835x).d(true, true).c(Integer.valueOf(this.E), Integer.valueOf(nl2Var.E), nx1Var);
        Integer valueOf3 = Integer.valueOf(this.D);
        Integer valueOf4 = Integer.valueOf(nl2Var.D);
        Objects.requireNonNull(this.f11831t);
        fx1<Integer> fx1Var2 = ul2.f14451f;
        xv1 c11 = c10.c(valueOf3, valueOf4, fx1Var2).d(this.A, nl2Var.A).c(Integer.valueOf(this.y), Integer.valueOf(nl2Var.y), nx1Var).b(this.f11836z, nl2Var.f11836z).c(Integer.valueOf(this.B), Integer.valueOf(nl2Var.B), fx1Var).c(Integer.valueOf(this.C), Integer.valueOf(nl2Var.C), fx1Var);
        Integer valueOf5 = Integer.valueOf(this.D);
        Integer valueOf6 = Integer.valueOf(nl2Var.D);
        if (!ls1.f(this.f11830s, nl2Var.f11830s)) {
            fx1Var = fx1Var2;
        }
        return c11.c(valueOf5, valueOf6, fx1Var).a();
    }
}
