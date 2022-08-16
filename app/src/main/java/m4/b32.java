package m4;

import d.c;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class b32 extends c12<q52, s52> {

    /* renamed from: d */
    public static final byte[] f6354d = new byte[0];

    public b32() {
        super(new z22());
    }

    public static q02 i(int i10, p02 p02Var, byte[] bArr, int i11) {
        int i12;
        l52 v10 = m52.v();
        t52 v11 = u52.v();
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        int i13 = 4;
        u52.C((u52) v11.f9883t);
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((u52) v11.f9883t).zzf = r01.a(5);
        n82 D = n82.D(bArr, 0, bArr.length);
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((u52) v11.f9883t).zzg = D;
        u52 k10 = v11.k();
        d62 v12 = e62.v();
        String z10 = p02Var.f12359a.z();
        if (v12.f9884u) {
            v12.m();
            v12.f9884u = false;
        }
        e62.A((e62) v12.f9883t, z10);
        n82 C = n82.C(p02Var.f12359a.y().e());
        if (v12.f9884u) {
            v12.m();
            v12.f9884u = false;
        }
        ((e62) v12.f9883t).zzf = C;
        int C2 = p02Var.f12359a.C() - 2;
        if (C2 == 1) {
            i12 = 1;
        } else if (C2 == 2) {
            i12 = 2;
        } else if (C2 == 3) {
            i12 = 3;
        } else if (C2 != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        } else {
            i12 = 4;
        }
        int i14 = i12 - 1;
        if (i14 == 0) {
            i13 = 3;
        } else if (i14 != 1) {
            i13 = i14 != 2 ? 6 : 5;
        }
        if (v12.f9884u) {
            v12.m();
            v12.f9884u = false;
        }
        e62.D((e62) v12.f9883t, i13);
        e62 k11 = v12.k();
        i52 v13 = k52.v();
        if (v13.f9884u) {
            v13.m();
            v13.f9884u = false;
        }
        ((k52) v13.f9883t).zze = k11;
        k52 k12 = v13.k();
        n52 w10 = o52.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((o52) w10.f9883t).zze = k10;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((o52) w10.f9883t).zzf = k12;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        o52.D((o52) w10.f9883t, i10);
        o52 k13 = w10.k();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ((m52) v10.f9883t).zze = k13;
        return new q02(v10.k(), i11);
    }

    @Override // m4.s02
    public final fa0 a() {
        return new a32();
    }

    @Override // m4.s02
    public final /* synthetic */ qa2 b(n82 n82Var) {
        return q52.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // m4.s02
    public final void f(qa2 qa2Var) {
        q52 q52Var = (q52) qa2Var;
        if (!(q52Var.A().k() == 0)) {
            w72.b(q52Var.v());
            c.i(q52Var.z().w());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // m4.s02
    public final int h() {
        return 4;
    }
}
