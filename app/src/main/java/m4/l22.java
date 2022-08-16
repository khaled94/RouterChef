package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class l22 extends fa0 {
    public l22() {
        super(u62.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return u62.y(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        u62 u62Var = (u62) qa2Var;
        r62 w10 = s62.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        s62.B((s62) w10.f9883t, u62Var);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((s62) w10.f9883t).zze = 0;
        return w10.k();
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ void e(qa2 qa2Var) {
        u62 u62Var = (u62) qa2Var;
        if (u62Var.z().isEmpty() || !u62Var.A()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
