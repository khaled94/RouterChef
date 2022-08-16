package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l4.b;
import r.f;

/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {
    public static Object[] A;
    public static int B;

    /* renamed from: w */
    public static final int[] f17164w = new int[0];

    /* renamed from: x */
    public static final Object[] f17165x = new Object[0];
    public static Object[] y;

    /* renamed from: z */
    public static int f17166z;

    /* renamed from: s */
    public int[] f17167s;

    /* renamed from: t */
    public Object[] f17168t;

    /* renamed from: u */
    public int f17169u;

    /* renamed from: v */
    public f<E, E> f17170v;

    public c() {
        this(0);
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f17167s = f17164w;
            this.f17168t = f17165x;
        } else {
            d(i10);
        }
        this.f17169u = 0;
    }

    public static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (B < 10) {
                    objArr[0] = A;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A = objArr;
                    B++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f17166z < 10) {
                    objArr[0] = y;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    y = objArr;
                    f17166z++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = g(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f17169u;
        int[] iArr = this.f17167s;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f17168t;
            d(i14);
            int[] iArr2 = this.f17167s;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f17168t, 0, objArr.length);
            }
            e(iArr, objArr, this.f17169u);
        }
        int i15 = this.f17169u;
        if (i12 < i15) {
            int[] iArr3 = this.f17167s;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f17168t;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f17169u - i12);
        }
        this.f17167s[i12] = i10;
        this.f17168t[i12] = e10;
        this.f17169u++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f17169u;
        int[] iArr = this.f17167s;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f17168t;
            d(size);
            int i10 = this.f17169u;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f17167s, 0, i10);
                System.arraycopy(objArr, 0, this.f17168t, 0, this.f17169u);
            }
            e(iArr, objArr, this.f17169u);
        }
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f17169u;
        if (i10 != 0) {
            e(this.f17167s, this.f17168t, i10);
            this.f17167s = f17164w;
            this.f17168t = f17165x;
            this.f17169u = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                Object[] objArr = A;
                if (objArr != null) {
                    this.f17168t = objArr;
                    A = (Object[]) objArr[0];
                    this.f17167s = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    B--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = y;
                if (objArr2 != null) {
                    this.f17168t = objArr2;
                    y = (Object[]) objArr2[0];
                    this.f17167s = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17166z--;
                    return;
                }
            }
        }
        this.f17167s = new int[i10];
        this.f17168t = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f17169u != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17169u; i10++) {
                try {
                    if (!set.contains(this.f17168t[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g(Object obj, int i10) {
        int i11 = this.f17169u;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b.b(this.f17167s, i11, i10);
        if (b10 < 0 || obj.equals(this.f17168t[b10])) {
            return b10;
        }
        int i12 = b10 + 1;
        while (i12 < i11 && this.f17167s[i12] == i10) {
            if (obj.equals(this.f17168t[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = b10 - 1; i13 >= 0 && this.f17167s[i13] == i10; i13--) {
            if (obj.equals(this.f17168t[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int h() {
        int i10 = this.f17169u;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b.b(this.f17167s, i10, 0);
        if (b10 < 0 || this.f17168t[b10] == null) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < i10 && this.f17167s[i11] == 0) {
            if (this.f17168t[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = b10 - 1; i12 >= 0 && this.f17167s[i12] == 0; i12--) {
            if (this.f17168t[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f17167s;
        int i10 = this.f17169u;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final E i(int i10) {
        Object[] objArr = this.f17168t;
        E e10 = (E) objArr[i10];
        int i11 = this.f17169u;
        if (i11 <= 1) {
            e(this.f17167s, objArr, i11);
            this.f17167s = f17164w;
            this.f17168t = f17165x;
            this.f17169u = 0;
        } else {
            int[] iArr = this.f17167s;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f17169u = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr2 = this.f17168t;
                    System.arraycopy(objArr2, i14, objArr2, i10, this.f17169u - i10);
                }
                this.f17168t[this.f17169u] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                d(i12);
                this.f17169u--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f17167s, 0, i10);
                    System.arraycopy(objArr, 0, this.f17168t, 0, i10);
                }
                int i15 = this.f17169u;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f17167s, i10, i15 - i10);
                    System.arraycopy(objArr, i16, this.f17168t, i10, this.f17169u - i10);
                }
            }
        }
        return e10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f17169u <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f17170v == null) {
            this.f17170v = new b(this);
        }
        f<E, E> fVar = this.f17170v;
        if (fVar.f17182b == null) {
            fVar.f17182b = new f.c();
        }
        return fVar.f17182b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            i(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f17169u - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f17168t[i10])) {
                i(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f17169u;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f17169u;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f17168t, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17169u) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17169u));
        }
        System.arraycopy(this.f17168t, 0, tArr, 0, this.f17169u);
        int length = tArr.length;
        int i10 = this.f17169u;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17169u * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f17169u; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f17168t[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
