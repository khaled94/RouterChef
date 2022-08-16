package m4;

/* loaded from: classes.dex */
public final class y82 {

    /* renamed from: a */
    public final Object f15618a;

    /* renamed from: b */
    public final int f15619b;

    public y82(Object obj, int i10) {
        this.f15618a = obj;
        this.f15619b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y82)) {
            return false;
        }
        y82 y82Var = (y82) obj;
        return this.f15618a == y82Var.f15618a && this.f15619b == y82Var.f15619b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15618a) * 65535) + this.f15619b;
    }
}
