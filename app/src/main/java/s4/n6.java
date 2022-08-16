package s4;

/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: a */
    public final Object f18026a;

    /* renamed from: b */
    public final int f18027b;

    public n6(Object obj, int i10) {
        this.f18026a = obj;
        this.f18027b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.f18026a == n6Var.f18026a && this.f18027b == n6Var.f18027b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f18026a) * 65535) + this.f18027b;
    }
}
