package s4;

/* loaded from: classes.dex */
public final class qb implements pb {

    /* renamed from: a */
    public static final n5<Boolean> f18074a;

    /* renamed from: b */
    public static final n5<Boolean> f18075b;

    static {
        l5 l5Var = new l5(f5.a(), false);
        l5Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f18074a = (i5) l5Var.c("measurement.lifecycle.app_backgrounded_engagement", false);
        l5Var.c("measurement.lifecycle.app_backgrounded_tracking", true);
        f18075b = (i5) l5Var.c("measurement.lifecycle.app_in_background_parameter", false);
        l5Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // s4.pb
    public final boolean a() {
        return f18075b.b().booleanValue();
    }

    @Override // s4.pb
    public final boolean zza() {
        return f18074a.b().booleanValue();
    }
}
