package s4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e9 extends AbstractList<String> implements RandomAccess, o7 {

    /* renamed from: s */
    public final o7 f17850s;

    public e9(o7 o7Var) {
        this.f17850s = o7Var;
    }

    @Override // s4.o7
    public final o7 b() {
        return this;
    }

    @Override // s4.o7
    public final List<?> f() {
        return this.f17850s.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((n7) this.f17850s).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new d9(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new c9(this, i10);
    }

    @Override // s4.o7
    public final void r(g6 g6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17850s.size();
    }

    @Override // s4.o7
    public final Object w(int i10) {
        return this.f17850s.w(i10);
    }
}
