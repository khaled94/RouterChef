package s4;

/* loaded from: classes.dex */
public final class q9 implements p9 {

    /* renamed from: a */
    public static final n5<Boolean> f18071a;

    /* renamed from: b */
    public static final n5<Boolean> f18072b;

    /* renamed from: c */
    public static final n5<Boolean> f18073c;

    static {
        l5 l5Var = new l5(f5.a(), true);
        f18071a = (i5) l5Var.c("measurement.adid_zero.service", false);
        f18072b = (i5) l5Var.c("measurement.adid_zero.adid_uid", false);
        f18073c = (i5) l5Var.c("measurement.adid_zero.remove_lair_if_adidzero_false", true);
    }

    @Override // s4.p9
    public final boolean a() {
        return f18071a.b().booleanValue();
    }

    @Override // s4.p9
    public final boolean c() {
        return f18072b.b().booleanValue();
    }

    @Override // s4.p9
    public final boolean g() {
        return f18073c.b().booleanValue();
    }

    @Override // s4.p9
    public final void zza() {
    }
}
