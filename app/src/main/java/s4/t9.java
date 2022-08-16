package s4;

/* loaded from: classes.dex */
public final class t9 implements s9 {

    /* renamed from: a */
    public static final n5<Boolean> f18123a;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f18123a = (i5) l5Var.c("measurement.androidId.delete_feature", true);
        l5Var.c("measurement.log_androidId_enabled", false);
    }

    @Override // s4.s9
    public final boolean zza() {
        return f18123a.b().booleanValue();
    }
}
