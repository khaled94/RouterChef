package m4;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import l0.d;

/* loaded from: classes.dex */
public final class g82 extends c82<Boolean> implements RandomAccess, xa2 {

    /* renamed from: t */
    public boolean[] f8768t;

    /* renamed from: u */
    public int f8769u;

    static {
        new g82(new boolean[0], 0).f6742s = false;
    }

    public g82() {
        this(new boolean[10], 0);
    }

    public g82(boolean[] zArr, int i10) {
        this.f8768t = zArr;
        this.f8769u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f8769u)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        boolean[] zArr = this.f8768t;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[f82.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f8768t, i10, zArr2, i10 + 1, this.f8769u - i10);
            this.f8768t = zArr2;
        }
        this.f8768t[i10] = booleanValue;
        this.f8769u++;
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // m4.c82, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = v92.f14624a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof g82)) {
            return super.addAll(collection);
        }
        g82 g82Var = (g82) collection;
        int i10 = g82Var.f8769u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8769u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f8768t;
        if (i12 > zArr.length) {
            this.f8768t = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(g82Var.f8768t, 0, this.f8768t, this.f8769u, g82Var.f8769u);
        this.f8769u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z10) {
        d();
        int i10 = this.f8769u;
        boolean[] zArr = this.f8768t;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[f82.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f8768t = zArr2;
        }
        boolean[] zArr3 = this.f8768t;
        int i11 = this.f8769u;
        this.f8769u = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g82)) {
            return super.equals(obj);
        }
        g82 g82Var = (g82) obj;
        if (this.f8769u != g82Var.f8769u) {
            return false;
        }
        boolean[] zArr = g82Var.f8768t;
        for (int i10 = 0; i10 < this.f8769u; i10++) {
            if (this.f8768t[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f8769u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Boolean.valueOf(this.f8768t[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f8769u) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8769u; i11++) {
            i10 = (i10 * 31) + v92.a(this.f8768t[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f8769u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8768t[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // m4.u92
    public final /* bridge */ /* synthetic */ u92 j(int i10) {
        if (i10 >= this.f8769u) {
            return new g82(Arrays.copyOf(this.f8768t, i10), this.f8769u);
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        h(i10);
        boolean[] zArr = this.f8768t;
        boolean z10 = zArr[i10];
        if (i10 < this.f8769u - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f8769u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            boolean[] zArr = this.f8768t;
            System.arraycopy(zArr, i11, zArr, i10, this.f8769u - i11);
            this.f8769u -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        h(i10);
        boolean[] zArr = this.f8768t;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8769u;
    }
}
