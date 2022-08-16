package m4;

/* loaded from: classes.dex */
public abstract class db {

    /* renamed from: a */
    public static final ab f7278a = new ab();

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract bb d(int i10, bb bbVar, boolean z10);

    public abstract cb e(int i10, cb cbVar);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((c() - 1) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(int r3, m4.bb r4, m4.cb r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.d(r3, r4, r0)
            r2.e(r0, r5)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.c()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = r0
            goto L2a
        L22:
            int r6 = r2.c()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            r4 = r3
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.e(r4, r5)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.db.f(int, m4.bb, m4.cb, int):int");
    }

    public final cb g(int i10, cb cbVar) {
        return e(i10, cbVar);
    }

    public final boolean h() {
        return c() == 0;
    }
}
