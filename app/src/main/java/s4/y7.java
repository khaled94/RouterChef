package s4;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class y7<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: t */
    public static final y7 f18207t;

    /* renamed from: s */
    public boolean f18208s = true;

    static {
        y7 y7Var = new y7();
        f18207t = y7Var;
        y7Var.f18208s = false;
    }

    public y7() {
    }

    public y7(Map<K, V> map) {
        super(map);
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = i7.f17920a;
            int length = bArr.length;
            for (byte b10 : bArr) {
                length = (length * 31) + b10;
            }
            if (length != 0) {
                return length;
            }
            return 1;
        }
        return obj.hashCode();
    }

    public final void b() {
        if (this.f18208s) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
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
            i10 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        b();
        Charset charset = i7.f17920a;
        Objects.requireNonNull(k10);
        Objects.requireNonNull(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (K k10 : map.keySet()) {
            Charset charset = i7.f17920a;
            Objects.requireNonNull(k10);
            Objects.requireNonNull(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        return (V) super.remove(obj);
    }
}
