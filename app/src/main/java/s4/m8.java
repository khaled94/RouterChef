package s4;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import l0.d;
import m4.f82;

/* loaded from: classes.dex */
public final class m8<E> extends y5<E> implements RandomAccess {

    /* renamed from: v */
    public static final m8<Object> f17993v;

    /* renamed from: t */
    public E[] f17994t;

    /* renamed from: u */
    public int f17995u;

    static {
        m8<Object> m8Var = new m8<>(new Object[0], 0);
        f17993v = m8Var;
        m8Var.f18203s = false;
    }

    public m8(E[] eArr, int i10) {
        this.f17994t = eArr;
        this.f17995u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f17995u)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        E[] eArr = this.f17994t;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[f82.a(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f17994t, i10, eArr2, i10 + 1, this.f17995u - i10);
            this.f17994t = eArr2;
        }
        this.f17994t[i10] = e10;
        this.f17995u++;
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f17995u;
        E[] eArr = this.f17994t;
        if (i10 == eArr.length) {
            this.f17994t = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f17994t;
        int i11 = this.f17995u;
        this.f17995u = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final String e(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f17995u);
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17995u) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        g(i10);
        return this.f17994t[i10];
    }

    @Override // s4.h7
    public final /* bridge */ /* synthetic */ h7 j(int i10) {
        if (i10 >= this.f17995u) {
            return new m8(Arrays.copyOf(this.f17994t, i10), this.f17995u);
        }
        throw new IllegalArgumentException();
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        d();
        g(i10);
        E[] eArr = this.f17994t;
        E e10 = eArr[i10];
        if (i10 < this.f17995u - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f17995u--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        g(i10);
        E[] eArr = this.f17994t;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17995u;
    }
}
