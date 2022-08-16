package m4;

import androidx.fragment.app.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class jb2 implements Map.Entry, Comparable<jb2> {

    /* renamed from: s */
    public final Comparable f9901s;

    /* renamed from: t */
    public Object f9902t;

    /* renamed from: u */
    public final /* synthetic */ mb2 f9903u;

    public jb2(mb2 mb2Var, Comparable comparable, Object obj) {
        this.f9903u = mb2Var;
        this.f9901s = comparable;
        this.f9902t = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(jb2 jb2Var) {
        return this.f9901s.compareTo(jb2Var.f9901s);
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
        Comparable comparable = this.f9901s;
        Object key = entry.getKey();
        if (comparable == null) {
            z10 = key == null;
        } else {
            z10 = comparable.equals(key);
        }
        if (z10) {
            Object obj2 = this.f9902t;
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
    public final /* synthetic */ Object getKey() {
        return this.f9901s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9902t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9901s;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9902t;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        mb2 mb2Var = this.f9903u;
        int i10 = mb2.y;
        mb2Var.h();
        Object obj2 = this.f9902t;
        this.f9902t = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9901s);
        String valueOf2 = String.valueOf(this.f9902t);
        return a.b(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
