package s4;

/* loaded from: classes.dex */
public final class db implements cb {

    /* renamed from: a */
    public static final n5<Boolean> f17806a;

    static {
        l5 l5Var = new l5(f5.a(), false);
        l5Var.c("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f17806a = (i5) l5Var.c("measurement.collection.redundant_engagement_removal_enabled", false);
        l5Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // s4.cb
    public final boolean zza() {
        return f17806a.b().booleanValue();
    }
}
