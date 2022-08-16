package u6;

import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class j extends a0.e.c {

    /* renamed from: a */
    public final int f19340a;

    /* renamed from: b */
    public final String f19341b;

    /* renamed from: c */
    public final int f19342c;

    /* renamed from: d */
    public final long f19343d;

    /* renamed from: e */
    public final long f19344e;

    /* renamed from: f */
    public final boolean f19345f;

    /* renamed from: g */
    public final int f19346g;

    /* renamed from: h */
    public final String f19347h;

    /* renamed from: i */
    public final String f19348i;

    /* loaded from: classes.dex */
    public static final class a extends a0.e.c.a {

        /* renamed from: a */
        public Integer f19349a;

        /* renamed from: b */
        public String f19350b;

        /* renamed from: c */
        public Integer f19351c;

        /* renamed from: d */
        public Long f19352d;

        /* renamed from: e */
        public Long f19353e;

        /* renamed from: f */
        public Boolean f19354f;

        /* renamed from: g */
        public Integer f19355g;

        /* renamed from: h */
        public String f19356h;

        /* renamed from: i */
        public String f19357i;

        public final a0.e.c a() {
            String str = this.f19349a == null ? " arch" : "";
            if (this.f19350b == null) {
                str = d7.a.c(str, " model");
            }
            if (this.f19351c == null) {
                str = d7.a.c(str, " cores");
            }
            if (this.f19352d == null) {
                str = d7.a.c(str, " ram");
            }
            if (this.f19353e == null) {
                str = d7.a.c(str, " diskSpace");
            }
            if (this.f19354f == null) {
                str = d7.a.c(str, " simulator");
            }
            if (this.f19355g == null) {
                str = d7.a.c(str, " state");
            }
            if (this.f19356h == null) {
                str = d7.a.c(str, " manufacturer");
            }
            if (this.f19357i == null) {
                str = d7.a.c(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new j(this.f19349a.intValue(), this.f19350b, this.f19351c.intValue(), this.f19352d.longValue(), this.f19353e.longValue(), this.f19354f.booleanValue(), this.f19355g.intValue(), this.f19356h, this.f19357i);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public j(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f19340a = i10;
        this.f19341b = str;
        this.f19342c = i11;
        this.f19343d = j3;
        this.f19344e = j10;
        this.f19345f = z10;
        this.f19346g = i12;
        this.f19347h = str2;
        this.f19348i = str3;
    }

    @Override // u6.a0.e.c
    public final int a() {
        return this.f19340a;
    }

    @Override // u6.a0.e.c
    public final int b() {
        return this.f19342c;
    }

    @Override // u6.a0.e.c
    public final long c() {
        return this.f19344e;
    }

    @Override // u6.a0.e.c
    public final String d() {
        return this.f19347h;
    }

    @Override // u6.a0.e.c
    public final String e() {
        return this.f19341b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.c)) {
            return false;
        }
        a0.e.c cVar = (a0.e.c) obj;
        return this.f19340a == cVar.a() && this.f19341b.equals(cVar.e()) && this.f19342c == cVar.b() && this.f19343d == cVar.g() && this.f19344e == cVar.c() && this.f19345f == cVar.i() && this.f19346g == cVar.h() && this.f19347h.equals(cVar.d()) && this.f19348i.equals(cVar.f());
    }

    @Override // u6.a0.e.c
    public final String f() {
        return this.f19348i;
    }

    @Override // u6.a0.e.c
    public final long g() {
        return this.f19343d;
    }

    @Override // u6.a0.e.c
    public final int h() {
        return this.f19346g;
    }

    public final int hashCode() {
        long j3 = this.f19343d;
        long j10 = this.f19344e;
        return ((((((((((((((((this.f19340a ^ 1000003) * 1000003) ^ this.f19341b.hashCode()) * 1000003) ^ this.f19342c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f19345f ? 1231 : 1237)) * 1000003) ^ this.f19346g) * 1000003) ^ this.f19347h.hashCode()) * 1000003) ^ this.f19348i.hashCode();
    }

    @Override // u6.a0.e.c
    public final boolean i() {
        return this.f19345f;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Device{arch=");
        c10.append(this.f19340a);
        c10.append(", model=");
        c10.append(this.f19341b);
        c10.append(", cores=");
        c10.append(this.f19342c);
        c10.append(", ram=");
        c10.append(this.f19343d);
        c10.append(", diskSpace=");
        c10.append(this.f19344e);
        c10.append(", simulator=");
        c10.append(this.f19345f);
        c10.append(", state=");
        c10.append(this.f19346g);
        c10.append(", manufacturer=");
        c10.append(this.f19347h);
        c10.append(", modelClass=");
        return b.b(c10, this.f19348i, "}");
    }
}
