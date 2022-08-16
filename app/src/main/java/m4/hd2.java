package m4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class hd2<E> extends AbstractList<E> {

    /* renamed from: u */
    public static final x50 f9198u = x50.e(hd2.class);

    /* renamed from: s */
    public final List<E> f9199s;

    /* renamed from: t */
    public final Iterator<E> f9200t;

    public hd2(List<E> list, Iterator<E> it) {
        this.f9199s = list;
        this.f9200t = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        if (this.f9199s.size() > i10) {
            return this.f9199s.get(i10);
        }
        if (!this.f9200t.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9199s.add(this.f9200t.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new gd2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        x50 x50Var = f9198u;
        x50Var.c("potentially expensive size() call");
        x50Var.c("blowup running");
        while (this.f9200t.hasNext()) {
            this.f9199s.add(this.f9200t.next());
        }
        return this.f9199s.size();
    }
}
