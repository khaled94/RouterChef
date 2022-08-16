package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tl2 implements Comparable<tl2> {

    /* renamed from: s */
    public final boolean f14102s;

    /* renamed from: t */
    public final pl2 f14103t;

    /* renamed from: u */
    public final boolean f14104u;

    /* renamed from: v */
    public final boolean f14105v;

    /* renamed from: w */
    public final int f14106w;

    /* renamed from: x */
    public final int f14107x;
    public final int y;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r9 < 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9 < 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tl2(m4.t r6, m4.pl2 r7, int r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.f14103t = r7
            r0 = 1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            if (r9 == 0) goto L19
            float r3 = r6.f13877r
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L17
            r4 = 1325400064(0x4f000000, float:2.14748365E9)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L19
        L17:
            r3 = r0
            goto L1a
        L19:
            r3 = r2
        L1a:
            r5.f14102s = r3
            r3 = -1
            if (r9 == 0) goto L3d
            int r9 = r6.p
            if (r9 == r3) goto L25
            if (r9 < 0) goto L3d
        L25:
            int r9 = r6.f13876q
            if (r9 == r3) goto L2b
            if (r9 < 0) goto L3d
        L2b:
            float r9 = r6.f13877r
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L36
            r1 = 0
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L3d
        L36:
            int r9 = r6.f13867g
            if (r9 == r3) goto L3e
            if (r9 < 0) goto L3d
            goto L3e
        L3d:
            r0 = r2
        L3e:
            r5.f14104u = r0
            boolean r8 = m4.ul2.c(r8, r2)
            r5.f14105v = r8
            int r8 = r6.f13867g
            r5.f14106w = r8
            int r8 = r6.p
            if (r8 == r3) goto L55
            int r9 = r6.f13876q
            if (r9 != r3) goto L53
            goto L55
        L53:
            int r3 = r8 * r9
        L55:
            r5.f14107x = r3
        L57:
            m4.gw1<java.lang.String> r8 = r7.f12089d
            int r8 = r8.size()
            if (r2 >= r8) goto L73
            java.lang.String r8 = r6.f13871k
            if (r8 == 0) goto L70
            m4.gw1<java.lang.String> r9 = r7.f12089d
            java.lang.Object r9 = r9.get(r2)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L70
            goto L76
        L70:
            int r2 = r2 + 1
            goto L57
        L73:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L76:
            r5.y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.tl2.<init>(m4.t, m4.pl2, int, boolean):void");
    }

    /* renamed from: b */
    public final int compareTo(tl2 tl2Var) {
        Object obj;
        if (this.f14102s && this.f14105v) {
            obj = ul2.f14450e;
        } else {
            obj = ul2.f14450e.a();
        }
        xv1 c10 = xv1.f15479a.d(this.f14105v, tl2Var.f14105v).d(this.f14102s, tl2Var.f14102s).d(this.f14104u, tl2Var.f14104u).c(Integer.valueOf(this.y), Integer.valueOf(tl2Var.y), nx1.f11953s);
        Integer valueOf = Integer.valueOf(this.f14106w);
        Integer valueOf2 = Integer.valueOf(tl2Var.f14106w);
        Objects.requireNonNull(this.f14103t);
        return c10.c(valueOf, valueOf2, ul2.f14451f).c(Integer.valueOf(this.f14107x), Integer.valueOf(tl2Var.f14107x), obj).c(Integer.valueOf(this.f14106w), Integer.valueOf(tl2Var.f14106w), obj).a();
    }
}
