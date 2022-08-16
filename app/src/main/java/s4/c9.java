package s4;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c9 implements ListIterator<String> {

    /* renamed from: s */
    public final ListIterator<String> f17759s;

    public c9(e9 e9Var, int i10) {
        this.f17759s = e9Var.f17850s.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17759s.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17759s.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f17759s.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17759s.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f17759s.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17759s.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
