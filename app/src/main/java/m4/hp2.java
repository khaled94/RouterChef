package m4;

import i0.b;

/* loaded from: classes.dex */
public final class hp2 {

    /* renamed from: a */
    public final kp2 f9408a;

    /* renamed from: b */
    public final kp2 f9409b;

    public hp2(kp2 kp2Var, kp2 kp2Var2) {
        this.f9408a = kp2Var;
        this.f9409b = kp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hp2.class == obj.getClass()) {
            hp2 hp2Var = (hp2) obj;
            if (this.f9408a.equals(hp2Var.f9408a) && this.f9409b.equals(hp2Var.f9409b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9409b.hashCode() + (this.f9408a.hashCode() * 31);
    }

    public final String toString() {
        String kp2Var = this.f9408a.toString();
        String concat = this.f9408a.equals(this.f9409b) ? "" : ", ".concat(this.f9409b.toString());
        return b.a(new StringBuilder(concat.length() + kp2Var.length() + 2), "[", kp2Var, concat, "]");
    }
}
