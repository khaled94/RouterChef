package m4;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class la2<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: t */
    public static final la2 f10694t;

    /* renamed from: s */
    public boolean f10695s = true;

    static {
        la2 la2Var = new la2();
        f10694t = la2Var;
        la2Var.f10695s = false;
    }

    public la2() {
    }

    public la2(Map<K, V> map) {
        super(map);
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = v92.f14624a;
            int length = bArr.length;
            int i10 = length;
            for (int i11 = 0; i11 < 0 + length; i11++) {
                i10 = (i10 * 31) + bArr[i11];
            }
            if (i10 != 0) {
                return i10;
            }
            return 1;
        } else if (!(obj instanceof o92)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final la2<K, V> a() {
        return isEmpty() ? new la2<>() : new la2<>(this);
    }

    public final void c() {
        if (this.f10695s) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                V value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                    z10 = value.equals(obj2);
                    continue;
                } else {
                    z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        c();
        Charset charset = v92.f14624a;
        Objects.requireNonNull(k10);
        Objects.requireNonNull(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c();
        for (K k10 : map.keySet()) {
            Charset charset = v92.f14624a;
            Objects.requireNonNull(k10);
            Objects.requireNonNull(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        return (V) super.remove(obj);
    }
}
