package m4;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gd2 implements Iterator {

    /* renamed from: s */
    public int f8833s = 0;

    /* renamed from: t */
    public final /* synthetic */ hd2 f8834t;

    public gd2(hd2 hd2Var) {
        this.f8834t = hd2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8833s < this.f8834t.f9199s.size() || this.f8834t.f9200t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8833s >= this.f8834t.f9199s.size()) {
            hd2 hd2Var = this.f8834t;
            hd2Var.f9199s.add(hd2Var.f9200t.next());
            return next();
        }
        List<E> list = this.f8834t.f9199s;
        int i10 = this.f8833s;
        this.f8833s = i10 + 1;
        return list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
