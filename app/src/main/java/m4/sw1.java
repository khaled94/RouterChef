package m4;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class sw1 extends rx1 implements ListIterator {
    public sw1(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // m4.rx1
    public final Object a(Object obj) {
        return ((mk) obj).name();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f13450s).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f13450s).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return ((mk) ((ListIterator) this.f13450s).previous()).name();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f13450s).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
