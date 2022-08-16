package m4;

/* loaded from: classes.dex */
public final class p12 extends s02<c42> {
    public p12() {
        super(c42.class, new n12());
    }

    public static q02 i(int i10, int i11, int i12) {
        h42 w10 = i42.w();
        j42 w11 = k42.w();
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((k42) w11.f9883t).zze = 16;
        k42 k10 = w11.k();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((i42) w10.f9883t).zze = k10;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((i42) w10.f9883t).zzf = i10;
        i42 k11 = w10.k();
        x52 w12 = y52.w();
        z52 w13 = a62.w();
        if (w13.f9884u) {
            w13.m();
            w13.f9884u = false;
        }
        ((a62) w13.f9883t).zze = r01.a(5);
        if (w13.f9884u) {
            w13.m();
            w13.f9884u = false;
        }
        ((a62) w13.f9883t).zzf = i11;
        a62 k12 = w13.k();
        if (w12.f9884u) {
            w12.m();
            w12.f9884u = false;
        }
        ((y52) w12.f9883t).zze = k12;
        if (w12.f9884u) {
            w12.m();
            w12.f9884u = false;
        }
        ((y52) w12.f9883t).zzf = 32;
        y52 k13 = w12.k();
        d42 v10 = e42.v();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ((e42) v10.f9883t).zze = k11;
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ((e42) v10.f9883t).zzf = k13;
        return new q02(v10.k(), i12);
    }

    @Override // m4.s02
    public final fa0 a() {
        return new o12();
    }

    @Override // m4.s02
    public final /* synthetic */ c42 b(n82 n82Var) {
        return c42.y(n82Var, z82.a());
    }

    @Override // m4.s02
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // m4.s02
    public final /* bridge */ /* synthetic */ void f(c42 c42Var) {
        c42 c42Var2 = c42Var;
        w72.b(c42Var2.v());
        new s12();
        s12.i(c42Var2.z());
        new p32();
        p32.i(c42Var2.A());
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
