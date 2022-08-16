package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class s12 extends s02<g42> {
    public s12() {
        super(g42.class, new q12(p72.class, 0));
    }

    public static final void i(g42 g42Var) {
        w72.b(g42Var.v());
        w72.a(g42Var.B().k());
        j(g42Var.A());
    }

    public static final void j(k42 k42Var) {
        if (k42Var.v() < 12 || k42Var.v() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // m4.s02
    public final fa0 a() {
        return new r12(this);
    }

    @Override // m4.s02
    public final /* synthetic */ g42 b(n82 n82Var) {
        return g42.z(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(g42 g42Var) {
        i(g42Var);
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
