package m4;

/* loaded from: classes.dex */
public final class pj2 extends lj2 {

    /* renamed from: e */
    public static final Object f12536e = new Object();

    /* renamed from: c */
    public final Object f12537c;

    /* renamed from: d */
    public final Object f12538d;

    public pj2(z40 z40Var, Object obj, Object obj2) {
        super(z40Var);
        this.f12537c = obj;
        this.f12538d = obj2;
    }

    @Override // m4.lj2, m4.z40
    public final int a(Object obj) {
        Object obj2;
        z40 z40Var = this.f10879b;
        if (f12536e.equals(obj) && (obj2 = this.f12538d) != null) {
            obj = obj2;
        }
        return z40Var.a(obj);
    }

    @Override // m4.z40
    public final d30 d(int i10, d30 d30Var, boolean z10) {
        this.f10879b.d(i10, d30Var, z10);
        if (ls1.f(d30Var.f7203b, this.f12538d) && z10) {
            d30Var.f7203b = f12536e;
        }
        return d30Var;
    }

    @Override // m4.z40
    public final j40 e(int i10, j40 j40Var, long j3) {
        this.f10879b.e(i10, j40Var, j3);
        if (ls1.f(j40Var.f9835a, this.f12537c)) {
            j40Var.f9835a = j40.f9833n;
        }
        return j40Var;
    }

    @Override // m4.lj2, m4.z40
    public final Object f(int i10) {
        Object f10 = this.f10879b.f(i10);
        return ls1.f(f10, this.f12538d) ? f12536e : f10;
    }

    public final pj2 p(z40 z40Var) {
        return new pj2(z40Var, this.f12537c, this.f12538d);
    }
}
