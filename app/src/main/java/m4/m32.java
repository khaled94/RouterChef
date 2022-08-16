package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class m32 extends s02<v32> {
    public m32() {
        super(v32.class, new q12(v02.class, 1));
    }

    public static void i(z32 z32Var) {
        if (z32Var.v() >= 10) {
            if (z32Var.v() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    @Override // m4.s02
    public final fa0 a() {
        return new l32();
    }

    @Override // m4.s02
    public final /* synthetic */ v32 b(n82 n82Var) {
        return v32.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // m4.s02
    public final void f(v32 v32Var) {
        v32 v32Var2 = v32Var;
        w72.b(v32Var2.v());
        if (v32Var2.A().k() == 32) {
            i(v32Var2.z());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
