package m4;

/* loaded from: classes.dex */
public final class r12 extends fa0 {
    public r12(s12 s12Var) {
        super(i42.class);
    }

    public static final g42 f(i42 i42Var) {
        f42 w10 = g42.w();
        k42 A = i42Var.A();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        g42.D((g42) w10.f9883t, A);
        byte[] a10 = v72.a(i42Var.v());
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((g42) w10.f9883t).zzg = D;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((g42) w10.f9883t).zze = 0;
        return w10.k();
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return i42.z(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ Object c(qa2 qa2Var) {
        return f((i42) qa2Var);
    }

    @Override // m4.fa0
    public final void e(qa2 qa2Var) {
        i42 i42Var = (i42) qa2Var;
        w72.a(i42Var.v());
        s12.j(i42Var.A());
    }
}
