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
public final class b6 extends y5<Boolean> implements RandomAccess, k8 {

    /* renamed from: t */
    public boolean[] f17743t;

    /* renamed from: u */
    public int f17744u;

    static {
        new b6(new boolean[0], 0).f18203s = false;
    }

    public b6() {
        this(new boolean[10], 0);
    }

    public b6(boolean[] zArr, int i10) {
        this.f17743t = zArr;
        this.f17744u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17744u)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        boolean[] zArr = this.f17743t;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[f82.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f17743t, i10, zArr2, i10 + 1, this.f17744u - i10);
            this.f17743t = zArr2;
        }
        this.f17743t[i10] = booleanValue;
        this.f17744u++;
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // s4.y5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = i7.f17920a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof b6)) {
            return super.addAll(collection);
        }
        b6 b6Var = (b6) collection;
        int i10 = b6Var.f17744u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17744u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f17743t;
        if (i12 > zArr.length) {
            this.f17743t = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(b6Var.f17743t, 0, this.f17743t, this.f17744u, b6Var.f17744u);
        this.f17744u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z10) {
        d();
        int i10 = this.f17744u;
        boolean[] zArr = this.f17743t;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[f82.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f17743t = zArr2;
        }
        boolean[] zArr3 = this.f17743t;
        int i11 = this.f17744u;
        this.f17744u = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return super.equals(obj);
        }
        b6 b6Var = (b6) obj;
        if (this.f17744u != b6Var.f17744u) {
            return false;
        }
        boolean[] zArr = b6Var.f17743t;
        for (int i10 = 0; i10 < this.f17744u; i10++) {
            if (this.f17743t[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f17744u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        h(i10);
        return Boolean.valueOf(this.f17743t[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f17744u) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17744u; i11++) {
            i10 = (i10 * 31) + i7.a(this.f17743t[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f17744u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f17743t[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // s4.h7
    public final /* bridge */ /* synthetic */ h7 j(int i10) {
        if (i10 >= this.f17744u) {
            return new b6(Arrays.copyOf(this.f17743t, i10), this.f17744u);
        }
        throw new IllegalArgumentException();
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        h(i10);
        boolean[] zArr = this.f17743t;
        boolean z10 = zArr[i10];
        if (i10 < this.f17744u - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f17744u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            boolean[] zArr = this.f17743t;
            System.arraycopy(zArr, i11, zArr, i10, this.f17744u - i11);
            this.f17744u -= i11 - i10;
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
        boolean[] zArr = this.f17743t;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17744u;
    }
}
