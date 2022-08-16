package r;

import java.util.ConcurrentModificationException;
import java.util.Map;
import l4.b;

/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: v */
    public static Object[] f17196v;

    /* renamed from: w */
    public static int f17197w;

    /* renamed from: x */
    public static Object[] f17198x;
    public static int y;

    /* renamed from: s */
    public int[] f17199s;

    /* renamed from: t */
    public Object[] f17200t;

    /* renamed from: u */
    public int f17201u;

    public g() {
        this.f17199s = b.f5813u;
        this.f17200t = b.f5814v;
        this.f17201u = 0;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f17199s = b.f5813u;
            this.f17200t = b.f5814v;
        } else {
            a(i10);
        }
        this.f17201u = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            int i10 = gVar.f17201u;
            b(this.f17201u + i10);
            if (this.f17201u != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    put(gVar.h(i11), gVar.k(i11));
                }
            } else if (i10 > 0) {
                System.arraycopy(gVar.f17199s, 0, this.f17199s, 0, i10);
                System.arraycopy(gVar.f17200t, 0, this.f17200t, 0, i10 << 1);
                this.f17201u = i10;
            }
        }
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = f17198x;
                if (objArr != null) {
                    this.f17200t = objArr;
                    f17198x = (Object[]) objArr[0];
                    this.f17199s = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    y--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f17196v;
                if (objArr2 != null) {
                    this.f17200t = objArr2;
                    f17196v = (Object[]) objArr2[0];
                    this.f17199s = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17197w--;
                    return;
                }
            }
        }
        this.f17199s = new int[i10];
        this.f17200t = new Object[i10 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (y < 10) {
                    objArr[0] = f17198x;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f17198x = objArr;
                    y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f17197w < 10) {
                    objArr[0] = f17196v;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f17196v = objArr;
                    f17197w++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f17201u;
        int[] iArr = this.f17199s;
        if (iArr.length < i10) {
            Object[] objArr = this.f17200t;
            a(i10);
            if (this.f17201u > 0) {
                System.arraycopy(iArr, 0, this.f17199s, 0, i11);
                System.arraycopy(objArr, 0, this.f17200t, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f17201u == i11) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int i10 = this.f17201u;
        if (i10 > 0) {
            int[] iArr = this.f17199s;
            Object[] objArr = this.f17200t;
            this.f17199s = b.f5813u;
            this.f17200t = b.f5814v;
            this.f17201u = 0;
            c(iArr, objArr, i10);
        }
        if (this.f17201u <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(Object obj, int i10) {
        int i11 = this.f17201u;
        if (i11 == 0) {
            return -1;
        }
        try {
            int b10 = b.b(this.f17199s, i11, i10);
            if (b10 < 0 || obj.equals(this.f17200t[b10 << 1])) {
                return b10;
            }
            int i12 = b10 + 1;
            while (i12 < i11 && this.f17199s[i12] == i10) {
                if (obj.equals(this.f17200t[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b10 - 1; i13 >= 0 && this.f17199s[i13] == i10; i13--) {
                if (obj.equals(this.f17200t[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f17201u != gVar.f17201u) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17201u; i10++) {
                try {
                    K h10 = h(i10);
                    V k10 = k(i10);
                    Object orDefault = gVar.getOrDefault(h10, null);
                    if (k10 == null) {
                        if (orDefault != null || !gVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!k10.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f17201u != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f17201u; i11++) {
                try {
                    K h11 = h(i11);
                    V k11 = k(i11);
                    Object obj2 = map.get(h11);
                    if (k11 == null) {
                        if (obj2 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!k11.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.f17201u;
        if (i10 == 0) {
            return -1;
        }
        try {
            int b10 = b.b(this.f17199s, i10, 0);
            if (b10 < 0 || this.f17200t[b10 << 1] == null) {
                return b10;
            }
            int i11 = b10 + 1;
            while (i11 < i10 && this.f17199s[i11] == 0) {
                if (this.f17200t[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = b10 - 1; i12 >= 0 && this.f17199s[i12] == 0; i12--) {
                if (this.f17200t[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i10 = this.f17201u * 2;
        Object[] objArr = this.f17200t;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int e10 = e(obj);
        return e10 >= 0 ? (V) this.f17200t[(e10 << 1) + 1] : v10;
    }

    public final K h(int i10) {
        return (K) this.f17200t[i10 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f17199s;
        Object[] objArr = this.f17200t;
        int i10 = this.f17201u;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final V i(int i10) {
        Object[] objArr = this.f17200t;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f17201u;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f17199s, objArr, i12);
            this.f17199s = b.f5813u;
            this.f17200t = b.f5814v;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f17199s;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr2 = this.f17200t;
                    System.arraycopy(objArr2, i16 << 1, objArr2, i11, i17 << 1);
                }
                Object[] objArr3 = this.f17200t;
                int i18 = i14 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 != this.f17201u) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f17199s, 0, i10);
                    System.arraycopy(objArr, 0, this.f17200t, 0, i11);
                }
                if (i10 < i14) {
                    int i19 = i10 + 1;
                    int i20 = i14 - i10;
                    System.arraycopy(iArr, i19, this.f17199s, i10, i20);
                    System.arraycopy(objArr, i19 << 1, this.f17200t, i11, i20 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 == this.f17201u) {
            this.f17201u = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean isEmpty() {
        return this.f17201u <= 0;
    }

    public final V j(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f17200t;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public final V k(int i10) {
        return (V) this.f17200t[(i10 << 1) + 1];
    }

    public final V put(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.f17201u;
        if (k10 == null) {
            i11 = f();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = d(k10, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            Object[] objArr = this.f17200t;
            V v11 = (V) objArr[i13];
            objArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.f17199s;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr2 = this.f17200t;
            a(i15);
            if (i12 != this.f17201u) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f17199s;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f17200t, 0, objArr2.length);
            }
            c(iArr, objArr2, i12);
        }
        if (i14 < i12) {
            int[] iArr3 = this.f17199s;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr3 = this.f17200t;
            System.arraycopy(objArr3, i14 << 1, objArr3, i16 << 1, (this.f17201u - i14) << 1);
        }
        int i17 = this.f17201u;
        if (i12 == i17) {
            int[] iArr4 = this.f17199s;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr4 = this.f17200t;
                int i18 = i14 << 1;
                objArr4[i18] = k10;
                objArr4[i18 + 1] = v10;
                this.f17201u = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, null);
        return orDefault == null ? put(k10, v10) : orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return i(e10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 >= 0) {
            V k10 = k(e10);
            if (obj2 != k10 && (obj2 == null || !obj2.equals(k10))) {
                return false;
            }
            i(e10);
            return true;
        }
        return false;
    }

    public final V replace(K k10, V v10) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return j(e10, v10);
        }
        return null;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int e10 = e(k10);
        if (e10 >= 0) {
            V k11 = k(e10);
            if (k11 != v10 && (v10 == null || !v10.equals(k11))) {
                return false;
            }
            j(e10, v11);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f17201u;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17201u * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f17201u; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            K h10 = h(i10);
            if (h10 != this) {
                sb.append(h10);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k10 = k(i10);
            if (k10 != this) {
                sb.append(k10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
