package j6;

import j6.a;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k6.c;
import k6.e;
import s4.k2;
import s4.y1;

/* loaded from: classes.dex */
public final class b implements j6.a {

    /* renamed from: c */
    public static volatile b f5471c;

    /* renamed from: a */
    public final x4.a f5472a;

    /* renamed from: b */
    public final Map<String, Object> f5473b = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public class a implements a.AbstractC0079a {
    }

    public b(x4.a aVar) {
        Objects.requireNonNull(aVar, "null reference");
        this.f5472a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.concurrent.ConcurrentHashMap] */
    @Override // j6.a
    public final a.AbstractC0079a a(String str, a.b bVar) {
        if (!k6.a.a(str)) {
            return null;
        }
        if (!str.isEmpty() && this.f5473b.containsKey(str) && this.f5473b.get(str) != null) {
            return null;
        }
        x4.a aVar = this.f5472a;
        Object cVar = "fiam".equals(str) ? new c(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new e(aVar, bVar) : null;
        if (cVar == null) {
            return null;
        }
        this.f5473b.put(str, cVar);
        return new a();
    }

    @Override // j6.a
    public final void b(Object obj) {
        if (!k6.a.a("fcm")) {
            return;
        }
        k2 k2Var = this.f5472a.f20026a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new y1(k2Var, "fcm", "_ln", obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = k6.a.a(r6)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.List<java.lang.String> r0 = k6.a.f5599b
            boolean r0 = r0.contains(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            goto L2a
        L12:
            java.util.List<java.lang.String> r0 = k6.a.f5601d
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L18
        L2a:
            r0 = r2
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 != 0) goto L30
            return
        L30:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L3a
            goto La3
        L3a:
            boolean r0 = k6.a.a(r6)
            if (r0 != 0) goto L41
            goto L94
        L41:
            java.util.List<java.lang.String> r0 = k6.a.f5601d
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L47
            goto L94
        L5a:
            int r0 = r6.hashCode()
            r3 = 101200(0x18b50, float:1.41811E-40)
            r4 = 2
            if (r0 == r3) goto L83
            r3 = 101230(0x18b6e, float:1.41853E-40)
            if (r0 == r3) goto L79
            r3 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r0 == r3) goto L6f
            goto L8d
        L6f:
            java.lang.String r0 = "fiam"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8d
            r0 = r4
            goto L8e
        L79:
            java.lang.String r0 = "fdl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8d
            r0 = r1
            goto L8e
        L83:
            java.lang.String r0 = "fcm"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8d
            r0 = r2
            goto L8e
        L8d:
            r0 = -1
        L8e:
            if (r0 == 0) goto L9c
            if (r0 == r1) goto L99
            if (r0 == r4) goto L96
        L94:
            r1 = r2
            goto La3
        L96:
            java.lang.String r0 = "fiam_integration"
            goto L9e
        L99:
            java.lang.String r0 = "fdl_integration"
            goto L9e
        L9c:
            java.lang.String r0 = "fcm_integration"
        L9e:
            java.lang.String r2 = "_cis"
            r8.putString(r2, r0)
        La3:
            if (r1 != 0) goto La6
            return
        La6:
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lbd
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lbd
            r0 = 1
            java.lang.String r2 = "_r"
            r8.putLong(r2, r0)
        Lbd:
            x4.a r0 = r5.f5472a
            r0.a(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b.c(java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
