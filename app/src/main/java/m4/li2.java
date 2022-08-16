package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class li2 {

    /* renamed from: a */
    public final int f10871a;

    /* renamed from: b */
    public final int f10872b;

    public li2(int i10, int i11) {
        this.f10871a = i10;
        this.f10872b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        Objects.requireNonNull(li2Var);
        return this.f10871a == li2Var.f10871a && this.f10872b == li2Var.f10872b;
    }

    public final int hashCode() {
        return ((this.f10871a + 16337) * 31) + this.f10872b;
    }
}
