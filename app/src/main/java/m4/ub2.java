package m4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ub2 extends AbstractList<String> implements RandomAccess, ca2 {

    /* renamed from: s */
    public final ca2 f14331s;

    public ub2(ca2 ca2Var) {
        this.f14331s = ca2Var;
    }

    @Override // m4.ca2
    public final ca2 b() {
        return this;
    }

    @Override // m4.ca2
    public final List<?> f() {
        return this.f14331s.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((ba2) this.f14331s).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new tb2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new sb2(this, i10);
    }

    @Override // m4.ca2
    public final void n(n82 n82Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14331s.size();
    }

    @Override // m4.ca2
    public final Object w(int i10) {
        return this.f14331s.w(i10);
    }
}
