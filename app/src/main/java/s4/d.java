package s4;

import androidx.activity.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class d implements Iterable<n>, n, j {

    /* renamed from: s */
    public final SortedMap<Integer, n> f17791s;

    /* renamed from: t */
    public final Map<String, n> f17792t;

    public d() {
        this.f17791s = new TreeMap();
        this.f17792t = new TreeMap();
    }

    public d(List<n> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                u(i10, list.get(i10));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.TreeMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final n O(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(m())) : (!d(str) || (nVar = (n) this.f17792t.get(str)) == null) ? n.f18009j : nVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.TreeMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final boolean d(String str) {
        return "length".equals(str) || this.f17792t.containsKey(str);
    }

    @Override // s4.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (m() != dVar.m()) {
            return false;
        }
        if (this.f17791s.isEmpty()) {
            return dVar.f17791s.isEmpty();
        }
        for (int intValue = ((Integer) this.f17791s.firstKey()).intValue(); intValue <= ((Integer) this.f17791s.lastKey()).intValue(); intValue++) {
            if (!o(intValue).equals(dVar.o(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    @Override // s4.n
    public final Double f() {
        return this.f17791s.size() == 1 ? o(0).f() : this.f17791s.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.SortedMap<java.lang.Integer, s4.n>] */
    @Override // s4.n
    public final n g() {
        Integer num;
        TreeMap treeMap;
        n nVar;
        d dVar = new d();
        for (Map.Entry entry : this.f17791s.entrySet()) {
            if (entry.getValue() instanceof j) {
                treeMap = dVar.f17791s;
                num = (Integer) entry.getKey();
                nVar = (n) entry.getValue();
            } else {
                treeMap = dVar.f17791s;
                num = (Integer) entry.getKey();
                nVar = ((n) entry.getValue()).g();
            }
            treeMap.put(num, nVar);
        }
        return dVar;
    }

    @Override // s4.n
    public final String h() {
        return p(",");
    }

    public final int hashCode() {
        return this.f17791s.hashCode() * 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x053e, code lost:
        if (m() == 0) goto L329;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [s4.e] */
    /* JADX WARN: Type inference failed for: r0v106, types: [s4.e] */
    /* JADX WARN: Type inference failed for: r0v121, types: [s4.d] */
    /* JADX WARN: Type inference failed for: r0v123, types: [s4.r] */
    /* JADX WARN: Type inference failed for: r0v126, types: [s4.g] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v57, types: [s4.g] */
    /* JADX WARN: Type inference failed for: r0v58, types: [s4.g] */
    /* JADX WARN: Type inference failed for: r0v59, types: [s4.g] */
    /* JADX WARN: Type inference failed for: r0v70, types: [s4.d] */
    /* JADX WARN: Type inference failed for: r0v71, types: [s4.d] */
    /* JADX WARN: Type inference failed for: r0v78, types: [s4.g] */
    /* JADX WARN: Type inference failed for: r0v81, types: [s4.n] */
    /* JADX WARN: Type inference failed for: r0v90, types: [s4.d] */
    /* JADX WARN: Type inference failed for: r0v96, types: [s4.n] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    @Override // s4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s4.n i(java.lang.String r26, s4.a4 r27, java.util.List<s4.n> r28) {
        /*
            Method dump skipped, instructions count: 2420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.d.i(java.lang.String, s4.a4, java.util.List):s4.n");
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return new c(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.TreeMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final void k(String str, n nVar) {
        if (nVar == null) {
            this.f17792t.remove(str);
        } else {
            this.f17792t.put(str, nVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.TreeMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.n
    public final Iterator<n> l() {
        return new b(this.f17791s.keySet().iterator(), this.f17792t.keySet().iterator());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    public final int m() {
        if (this.f17791s.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f17791s.lastKey()).intValue() + 1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    public final n o(int i10) {
        n nVar;
        if (i10 < m()) {
            return (!v(i10) || (nVar = (n) this.f17791s.get(Integer.valueOf(i10))) == null) ? n.f18009j : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String p(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f17791s.isEmpty()) {
            for (int i10 = 0; i10 < m(); i10++) {
                n o10 = o(i10);
                sb.append(str);
                if (!(o10 instanceof s) && !(o10 instanceof l)) {
                    sb.append(o10.h());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    public final Iterator<Integer> q() {
        return this.f17791s.keySet().iterator();
    }

    public final List<n> s() {
        ArrayList arrayList = new ArrayList(m());
        for (int i10 = 0; i10 < m(); i10++) {
            arrayList.add(o(i10));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    public final void t(int i10) {
        int intValue = ((Integer) this.f17791s.lastKey()).intValue();
        if (i10 > intValue || i10 < 0) {
            return;
        }
        this.f17791s.remove(Integer.valueOf(i10));
        if (i10 == intValue) {
            ?? r02 = this.f17791s;
            int i11 = i10 - 1;
            Integer valueOf = Integer.valueOf(i11);
            if (r02.containsKey(valueOf) || i11 < 0) {
                return;
            }
            this.f17791s.put(valueOf, n.f18009j);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) this.f17791s.lastKey()).intValue()) {
                return;
            }
            ?? r03 = this.f17791s;
            Integer valueOf2 = Integer.valueOf(i10);
            n nVar = (n) r03.get(valueOf2);
            if (nVar != null) {
                this.f17791s.put(Integer.valueOf(i10 - 1), nVar);
                this.f17791s.remove(valueOf2);
            }
        }
    }

    public final String toString() {
        return p(",");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    @RequiresNonNull({"elements"})
    public final void u(int i10, n nVar) {
        if (i10 <= 32468) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException(k.a(32, "Out of bounds index: ", i10));
            }
            if (nVar == null) {
                this.f17791s.remove(Integer.valueOf(i10));
                return;
            } else {
                this.f17791s.put(Integer.valueOf(i10), nVar);
                return;
            }
        }
        throw new IllegalStateException("Array too large");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.TreeMap, java.util.SortedMap<java.lang.Integer, s4.n>] */
    public final boolean v(int i10) {
        if (i10 < 0 || i10 > ((Integer) this.f17791s.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException(k.a(32, "Out of bounds index: ", i10));
        }
        return this.f17791s.containsKey(Integer.valueOf(i10));
    }
}
