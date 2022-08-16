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
public final class s7 extends y5<Long> implements RandomAccess, g7, k8 {

    /* renamed from: v */
    public static final s7 f18095v;

    /* renamed from: t */
    public long[] f18096t;

    /* renamed from: u */
    public int f18097u;

    static {
        s7 s7Var = new s7(new long[0], 0);
        f18095v = s7Var;
        s7Var.f18203s = false;
    }

    public s7() {
        this(new long[10], 0);
    }

    public s7(long[] jArr, int i10) {
        this.f18096t = jArr;
        this.f18097u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f18097u)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f18096t;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[f82.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f18096t, i10, jArr2, i10 + 1, this.f18097u - i10);
            this.f18096t = jArr2;
        }
        this.f18096t[i10] = longValue;
        this.f18097u++;
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // s4.y5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = i7.f17920a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof s7)) {
            return super.addAll(collection);
        }
        s7 s7Var = (s7) collection;
        int i10 = s7Var.f18097u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18097u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f18096t;
        if (i12 > jArr.length) {
            this.f18096t = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(s7Var.f18096t, 0, this.f18096t, this.f18097u, s7Var.f18097u);
        this.f18097u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i10) {
        k(i10);
        return this.f18096t[i10];
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return super.equals(obj);
        }
        s7 s7Var = (s7) obj;
        if (this.f18097u != s7Var.f18097u) {
            return false;
        }
        long[] jArr = s7Var.f18096t;
        for (int i10 = 0; i10 < this.f18097u; i10++) {
            if (this.f18096t[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final g7 j(int i10) {
        if (i10 >= this.f18097u) {
            return new s7(Arrays.copyOf(this.f18096t, i10), this.f18097u);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f18096t[i10]);
    }

    public final void h(long j3) {
        d();
        int i10 = this.f18097u;
        long[] jArr = this.f18096t;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[f82.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f18096t = jArr2;
        }
        long[] jArr3 = this.f18096t;
        int i11 = this.f18097u;
        this.f18097u = i11 + 1;
        jArr3[i11] = j3;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18097u; i11++) {
            i10 = (i10 * 31) + i7.b(this.f18096t[i11]);
        }
        return i10;
    }

    public final String i(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f18097u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f18097u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18096t[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f18097u) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        long[] jArr = this.f18096t;
        long j3 = jArr[i10];
        if (i10 < this.f18097u - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f18097u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            long[] jArr = this.f18096t;
            System.arraycopy(jArr, i11, jArr, i10, this.f18097u - i11);
            this.f18097u -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        k(i10);
        long[] jArr = this.f18096t;
        long j3 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18097u;
    }
}
