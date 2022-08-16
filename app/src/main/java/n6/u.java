package n6;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o7.b;

/* loaded from: classes.dex */
public final class u<T> implements b<Set<T>> {

    /* renamed from: b */
    public volatile Set<T> f16662b = null;

    /* renamed from: a */
    public volatile Set<b<T>> f16661a = Collections.newSetFromMap(new ConcurrentHashMap());

    public u(Collection<b<T>> collection) {
        this.f16661a.addAll(collection);
    }

    @Override // o7.b
    public final Object get() {
        if (this.f16662b == null) {
            synchronized (this) {
                if (this.f16662b == null) {
                    this.f16662b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        for (b<T> bVar : this.f16661a) {
                            this.f16662b.add(bVar.get());
                        }
                        this.f16661a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f16662b);
    }
}
