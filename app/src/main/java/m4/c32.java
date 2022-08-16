package m4;

import d.c;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes.dex */
public final class c32 extends r02<n02, s52> {
    public c32() {
        super(n02.class);
    }

    @Override // m4.r02
    public final n02 a(s52 s52Var) {
        s52 s52Var2 = s52Var;
        o52 w10 = s52Var2.w();
        u52 z10 = w10.z();
        int k10 = c.k(z10.A());
        byte[] e10 = s52Var2.B().e();
        byte[] e11 = s52Var2.C().e();
        ECParameterSpec i10 = zv1.i(k10);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, e10), new BigInteger(1, e11));
        zv1.f(eCPoint, i10.getCurve());
        return new l72((ECPublicKey) n72.f11548i.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, i10)), z10.y().e(), c.j(z10.B()), c.l(w10.C()), new k32(w10.v().y()));
    }
}
