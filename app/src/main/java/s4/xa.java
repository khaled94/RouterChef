package s4;

/* loaded from: classes.dex */
public final class xa implements wa {

    /* renamed from: a */
    public static final n5<Boolean> f18195a;

    /* renamed from: b */
    public static final n5<Boolean> f18196b;

    /* renamed from: c */
    public static final n5<Boolean> f18197c;

    static {
        l5 l5Var = new l5(f5.a(), false);
        l5Var.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f18195a = (i5) l5Var.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f18196b = (i5) l5Var.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f18197c = (i5) l5Var.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // s4.wa
    public final boolean a() {
        return f18195a.b().booleanValue();
    }

    @Override // s4.wa
    public final boolean c() {
        return f18196b.b().booleanValue();
    }

    @Override // s4.wa
    public final boolean g() {
        return f18197c.b().booleanValue();
    }

    @Override // s4.wa
    public final void zza() {
    }
}
