package s4;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements n {
    @Override // s4.n
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof s;
    }

    @Override // s4.n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // s4.n
    public final n g() {
        return n.f18009j;
    }

    @Override // s4.n
    public final String h() {
        return "undefined";
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return null;
    }
}
