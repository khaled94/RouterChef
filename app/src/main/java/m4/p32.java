package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class p32 extends s02<w52> {
    public p32() {
        super(w52.class, new n32());
    }

    public static final void i(w52 w52Var) {
        w72.b(w52Var.v());
        if (w52Var.B().k() >= 16) {
            k(w52Var.A());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static q02 j(int i10, int i11, int i12, int i13) {
        x52 w10 = y52.w();
        z52 w11 = a62.w();
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((a62) w11.f9883t).zze = r01.a(i12);
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((a62) w11.f9883t).zzf = i11;
        a62 k10 = w11.k();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((y52) w10.f9883t).zze = k10;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((y52) w10.f9883t).zzf = i10;
        return new q02(w10.k(), i13);
    }

    public static void k(a62 a62Var) {
        if (a62Var.v() >= 10) {
            int A = a62Var.A() - 2;
            if (A == 1) {
                if (a62Var.v() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (A == 2) {
                if (a62Var.v() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (A == 3) {
                if (a62Var.v() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (A == 4) {
                if (a62Var.v() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (A != 5) {
                throw new GeneralSecurityException("unknown hash type");
            } else {
                if (a62Var.v() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // m4.s02
    public final fa0 a() {
        return new o32();
    }

    @Override // m4.s02
    public final /* synthetic */ w52 b(n82 n82Var) {
        return w52.z(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(w52 w52Var) {
        i(w52Var);
    }

    @Override // m4.s02
    public final int g() {
        return 2;
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
