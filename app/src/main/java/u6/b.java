package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class b extends a0 {

    /* renamed from: b */
    public final String f19270b;

    /* renamed from: c */
    public final String f19271c;

    /* renamed from: d */
    public final int f19272d;

    /* renamed from: e */
    public final String f19273e;

    /* renamed from: f */
    public final String f19274f;

    /* renamed from: g */
    public final String f19275g;

    /* renamed from: h */
    public final a0.e f19276h;

    /* renamed from: i */
    public final a0.d f19277i;

    /* loaded from: classes.dex */
    public static final class a extends a0.b {

        /* renamed from: a */
        public String f19278a;

        /* renamed from: b */
        public String f19279b;

        /* renamed from: c */
        public Integer f19280c;

        /* renamed from: d */
        public String f19281d;

        /* renamed from: e */
        public String f19282e;

        /* renamed from: f */
        public String f19283f;

        /* renamed from: g */
        public a0.e f19284g;

        /* renamed from: h */
        public a0.d f19285h;

        public a() {
        }

        public a(a0 a0Var) {
            this.f19278a = a0Var.g();
            this.f19279b = a0Var.c();
            this.f19280c = Integer.valueOf(a0Var.f());
            this.f19281d = a0Var.d();
            this.f19282e = a0Var.a();
            this.f19283f = a0Var.b();
            this.f19284g = a0Var.h();
            this.f19285h = a0Var.e();
        }

        public final a0 a() {
            String str = this.f19278a == null ? " sdkVersion" : "";
            if (this.f19279b == null) {
                str = d7.a.c(str, " gmpAppId");
            }
            if (this.f19280c == null) {
                str = d7.a.c(str, " platform");
            }
            if (this.f19281d == null) {
                str = d7.a.c(str, " installationUuid");
            }
            if (this.f19282e == null) {
                str = d7.a.c(str, " buildVersion");
            }
            if (this.f19283f == null) {
                str = d7.a.c(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f19278a, this.f19279b, this.f19280c.intValue(), this.f19281d, this.f19282e, this.f19283f, this.f19284g, this.f19285h);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.f19270b = str;
        this.f19271c = str2;
        this.f19272d = i10;
        this.f19273e = str3;
        this.f19274f = str4;
        this.f19275g = str5;
        this.f19276h = eVar;
        this.f19277i = dVar;
    }

    @Override // u6.a0
    public final String a() {
        return this.f19274f;
    }

    @Override // u6.a0
    public final String b() {
        return this.f19275g;
    }

    @Override // u6.a0
    public final String c() {
        return this.f19271c;
    }

    @Override // u6.a0
    public final String d() {
        return this.f19273e;
    }

    @Override // u6.a0
    public final a0.d e() {
        return this.f19277i;
    }

    public final boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f19270b.equals(a0Var.g()) && this.f19271c.equals(a0Var.c()) && this.f19272d == a0Var.f() && this.f19273e.equals(a0Var.d()) && this.f19274f.equals(a0Var.a()) && this.f19275g.equals(a0Var.b()) && ((eVar = this.f19276h) != null ? eVar.equals(a0Var.h()) : a0Var.h() == null)) {
            a0.d dVar = this.f19277i;
            a0.d e10 = a0Var.e();
            if (dVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (dVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    @Override // u6.a0
    public final int f() {
        return this.f19272d;
    }

    @Override // u6.a0
    public final String g() {
        return this.f19270b;
    }

    @Override // u6.a0
    public final a0.e h() {
        return this.f19276h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.f19270b.hashCode() ^ 1000003) * 1000003) ^ this.f19271c.hashCode()) * 1000003) ^ this.f19272d) * 1000003) ^ this.f19273e.hashCode()) * 1000003) ^ this.f19274f.hashCode()) * 1000003) ^ this.f19275g.hashCode()) * 1000003;
        a0.e eVar = this.f19276h;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f19277i;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("CrashlyticsReport{sdkVersion=");
        c10.append(this.f19270b);
        c10.append(", gmpAppId=");
        c10.append(this.f19271c);
        c10.append(", platform=");
        c10.append(this.f19272d);
        c10.append(", installationUuid=");
        c10.append(this.f19273e);
        c10.append(", buildVersion=");
        c10.append(this.f19274f);
        c10.append(", displayVersion=");
        c10.append(this.f19275g);
        c10.append(", session=");
        c10.append(this.f19276h);
        c10.append(", ndkPayload=");
        c10.append(this.f19277i);
        c10.append("}");
        return c10.toString();
    }
}
