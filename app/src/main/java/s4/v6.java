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
public final class v6 extends y5<Float> implements RandomAccess, k8 {

    /* renamed from: t */
    public float[] f18150t;

    /* renamed from: u */
    public int f18151u;

    static {
        new v6(new float[0], 0).f18203s = false;
    }

    public v6() {
        this(new float[10], 0);
    }

    public v6(float[] fArr, int i10) {
        this.f18150t = fArr;
        this.f18151u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f18151u)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        float[] fArr = this.f18150t;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[f82.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f18150t, i10, fArr2, i10 + 1, this.f18151u - i10);
            this.f18150t = fArr2;
        }
        this.f18150t[i10] = floatValue;
        this.f18151u++;
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // s4.y5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        Charset charset = i7.f17920a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof v6)) {
            return super.addAll(collection);
        }
        v6 v6Var = (v6) collection;
        int i10 = v6Var.f18151u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18151u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f18150t;
        if (i12 > fArr.length) {
            this.f18150t = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(v6Var.f18150t, 0, this.f18150t, this.f18151u, v6Var.f18151u);
        this.f18151u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f10) {
        d();
        int i10 = this.f18151u;
        float[] fArr = this.f18150t;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[f82.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f18150t = fArr2;
        }
        float[] fArr3 = this.f18150t;
        int i11 = this.f18151u;
        this.f18151u = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return super.equals(obj);
        }
        v6 v6Var = (v6) obj;
        if (this.f18151u != v6Var.f18151u) {
            return false;
        }
        float[] fArr = v6Var.f18150t;
        for (int i10 = 0; i10 < this.f18151u; i10++) {
            if (Float.floatToIntBits(this.f18150t[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f18151u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        h(i10);
        return Float.valueOf(this.f18150t[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f18151u) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18151u; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f18150t[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f18151u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18150t[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // s4.h7
    public final /* bridge */ /* synthetic */ h7 j(int i10) {
        if (i10 >= this.f18151u) {
            return new v6(Arrays.copyOf(this.f18150t, i10), this.f18151u);
        }
        throw new IllegalArgumentException();
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        h(i10);
        float[] fArr = this.f18150t;
        float f10 = fArr[i10];
        if (i10 < this.f18151u - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f18151u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            float[] fArr = this.f18150t;
            System.arraycopy(fArr, i11, fArr, i10, this.f18151u - i11);
            this.f18151u -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        h(i10);
        float[] fArr = this.f18150t;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18151u;
    }
}
