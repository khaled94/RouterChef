package s4;

import j0.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s4.s6;

/* loaded from: classes.dex */
public final class t6<T extends s6<T>> {

    /* renamed from: c */
    public static final /* synthetic */ int f18117c = 0;

    /* renamed from: a */
    public final x8<T, Object> f18118a;

    /* renamed from: b */
    public boolean f18119b;

    static {
        new t6(true);
    }

    public t6() {
        this.f18118a = new q8(16);
    }

    public t6(boolean z10) {
        q8 q8Var = new q8(0);
        this.f18118a = q8Var;
        if (!this.f18119b) {
            q8Var.a();
            this.f18119b = true;
        }
        if (this.f18119b) {
            return;
        }
        q8Var.a();
        this.f18119b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(T r4, java.lang.Object r5) {
        /*
            s4.l9 r0 = r4.a()
            java.nio.charset.Charset r1 = s4.i7.f17920a
            java.util.Objects.requireNonNull(r5)
            s4.l9 r1 = s4.l9.DOUBLE
            s4.m9 r1 = s4.m9.INT
            s4.m9 r0 = r0.f17979s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof s4.d8
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof s4.g6
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            s4.l9 r4 = r4.a()
            s4.m9 r4 = r4.f17979s
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
        throw new UnsupportedOperationException("Method not decompiled: s4.t6.b(s4.s6, java.lang.Object):void");
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
        this.f18118a.put(t10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        t6 t6Var = new t6();
        for (int i10 = 0; i10 < this.f18118a.b(); i10++) {
            Map.Entry<T, Object> d5 = this.f18118a.d(i10);
            t6Var.a(d5.getKey(), d5.getValue());
        }
        x8<T, Object> x8Var = this.f18118a;
        for (Map.Entry entry : x8Var.f18189u.isEmpty() ? d.A : x8Var.f18189u.entrySet()) {
            t6Var.a((s6) entry.getKey(), entry.getValue());
        }
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t6) {
            return this.f18118a.equals(((t6) obj).f18118a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18118a.hashCode();
    }
}
