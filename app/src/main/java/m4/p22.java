package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class p22 extends s02<x62> {
    public p22() {
        super(x62.class, new n22());
    }

    @Override // m4.s02
    public final fa0 a() {
        return new o22();
    }

    @Override // m4.s02
    public final /* synthetic */ x62 b(n82 n82Var) {
        return x62.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(x62 x62Var) {
        x62 x62Var2 = x62Var;
        w72.b(x62Var2.v());
        if (x62Var2.z().k() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
