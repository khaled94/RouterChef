package s4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator<n> {

    /* renamed from: s */
    public final /* synthetic */ Iterator f17731s;

    /* renamed from: t */
    public final /* synthetic */ Iterator f17732t;

    public b(Iterator it, Iterator it2) {
        this.f17731s = it;
        this.f17732t = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17731s.hasNext()) {
            return true;
        }
        return this.f17732t.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ n next() {
        if (this.f17731s.hasNext()) {
            return new r(((Integer) this.f17731s.next()).toString());
        }
        if (!this.f17732t.hasNext()) {
            throw new NoSuchElementException();
        }
        return new r((String) this.f17732t.next());
    }
}
