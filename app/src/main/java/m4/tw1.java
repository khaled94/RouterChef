package m4;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tw1<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: s */
    public final List<F> f14188s;

    /* renamed from: t */
    public final cu1<? super F, ? extends T> f14189t;

    public tw1(List list) {
        q61 q61Var = q61.f12715a;
        this.f14188s = list;
        this.f14189t = q61Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14188s.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new sw1(this.f14188s.listIterator(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14188s.size();
    }
}
