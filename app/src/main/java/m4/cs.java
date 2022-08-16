package m4;

/* loaded from: classes.dex */
public final class cs implements bu {

    /* renamed from: a */
    public final /* synthetic */ ds f7133a;

    public cs(ds dsVar) {
        this.f7133a = dsVar;
    }

    @Override // m4.bu
    public final Double a(String str, double d5) {
        return Double.valueOf(this.f7133a.f7620e.getFloat(str, (float) d5));
    }

    @Override // m4.bu
    public final String b(String str, String str2) {
        return this.f7133a.f7620e.getString(str, str2);
    }

    @Override // m4.bu
    public final Long c(String str, long j3) {
        try {
            return Long.valueOf(this.f7133a.f7620e.getLong(str, j3));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f7133a.f7620e.getInt(str, (int) j3));
        }
    }

    @Override // m4.bu
    public final Boolean d(String str, boolean z10) {
        return Boolean.valueOf(this.f7133a.f7620e.getBoolean(str, z10));
    }
}
