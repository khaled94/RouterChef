package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class p extends a0.e.d.a.b.c {

    /* renamed from: a */
    public final String f19401a;

    /* renamed from: b */
    public final String f19402b;

    /* renamed from: c */
    public final long f19403c;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.d.a.b.c.AbstractC0134a {

        /* renamed from: a */
        public String f19404a;

        /* renamed from: b */
        public String f19405b;

        /* renamed from: c */
        public Long f19406c;

        public final a0.e.d.a.b.c a() {
            String str = this.f19404a == null ? " name" : "";
            if (this.f19405b == null) {
                str = d7.a.c(str, " code");
            }
            if (this.f19406c == null) {
                str = d7.a.c(str, " address");
            }
            if (str.isEmpty()) {
                return new p(this.f19404a, this.f19405b, this.f19406c.longValue());
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public p(String str, String str2, long j3) {
        this.f19401a = str;
        this.f19402b = str2;
        this.f19403c = j3;
    }

    @Override // u6.a0.e.d.a.b.c
    public final long a() {
        return this.f19403c;
    }

    @Override // u6.a0.e.d.a.b.c
    public final String b() {
        return this.f19402b;
    }

    @Override // u6.a0.e.d.a.b.c
    public final String c() {
        return this.f19401a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.c)) {
            return false;
        }
        a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
        return this.f19401a.equals(cVar.c()) && this.f19402b.equals(cVar.b()) && this.f19403c == cVar.a();
    }

    public final int hashCode() {
        long j3 = this.f19403c;
        return ((((this.f19401a.hashCode() ^ 1000003) * 1000003) ^ this.f19402b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Signal{name=");
        c10.append(this.f19401a);
        c10.append(", code=");
        c10.append(this.f19402b);
        c10.append(", address=");
        c10.append(this.f19403c);
        c10.append("}");
        return c10.toString();
    }
}
