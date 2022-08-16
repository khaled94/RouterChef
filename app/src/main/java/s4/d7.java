package s4;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import l0.d;
import m4.f82;

/* loaded from: classes.dex */
public final class d7 extends y5<Integer> implements RandomAccess, f7, k8 {

    /* renamed from: v */
    public static final d7 f17798v;

    /* renamed from: t */
    public int[] f17799t;

    /* renamed from: u */
    public int f17800u;

    static {
        d7 d7Var = new d7(new int[0], 0);
        f17798v = d7Var;
        d7Var.f18203s = false;
    }

    public d7() {
        this(new int[10], 0);
    }

    public d7(int[] iArr, int i10) {
        this.f17799t = iArr;
        this.f17800u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17800u)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f17799t;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[f82.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f17799t, i10, iArr2, i10 + 1, this.f17800u - i10);
            this.f17799t = iArr2;
        }
        this.f17799t[i10] = intValue;
        this.f17800u++;
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    @Override // s4.y5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = i7.f17920a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof d7)) {
            return super.addAll(collection);
        }
        d7 d7Var = (d7) collection;
        int i10 = d7Var.f17800u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17800u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f17799t;
        if (i12 > iArr.length) {
            this.f17799t = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(d7Var.f17799t, 0, this.f17799t, this.f17800u, d7Var.f17800u);
        this.f17800u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        k(i10);
        return this.f17799t[i10];
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return super.equals(obj);
        }
        d7 d7Var = (d7) obj;
        if (this.f17800u != d7Var.f17800u) {
            return false;
        }
        int[] iArr = d7Var.f17799t;
        for (int i10 = 0; i10 < this.f17800u; i10++) {
            if (this.f17799t[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final f7 j(int i10) {
        if (i10 >= this.f17800u) {
            return new d7(Arrays.copyOf(this.f17799t, i10), this.f17800u);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f17799t[i10]);
    }

    public final void h(int i10) {
        d();
        int i11 = this.f17800u;
        int[] iArr = this.f17799t;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[f82.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f17799t = iArr2;
        }
        int[] iArr3 = this.f17799t;
        int i12 = this.f17800u;
        this.f17800u = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17800u; i11++) {
            i10 = (i10 * 31) + this.f17799t[i11];
        }
        return i10;
    }

    public final String i(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f17800u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f17800u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f17799t[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f17800u) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        int[] iArr = this.f17799t;
        int i12 = iArr[i10];
        if (i10 < this.f17800u - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f17800u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            int[] iArr = this.f17799t;
            System.arraycopy(iArr, i11, iArr, i10, this.f17800u - i11);
            this.f17800u -= i11 - i10;
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
        int[] iArr = this.f17799t;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17800u;
    }
}
