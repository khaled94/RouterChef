package a3;

import a3.f;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends f.a {

    /* renamed from: a */
    public final long f39a;

    /* renamed from: b */
    public final long f40b;

    /* renamed from: c */
    public final Set<f.b> f41c;

    /* loaded from: classes.dex */
    public static final class b extends f.a.AbstractC0002a {

        /* renamed from: a */
        public Long f42a;

        /* renamed from: b */
        public Long f43b;

        /* renamed from: c */
        public Set<f.b> f44c;

        @Override // a3.f.a.AbstractC0002a
        public final f.a a() {
            String str = this.f42a == null ? " delta" : "";
            if (this.f43b == null) {
                str = d7.a.c(str, " maxAllowedDelay");
            }
            if (this.f44c == null) {
                str = d7.a.c(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f42a.longValue(), this.f43b.longValue(), this.f44c, null);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        @Override // a3.f.a.AbstractC0002a
        public final f.a.AbstractC0002a b(long j3) {
            this.f42a = Long.valueOf(j3);
            return this;
        }

        @Override // a3.f.a.AbstractC0002a
        public final f.a.AbstractC0002a c() {
            this.f43b = 86400000L;
            return this;
        }
    }

    public c(long j3, long j10, Set set, a aVar) {
        this.f39a = j3;
        this.f40b = j10;
        this.f41c = set;
    }

    @Override // a3.f.a
    public final long b() {
        return this.f39a;
    }

    @Override // a3.f.a
    public final Set<f.b> c() {
        return this.f41c;
    }

    @Override // a3.f.a
    public final long d() {
        return this.f40b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.a)) {
            return false;
        }
        f.a aVar = (f.a) obj;
        return this.f39a == aVar.b() && this.f40b == aVar.d() && this.f41c.equals(aVar.c());
    }

    public final int hashCode() {
        long j3 = this.f39a;
        long j10 = this.f40b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f41c.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("ConfigValue{delta=");
        c10.append(this.f39a);
        c10.append(", maxAllowedDelay=");
        c10.append(this.f40b);
        c10.append(", flags=");
        c10.append(this.f41c);
        c10.append("}");
        return c10.toString();
    }
}
