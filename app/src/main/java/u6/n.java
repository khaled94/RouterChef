package u6;

import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class n extends a0.e.d.a.b.AbstractC0130a {

    /* renamed from: a */
    public final long f19383a;

    /* renamed from: b */
    public final long f19384b;

    /* renamed from: c */
    public final String f19385c;

    /* renamed from: d */
    public final String f19386d;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.d.a.b.AbstractC0130a.AbstractC0131a {

        /* renamed from: a */
        public Long f19387a;

        /* renamed from: b */
        public Long f19388b;

        /* renamed from: c */
        public String f19389c;

        /* renamed from: d */
        public String f19390d;

        public final a0.e.d.a.b.AbstractC0130a a() {
            String str = this.f19387a == null ? " baseAddress" : "";
            if (this.f19388b == null) {
                str = d7.a.c(str, " size");
            }
            if (this.f19389c == null) {
                str = d7.a.c(str, " name");
            }
            if (str.isEmpty()) {
                return new n(this.f19387a.longValue(), this.f19388b.longValue(), this.f19389c, this.f19390d);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public n(long j3, long j10, String str, String str2) {
        this.f19383a = j3;
        this.f19384b = j10;
        this.f19385c = str;
        this.f19386d = str2;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0130a
    public final long a() {
        return this.f19383a;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0130a
    public final String b() {
        return this.f19385c;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0130a
    public final long c() {
        return this.f19384b;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0130a
    public final String d() {
        return this.f19386d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0130a)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0130a abstractC0130a = (a0.e.d.a.b.AbstractC0130a) obj;
        if (this.f19383a == abstractC0130a.a() && this.f19384b == abstractC0130a.c() && this.f19385c.equals(abstractC0130a.b())) {
            String str = this.f19386d;
            String d5 = abstractC0130a.d();
            if (str == null) {
                if (d5 == null) {
                    return true;
                }
            } else if (str.equals(d5)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f19383a;
        long j10 = this.f19384b;
        int hashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f19385c.hashCode()) * 1000003;
        String str = this.f19386d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("BinaryImage{baseAddress=");
        c10.append(this.f19383a);
        c10.append(", size=");
        c10.append(this.f19384b);
        c10.append(", name=");
        c10.append(this.f19385c);
        c10.append(", uuid=");
        return b.b(c10, this.f19386d, "}");
    }
}
