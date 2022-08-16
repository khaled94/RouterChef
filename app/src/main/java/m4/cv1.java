package m4;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class cv1 implements Iterator {

    /* renamed from: s */
    public final Iterator f7144s;

    /* renamed from: t */
    public final Collection f7145t;

    /* renamed from: u */
    public final /* synthetic */ dv1 f7146u;

    public cv1(dv1 dv1Var) {
        this.f7146u = dv1Var;
        Collection collection = dv1Var.f7649t;
        this.f7145t = collection;
        this.f7144s = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public cv1(dv1 dv1Var, Iterator it) {
        this.f7146u = dv1Var;
        this.f7145t = dv1Var.f7649t;
        this.f7144s = it;
    }

    public final void a() {
        this.f7146u.a();
        if (this.f7146u.f7649t == this.f7145t) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f7144s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f7144s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7144s.remove();
        dv1 dv1Var = this.f7146u;
        gv1 gv1Var = dv1Var.f7652w;
        gv1Var.f9055w--;
        dv1Var.e();
    }
}
