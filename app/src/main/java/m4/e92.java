package m4;

import androidx.lifecycle.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m4.d92;

/* loaded from: classes.dex */
public final class e92<T extends d92<T>> {

    /* renamed from: c */
    public static final /* synthetic */ int f7748c = 0;

    /* renamed from: a */
    public final mb2<T, Object> f7749a;

    /* renamed from: b */
    public boolean f7750b;

    static {
        new e92(true);
    }

    public e92() {
        this.f7749a = new gb2(16);
    }

    public e92(boolean z10) {
        gb2 gb2Var = new gb2(0);
        this.f7749a = gb2Var;
        if (!this.f7750b) {
            gb2Var.a();
            this.f7750b = true;
        }
        if (this.f7750b) {
            return;
        }
        gb2Var.a();
        this.f7750b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(T r4, java.lang.Object r5) {
        /*
            m4.cc2 r0 = r4.a()
            java.nio.charset.Charset r1 = m4.v92.f14624a
            java.util.Objects.requireNonNull(r5)
            m4.cc2 r1 = m4.cc2.DOUBLE
            m4.dc2 r1 = m4.dc2.INT
            m4.dc2 r0 = r0.f6783s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof m4.qa2
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof m4.o92
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof m4.n82
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            m4.cc2 r4 = r4.a()
            m4.dc2 r4 = r4.f6783s
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.e92.b(m4.d92, java.lang.Object):void");
    }

    public final void a(T t10, Object obj) {
        if (!t10.c()) {
            b(t10, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(t10, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f7749a.put(t10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        e92 e92Var = new e92();
        for (int i10 = 0; i10 < this.f7749a.b(); i10++) {
            Map.Entry<T, Object> d5 = this.f7749a.d(i10);
            e92Var.a(d5.getKey(), d5.getValue());
        }
        mb2<T, Object> mb2Var = this.f7749a;
        for (Map.Entry entry : mb2Var.f11141u.isEmpty() ? f0.f1680w : mb2Var.f11141u.entrySet()) {
            e92Var.a((d92) entry.getKey(), entry.getValue());
        }
        return e92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e92) {
            return this.f7749a.equals(((e92) obj).f7749a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7749a.hashCode();
    }
}
