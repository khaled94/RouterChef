package m4;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class v22 extends s02<b52> {
    public v22() {
        super(b52.class, new t22());
    }

    @Override // m4.s02
    public final fa0 a() {
        return new u22();
    }

    @Override // m4.s02
    public final /* synthetic */ b52 b(n82 n82Var) {
        return b52.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(b52 b52Var) {
        b52 b52Var2 = b52Var;
        w72.b(b52Var2.v());
        if (b52Var2.z().k() == 64) {
            return;
        }
        int k10 = b52Var2.z().k();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(k10);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
