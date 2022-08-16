package m4;

import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class rj2 extends jj2<Void> {

    /* renamed from: j */
    public final xj2 f13372j;

    /* renamed from: k */
    public final boolean f13373k;

    /* renamed from: l */
    public final j40 f13374l;

    /* renamed from: m */
    public final d30 f13375m;

    /* renamed from: n */
    public pj2 f13376n;

    /* renamed from: o */
    public oj2 f13377o;
    public boolean p;

    /* renamed from: q */
    public boolean f13378q;

    /* renamed from: r */
    public boolean f13379r;

    public rj2(xj2 xj2Var, boolean z10) {
        boolean z11;
        this.f13372j = xj2Var;
        if (z10) {
            xj2Var.r();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f13373k = z11;
        this.f13374l = new j40();
        this.f13375m = new d30();
        xj2Var.t();
        this.f13376n = new pj2(new qj2(xj2Var.u()), j40.f9833n, pj2.f12536e);
    }

    @Override // m4.xj2
    public final void d(tj2 tj2Var) {
        oj2 oj2Var = (oj2) tj2Var;
        tj2 tj2Var2 = oj2Var.f12182v;
        if (tj2Var2 != null) {
            xj2 xj2Var = oj2Var.f12181u;
            Objects.requireNonNull(xj2Var);
            xj2Var.d(tj2Var2);
        }
        if (tj2Var == this.f13377o) {
            this.f13377o = null;
        }
    }

    @Override // m4.ej2
    public final void m(i01 i01Var) {
        this.f10103i = i01Var;
        this.f10102h = ls1.x();
        if (!this.f13373k) {
            this.p = true;
            v(null, this.f13372j);
        }
    }

    @Override // m4.jj2, m4.ej2
    public final void o() {
        this.f13378q = false;
        this.p = false;
        super.o();
    }

    @Override // m4.jj2
    public final /* bridge */ /* synthetic */ uj2 p(Void r22, uj2 uj2Var) {
        Object obj = uj2Var.f8973a;
        Object obj2 = this.f13376n.f12538d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = pj2.f12536e;
        }
        return uj2Var.b(obj);
    }

    @Override // m4.xj2
    public final void q() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // m4.jj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Void r12, m4.xj2 r13, m4.z40 r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.f13378q
            if (r12 == 0) goto L19
            m4.pj2 r12 = r11.f13376n
            m4.pj2 r12 = r12.p(r14)
            r11.f13376n = r12
            m4.oj2 r12 = r11.f13377o
            if (r12 == 0) goto Lac
            long r12 = r12.f12184x
            r11.x(r12)
            goto Lac
        L19:
            boolean r12 = r14.o()
            if (r12 == 0) goto L38
            boolean r12 = r11.f13379r
            if (r12 == 0) goto L2a
            m4.pj2 r12 = r11.f13376n
            m4.pj2 r12 = r12.p(r14)
            goto L34
        L2a:
            java.lang.Object r12 = m4.j40.f9833n
            java.lang.Object r13 = m4.pj2.f12536e
            m4.pj2 r0 = new m4.pj2
            r0.<init>(r14, r12, r13)
            r12 = r0
        L34:
            r11.f13376n = r12
            goto Lac
        L38:
            m4.j40 r12 = r11.f13374l
            r13 = 0
            r0 = 0
            r14.e(r13, r12, r0)
            m4.j40 r12 = r11.f13374l
            java.lang.Object r12 = r12.f9835a
            m4.oj2 r2 = r11.f13377o
            if (r2 == 0) goto L62
            long r3 = r2.f12180t
            m4.pj2 r5 = r11.f13376n
            m4.uj2 r2 = r2.f12179s
            java.lang.Object r2 = r2.f8973a
            m4.d30 r6 = r11.f13375m
            r5.n(r2, r6)
            m4.pj2 r2 = r11.f13376n
            m4.j40 r5 = r11.f13374l
            r2.e(r13, r5, r0)
            int r13 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r13 == 0) goto L62
            r9 = r3
            goto L63
        L62:
            r9 = r0
        L63:
            m4.j40 r6 = r11.f13374l
            m4.d30 r7 = r11.f13375m
            r8 = 0
            r5 = r14
            android.util.Pair r13 = r5.l(r6, r7, r8, r9)
            java.lang.Object r0 = r13.first
            java.lang.Object r13 = r13.second
            java.lang.Long r13 = (java.lang.Long) r13
            long r1 = r13.longValue()
            boolean r13 = r11.f13379r
            if (r13 == 0) goto L82
            m4.pj2 r12 = r11.f13376n
            m4.pj2 r12 = r12.p(r14)
            goto L88
        L82:
            m4.pj2 r13 = new m4.pj2
            r13.<init>(r14, r12, r0)
            r12 = r13
        L88:
            r11.f13376n = r12
            m4.oj2 r12 = r11.f13377o
            if (r12 == 0) goto Lac
            r11.x(r1)
            m4.uj2 r12 = r12.f12179s
            java.lang.Object r13 = r12.f8973a
            m4.pj2 r14 = r11.f13376n
            java.lang.Object r14 = r14.f12538d
            if (r14 == 0) goto La7
            java.lang.Object r14 = m4.pj2.f12536e
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto La7
            m4.pj2 r13 = r11.f13376n
            java.lang.Object r13 = r13.f12538d
        La7:
            m4.uj2 r12 = r12.b(r13)
            goto Lad
        Lac:
            r12 = 0
        Lad:
            r13 = 1
            r11.f13379r = r13
            r11.f13378q = r13
            m4.pj2 r13 = r11.f13376n
            r11.n(r13)
            if (r12 == 0) goto Lc1
            m4.oj2 r13 = r11.f13377o
            java.util.Objects.requireNonNull(r13)
            r13.p(r12)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.rj2.s(java.lang.Object, m4.xj2, m4.z40):void");
    }

    @Override // m4.xj2
    public final gi u() {
        return this.f13372j.u();
    }

    /* renamed from: w */
    public final oj2 i(uj2 uj2Var, pm2 pm2Var, long j3) {
        oj2 oj2Var = new oj2(uj2Var, pm2Var, j3);
        xj2 xj2Var = this.f13372j;
        r01.h(oj2Var.f12181u == null);
        oj2Var.f12181u = xj2Var;
        if (this.f13378q) {
            Object obj = uj2Var.f8973a;
            if (this.f13376n.f12538d != null && obj.equals(pj2.f12536e)) {
                obj = this.f13376n.f12538d;
            }
            oj2Var.p(uj2Var.b(obj));
        } else {
            this.f13377o = oj2Var;
            if (!this.p) {
                this.p = true;
                v(null, this.f13372j);
            }
        }
        return oj2Var;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void x(long j3) {
        oj2 oj2Var = this.f13377o;
        int a10 = this.f13376n.a(oj2Var.f12179s.f8973a);
        if (a10 == -1) {
            return;
        }
        pj2 pj2Var = this.f13376n;
        d30 d30Var = this.f13375m;
        pj2Var.d(a10, d30Var, false);
        long j10 = d30Var.f7205d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        oj2Var.f12184x = j3;
    }
}
