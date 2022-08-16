package m4;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import l0.d;

/* loaded from: classes.dex */
public final class ga2 extends c82<Long> implements RandomAccess, t92, xa2 {

    /* renamed from: v */
    public static final ga2 f8794v;

    /* renamed from: t */
    public long[] f8795t;

    /* renamed from: u */
    public int f8796u;

    static {
        ga2 ga2Var = new ga2(new long[0], 0);
        f8794v = ga2Var;
        ga2Var.f6742s = false;
    }

    public ga2() {
        this(new long[10], 0);
    }

    public ga2(long[] jArr, int i10) {
        this.f8795t = jArr;
        this.f8796u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f8796u)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f8795t;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[f82.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f8795t, i10, jArr2, i10 + 1, this.f8796u - i10);
            this.f8795t = jArr2;
        }
        this.f8795t[i10] = longValue;
        this.f8796u++;
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // m4.c82, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = v92.f14624a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof ga2)) {
            return super.addAll(collection);
        }
        ga2 ga2Var = (ga2) collection;
        int i10 = ga2Var.f8796u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8796u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f8795t;
        if (i12 > jArr.length) {
            this.f8795t = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(ga2Var.f8795t, 0, this.f8795t, this.f8796u, ga2Var.f8796u);
        this.f8796u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final t92 j(int i10) {
        if (i10 >= this.f8796u) {
            return new ga2(Arrays.copyOf(this.f8795t, i10), this.f8796u);
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga2)) {
            return super.equals(obj);
        }
        ga2 ga2Var = (ga2) obj;
        if (this.f8796u != ga2Var.f8796u) {
            return false;
        }
        long[] jArr = ga2Var.f8795t;
        for (int i10 = 0; i10 < this.f8796u; i10++) {
            if (this.f8795t[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final long g(int i10) {
        k(i10);
        return this.f8795t[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f8795t[i10]);
    }

    public final void h(long j3) {
        d();
        int i10 = this.f8796u;
        long[] jArr = this.f8795t;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[f82.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f8795t = jArr2;
        }
        long[] jArr3 = this.f8795t;
        int i11 = this.f8796u;
        this.f8796u = i11 + 1;
        jArr3[i11] = j3;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8796u; i11++) {
            i10 = (i10 * 31) + v92.b(this.f8795t[i11]);
        }
        return i10;
    }

    public final String i(int i10) {
        return d.a(35, "Index:", i10, ", Size:", this.f8796u);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f8796u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8795t[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f8796u) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        long[] jArr = this.f8795t;
        long j3 = jArr[i10];
        if (i10 < this.f8796u - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f8796u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            long[] jArr = this.f8795t;
            System.arraycopy(jArr, i11, jArr, i10, this.f8796u - i11);
            this.f8796u -= i11 - i10;
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
        long[] jArr = this.f8795t;
        long j3 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8796u;
    }
}
