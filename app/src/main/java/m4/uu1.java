package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class uu1<T> implements Iterator<T> {

    /* renamed from: s */
    public final Iterator<Map.Entry> f14502s;
    @CheckForNull

    /* renamed from: t */
    public Object f14503t;
    @CheckForNull

    /* renamed from: u */
    public Collection f14504u = null;

    /* renamed from: v */
    public Iterator f14505v = rw1.f13446s;

    /* renamed from: w */
    public final /* synthetic */ gv1 f14506w;

    public uu1(gv1 gv1Var) {
        this.f14506w = gv1Var;
        this.f14502s = gv1Var.f9054v.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14502s.hasNext() || this.f14505v.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f14505v.hasNext()) {
            Map.Entry next = this.f14502s.next();
            this.f14503t = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f14504u = collection;
            this.f14505v = collection.iterator();
        }
        return (T) this.f14505v.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14505v.remove();
        Collection collection = this.f14504u;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f14502s.remove();
        }
        gv1 gv1Var = this.f14506w;
        gv1Var.f9055w--;
    }
}
