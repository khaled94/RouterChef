package s4;

/* loaded from: classes.dex */
public final class mb implements lb {

    /* renamed from: a */
    public static final n5<Boolean> f18005a;

    /* renamed from: b */
    public static final n5<Boolean> f18006b;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f18005a = (i5) l5Var.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        l5Var.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f18006b = (i5) l5Var.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        l5Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // s4.lb
    public final boolean a() {
        return f18006b.b().booleanValue();
    }

    @Override // s4.lb
    public final boolean zza() {
        return f18005a.b().booleanValue();
    }
}
