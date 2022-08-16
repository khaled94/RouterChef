package c4;

import a4.d;
import c5.j;
import d4.m;

/* loaded from: classes.dex */
public abstract class l<A, ResultT> {

    /* renamed from: a */
    public final d[] f2709a;

    /* renamed from: b */
    public final boolean f2710b;

    /* renamed from: c */
    public final int f2711c;

    /* loaded from: classes.dex */
    public static class a<A, ResultT> {

        /* renamed from: a */
        public k<A, j<ResultT>> f2712a;

        /* renamed from: c */
        public d[] f2714c;

        /* renamed from: b */
        public boolean f2713b = true;

        /* renamed from: d */
        public int f2715d = 0;

        public final l<A, ResultT> a() {
            m.b(this.f2712a != null, "execute parameter required");
            return new k0(this, this.f2714c, this.f2713b, this.f2715d);
        }
    }

    public l(d[] dVarArr, boolean z10, int i10) {
        this.f2709a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f2710b = z11;
        this.f2711c = i10;
    }
}
