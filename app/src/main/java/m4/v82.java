package m4;

import c4.a;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class v82 extends wo2 {
    public static final Logger y = Logger.getLogger(v82.class.getName());

    /* renamed from: z */
    public static final boolean f14614z = zb2.f16091e;

    /* renamed from: x */
    public w82 f14615x;

    public v82() {
    }

    public /* synthetic */ v82(a aVar) {
    }

    @Deprecated
    public static int A(int i10, qa2 qa2Var, eb2 eb2Var) {
        int i11 = i(i10 << 3);
        int i12 = i11 + i11;
        b82 b82Var = (b82) qa2Var;
        int g10 = b82Var.g();
        if (g10 == -1) {
            g10 = eb2Var.h(b82Var);
            b82Var.i(g10);
        }
        return i12 + g10;
    }

    public static int B(int i10) {
        if (i10 >= 0) {
            return i(i10);
        }
        return 10;
    }

    public static int C(qa2 qa2Var, eb2 eb2Var) {
        b82 b82Var = (b82) qa2Var;
        int g10 = b82Var.g();
        if (g10 == -1) {
            g10 = eb2Var.h(b82Var);
            b82Var.i(g10);
        }
        return i(g10) + g10;
    }

    public static int D(String str) {
        int i10;
        try {
            i10 = bc2.c(str);
        } catch (ac2 unused) {
            i10 = str.getBytes(v92.f14624a).length;
        }
        return i(i10) + i10;
    }

    public static int E(int i10) {
        return i(i10 << 3);
    }

    public static int i(int i10) {
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

    public static int j(long j3) {
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

    public static int z(n82 n82Var) {
        int k10 = n82Var.k();
        return i(k10) + k10;
    }

    public abstract void k(byte b10);

    public abstract void l(int i10, boolean z10);

    public abstract void m(int i10, n82 n82Var);

    public abstract void n(int i10, int i11);

    public abstract void o(int i10);

    public abstract void p(int i10, long j3);

    public abstract void q(long j3);

    public abstract void r(int i10, int i11);

    public abstract void s(int i10);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j3);

    public abstract void y(long j3);
}
