package s4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.h0;

/* loaded from: classes.dex */
public class k implements n, j {

    /* renamed from: s */
    public final Map<String, n> f17946s = new HashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final n O(String str) {
        return this.f17946s.containsKey(str) ? (n) this.f17946s.get(str) : n.f18009j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final boolean d(String str) {
        return this.f17946s.containsKey(str);
    }

    @Override // s4.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f17946s.equals(((k) obj).f17946s);
        }
        return false;
    }

    @Override // s4.n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.n
    public final n g() {
        String str;
        ?? r32;
        n nVar;
        k kVar = new k();
        for (Map.Entry entry : this.f17946s.entrySet()) {
            if (entry.getValue() instanceof j) {
                r32 = kVar.f17946s;
                str = (String) entry.getKey();
                nVar = (n) entry.getValue();
            } else {
                r32 = kVar.f17946s;
                str = (String) entry.getKey();
                nVar = ((n) entry.getValue()).g();
            }
            r32.put(str, nVar);
        }
        return kVar;
    }

    @Override // s4.n
    public final String h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f17946s.hashCode();
    }

    @Override // s4.n
    public n i(String str, a4 a4Var, List<n> list) {
        return "toString".equals(str) ? new r(toString()) : h0.e(this, new r(str), a4Var, list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final void k(String str, n nVar) {
        if (nVar == null) {
            this.f17946s.remove(str);
        } else {
            this.f17946s.put(str, nVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.n
    public final Iterator<n> l() {
        return new i(this.f17946s.keySet().iterator());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f17946s.isEmpty()) {
            for (String str : this.f17946s.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f17946s.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
