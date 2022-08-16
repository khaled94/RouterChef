package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e22 extends s02<f52> {
    public e22() {
        super(f52.class, new c22());
    }

    @Override // m4.s02
    public final fa0 a() {
        return new d22();
    }

    @Override // m4.s02
    public final /* synthetic */ f52 b(n82 n82Var) {
        return f52.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(f52 f52Var) {
        f52 f52Var2 = f52Var;
        w72.b(f52Var2.v());
        if (f52Var2.z().k() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
