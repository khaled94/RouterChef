package s4;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: s */
    public final boolean f17809s;

    public e(Boolean bool) {
        this.f17809s = bool == null ? false : bool.booleanValue();
    }

    @Override // s4.n
    public final Boolean e() {
        return Boolean.valueOf(this.f17809s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f17809s == ((e) obj).f17809s;
    }

    @Override // s4.n
    public final Double f() {
        return Double.valueOf(true != this.f17809s ? 0.0d : 1.0d);
    }

    @Override // s4.n
    public final n g() {
        return new e(Boolean.valueOf(this.f17809s));
    }

    @Override // s4.n
    public final String h() {
        return Boolean.toString(this.f17809s);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f17809s).hashCode();
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        if ("toString".equals(str)) {
            return new r(Boolean.toString(this.f17809s));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f17809s), str));
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f17809s);
    }
}
