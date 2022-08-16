package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class vu1 implements Iterator {
    @CheckForNull

    /* renamed from: s */
    public Map.Entry f14787s;

    /* renamed from: t */
    public final /* synthetic */ Iterator f14788t;

    /* renamed from: u */
    public final /* synthetic */ wu1 f14789u;

    public vu1(wu1 wu1Var, Iterator it) {
        this.f14789u = wu1Var;
        this.f14788t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14788t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f14788t.next();
        this.f14787s = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hu1.i(this.f14787s != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f14787s.getValue();
        this.f14788t.remove();
        this.f14789u.f15114t.f9055w -= collection.size();
        collection.clear();
        this.f14787s = null;
    }
}
