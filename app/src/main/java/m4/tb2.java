package m4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class tb2 implements Iterator<String> {

    /* renamed from: s */
    public final Iterator<String> f13997s;

    public tb2(ub2 ub2Var) {
        this.f13997s = ub2Var.f14331s.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13997s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f13997s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
