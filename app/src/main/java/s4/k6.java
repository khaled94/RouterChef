package s4;

import e9.d;
import java.util.logging.Logger;
import m4.g7;

/* loaded from: classes.dex */
public abstract class k6 extends g7 {
    public static final Logger y = Logger.getLogger(k6.class.getName());

    /* renamed from: z */
    public static final boolean f17957z = i9.f17926e;

    /* renamed from: x */
    public l6 f17958x;

    public k6() {
    }

    public /* synthetic */ k6(d dVar) {
    }

    public static int A(int i10) {
        if (i10 >= 0) {
            return g(i10);
        }
        return 10;
    }

    public static int B(d8 d8Var, o8 o8Var) {
        x5 x5Var = (x5) d8Var;
        int f10 = x5Var.f();
        if (f10 == -1) {
            f10 = o8Var.h(x5Var);
            x5Var.h(f10);
        }
        return g(f10) + f10;
    }

    public static int C(String str) {
        int i10;
        try {
            i10 = k9.c(str);
        } catch (j9 unused) {
            i10 = str.getBytes(i7.f17920a).length;
        }
        return g(i10) + i10;
    }

    public static int D(int i10) {
        return g(i10 << 3);
    }

    public static int g(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int i(long j3) {
        int i10;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i10 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int y(g6 g6Var) {
        int g10 = g6Var.g();
        return g(g10) + g10;
    }

    @Deprecated
    public static int z(int i10, d8 d8Var, o8 o8Var) {
        int g10 = g(i10 << 3);
        int i11 = g10 + g10;
        x5 x5Var = (x5) d8Var;
        int f10 = x5Var.f();
        if (f10 == -1) {
            f10 = o8Var.h(x5Var);
            x5Var.h(f10);
        }
        return i11 + f10;
    }

    public abstract void j(byte b10);

    public abstract void k(int i10, boolean z10);

    public abstract void l(int i10, g6 g6Var);

    public abstract void m(int i10, int i11);

    public abstract void n(int i10);

    public abstract void o(int i10, long j3);

    public abstract void p(long j3);

    public abstract void q(int i10, int i11);

    public abstract void r(int i10);

    public abstract void s(int i10, String str);

    public abstract void t(int i10, int i11);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10);

    public abstract void w(int i10, long j3);

    public abstract void x(long j3);
}
