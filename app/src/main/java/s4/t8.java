package s4;

import androidx.fragment.app.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class t8 implements Map.Entry, Comparable<t8> {

    /* renamed from: s */
    public final Comparable f18120s;

    /* renamed from: t */
    public Object f18121t;

    /* renamed from: u */
    public final /* synthetic */ x8 f18122u;

    public t8(x8 x8Var, Comparable comparable, Object obj) {
        this.f18122u = x8Var;
        this.f18120s = comparable;
        this.f18121t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(t8 t8Var) {
        return this.f18120s.compareTo(t8Var.f18120s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f18120s;
        Object key = entry.getKey();
        if (comparable == null) {
            z10 = key == null;
        } else {
            z10 = comparable.equals(key);
        }
        if (z10) {
            Object obj2 = this.f18121t;
            Object value = entry.getValue();
            if (obj2 == null) {
                z11 = value == null;
            } else {
                z11 = obj2.equals(value);
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f18120s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18121t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18120s;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18121t;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x8 x8Var = this.f18122u;
        int i10 = x8.y;
        x8Var.h();
        Object obj2 = this.f18121t;
        this.f18121t = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18120s);
        String valueOf2 = String.valueOf(this.f18121t);
        return a.b(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
