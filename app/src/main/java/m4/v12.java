package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class v12 extends s02<m42> {
    public v12() {
        super(m42.class, new t12());
    }

    public static q02 i(int i10, int i11) {
        n42 w10 = o42.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((o42) w10.f9883t).zzf = i10;
        p42 w11 = q42.w();
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((q42) w11.f9883t).zze = 16;
        q42 k10 = w11.k();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((o42) w10.f9883t).zze = k10;
        return new q02(w10.k(), i11);
    }

    @Override // m4.s02
    public final fa0 a() {
        return new u12();
    }

    @Override // m4.s02
    public final /* synthetic */ m42 b(n82 n82Var) {
        return m42.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(m42 m42Var) {
        m42 m42Var2 = m42Var;
        w72.b(m42Var2.v());
        w72.a(m42Var2.A().k());
        if (m42Var2.z().v() == 12 || m42Var2.z().v() == 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
