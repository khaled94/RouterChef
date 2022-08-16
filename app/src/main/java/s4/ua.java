package s4;

/* loaded from: classes.dex */
public final class ua implements ta {

    /* renamed from: a */
    public static final n5<Boolean> f18141a;

    /* renamed from: b */
    public static final n5<Boolean> f18142b;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f18141a = (i5) l5Var.c("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f18142b = (i5) l5Var.c("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // s4.ta
    public final boolean a() {
        return f18141a.b().booleanValue();
    }

    @Override // s4.ta
    public final boolean c() {
        return f18142b.b().booleanValue();
    }

    @Override // s4.ta
    public final void zza() {
    }
}
