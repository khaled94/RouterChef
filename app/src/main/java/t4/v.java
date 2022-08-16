package t4;

import androidx.appcompat.widget.e0;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import n9.d;

/* loaded from: classes.dex */
public abstract class v implements Map, Serializable {
    @CheckForNull

    /* renamed from: s */
    public transient d f18666s;
    @CheckForNull

    /* renamed from: t */
    public transient e f18667t;
    @CheckForNull

    /* renamed from: u */
    public transient f f18668u;

    /* renamed from: a */
    public final q values() {
        f fVar = this.f18668u;
        if (fVar == null) {
            g gVar = (g) this;
            f fVar2 = new f(gVar.f18649w, 1, gVar.f18650x);
            this.f18668u = fVar2;
            return fVar2;
        }
        return fVar;
    }

    /* renamed from: b */
    public final w entrySet() {
        d dVar = this.f18666s;
        if (dVar == null) {
            g gVar = (g) this;
            d dVar2 = new d(gVar, gVar.f18649w, gVar.f18650x);
            this.f18666s = dVar2;
            return dVar2;
        }
        return dVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return d.b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((g) this).f18650x == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        e eVar = this.f18667t;
        if (eVar == null) {
            g gVar = (g) this;
            e eVar2 = new e(gVar, new f(gVar.f18649w, 0, gVar.f18650x));
            this.f18667t = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((g) this).f18650x;
        if (i10 >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
            sb.append('{');
            boolean z10 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z10) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z10 = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(e0.a("size cannot be negative but was: ", i10));
    }
}
