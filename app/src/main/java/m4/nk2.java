package m4;

/* loaded from: classes.dex */
public final class nk2 {

    /* renamed from: a */
    public final int f11823a;

    /* renamed from: b */
    public final boolean f11824b;

    public nk2(int i10, boolean z10) {
        this.f11823a = i10;
        this.f11824b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nk2.class == obj.getClass()) {
            nk2 nk2Var = (nk2) obj;
            if (this.f11823a == nk2Var.f11823a && this.f11824b == nk2Var.f11824b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11823a * 31) + (this.f11824b ? 1 : 0);
    }
}
