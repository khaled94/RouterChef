package m4;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import l0.d;

/* loaded from: classes.dex */
public final class x82 extends c82<Double> implements RandomAccess, xa2 {

    /* renamed from: t */
    public double[] f15249t;

    /* renamed from: u */
    public int f15250u;

    static {
        new x82(new double[0], 0).f6742s = false;
    }

    public x82() {
        this(new double[10], 0);
    }

    public x82(double[] dArr, int i10) {
        this.f15249t = dArr;
        this.f15250u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f15250u)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        double[] dArr = this.f15249t;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[f82.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f15249t, i10, dArr2, i10 + 1, this.f15250u - i10);
            this.f15249t = dArr2;
        }
        this.f15249t[i10] = doubleValue;
        this.f15250u++;
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // m4.c82, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = v92.f14624a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof x82)) {
            return super.addAll(collection);
        }
        x82 x82Var = (x82) collection;
        int i10 = x82Var.f15250u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15250u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f15249t;
        if (i12 > dArr.length) {
            this.f15249t = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(x82Var.f15249t, 0, this.f15249t, this.f15250u, x82Var.f15250u);
        this.f15250u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d5) {
        d();
        int i10 = this.f15250u;
        double[] dArr = this.f15249t;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[f82.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f15249t = dArr2;
        }
        double[] dArr3 = this.f15249t;
        int i11 = this.f15250u;
        this.f15250u = i11 + 1;
        dArr3[i11] = d5;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x82)) {
            return super.equals(obj);
        }
        x82 x82Var = (x82) obj;
        if (this.f15250u != x82Var.f15250u) {
            return false;
        }
        double[] dArr = x82Var.f15249t;
        for (int i10 = 0; i10 < this.f15250u; i10++) {
            if (Double.doubleToLongBits(this.f15249t[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f15250u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.f15249t[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f15250u) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15250u; i11++) {
            i10 = (i10 * 31) + v92.b(Double.doubleToLongBits(this.f15249t[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f15250u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f15249t[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // m4.u92
    public final /* bridge */ /* synthetic */ u92 j(int i10) {
        if (i10 >= this.f15250u) {
            return new x82(Arrays.copyOf(this.f15249t, i10), this.f15250u);
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        h(i10);
        double[] dArr = this.f15249t;
        double d5 = dArr[i10];
        if (i10 < this.f15250u - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f15250u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            double[] dArr = this.f15249t;
            System.arraycopy(dArr, i11, dArr, i10, this.f15250u - i11);
            this.f15250u -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        h(i10);
        double[] dArr = this.f15249t;
        double d5 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15250u;
    }
}
