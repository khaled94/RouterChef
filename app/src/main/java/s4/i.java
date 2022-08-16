package s4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterator<n> {

    /* renamed from: s */
    public final /* synthetic */ Iterator f17915s;

    public i(Iterator it) {
        this.f17915s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17915s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ n next() {
        return new r((String) this.f17915s.next());
    }
}
