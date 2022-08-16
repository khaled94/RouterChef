package m4;

/* loaded from: classes.dex */
public final class bs1 implements nq0 {

    /* renamed from: s */
    public String f6609s;

    /* renamed from: t */
    public Object f6610t;

    /* renamed from: u */
    public Object f6611u;

    public final as1 a() {
        Boolean bool;
        String str = this.f6609s;
        if (str == null || (bool = (Boolean) this.f6610t) == null || ((Boolean) this.f6611u) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f6609s == null) {
                sb.append(" clientVersion");
            }
            if (((Boolean) this.f6610t) == null) {
                sb.append(" shouldGetAdvertisingId");
            }
            if (((Boolean) this.f6611u) == null) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cs1(str, bool.booleanValue(), ((Boolean) this.f6611u).booleanValue());
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        ((sl1) obj).u((a60) this.f6610t, this.f6609s, (String) this.f6611u);
    }
}
