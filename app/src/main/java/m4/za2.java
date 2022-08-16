package m4;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import l0.d;

/* loaded from: classes.dex */
public final class za2<E> extends c82<E> implements RandomAccess {

    /* renamed from: v */
    public static final za2<Object> f16072v;

    /* renamed from: t */
    public E[] f16073t;

    /* renamed from: u */
    public int f16074u;

    static {
        za2<Object> za2Var = new za2<>(new Object[0], 0);
        f16072v = za2Var;
        za2Var.f6742s = false;
    }

    public za2(E[] eArr, int i10) {
        this.f16073t = eArr;
        this.f16074u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f16074u)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        E[] eArr = this.f16073t;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[f82.a(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f16073t, i10, eArr2, i10 + 1, this.f16074u - i10);
            this.f16073t = eArr2;
        }
        this.f16073t[i10] = e10;
        this.f16074u++;
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f16074u;
        E[] eArr = this.f16073t;
        if (i10 == eArr.length) {
            this.f16073t = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f16073t;
        int i11 = this.f16074u;
        this.f16074u = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final String e(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f16074u);
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f16074u) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        g(i10);
        return this.f16073t[i10];
    }

    @Override // m4.u92
    public final /* bridge */ /* synthetic */ u92 j(int i10) {
        if (i10 >= this.f16074u) {
            return new za2(Arrays.copyOf(this.f16073t, i10), this.f16074u);
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        d();
        g(i10);
        E[] eArr = this.f16073t;
        E e10 = eArr[i10];
        if (i10 < this.f16074u - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f16074u--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        g(i10);
        E[] eArr = this.f16073t;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16074u;
    }
}
