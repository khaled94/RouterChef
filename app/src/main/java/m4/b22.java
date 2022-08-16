package m4;

/* loaded from: classes.dex */
public final class b22 extends s02<x42> {
    public b22() {
        super(x42.class, new z12());
    }

    public static q02 i(int i10, int i11) {
        y42 w10 = z42.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((z42) w10.f9883t).zze = i10;
        return new q02(w10.k(), i11);
    }

    @Override // m4.s02
    public final fa0 a() {
        return new a22();
    }

    @Override // m4.s02
    public final /* synthetic */ x42 b(n82 n82Var) {
        return x42.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(x42 x42Var) {
        x42 x42Var2 = x42Var;
        w72.b(x42Var2.v());
        w72.a(x42Var2.z().k());
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
