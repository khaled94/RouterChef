package u6;

import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class c extends a0.a {

    /* renamed from: a */
    public final int f19287a;

    /* renamed from: b */
    public final String f19288b;

    /* renamed from: c */
    public final int f19289c;

    /* renamed from: d */
    public final int f19290d;

    /* renamed from: e */
    public final long f19291e;

    /* renamed from: f */
    public final long f19292f;

    /* renamed from: g */
    public final long f19293g;

    /* renamed from: h */
    public final String f19294h;

    /* loaded from: classes.dex */
    public static final class a extends a0.a.AbstractC0126a {

        /* renamed from: a */
        public Integer f19295a;

        /* renamed from: b */
        public String f19296b;

        /* renamed from: c */
        public Integer f19297c;

        /* renamed from: d */
        public Integer f19298d;

        /* renamed from: e */
        public Long f19299e;

        /* renamed from: f */
        public Long f19300f;

        /* renamed from: g */
        public Long f19301g;

        /* renamed from: h */
        public String f19302h;

        public final a0.a a() {
            String str = this.f19295a == null ? " pid" : "";
            if (this.f19296b == null) {
                str = d7.a.c(str, " processName");
            }
            if (this.f19297c == null) {
                str = d7.a.c(str, " reasonCode");
            }
            if (this.f19298d == null) {
                str = d7.a.c(str, " importance");
            }
            if (this.f19299e == null) {
                str = d7.a.c(str, " pss");
            }
            if (this.f19300f == null) {
                str = d7.a.c(str, " rss");
            }
            if (this.f19301g == null) {
                str = d7.a.c(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f19295a.intValue(), this.f19296b, this.f19297c.intValue(), this.f19298d.intValue(), this.f19299e.longValue(), this.f19300f.longValue(), this.f19301g.longValue(), this.f19302h);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public c(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2) {
        this.f19287a = i10;
        this.f19288b = str;
        this.f19289c = i11;
        this.f19290d = i12;
        this.f19291e = j3;
        this.f19292f = j10;
        this.f19293g = j11;
        this.f19294h = str2;
    }

    @Override // u6.a0.a
    public final int a() {
        return this.f19290d;
    }

    @Override // u6.a0.a
    public final int b() {
        return this.f19287a;
    }

    @Override // u6.a0.a
    public final String c() {
        return this.f19288b;
    }

    @Override // u6.a0.a
    public final long d() {
        return this.f19291e;
    }

    @Override // u6.a0.a
    public final int e() {
        return this.f19289c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        if (this.f19287a == aVar.b() && this.f19288b.equals(aVar.c()) && this.f19289c == aVar.e() && this.f19290d == aVar.a() && this.f19291e == aVar.d() && this.f19292f == aVar.f() && this.f19293g == aVar.g()) {
            String str = this.f19294h;
            String h10 = aVar.h();
            if (str == null) {
                if (h10 == null) {
                    return true;
                }
            } else if (str.equals(h10)) {
                return true;
            }
        }
        return false;
    }

    @Override // u6.a0.a
    public final long f() {
        return this.f19292f;
    }

    @Override // u6.a0.a
    public final long g() {
        return this.f19293g;
    }

    @Override // u6.a0.a
    public final String h() {
        return this.f19294h;
    }

    public final int hashCode() {
        long j3 = this.f19291e;
        long j10 = this.f19292f;
        long j11 = this.f19293g;
        int hashCode = (((((((((((((this.f19287a ^ 1000003) * 1000003) ^ this.f19288b.hashCode()) * 1000003) ^ this.f19289c) * 1000003) ^ this.f19290d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f19294h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("ApplicationExitInfo{pid=");
        c10.append(this.f19287a);
        c10.append(", processName=");
        c10.append(this.f19288b);
        c10.append(", reasonCode=");
        c10.append(this.f19289c);
        c10.append(", importance=");
        c10.append(this.f19290d);
        c10.append(", pss=");
        c10.append(this.f19291e);
        c10.append(", rss=");
        c10.append(this.f19292f);
        c10.append(", timestamp=");
        c10.append(this.f19293g);
        c10.append(", traceFile=");
        return b.b(c10, this.f19294h, "}");
    }
}
