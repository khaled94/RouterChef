package m4;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import l0.d;

/* loaded from: classes.dex */
public final class g92 extends c82<Float> implements RandomAccess, xa2 {

    /* renamed from: t */
    public float[] f8781t;

    /* renamed from: u */
    public int f8782u;

    static {
        new g92(new float[0], 0).f6742s = false;
    }

    public g92() {
        this(new float[10], 0);
    }

    public g92(float[] fArr, int i10) {
        this.f8781t = fArr;
        this.f8782u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f8782u)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        float[] fArr = this.f8781t;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[f82.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f8781t, i10, fArr2, i10 + 1, this.f8782u - i10);
            this.f8781t = fArr2;
        }
        this.f8781t[i10] = floatValue;
        this.f8782u++;
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // m4.c82, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        Charset charset = v92.f14624a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof g92)) {
            return super.addAll(collection);
        }
        g92 g92Var = (g92) collection;
        int i10 = g92Var.f8782u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8782u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f8781t;
        if (i12 > fArr.length) {
            this.f8781t = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(g92Var.f8781t, 0, this.f8781t, this.f8782u, g92Var.f8782u);
        this.f8782u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f10) {
        d();
        int i10 = this.f8782u;
        float[] fArr = this.f8781t;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[f82.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f8781t = fArr2;
        }
        float[] fArr3 = this.f8781t;
        int i11 = this.f8782u;
        this.f8782u = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g92)) {
            return super.equals(obj);
        }
        g92 g92Var = (g92) obj;
        if (this.f8782u != g92Var.f8782u) {
            return false;
        }
        float[] fArr = g92Var.f8781t;
        for (int i10 = 0; i10 < this.f8782u; i10++) {
            if (Float.floatToIntBits(this.f8781t[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f8782u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Float.valueOf(this.f8781t[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f8782u) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8782u; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f8781t[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f8782u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8781t[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // m4.u92
    public final /* bridge */ /* synthetic */ u92 j(int i10) {
        if (i10 >= this.f8782u) {
            return new g92(Arrays.copyOf(this.f8781t, i10), this.f8782u);
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        h(i10);
        float[] fArr = this.f8781t;
        float f10 = fArr[i10];
        if (i10 < this.f8782u - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f8782u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            float[] fArr = this.f8781t;
            System.arraycopy(fArr, i11, fArr, i10, this.f8782u - i11);
            this.f8782u -= i11 - i10;
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
        float[] fArr = this.f8781t;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8782u;
    }
}
