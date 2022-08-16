package s4;

/* loaded from: classes.dex */
public final class ab implements za {

    /* renamed from: a */
    public static final n5<Boolean> f17728a;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f17728a = (i5) l5Var.c("measurement.client.sessions.check_on_reset_and_enable2", true);
        l5Var.c("measurement.client.sessions.check_on_startup", true);
        l5Var.c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // s4.za
    public final boolean a() {
        return f17728a.b().booleanValue();
    }

    @Override // s4.za
    public final void zza() {
    }
}
