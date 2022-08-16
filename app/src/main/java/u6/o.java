package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class o extends a0.e.d.a.b.AbstractC0132b {

    /* renamed from: a */
    public final String f19391a;

    /* renamed from: b */
    public final String f19392b;

    /* renamed from: c */
    public final b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> f19393c;

    /* renamed from: d */
    public final a0.e.d.a.b.AbstractC0132b f19394d;

    /* renamed from: e */
    public final int f19395e;

    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0132b.AbstractC0133a {

        /* renamed from: a */
        public String f19396a;

        /* renamed from: b */
        public String f19397b;

        /* renamed from: c */
        public b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> f19398c;

        /* renamed from: d */
        public a0.e.d.a.b.AbstractC0132b f19399d;

        /* renamed from: e */
        public Integer f19400e;

        public final a0.e.d.a.b.AbstractC0132b a() {
            String str = this.f19396a == null ? " type" : "";
            if (this.f19398c == null) {
                str = d7.a.c(str, " frames");
            }
            if (this.f19400e == null) {
                str = d7.a.c(str, " overflowCount");
            }
            if (str.isEmpty()) {
                return new o(this.f19396a, this.f19397b, this.f19398c, this.f19399d, this.f19400e.intValue(), null);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.AbstractC0132b abstractC0132b, int i10, a aVar) {
        this.f19391a = str;
        this.f19392b = str2;
        this.f19393c = b0Var;
        this.f19394d = abstractC0132b;
        this.f19395e = i10;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0132b
    public final a0.e.d.a.b.AbstractC0132b a() {
        return this.f19394d;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0132b
    public final b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> b() {
        return this.f19393c;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0132b
    public final int c() {
        return this.f19395e;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0132b
    public final String d() {
        return this.f19392b;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0132b
    public final String e() {
        return this.f19391a;
    }

    public final boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.AbstractC0132b abstractC0132b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0132b)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0132b abstractC0132b2 = (a0.e.d.a.b.AbstractC0132b) obj;
        return this.f19391a.equals(abstractC0132b2.e()) && ((str = this.f19392b) != null ? str.equals(abstractC0132b2.d()) : abstractC0132b2.d() == null) && this.f19393c.equals(abstractC0132b2.b()) && ((abstractC0132b = this.f19394d) != null ? abstractC0132b.equals(abstractC0132b2.a()) : abstractC0132b2.a() == null) && this.f19395e == abstractC0132b2.c();
    }

    public final int hashCode() {
        int hashCode = (this.f19391a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19392b;
        int i10 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f19393c.hashCode()) * 1000003;
        a0.e.d.a.b.AbstractC0132b abstractC0132b = this.f19394d;
        if (abstractC0132b != null) {
            i10 = abstractC0132b.hashCode();
        }
        return ((hashCode2 ^ i10) * 1000003) ^ this.f19395e;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Exception{type=");
        c10.append(this.f19391a);
        c10.append(", reason=");
        c10.append(this.f19392b);
        c10.append(", frames=");
        c10.append(this.f19393c);
        c10.append(", causedBy=");
        c10.append(this.f19394d);
        c10.append(", overflowCount=");
        c10.append(this.f19395e);
        c10.append("}");
        return c10.toString();
    }
}
