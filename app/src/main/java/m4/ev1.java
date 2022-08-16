package m4;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class ev1 extends cv1 implements ListIterator {

    /* renamed from: v */
    public final /* synthetic */ fv1 f8290v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev1(fv1 fv1Var) {
        super(fv1Var);
        this.f8290v = fv1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev1(fv1 fv1Var, int i10) {
        super(fv1Var, ((List) fv1Var.f7649t).listIterator(i10));
        this.f8290v = fv1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f8290v.isEmpty();
        a();
        ((ListIterator) this.f7144s).add(obj);
        fv1 fv1Var = this.f8290v;
        fv1Var.f8651x.f9055w++;
        if (isEmpty) {
            fv1Var.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f7144s).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f7144s).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f7144s).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f7144s).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f7144s).set(obj);
    }
}
