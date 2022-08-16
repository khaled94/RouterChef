package m4;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class wl1 implements uc1<hz0> {

    /* renamed from: a */
    public final Context f15042a;

    /* renamed from: b */
    public final Executor f15043b;

    /* renamed from: c */
    public final if0 f15044c;

    /* renamed from: d */
    public final sl1 f15045d;

    /* renamed from: e */
    public final dl1<kz0, hz0> f15046e;

    /* renamed from: f */
    public final mm1 f15047f;

    /* renamed from: g */
    public final qp1 f15048g;
    @GuardedBy("this")

    /* renamed from: h */
    public final nm1 f15049h;
    @GuardedBy("this")

    /* renamed from: i */
    public tz1<hz0> f15050i;

    public wl1(Context context, Executor executor, if0 if0Var, dl1<kz0, hz0> dl1Var, sl1 sl1Var, nm1 nm1Var, mm1 mm1Var) {
        this.f15042a = context;
        this.f15043b = executor;
        this.f15044c = if0Var;
        this.f15046e = dl1Var;
        this.f15045d = sl1Var;
        this.f15049h = nm1Var;
        this.f15047f = mm1Var;
        this.f15048g = if0Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        r1 = r22.f15048g;
        r2.d(false);
        r1.a(r2.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r2 == null) goto L11;
     */
    @Override // m4.uc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(m4.jn r23, java.lang.String r24, a6.f r25, m4.tc1<? super m4.hz0> r26) {
        /*
            r22 = this;
            r0 = r22
            m4.f60 r1 = new m4.f60
            r2 = r23
            r3 = r24
            r1.<init>(r2, r3)
            android.content.Context r2 = r0.f15042a
            m4.jn r3 = r1.f8358s
            r4 = 5
            m4.op1 r2 = m4.op1.g(r2, r4, r3)
            java.lang.String r3 = r1.f8359t
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L2e
            java.lang.String r1 = "Ad unit ID should not be null for rewarded video ad."
            n3.g1.g(r1)
            java.util.concurrent.Executor r1 = r0.f15043b
            m4.cj r3 = new m4.cj
            r4 = 8
            r3.<init>(r0, r4)
            r1.execute(r3)
            if (r2 != 0) goto L3d
            goto L3a
        L2e:
            m4.tz1<m4.hz0> r3 = r0.f15050i
            if (r3 == 0) goto L4a
            boolean r3 = r3.isDone()
            if (r3 != 0) goto L4a
            if (r2 != 0) goto L3d
        L3a:
            r4 = r5
            goto Lc6
        L3d:
            m4.qp1 r1 = r0.f15048g
            r2.d(r5)
            m4.pp1 r2 = r2.f()
            r1.a(r2)
            return r5
        L4a:
            android.content.Context r3 = r0.f15042a
            m4.jn r5 = r1.f8358s
            boolean r5 = r5.f10133x
            m4.x90.d(r3, r5)
            m4.yr<java.lang.Boolean> r3 = m4.es.S5
            m4.jo r5 = m4.jo.f10145d
            m4.ds r5 = r5.f10148c
            java.lang.Object r3 = r5.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L74
            m4.jn r3 = r1.f8358s
            boolean r3 = r3.f10133x
            if (r3 == 0) goto L74
            m4.if0 r3 = r0.f15044c
            m4.x21 r3 = r3.p()
            r3.c(r4)
        L74:
            m4.nm1 r3 = r0.f15049h
            java.lang.String r5 = r1.f8359t
            r3.f11841c = r5
            m4.on r5 = new m4.on
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            java.lang.String r7 = "reward_mb"
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.f11840b = r5
            m4.jn r1 = r1.f8358s
            r3.f11839a = r1
            m4.om1 r1 = r3.a()
            m4.vl1 r3 = new m4.vl1
            r5 = 0
            r3.<init>(r5)
            r3.f14725a = r1
            m4.dl1<m4.kz0, m4.hz0> r1 = r0.f15046e
            m4.el1 r6 = new m4.el1
            r6.<init>(r3, r5)
            m4.rc r5 = new m4.rc
            r5.<init>(r0)
            m4.tz1 r1 = r1.a(r6, r5)
            r0.f15050i = r1
            m4.ul1 r5 = new m4.ul1
            r6 = r26
            r5.<init>(r0, r6, r2, r3)
            java.util.concurrent.Executor r2 = r0.f15043b
            m4.mz1.t(r1, r5, r2)
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.wl1.a(m4.jn, java.lang.String, a6.f, m4.tc1):boolean");
    }

    public final ig0 b(bl1 bl1Var) {
        ig0 m10 = this.f15044c.m();
        go0 go0Var = new go0();
        go0Var.f8988a = this.f15042a;
        go0Var.f8989b = ((vl1) bl1Var).f14725a;
        go0Var.f8991d = this.f15047f;
        m10.f9641d = go0Var.a();
        m10.f9640c = new cr0().j();
        return m10;
    }

    @Override // m4.uc1
    public final boolean zza() {
        throw null;
    }
}
