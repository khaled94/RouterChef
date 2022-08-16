package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class u extends a0.e.AbstractC0140e {

    /* renamed from: a */
    public final int f19436a;

    /* renamed from: b */
    public final String f19437b;

    /* renamed from: c */
    public final String f19438c;

    /* renamed from: d */
    public final boolean f19439d;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.AbstractC0140e.a {

        /* renamed from: a */
        public Integer f19440a;

        /* renamed from: b */
        public String f19441b;

        /* renamed from: c */
        public String f19442c;

        /* renamed from: d */
        public Boolean f19443d;

        public final a0.e.AbstractC0140e a() {
            String str = this.f19440a == null ? " platform" : "";
            if (this.f19441b == null) {
                str = d7.a.c(str, " version");
            }
            if (this.f19442c == null) {
                str = d7.a.c(str, " buildVersion");
            }
            if (this.f19443d == null) {
                str = d7.a.c(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new u(this.f19440a.intValue(), this.f19441b, this.f19442c, this.f19443d.booleanValue());
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public u(int i10, String str, String str2, boolean z10) {
        this.f19436a = i10;
        this.f19437b = str;
        this.f19438c = str2;
        this.f19439d = z10;
    }

    @Override // u6.a0.e.AbstractC0140e
    public final String a() {
        return this.f19438c;
    }

    @Override // u6.a0.e.AbstractC0140e
    public final int b() {
        return this.f19436a;
    }

    @Override // u6.a0.e.AbstractC0140e
    public final String c() {
        return this.f19437b;
    }

    @Override // u6.a0.e.AbstractC0140e
    public final boolean d() {
        return this.f19439d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.AbstractC0140e)) {
            return false;
        }
        a0.e.AbstractC0140e abstractC0140e = (a0.e.AbstractC0140e) obj;
        return this.f19436a == abstractC0140e.b() && this.f19437b.equals(abstractC0140e.c()) && this.f19438c.equals(abstractC0140e.a()) && this.f19439d == abstractC0140e.d();
    }

    public final int hashCode() {
        return ((((((this.f19436a ^ 1000003) * 1000003) ^ this.f19437b.hashCode()) * 1000003) ^ this.f19438c.hashCode()) * 1000003) ^ (this.f19439d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("OperatingSystem{platform=");
        c10.append(this.f19436a);
        c10.append(", version=");
        c10.append(this.f19437b);
        c10.append(", buildVersion=");
        c10.append(this.f19438c);
        c10.append(", jailbroken=");
        c10.append(this.f19439d);
        c10.append("}");
        return c10.toString();
    }
}
