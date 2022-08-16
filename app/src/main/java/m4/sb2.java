package m4;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class sb2 implements ListIterator<String> {

    /* renamed from: s */
    public final ListIterator<String> f13584s;

    public sb2(ub2 ub2Var, int i10) {
        this.f13584s = ub2Var.f14331s.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13584s.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13584s.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f13584s.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13584s.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f13584s.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13584s.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
