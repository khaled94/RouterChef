package m4;

/* loaded from: classes.dex */
public final class y12 extends s02<t42> {
    public y12() {
        super(t42.class, new w12());
    }

    public static q02 i(int i10, int i11) {
        u42 w10 = v42.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((v42) w10.f9883t).zze = i10;
        return new q02(w10.k(), i11);
    }

    @Override // m4.s02
    public final fa0 a() {
        return new x12();
    }

    @Override // m4.s02
    public final /* synthetic */ t42 b(n82 n82Var) {
        return t42.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(t42 t42Var) {
        t42 t42Var2 = t42Var;
        w72.b(t42Var2.v());
        w72.a(t42Var2.z().k());
    }

    @Override // m4.s02
    public final int g() {
        return 2;
    }

    @Override // m4.s02
    public final int h() {
        return 3;
    }
}
