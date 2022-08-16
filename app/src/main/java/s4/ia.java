package s4;

/* loaded from: classes.dex */
public final class ia implements ha {

    /* renamed from: a */
    public static final n5<Boolean> f17929a;

    /* renamed from: b */
    public static final n5<Boolean> f17930b;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f17929a = (i5) l5Var.c("measurement.euid.client.dev", false);
        f17930b = (i5) l5Var.c("measurement.euid.service", false);
    }

    @Override // s4.ha
    public final boolean a() {
        return f17930b.b().booleanValue();
    }

    @Override // s4.ha
    public final boolean zza() {
        return f17929a.b().booleanValue();
    }
}
