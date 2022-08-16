package m4;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class rx1<F, T> implements Iterator<T> {

    /* renamed from: s */
    public final Iterator<? extends F> f13450s;

    public rx1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f13450s = it;
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13450s.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f13450s.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f13450s.remove();
    }
}
