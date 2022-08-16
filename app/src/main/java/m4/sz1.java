package m4;

import g1.l;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class sz1 implements ff2 {
    public boolean B;
    public boolean C;

    /* renamed from: s */
    public final int f13854s;

    /* renamed from: u */
    public gf2 f13856u;

    /* renamed from: v */
    public int f13857v;

    /* renamed from: w */
    public int f13858w;

    /* renamed from: x */
    public zk2 f13859x;
    public t[] y;

    /* renamed from: z */
    public long f13860z;

    /* renamed from: t */
    public final l f13855t = new l();
    public long A = Long.MIN_VALUE;

    public sz1(int i10) {
        this.f13854s = i10;
    }

    public abstract void A(long j3, boolean z10);

    @Override // m4.ff2
    public final void B() {
        r01.h(this.f13858w == 2);
        this.f13858w = 1;
        G();
    }

    @Override // m4.ff2
    public final void C() {
        this.B = true;
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    @Override // m4.ff2
    public final boolean H() {
        return this.B;
    }

    public abstract void I(long j3, long j10);

    @Override // m4.ff2
    public final void S() {
        boolean z10 = true;
        if (this.f13858w != 1) {
            z10 = false;
        }
        r01.h(z10);
        this.f13858w = 2;
        F();
    }

    @Override // m4.ff2
    public final int a() {
        return this.f13854s;
    }

    @Override // m4.ff2
    public final long d() {
        return this.A;
    }

    @Override // m4.ff2
    public final void f(int i10) {
        this.f13857v = i10;
    }

    @Override // m4.ff2
    public final void g(gf2 gf2Var, t[] tVarArr, zk2 zk2Var, long j3, boolean z10, boolean z11, long j10, long j11) {
        r01.h(this.f13858w == 0);
        this.f13856u = gf2Var;
        this.f13858w = 1;
        z(z11);
        q(tVarArr, zk2Var, j10, j11);
        A(j3, z10);
    }

    @Override // m4.ff2
    public me2 h() {
        return null;
    }

    @Override // m4.ff2
    public final sz1 i() {
        return this;
    }

    @Override // m4.ff2
    public final void j(long j3) {
        this.B = false;
        this.A = j3;
        A(j3, false);
    }

    @Override // m4.bf2
    public void k(int i10, Object obj) {
    }

    @Override // m4.ff2
    public final zk2 l() {
        return this.f13859x;
    }

    @Override // m4.ff2
    public final void m() {
        zk2 zk2Var = this.f13859x;
        Objects.requireNonNull(zk2Var);
        zk2Var.g();
    }

    @Override // m4.ff2
    public /* synthetic */ void n(float f10, float f11) {
    }

    @Override // m4.ff2
    public final void o() {
        boolean z10 = true;
        if (this.f13858w != 1) {
            z10 = false;
        }
        r01.h(z10);
        l lVar = this.f13855t;
        lVar.f4819t = null;
        lVar.f4818s = null;
        this.f13858w = 0;
        this.f13859x = null;
        this.y = null;
        this.B = false;
        y();
    }

    @Override // m4.ff2
    public final int p() {
        return this.f13858w;
    }

    @Override // m4.ff2
    public final void q(t[] tVarArr, zk2 zk2Var, long j3, long j10) {
        r01.h(!this.B);
        this.f13859x = zk2Var;
        if (this.A == Long.MIN_VALUE) {
            this.A = j3;
        }
        this.y = tVarArr;
        this.f13860z = j10;
        I(j3, j10);
    }

    public abstract int r(t tVar);

    public final int s(l lVar, il0 il0Var, int i10) {
        zk2 zk2Var = this.f13859x;
        Objects.requireNonNull(zk2Var);
        int c10 = zk2Var.c(lVar, il0Var, i10);
        if (c10 == -4) {
            if (il0Var.b(4)) {
                this.A = Long.MIN_VALUE;
                return this.B ? -4 : -3;
            }
            long j3 = il0Var.f9688e + this.f13860z;
            il0Var.f9688e = j3;
            this.A = Math.max(this.A, j3);
        } else if (c10 == -5) {
            t tVar = (t) lVar.f4818s;
            Objects.requireNonNull(tVar);
            if (tVar.f13875o != Long.MAX_VALUE) {
                kq2 kq2Var = new kq2(tVar);
                kq2Var.f10546n = tVar.f13875o + this.f13860z;
                lVar.f4818s = new t(kq2Var);
                return -5;
            }
        }
        return c10;
    }

    @Override // m4.ff2
    public final boolean t() {
        return this.A == Long.MIN_VALUE;
    }

    @Override // m4.ff2
    public final void u() {
        r01.h(this.f13858w == 0);
        l lVar = this.f13855t;
        lVar.f4819t = null;
        lVar.f4818s = null;
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.o62 v(java.lang.Throwable r13, m4.t r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.C
            if (r3 != 0) goto L1d
            r3 = 1
            r1.C = r3
            r3 = 0
            int r4 = r12.r(r14)     // Catch: java.lang.Throwable -> L16 m4.o62 -> L1b
            r4 = r4 & 7
            r1.C = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.C = r3
            throw r2
        L1b:
            r1.C = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.D()
            int r7 = r1.f13857v
            if (r0 != 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r4
        L29:
            m4.o62 r11 = new m4.o62
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sz1.v(java.lang.Throwable, m4.t, boolean, int):m4.o62");
    }

    public int w() {
        return 0;
    }

    public final l x() {
        l lVar = this.f13855t;
        lVar.f4819t = null;
        lVar.f4818s = null;
        return lVar;
    }

    public abstract void y();

    public void z(boolean z10) {
    }
}
