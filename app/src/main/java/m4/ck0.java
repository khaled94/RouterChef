package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class ck0 extends am0 {

    /* renamed from: i */
    public final vd0 f7004i;

    /* renamed from: j */
    public final int f7005j;

    /* renamed from: k */
    public final Context f7006k;

    /* renamed from: l */
    public final y20 f7007l;

    /* renamed from: m */
    public final qt0 f7008m;

    /* renamed from: n */
    public final zo0 f7009n;

    /* renamed from: o */
    public boolean f7010o = false;

    public ck0(zl0 zl0Var, Context context, vd0 vd0Var, int i10, y20 y20Var, qt0 qt0Var, zo0 zo0Var) {
        super(zl0Var);
        this.f7004i = vd0Var;
        this.f7006k = context;
        this.f7005j = i10;
        this.f7007l = y20Var;
        this.f7008m = qt0Var;
        this.f7009n = zo0Var;
    }

    @Override // m4.am0
    public final void a() {
        super.a();
        vd0 vd0Var = this.f7004i;
        if (vd0Var != null) {
            vd0Var.destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.app.Activity r4, m4.bj r5, boolean r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            android.content.Context r4 = r3.f7006k
        L4:
            m4.yr<java.lang.Boolean> r0 = m4.es.f8158o0
            m4.jo r1 = m4.jo.f10145d
            m4.ds r2 = r1.f10148c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            l3.s r0 = l3.s.B
            n3.s1 r2 = r0.f5789c
            boolean r2 = n3.s1.i(r4)
            if (r2 == 0) goto L55
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            n3.g1.j(r5)
            m4.zo0 r5 = r3.f7009n
            r5.a()
            m4.yr<java.lang.Boolean> r5 = m4.es.f8165p0
            m4.ds r6 = r1.f10148c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto La9
            m4.fs1 r5 = new m4.fs1
            android.content.Context r4 = r4.getApplicationContext()
            n3.t0 r6 = r0.f5802q
            android.os.Looper r6 = r6.a()
            r5.<init>(r4, r6)
            m4.km1 r4 = r3.f6190a
            m4.jm1 r4 = r4.f10489b
            m4.em1 r4 = r4.f10126b
            java.lang.String r4 = r4.f8004b
            r5.a(r4)
            return
        L55:
            boolean r0 = r3.f7010o
            if (r0 == 0) goto L7a
            java.lang.String r0 = "App open interstitial ad is already visible."
            n3.g1.j(r0)
            m4.yr<java.lang.Boolean> r0 = m4.es.f8240y6
            m4.ds r1 = r1.f10148c
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            m4.zo0 r0 = r3.f7009n
            r1 = 10
            r2 = 0
            m4.cn r1 = a6.f.n(r1, r2, r2)
            r0.d(r1)
        L7a:
            boolean r0 = r3.f7010o
            if (r0 != 0) goto La9
            m4.qt0 r0 = r3.f7008m     // Catch: m4.pt0 -> L89
            m4.zo0 r1 = r3.f7009n     // Catch: m4.pt0 -> L89
            r0.c(r6, r4, r1)     // Catch: m4.pt0 -> L89
            r4 = 1
            r3.f7010o = r4
            return
        L89:
            r4 = move-exception
            m4.yr<java.lang.Boolean> r6 = m4.es.f8240y6
            m4.jo r0 = m4.jo.f10145d
            m4.ds r0 = r0.f10148c
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto La2
            m4.zo0 r5 = r3.f7009n
            r5.p0(r4)
            return
        La2:
            m4.cn r4 = a6.f.i(r4)
            r5.p0(r4)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ck0.c(android.app.Activity, m4.bj, boolean):void");
    }
}
