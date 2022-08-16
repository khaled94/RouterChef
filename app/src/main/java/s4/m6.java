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
public final class m6 extends y5<Double> implements RandomAccess, k8 {

    /* renamed from: t */
    public double[] f17989t;

    /* renamed from: u */
    public int f17990u;

    static {
        new m6(new double[0], 0).f18203s = false;
    }

    public m6() {
        this(new double[10], 0);
    }

    public m6(double[] dArr, int i10) {
        this.f17989t = dArr;
        this.f17990u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17990u)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        double[] dArr = this.f17989t;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[f82.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f17989t, i10, dArr2, i10 + 1, this.f17990u - i10);
            this.f17989t = dArr2;
        }
        this.f17989t[i10] = doubleValue;
        this.f17990u++;
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // s4.y5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = i7.f17920a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof m6)) {
            return super.addAll(collection);
        }
        m6 m6Var = (m6) collection;
        int i10 = m6Var.f17990u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17990u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f17989t;
        if (i12 > dArr.length) {
            this.f17989t = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(m6Var.f17989t, 0, this.f17989t, this.f17990u, m6Var.f17990u);
        this.f17990u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d5) {
        d();
        int i10 = this.f17990u;
        double[] dArr = this.f17989t;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[f82.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f17989t = dArr2;
        }
        double[] dArr3 = this.f17989t;
        int i11 = this.f17990u;
        this.f17990u = i11 + 1;
        dArr3[i11] = d5;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return super.equals(obj);
        }
        m6 m6Var = (m6) obj;
        if (this.f17990u != m6Var.f17990u) {
            return false;
        }
        double[] dArr = m6Var.f17989t;
        for (int i10 = 0; i10 < this.f17990u; i10++) {
            if (Double.doubleToLongBits(this.f17989t[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f17990u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.f17989t[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f17990u) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17990u; i11++) {
            i10 = (i10 * 31) + i7.b(Double.doubleToLongBits(this.f17989t[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f17990u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f17989t[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // s4.h7
    public final /* bridge */ /* synthetic */ h7 j(int i10) {
        if (i10 >= this.f17990u) {
            return new m6(Arrays.copyOf(this.f17989t, i10), this.f17990u);
        }
        throw new IllegalArgumentException();
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        h(i10);
        double[] dArr = this.f17989t;
        double d5 = dArr[i10];
        if (i10 < this.f17990u - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f17990u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            double[] dArr = this.f17989t;
            System.arraycopy(dArr, i11, dArr, i10, this.f17990u - i11);
            this.f17990u -= i11 - i10;
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
        double[] dArr = this.f17989t;
        double d5 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17990u;
    }
}
