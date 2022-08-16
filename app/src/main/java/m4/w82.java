package m4;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class w82 {

    /* renamed from: a */
    public final v82 f14883a;

    public w82(v82 v82Var) {
        Charset charset = v92.f14624a;
        this.f14883a = v82Var;
        v82Var.f14615x = this;
    }

    public final void a(int i10, int i11) {
        this.f14883a.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j3) {
        this.f14883a.x(i10, (j3 >> 63) ^ (j3 + j3));
    }

    public final void c(int i10, int i11) {
        this.f14883a.v(i10, i11);
    }

    public final void d(int i10, long j3) {
        this.f14883a.x(i10, j3);
    }

    public final void e(int i10, boolean z10) {
        this.f14883a.l(i10, z10);
    }

    public final void f(int i10, n82 n82Var) {
        this.f14883a.m(i10, n82Var);
    }

    public final void g(int i10, double d5) {
        this.f14883a.p(i10, Double.doubleToRawLongBits(d5));
    }

    public final void h(int i10, int i11) {
        this.f14883a.r(i10, i11);
    }

    public final void i(int i10, int i11) {
        this.f14883a.n(i10, i11);
    }

    public final void j(int i10, long j3) {
        this.f14883a.p(i10, j3);
    }

    public final void k(int i10, float f10) {
        this.f14883a.n(i10, Float.floatToRawIntBits(f10));
    }

    public final void l(int i10, Object obj, eb2 eb2Var) {
        v82 v82Var = this.f14883a;
        v82Var.u(i10, 3);
        eb2Var.f((qa2) obj, v82Var.f14615x);
        v82Var.u(i10, 4);
    }

    public final void m(int i10, int i11) {
        this.f14883a.r(i10, i11);
    }

    public final void n(int i10, long j3) {
        this.f14883a.x(i10, j3);
    }

    public final void o(int i10, Object obj, eb2 eb2Var) {
        qa2 qa2Var = (qa2) obj;
        t82 t82Var = (t82) this.f14883a;
        t82Var.w((i10 << 3) | 2);
        b82 b82Var = (b82) qa2Var;
        int g10 = b82Var.g();
        if (g10 == -1) {
            g10 = eb2Var.h(b82Var);
            b82Var.i(g10);
        }
        t82Var.w(g10);
        eb2Var.f(qa2Var, t82Var.f14615x);
    }

    public final void p(int i10, int i11) {
        this.f14883a.n(i10, i11);
    }

    public final void q(int i10, long j3) {
        this.f14883a.p(i10, j3);
    }
}
