package s4;

/* loaded from: classes.dex */
public final class fa implements ea {

    /* renamed from: a */
    public static final n5<Long> f17864a;

    static {
        l5 l5Var = new l5(f5.a(), false);
        l5Var.c("measurement.client.consent_state_v1", true);
        l5Var.c("measurement.client.3p_consent_state_v1", true);
        l5Var.c("measurement.service.consent_state_v1_W36", true);
        f17864a = (h5) l5Var.a("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // s4.ea
    public final long zza() {
        return f17864a.b().longValue();
    }
}
