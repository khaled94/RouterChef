package m4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class dv1 extends AbstractCollection {

    /* renamed from: s */
    public final Object f7648s;

    /* renamed from: t */
    public Collection f7649t;
    @CheckForNull

    /* renamed from: u */
    public final dv1 f7650u;
    @CheckForNull

    /* renamed from: v */
    public final Collection f7651v;

    /* renamed from: w */
    public final /* synthetic */ gv1 f7652w;

    public dv1(gv1 gv1Var, Object obj, @CheckForNull Collection collection, dv1 dv1Var) {
        this.f7652w = gv1Var;
        this.f7648s = obj;
        this.f7649t = collection;
        this.f7650u = dv1Var;
        this.f7651v = dv1Var == null ? null : dv1Var.f7649t;
    }

    public final void a() {
        Collection collection;
        dv1 dv1Var = this.f7650u;
        if (dv1Var != null) {
            dv1Var.a();
            if (this.f7650u.f7649t != this.f7651v) {
                throw new ConcurrentModificationException();
            }
        } else if (!this.f7649t.isEmpty() || (collection = (Collection) this.f7652w.f9054v.get(this.f7648s)) == null) {
        } else {
            this.f7649t = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.f7649t.isEmpty();
        boolean add = this.f7649t.add(obj);
        if (add) {
            this.f7652w.f9055w++;
            if (isEmpty) {
                d();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f7649t.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f7649t.size();
        gv1 gv1Var = this.f7652w;
        gv1Var.f9055w = (size2 - size) + gv1Var.f9055w;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f7649t.clear();
        this.f7652w.f9055w -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        a();
        return this.f7649t.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        a();
        return this.f7649t.containsAll(collection);
    }

    public final void d() {
        dv1 dv1Var = this.f7650u;
        if (dv1Var != null) {
            dv1Var.d();
        } else {
            this.f7652w.f9054v.put(this.f7648s, this.f7649t);
        }
    }

    public final void e() {
        dv1 dv1Var = this.f7650u;
        if (dv1Var != null) {
            dv1Var.e();
        } else if (!this.f7649t.isEmpty()) {
        } else {
            this.f7652w.f9054v.remove(this.f7648s);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f7649t.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        a();
        return this.f7649t.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a();
        return new cv1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        a();
        boolean remove = this.f7649t.remove(obj);
        if (remove) {
            gv1 gv1Var = this.f7652w;
            gv1Var.f9055w--;
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f7649t.removeAll(collection);
        if (removeAll) {
            int size2 = this.f7649t.size();
            gv1 gv1Var = this.f7652w;
            gv1Var.f9055w = (size2 - size) + gv1Var.f9055w;
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f7649t.retainAll(collection);
        if (retainAll) {
            int size2 = this.f7649t.size();
            gv1 gv1Var = this.f7652w;
            gv1Var.f9055w = (size2 - size) + gv1Var.f9055w;
            e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        a();
        return this.f7649t.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f7649t.toString();
    }
}
