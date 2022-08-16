package u6;

import java.util.Objects;
import u6.a0;

/* loaded from: classes.dex */
public final class k extends a0.e.d {

    /* renamed from: a */
    public final long f19358a;

    /* renamed from: b */
    public final String f19359b;

    /* renamed from: c */
    public final a0.e.d.a f19360c;

    /* renamed from: d */
    public final a0.e.d.c f19361d;

    /* renamed from: e */
    public final a0.e.d.AbstractC0139d f19362e;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.d.b {

        /* renamed from: a */
        public Long f19363a;

        /* renamed from: b */
        public String f19364b;

        /* renamed from: c */
        public a0.e.d.a f19365c;

        /* renamed from: d */
        public a0.e.d.c f19366d;

        /* renamed from: e */
        public a0.e.d.AbstractC0139d f19367e;

        public a() {
        }

        public a(a0.e.d dVar) {
            this.f19363a = Long.valueOf(dVar.d());
            this.f19364b = dVar.e();
            this.f19365c = dVar.a();
            this.f19366d = dVar.b();
            this.f19367e = dVar.c();
        }

        public final a0.e.d a() {
            String str = this.f19363a == null ? " timestamp" : "";
            if (this.f19364b == null) {
                str = d7.a.c(str, " type");
            }
            if (this.f19365c == null) {
                str = d7.a.c(str, " app");
            }
            if (this.f19366d == null) {
                str = d7.a.c(str, " device");
            }
            if (str.isEmpty()) {
                return new k(this.f19363a.longValue(), this.f19364b, this.f19365c, this.f19366d, this.f19367e);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        public final a0.e.d.b b(long j3) {
            this.f19363a = Long.valueOf(j3);
            return this;
        }

        public final a0.e.d.b c(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f19364b = str;
            return this;
        }
    }

    public k(long j3, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0139d abstractC0139d) {
        this.f19358a = j3;
        this.f19359b = str;
        this.f19360c = aVar;
        this.f19361d = cVar;
        this.f19362e = abstractC0139d;
    }

    @Override // u6.a0.e.d
    public final a0.e.d.a a() {
        return this.f19360c;
    }

    @Override // u6.a0.e.d
    public final a0.e.d.c b() {
        return this.f19361d;
    }

    @Override // u6.a0.e.d
    public final a0.e.d.AbstractC0139d c() {
        return this.f19362e;
    }

    @Override // u6.a0.e.d
    public final long d() {
        return this.f19358a;
    }

    @Override // u6.a0.e.d
    public final String e() {
        return this.f19359b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d)) {
            return false;
        }
        a0.e.d dVar = (a0.e.d) obj;
        if (this.f19358a == dVar.d() && this.f19359b.equals(dVar.e()) && this.f19360c.equals(dVar.a()) && this.f19361d.equals(dVar.b())) {
            a0.e.d.AbstractC0139d abstractC0139d = this.f19362e;
            a0.e.d.AbstractC0139d c10 = dVar.c();
            if (abstractC0139d == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (abstractC0139d.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f19358a;
        int hashCode = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f19359b.hashCode()) * 1000003) ^ this.f19360c.hashCode()) * 1000003) ^ this.f19361d.hashCode()) * 1000003;
        a0.e.d.AbstractC0139d abstractC0139d = this.f19362e;
        return hashCode ^ (abstractC0139d == null ? 0 : abstractC0139d.hashCode());
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Event{timestamp=");
        c10.append(this.f19358a);
        c10.append(", type=");
        c10.append(this.f19359b);
        c10.append(", app=");
        c10.append(this.f19360c);
        c10.append(", device=");
        c10.append(this.f19361d);
        c10.append(", log=");
        c10.append(this.f19362e);
        c10.append("}");
        return c10.toString();
    }
}
