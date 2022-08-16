package m4;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class uv1<T> extends fx1<T> implements Serializable {

    /* renamed from: s */
    public final Comparator<T> f14516s;

    public uv1(Comparator<T> comparator) {
        this.f14516s = comparator;
    }

    @Override // m4.fx1, java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f14516s.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uv1)) {
            return false;
        }
        return this.f14516s.equals(((uv1) obj).f14516s);
    }

    public final int hashCode() {
        return this.f14516s.hashCode();
    }

    public final String toString() {
        return this.f14516s.toString();
    }
}
