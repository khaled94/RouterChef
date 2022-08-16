package m4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class tv1<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object B = new Object();
    @CheckForNull
    public transient Collection<V> A;
    @CheckForNull

    /* renamed from: s */
    public transient Object f14180s;
    @CheckForNull

    /* renamed from: t */
    public transient int[] f14181t;
    @CheckForNull

    /* renamed from: u */
    public transient Object[] f14182u;
    @CheckForNull

    /* renamed from: v */
    public transient Object[] f14183v;

    /* renamed from: w */
    public transient int f14184w = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: x */
    public transient int f14185x;
    @CheckForNull
    public transient Set<K> y;
    @CheckForNull

    /* renamed from: z */
    public transient Set<Map.Entry<K, V>> f14186z;

    public tv1() {
    }

    public static Object a(tv1 tv1Var, int i10) {
        Object[] objArr = tv1Var.f14182u;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    public static Object b(tv1 tv1Var, int i10) {
        Object[] objArr = tv1Var.f14183v;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    @CheckForNull
    public final Map<K, V> c() {
        Object obj = this.f14180s;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        d();
        Map<K, V> c10 = c();
        if (c10 != null) {
            this.f14184w = Math.min(Math.max(size(), 3), 1073741823);
            c10.clear();
            this.f14180s = null;
        } else {
            Object[] objArr = this.f14182u;
            Objects.requireNonNull(objArr);
            Arrays.fill(objArr, 0, this.f14185x, (Object) null);
            Object[] objArr2 = this.f14183v;
            Objects.requireNonNull(objArr2);
            Arrays.fill(objArr2, 0, this.f14185x, (Object) null);
            Object obj = this.f14180s;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f14181t;
            Objects.requireNonNull(iArr);
            Arrays.fill(iArr, 0, this.f14185x, 0);
        }
        this.f14185x = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> c10 = c();
        return c10 != null ? c10.containsKey(obj) : h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> c10 = c();
        if (c10 == null) {
            for (int i10 = 0; i10 < this.f14185x; i10++) {
                Object[] objArr = this.f14183v;
                Objects.requireNonNull(objArr);
                if (js.a(obj, objArr[i10])) {
                    return true;
                }
            }
            return false;
        }
        return c10.containsValue(obj);
    }

    public final void d() {
        this.f14184w += 32;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f14180s;
        Objects.requireNonNull(obj);
        int[] iArr = this.f14181t;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.f14182u;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.f14183v;
        Objects.requireNonNull(objArr2);
        int size = size() - 1;
        if (i10 >= size) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i10] = iArr[size];
        iArr[size] = 0;
        int d5 = zv1.d(obj2) & i11;
        int c10 = ql.c(obj, d5);
        int i12 = size + 1;
        if (c10 == i12) {
            ql.g(obj, d5, i10 + 1);
            return;
        }
        while (true) {
            int i13 = c10 - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == i12) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            c10 = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f14186z;
        if (set == null) {
            ov1 ov1Var = new ov1(this);
            this.f14186z = ov1Var;
            return ov1Var;
        }
        return set;
    }

    public final boolean f() {
        return this.f14180s == null;
    }

    public final int g() {
        return (1 << (this.f14184w & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map<K, V> c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int h10 = h(obj);
        if (h10 == -1) {
            return null;
        }
        Object[] objArr = this.f14183v;
        Objects.requireNonNull(objArr);
        return (V) objArr[h10];
    }

    public final int h(@CheckForNull Object obj) {
        if (f()) {
            return -1;
        }
        int d5 = zv1.d(obj);
        int g10 = g();
        Object obj2 = this.f14180s;
        Objects.requireNonNull(obj2);
        int c10 = ql.c(obj2, d5 & g10);
        if (c10 == 0) {
            return -1;
        }
        int i10 = ~g10;
        int i11 = d5 & i10;
        do {
            int i12 = c10 - 1;
            int[] iArr = this.f14181t;
            Objects.requireNonNull(iArr);
            int i13 = iArr[i12];
            if ((i13 & i10) == i11) {
                Object[] objArr = this.f14182u;
                Objects.requireNonNull(objArr);
                if (js.a(obj, objArr[i12])) {
                    return i12;
                }
            }
            c10 = i13 & g10;
        } while (c10 != 0);
        return -1;
    }

    public final int i(int i10, int i11, int i12, int i13) {
        Object f10 = ql.f(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            ql.g(f10, i12 & i14, i13 + 1);
        }
        Object obj = this.f14180s;
        Objects.requireNonNull(obj);
        int[] iArr = this.f14181t;
        Objects.requireNonNull(iArr);
        for (int i15 = 0; i15 <= i10; i15++) {
            int c10 = ql.c(obj, i15);
            while (c10 != 0) {
                int i16 = c10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int c11 = ql.c(f10, i19);
                ql.g(f10, i19, c10);
                iArr[i16] = ((~i14) & i18) | (c11 & i14);
                c10 = i17 & i10;
            }
        }
        this.f14180s = f10;
        this.f14184w = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f14184w & (-32));
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(@CheckForNull Object obj) {
        if (f()) {
            return B;
        }
        int g10 = g();
        Object obj2 = this.f14180s;
        Objects.requireNonNull(obj2);
        int[] iArr = this.f14181t;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.f14182u;
        Objects.requireNonNull(objArr);
        int b10 = ql.b(obj, null, g10, obj2, iArr, objArr, null);
        if (b10 == -1) {
            return B;
        }
        Object[] objArr2 = this.f14183v;
        Objects.requireNonNull(objArr2);
        Object obj3 = objArr2[b10];
        e(b10, g10);
        this.f14185x--;
        d();
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.y;
        if (set == null) {
            qv1 qv1Var = new qv1(this);
            this.y = qv1Var;
            return qv1Var;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V put(K k10, V v10) {
        int length;
        int min;
        int i10;
        int i11 = -1;
        if (f()) {
            hu1.i(f(), "Arrays already allocated");
            int i12 = this.f14184w;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f14180s = ql.f(max2);
            this.f14184w = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f14184w & (-32));
            this.f14181t = new int[i12];
            this.f14182u = new Object[i12];
            this.f14183v = new Object[i12];
        }
        Map<K, V> c10 = c();
        if (c10 != null) {
            return c10.put(k10, v10);
        }
        int[] iArr = this.f14181t;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.f14182u;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.f14183v;
        Objects.requireNonNull(objArr2);
        int i13 = this.f14185x;
        int i14 = i13 + 1;
        int d5 = zv1.d(k10);
        int g10 = g();
        int i15 = d5 & g10;
        Object obj = this.f14180s;
        Objects.requireNonNull(obj);
        int c11 = ql.c(obj, i15);
        if (c11 == 0) {
            if (i14 > g10) {
                i10 = (g10 + 1) * (g10 < 32 ? 4 : 2);
                g10 = i(g10, i10, d5, i13);
                int[] iArr2 = this.f14181t;
                Objects.requireNonNull(iArr2);
                length = iArr2.length;
                if (i14 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    int[] iArr3 = this.f14181t;
                    Objects.requireNonNull(iArr3);
                    this.f14181t = Arrays.copyOf(iArr3, min);
                    Object[] objArr3 = this.f14182u;
                    Objects.requireNonNull(objArr3);
                    this.f14182u = Arrays.copyOf(objArr3, min);
                    Object[] objArr4 = this.f14183v;
                    Objects.requireNonNull(objArr4);
                    this.f14183v = Arrays.copyOf(objArr4, min);
                }
                int[] iArr4 = this.f14181t;
                Objects.requireNonNull(iArr4);
                iArr4[i13] = (~g10) & d5;
                Object[] objArr5 = this.f14182u;
                Objects.requireNonNull(objArr5);
                objArr5[i13] = k10;
                Object[] objArr6 = this.f14183v;
                Objects.requireNonNull(objArr6);
                objArr6[i13] = v10;
                this.f14185x = i14;
                d();
                return null;
            }
            Object obj2 = this.f14180s;
            Objects.requireNonNull(obj2);
            ql.g(obj2, i15, i14);
            int[] iArr22 = this.f14181t;
            Objects.requireNonNull(iArr22);
            length = iArr22.length;
            if (i14 > length) {
                int[] iArr32 = this.f14181t;
                Objects.requireNonNull(iArr32);
                this.f14181t = Arrays.copyOf(iArr32, min);
                Object[] objArr32 = this.f14182u;
                Objects.requireNonNull(objArr32);
                this.f14182u = Arrays.copyOf(objArr32, min);
                Object[] objArr42 = this.f14183v;
                Objects.requireNonNull(objArr42);
                this.f14183v = Arrays.copyOf(objArr42, min);
            }
            int[] iArr42 = this.f14181t;
            Objects.requireNonNull(iArr42);
            iArr42[i13] = (~g10) & d5;
            Object[] objArr52 = this.f14182u;
            Objects.requireNonNull(objArr52);
            objArr52[i13] = k10;
            Object[] objArr62 = this.f14183v;
            Objects.requireNonNull(objArr62);
            objArr62[i13] = v10;
            this.f14185x = i14;
            d();
            return null;
        }
        int i16 = ~g10;
        int i17 = d5 & i16;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int i20 = c11 + i11;
            int i21 = iArr[i20];
            int i22 = i21 & i16;
            if (i22 == i17 && js.a(k10, objArr[i20])) {
                V v11 = (V) objArr2[i20];
                objArr2[i20] = v10;
                return v11;
            }
            int i23 = i21 & g10;
            int i24 = i17;
            int i25 = i19 + 1;
            if (i23 != 0) {
                i19 = i25;
                c11 = i23;
                i17 = i24;
                i11 = -1;
            } else if (i25 >= 9) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                if (isEmpty()) {
                    i18 = -1;
                }
                while (i18 >= 0) {
                    Object[] objArr7 = this.f14182u;
                    Objects.requireNonNull(objArr7);
                    Object obj3 = objArr7[i18];
                    Object[] objArr8 = this.f14183v;
                    Objects.requireNonNull(objArr8);
                    linkedHashMap.put(obj3, objArr8[i18]);
                    int i26 = i18 + 1;
                    i18 = i26 < this.f14185x ? i26 : -1;
                }
                this.f14180s = linkedHashMap;
                this.f14181t = null;
                this.f14182u = null;
                this.f14183v = null;
                d();
                return (V) linkedHashMap.put(k10, v10);
            } else if (i14 > g10) {
                i10 = (g10 + 1) * (g10 < 32 ? 4 : 2);
            } else {
                iArr[i20] = (i14 & g10) | i22;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map<K, V> c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        V v10 = (V) j(obj);
        if (v10 != B) {
            return v10;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> c10 = c();
        return c10 != null ? c10.size() : this.f14185x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.A;
        if (collection == null) {
            sv1 sv1Var = new sv1(this);
            this.A = sv1Var;
            return sv1Var;
        }
        return collection;
    }

    public tv1(int i10) {
    }
}
