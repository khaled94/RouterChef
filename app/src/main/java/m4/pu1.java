package m4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class pu1<E> extends sx1<Object> implements ListIterator<Object> {

    /* renamed from: s */
    public final int f12623s;

    /* renamed from: t */
    public int f12624t;

    public pu1(int i10, int i11) {
        hu1.b(i11, i10);
        this.f12623s = i10;
        this.f12624t = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12624t < this.f12623s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12624t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f12624t;
            this.f12624t = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12624t;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f12624t - 1;
            this.f12624t = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12624t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
