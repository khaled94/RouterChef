package i9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a */
    public final AtomicReference<b<T>> f5315a;

    public a(b<? extends T> bVar) {
        this.f5315a = new AtomicReference<>(bVar);
    }

    @Override // i9.b
    public final Iterator<T> iterator() {
        b<T> andSet = this.f5315a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
