package s4;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l6 {

    /* renamed from: a */
    public final k6 f17966a;

    public l6(k6 k6Var) {
        Charset charset = i7.f17920a;
        this.f17966a = k6Var;
        k6Var.f17958x = this;
    }

    public final void a(int i10, int i11) {
        this.f17966a.u(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j3) {
        this.f17966a.w(i10, (j3 >> 63) ^ (j3 + j3));
    }

    public final void c(int i10, int i11) {
        this.f17966a.u(i10, i11);
    }

    public final void d(int i10, long j3) {
        this.f17966a.w(i10, j3);
    }

    public final void e(int i10, boolean z10) {
        this.f17966a.k(i10, z10);
    }

    public final void f(int i10, g6 g6Var) {
        this.f17966a.l(i10, g6Var);
    }

    public final void g(int i10, double d5) {
        this.f17966a.o(i10, Double.doubleToRawLongBits(d5));
    }

    public final void h(int i10, int i11) {
        this.f17966a.q(i10, i11);
    }

    public final void i(int i10, int i11) {
        this.f17966a.m(i10, i11);
    }

    public final void j(int i10, long j3) {
        this.f17966a.o(i10, j3);
    }

    public final void k(int i10, float f10) {
        this.f17966a.m(i10, Float.floatToRawIntBits(f10));
    }

    public final void l(int i10, Object obj, o8 o8Var) {
        k6 k6Var = this.f17966a;
        k6Var.t(i10, 3);
        o8Var.i((d8) obj, k6Var.f17958x);
        k6Var.t(i10, 4);
    }

    public final void m(int i10, int i11) {
        this.f17966a.q(i10, i11);
    }

    public final void n(int i10, long j3) {
        this.f17966a.w(i10, j3);
    }

    public final void o(int i10, Object obj, o8 o8Var) {
        d8 d8Var = (d8) obj;
        i6 i6Var = (i6) this.f17966a;
        i6Var.v((i10 << 3) | 2);
        x5 x5Var = (x5) d8Var;
        int f10 = x5Var.f();
        if (f10 == -1) {
            f10 = o8Var.h(x5Var);
            x5Var.h(f10);
        }
        i6Var.v(f10);
        o8Var.i(d8Var, i6Var.f17958x);
    }

    public final void p(int i10, int i11) {
        this.f17966a.m(i10, i11);
    }

    public final void q(int i10, long j3) {
        this.f17966a.o(i10, j3);
    }
}
