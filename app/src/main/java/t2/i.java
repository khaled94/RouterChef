package t2;

import java.util.Map;
import java.util.Objects;
import t2.n;

/* loaded from: classes.dex */
public final class i extends n {

    /* renamed from: a */
    public final String f18515a;

    /* renamed from: b */
    public final Integer f18516b;

    /* renamed from: c */
    public final m f18517c;

    /* renamed from: d */
    public final long f18518d;

    /* renamed from: e */
    public final long f18519e;

    /* renamed from: f */
    public final Map<String, String> f18520f;

    /* loaded from: classes.dex */
    public static final class b extends n.a {

        /* renamed from: a */
        public String f18521a;

        /* renamed from: b */
        public Integer f18522b;

        /* renamed from: c */
        public m f18523c;

        /* renamed from: d */
        public Long f18524d;

        /* renamed from: e */
        public Long f18525e;

        /* renamed from: f */
        public Map<String, String> f18526f;

        @Override // t2.n.a
        public final n c() {
            String str = this.f18521a == null ? " transportName" : "";
            if (this.f18523c == null) {
                str = d7.a.c(str, " encodedPayload");
            }
            if (this.f18524d == null) {
                str = d7.a.c(str, " eventMillis");
            }
            if (this.f18525e == null) {
                str = d7.a.c(str, " uptimeMillis");
            }
            if (this.f18526f == null) {
                str = d7.a.c(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new i(this.f18521a, this.f18522b, this.f18523c, this.f18524d.longValue(), this.f18525e.longValue(), this.f18526f, null);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        @Override // t2.n.a
        public final Map<String, String> d() {
            Map<String, String> map = this.f18526f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // t2.n.a
        public final n.a e(long j3) {
            this.f18524d = Long.valueOf(j3);
            return this;
        }

        @Override // t2.n.a
        public final n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f18521a = str;
            return this;
        }

        @Override // t2.n.a
        public final n.a g(long j3) {
            this.f18525e = Long.valueOf(j3);
            return this;
        }

        public final n.a h(m mVar) {
            Objects.requireNonNull(mVar, "Null encodedPayload");
            this.f18523c = mVar;
            return this;
        }
    }

    public i(String str, Integer num, m mVar, long j3, long j10, Map map, a aVar) {
        this.f18515a = str;
        this.f18516b = num;
        this.f18517c = mVar;
        this.f18518d = j3;
        this.f18519e = j10;
        this.f18520f = map;
    }

    @Override // t2.n
    public final Map<String, String> c() {
        return this.f18520f;
    }

    @Override // t2.n
    public final Integer d() {
        return this.f18516b;
    }

    @Override // t2.n
    public final m e() {
        return this.f18517c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f18515a.equals(nVar.h()) && ((num = this.f18516b) != null ? num.equals(nVar.d()) : nVar.d() == null) && this.f18517c.equals(nVar.e()) && this.f18518d == nVar.f() && this.f18519e == nVar.i() && this.f18520f.equals(nVar.c());
    }

    @Override // t2.n
    public final long f() {
        return this.f18518d;
    }

    @Override // t2.n
    public final String h() {
        return this.f18515a;
    }

    public final int hashCode() {
        int hashCode = (this.f18515a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f18516b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j3 = this.f18518d;
        long j10 = this.f18519e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f18517c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f18520f.hashCode();
    }

    @Override // t2.n
    public final long i() {
        return this.f18519e;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("EventInternal{transportName=");
        c10.append(this.f18515a);
        c10.append(", code=");
        c10.append(this.f18516b);
        c10.append(", encodedPayload=");
        c10.append(this.f18517c);
        c10.append(", eventMillis=");
        c10.append(this.f18518d);
        c10.append(", uptimeMillis=");
        c10.append(this.f18519e);
        c10.append(", autoMetadata=");
        c10.append(this.f18520f);
        c10.append("}");
        return c10.toString();
    }
}
