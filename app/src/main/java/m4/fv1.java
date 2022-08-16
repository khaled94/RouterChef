package m4;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class fv1 extends dv1 implements List {

    /* renamed from: x */
    public final /* synthetic */ gv1 f8651x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv1(gv1 gv1Var, Object obj, @CheckForNull List list, dv1 dv1Var) {
        super(gv1Var, obj, list, dv1Var);
        this.f8651x = gv1Var;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        a();
        boolean isEmpty = this.f7649t.isEmpty();
        ((List) this.f7649t).add(i10, obj);
        this.f8651x.f9055w++;
        if (isEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f7649t).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f7649t.size();
        gv1 gv1Var = this.f8651x;
        gv1Var.f9055w = (size2 - size) + gv1Var.f9055w;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a();
        return ((List) this.f7649t).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        a();
        return ((List) this.f7649t).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        a();
        return ((List) this.f7649t).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new ev1(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        a();
        return new ev1(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        a();
        Object remove = ((List) this.f7649t).remove(i10);
        gv1 gv1Var = this.f8651x;
        gv1Var.f9055w--;
        e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        a();
        return ((List) this.f7649t).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        a();
        gv1 gv1Var = this.f8651x;
        Object obj = this.f7648s;
        List subList = ((List) this.f7649t).subList(i10, i11);
        dv1 dv1Var = this.f7650u;
        if (dv1Var == null) {
            dv1Var = this;
        }
        Objects.requireNonNull(gv1Var);
        return subList instanceof RandomAccess ? new zu1(gv1Var, obj, subList, dv1Var) : new fv1(gv1Var, obj, subList, dv1Var);
    }
}
