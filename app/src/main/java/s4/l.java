package s4;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements n {
    @Override // s4.n
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof l;
    }

    @Override // s4.n
    public final Double f() {
        return Double.valueOf(0.0d);
    }

    @Override // s4.n
    public final n g() {
        return n.f18010k;
    }

    @Override // s4.n
    public final String h() {
        return "null";
    }

    public final int hashCode() {
        return 1;
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return null;
    }
}
