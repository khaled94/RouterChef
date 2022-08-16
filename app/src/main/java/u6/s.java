package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class s extends a0.e.d.c {

    /* renamed from: a */
    public final Double f19423a;

    /* renamed from: b */
    public final int f19424b;

    /* renamed from: c */
    public final boolean f19425c;

    /* renamed from: d */
    public final int f19426d;

    /* renamed from: e */
    public final long f19427e;

    /* renamed from: f */
    public final long f19428f;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.d.c.a {

        /* renamed from: a */
        public Double f19429a;

        /* renamed from: b */
        public Integer f19430b;

        /* renamed from: c */
        public Boolean f19431c;

        /* renamed from: d */
        public Integer f19432d;

        /* renamed from: e */
        public Long f19433e;

        /* renamed from: f */
        public Long f19434f;

        public final a0.e.d.c a() {
            String str = this.f19430b == null ? " batteryVelocity" : "";
            if (this.f19431c == null) {
                str = d7.a.c(str, " proximityOn");
            }
            if (this.f19432d == null) {
                str = d7.a.c(str, " orientation");
            }
            if (this.f19433e == null) {
                str = d7.a.c(str, " ramUsed");
            }
            if (this.f19434f == null) {
                str = d7.a.c(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new s(this.f19429a, this.f19430b.intValue(), this.f19431c.booleanValue(), this.f19432d.intValue(), this.f19433e.longValue(), this.f19434f.longValue());
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public s(Double d5, int i10, boolean z10, int i11, long j3, long j10) {
        this.f19423a = d5;
        this.f19424b = i10;
        this.f19425c = z10;
        this.f19426d = i11;
        this.f19427e = j3;
        this.f19428f = j10;
    }

    @Override // u6.a0.e.d.c
    public final Double a() {
        return this.f19423a;
    }

    @Override // u6.a0.e.d.c
    public final int b() {
        return this.f19424b;
    }

    @Override // u6.a0.e.d.c
    public final long c() {
        return this.f19428f;
    }

    @Override // u6.a0.e.d.c
    public final int d() {
        return this.f19426d;
    }

    @Override // u6.a0.e.d.c
    public final long e() {
        return this.f19427e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.c)) {
            return false;
        }
        a0.e.d.c cVar = (a0.e.d.c) obj;
        Double d5 = this.f19423a;
        if (d5 != null ? d5.equals(cVar.a()) : cVar.a() == null) {
            if (this.f19424b == cVar.b() && this.f19425c == cVar.f() && this.f19426d == cVar.d() && this.f19427e == cVar.e() && this.f19428f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // u6.a0.e.d.c
    public final boolean f() {
        return this.f19425c;
    }

    public final int hashCode() {
        Double d5 = this.f19423a;
        int hashCode = ((((d5 == null ? 0 : d5.hashCode()) ^ 1000003) * 1000003) ^ this.f19424b) * 1000003;
        int i10 = this.f19425c ? 1231 : 1237;
        long j3 = this.f19427e;
        long j10 = this.f19428f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.f19426d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Device{batteryLevel=");
        c10.append(this.f19423a);
        c10.append(", batteryVelocity=");
        c10.append(this.f19424b);
        c10.append(", proximityOn=");
        c10.append(this.f19425c);
        c10.append(", orientation=");
        c10.append(this.f19426d);
        c10.append(", ramUsed=");
        c10.append(this.f19427e);
        c10.append(", diskUsed=");
        c10.append(this.f19428f);
        c10.append("}");
        return c10.toString();
    }
}
