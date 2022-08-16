package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class r extends a0.e.d.a.b.AbstractC0135d.AbstractC0137b {

    /* renamed from: a */
    public final long f19413a;

    /* renamed from: b */
    public final String f19414b;

    /* renamed from: c */
    public final String f19415c;

    /* renamed from: d */
    public final long f19416d;

    /* renamed from: e */
    public final int f19417e;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.d.a.b.AbstractC0135d.AbstractC0137b.AbstractC0138a {

        /* renamed from: a */
        public Long f19418a;

        /* renamed from: b */
        public String f19419b;

        /* renamed from: c */
        public String f19420c;

        /* renamed from: d */
        public Long f19421d;

        /* renamed from: e */
        public Integer f19422e;

        public final a0.e.d.a.b.AbstractC0135d.AbstractC0137b a() {
            String str = this.f19418a == null ? " pc" : "";
            if (this.f19419b == null) {
                str = d7.a.c(str, " symbol");
            }
            if (this.f19421d == null) {
                str = d7.a.c(str, " offset");
            }
            if (this.f19422e == null) {
                str = d7.a.c(str, " importance");
            }
            if (str.isEmpty()) {
                return new r(this.f19418a.longValue(), this.f19419b, this.f19420c, this.f19421d.longValue(), this.f19422e.intValue());
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public r(long j3, String str, String str2, long j10, int i10) {
        this.f19413a = j3;
        this.f19414b = str;
        this.f19415c = str2;
        this.f19416d = j10;
        this.f19417e = i10;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d.AbstractC0137b
    public final String a() {
        return this.f19415c;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d.AbstractC0137b
    public final int b() {
        return this.f19417e;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d.AbstractC0137b
    public final long c() {
        return this.f19416d;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d.AbstractC0137b
    public final long d() {
        return this.f19413a;
    }

    @Override // u6.a0.e.d.a.b.AbstractC0135d.AbstractC0137b
    public final String e() {
        return this.f19414b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0135d.AbstractC0137b)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0135d.AbstractC0137b abstractC0137b = (a0.e.d.a.b.AbstractC0135d.AbstractC0137b) obj;
        return this.f19413a == abstractC0137b.d() && this.f19414b.equals(abstractC0137b.e()) && ((str = this.f19415c) != null ? str.equals(abstractC0137b.a()) : abstractC0137b.a() == null) && this.f19416d == abstractC0137b.c() && this.f19417e == abstractC0137b.b();
    }

    public final int hashCode() {
        long j3 = this.f19413a;
        int hashCode = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f19414b.hashCode()) * 1000003;
        String str = this.f19415c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f19416d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f19417e;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Frame{pc=");
        c10.append(this.f19413a);
        c10.append(", symbol=");
        c10.append(this.f19414b);
        c10.append(", file=");
        c10.append(this.f19415c);
        c10.append(", offset=");
        c10.append(this.f19416d);
        c10.append(", importance=");
        c10.append(this.f19417e);
        c10.append("}");
        return c10.toString();
    }
}
