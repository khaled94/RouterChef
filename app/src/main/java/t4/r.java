package t4;

import java.util.NoSuchElementException;
import l0.g;

/* loaded from: classes.dex */
public final class r extends h {

    /* renamed from: s */
    public final int f18656s;

    /* renamed from: t */
    public int f18657t;

    /* renamed from: u */
    public final t f18658u;

    public r(t tVar, int i10) {
        int size = tVar.size();
        g.j(i10, size);
        this.f18656s = size;
        this.f18657t = i10;
        this.f18658u = tVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18657t < this.f18656s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18657t > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f18657t;
            this.f18657t = i10 + 1;
            return this.f18658u.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18657t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f18657t - 1;
            this.f18657t = i10;
            return this.f18658u.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18657t - 1;
    }
}
