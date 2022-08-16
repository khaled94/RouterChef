package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class q extends a0.e.d.a.b.AbstractC0135d {

    /* renamed from: a */
    public final String f19407a;

    /* renamed from: b */
    public final int f19408b;

    /* renamed from: c */
    public final b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> f19409c;

    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0135d.AbstractC0136a {

        /* renamed from: a */
        public String f19410a;

        /* renamed from: b */
        public Integer f19411b;

        /* renamed from: c */
        public b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> f19412c;

        public final a0.e.d.a.b.AbstractC0135d a() {
            String str = this.f19410a == null ? " name" : "";
            if (this.f19411b == null) {
                str = d7.a.c(str, " importance");
            }
            if (this.f19412c == null) {
                str = d7.a.c(str, " frames");
            }
            if (str.isEmpty()) {
                return new q(this.f19410a, this.f19411b.intValue(), this.f19412c, null);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public q(String str, int i10, b0 b0Var, a aVar) {
        this.f19407a = str;
        this.f19408b = i10;
        this.f19409c = b0Var;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d
    public final b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> a() {
        return this.f19409c;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d
    public final int b() {
        return this.f19408b;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d
    public final String c() {
        return this.f19407a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0135d)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0135d abstractC0135d = (a0.e.d.a.b.AbstractC0135d) obj;
        return this.f19407a.equals(abstractC0135d.c()) && this.f19408b == abstractC0135d.b() && this.f19409c.equals(abstractC0135d.a());
    }

    public final int hashCode() {
        return ((((this.f19407a.hashCode() ^ 1000003) * 1000003) ^ this.f19408b) * 1000003) ^ this.f19409c.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Thread{name=");
        c10.append(this.f19407a);
        c10.append(", importance=");
        c10.append(this.f19408b);
        c10.append(", frames=");
        c10.append(this.f19409c);
        c10.append("}");
        return c10.toString();
    }
}
