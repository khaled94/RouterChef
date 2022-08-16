package m4;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class n32 extends r02<v02, w52> {
    public n32() {
        super(v02.class);
    }

    @Override // m4.r02
    public final /* bridge */ /* synthetic */ v02 a(w52 w52Var) {
        w52 w52Var2 = w52Var;
        int A = w52Var2.A().A();
        SecretKeySpec secretKeySpec = new SecretKeySpec(w52Var2.B().e(), "HMAC");
        int v10 = w52Var2.A().v();
        int i10 = A - 2;
        if (i10 != 1) {
            if (i10 == 2) {
                return new t72(new s72("HMACSHA384", secretKeySpec), v10);
            }
            if (i10 == 3) {
                return new t72(new s72("HMACSHA256", secretKeySpec), v10);
            }
            if (i10 == 4) {
                return new t72(new s72("HMACSHA512", secretKeySpec), v10);
            }
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash");
            }
            return new t72(new s72("HMACSHA224", secretKeySpec), v10);
        }
        return new t72(new s72("HMACSHA1", secretKeySpec), v10);
    }
}
