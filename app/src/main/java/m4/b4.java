package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: a */
    public final int f6355a;

    /* renamed from: b */
    public final byte[] f6356b;

    /* renamed from: c */
    public final Map<String, String> f6357c;

    /* renamed from: d */
    public final List<x3> f6358d;

    /* renamed from: e */
    public final boolean f6359e;

    public b4(int i10, byte[] bArr, Map map, List list, boolean z10) {
        this.f6355a = i10;
        this.f6356b = bArr;
        this.f6357c = map;
        this.f6358d = list == null ? null : Collections.unmodifiableList(list);
        this.f6359e = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b4(int r9, byte[] r10, boolean r11, long r12, java.util.List<m4.x3> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L5
            r12 = 0
        L3:
            r5 = r12
            goto L2f
        L5:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L10
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r12 = new java.util.TreeMap
            java.util.Comparator r13 = java.lang.String.CASE_INSENSITIVE_ORDER
            r12.<init>(r13)
            java.util.Iterator r13 = r14.iterator()
        L1b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L3
            java.lang.Object r0 = r13.next()
            m4.x3 r0 = (m4.x3) r0
            java.lang.String r1 = r0.f15209a
            java.lang.String r0 = r0.f15210b
            r12.put(r1, r0)
            goto L1b
        L2f:
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r14
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b4.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    public static List<x3> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new x3(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
