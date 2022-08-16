package m4;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import l0.d;

/* loaded from: classes.dex */
public final class n92 extends c82<Integer> implements RandomAccess, q92, xa2 {

    /* renamed from: v */
    public static final n92 f11578v;

    /* renamed from: t */
    public int[] f11579t;

    /* renamed from: u */
    public int f11580u;

    static {
        n92 n92Var = new n92(new int[0], 0);
        f11578v = n92Var;
        n92Var.f6742s = false;
    }

    public n92() {
        this(new int[10], 0);
    }

    public n92(int[] iArr, int i10) {
        this.f11579t = iArr;
        this.f11580u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f11580u)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f11579t;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[f82.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f11579t, i10, iArr2, i10 + 1, this.f11580u - i10);
            this.f11579t = iArr2;
        }
        this.f11579t[i10] = intValue;
        this.f11580u++;
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    @Override // m4.c82, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = v92.f14624a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof n92)) {
            return super.addAll(collection);
        }
        n92 n92Var = (n92) collection;
        int i10 = n92Var.f11580u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11580u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f11579t;
        if (i12 > iArr.length) {
            this.f11579t = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(n92Var.f11579t, 0, this.f11579t, this.f11580u, n92Var.f11580u);
        this.f11580u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        k(i10);
        return this.f11579t[i10];
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n92)) {
            return super.equals(obj);
        }
        n92 n92Var = (n92) obj;
        if (this.f11580u != n92Var.f11580u) {
            return false;
        }
        int[] iArr = n92Var.f11579t;
        for (int i10 = 0; i10 < this.f11580u; i10++) {
            if (this.f11579t[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final q92 j(int i10) {
        if (i10 >= this.f11580u) {
            return new n92(Arrays.copyOf(this.f11579t, i10), this.f11580u);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f11579t[i10]);
    }

    public final void h(int i10) {
        d();
        int i11 = this.f11580u;
        int[] iArr = this.f11579t;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[f82.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f11579t = iArr2;
        }
        int[] iArr3 = this.f11579t;
        int i12 = this.f11580u;
        this.f11580u = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11580u; i11++) {
            i10 = (i10 * 31) + this.f11579t[i11];
        }
        return i10;
    }

    public final String i(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f11580u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f11580u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11579t[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f11580u) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        int[] iArr = this.f11579t;
        int i12 = iArr[i10];
        if (i10 < this.f11580u - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f11580u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            int[] iArr = this.f11579t;
            System.arraycopy(iArr, i11, iArr, i10, this.f11580u - i11);
            this.f11580u -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        k(i10);
        int[] iArr = this.f11579t;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11580u;
    }
}
