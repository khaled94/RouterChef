package m4;

/* loaded from: classes.dex */
public final class oe2 {

    /* renamed from: a */
    public final uj2 f12130a;

    /* renamed from: b */
    public final long f12131b;

    /* renamed from: c */
    public final long f12132c;

    /* renamed from: d */
    public final long f12133d;

    /* renamed from: e */
    public final long f12134e;

    /* renamed from: f */
    public final boolean f12135f;

    /* renamed from: g */
    public final boolean f12136g;

    /* renamed from: h */
    public final boolean f12137h;

    public oe2(uj2 uj2Var, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        r01.f(!z12 || z10);
        r01.f((!z11 || z10) ? true : z13);
        this.f12130a = uj2Var;
        this.f12131b = j3;
        this.f12132c = j10;
        this.f12133d = j11;
        this.f12134e = j12;
        this.f12135f = z10;
        this.f12136g = z11;
        this.f12137h = z12;
    }

    public final oe2 a(long j3) {
        return j3 == this.f12132c ? this : new oe2(this.f12130a, this.f12131b, j3, this.f12133d, this.f12134e, this.f12135f, this.f12136g, this.f12137h);
    }

    public final oe2 b(long j3) {
        return j3 == this.f12131b ? this : new oe2(this.f12130a, j3, this.f12132c, this.f12133d, this.f12134e, this.f12135f, this.f12136g, this.f12137h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oe2.class == obj.getClass()) {
            oe2 oe2Var = (oe2) obj;
            if (this.f12131b == oe2Var.f12131b && this.f12132c == oe2Var.f12132c && this.f12133d == oe2Var.f12133d && this.f12134e == oe2Var.f12134e && this.f12135f == oe2Var.f12135f && this.f12136g == oe2Var.f12136g && this.f12137h == oe2Var.f12137h && ls1.f(this.f12130a, oe2Var.f12130a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f12130a.hashCode() + 527) * 31) + ((int) this.f12131b)) * 31) + ((int) this.f12132c)) * 31) + ((int) this.f12133d)) * 31) + ((int) this.f12134e)) * 961) + (this.f12135f ? 1 : 0)) * 31) + (this.f12136g ? 1 : 0)) * 31) + (this.f12137h ? 1 : 0);
    }
}
