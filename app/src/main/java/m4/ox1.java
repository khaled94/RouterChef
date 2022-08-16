package m4;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ox1<T> extends fx1<T> implements Serializable {

    /* renamed from: s */
    public final fx1<? super T> f12305s;

    public ox1(fx1<? super T> fx1Var) {
        this.f12305s = fx1Var;
    }

    @Override // m4.fx1
    public final <S extends T> fx1<S> a() {
        return (fx1<? super T>) this.f12305s;
    }

    @Override // m4.fx1, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f12305s.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ox1)) {
            return false;
        }
        return this.f12305s.equals(((ox1) obj).f12305s);
    }

    public final int hashCode() {
        return -this.f12305s.hashCode();
    }

    public final String toString() {
        return this.f12305s.toString().concat(".reverse()");
    }
}
