package m4;

import d.c;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes.dex */
public final class z22 extends r02<m02, q52> {
    public z22() {
        super(m02.class);
    }

    @Override // m4.r02
    public final /* bridge */ /* synthetic */ m02 a(q52 q52Var) {
        q52 q52Var2 = q52Var;
        o52 w10 = q52Var2.z().w();
        u52 z10 = w10.z();
        int k10 = c.k(z10.A());
        byte[] e10 = q52Var2.A().e();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) n72.f11548i.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, e10), zv1.i(k10)));
        new k32(w10.v().y());
        z10.y().e();
        c.j(z10.B());
        c.l(w10.C());
        return new qi();
    }
}
