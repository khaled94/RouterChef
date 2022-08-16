package r7;

import r7.e;
import s.b;
import s.h;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b */
    public final String f17261b;

    /* renamed from: c */
    public final int f17262c;

    /* renamed from: d */
    public final String f17263d;

    /* renamed from: e */
    public final String f17264e;

    /* renamed from: f */
    public final long f17265f;

    /* renamed from: g */
    public final long f17266g;

    /* renamed from: h */
    public final String f17267h;

    /* renamed from: r7.a$a */
    /* loaded from: classes.dex */
    public static final class C0109a extends e.a {

        /* renamed from: a */
        public String f17268a;

        /* renamed from: b */
        public int f17269b;

        /* renamed from: c */
        public String f17270c;

        /* renamed from: d */
        public String f17271d;

        /* renamed from: e */
        public Long f17272e;

        /* renamed from: f */
        public Long f17273f;

        /* renamed from: g */
        public String f17274g;

        public C0109a() {
        }

        public C0109a(e eVar) {
            this.f17268a = eVar.c();
            this.f17269b = eVar.f();
            this.f17270c = eVar.a();
            this.f17271d = eVar.e();
            this.f17272e = Long.valueOf(eVar.b());
            this.f17273f = Long.valueOf(eVar.g());
            this.f17274g = eVar.d();
        }

        public final e a() {
            String str = this.f17269b == 0 ? " registrationStatus" : "";
            if (this.f17272e == null) {
                str = d7.a.c(str, " expiresInSecs");
            }
            if (this.f17273f == null) {
                str = d7.a.c(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f17268a, this.f17269b, this.f17270c, this.f17271d, this.f17272e.longValue(), this.f17273f.longValue(), this.f17274g);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        public final e.a b(long j3) {
            this.f17272e = Long.valueOf(j3);
            return this;
        }

        public final e.a c(int i10) {
            if (i10 != 0) {
                this.f17269b = i10;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public final e.a d(long j3) {
            this.f17273f = Long.valueOf(j3);
            return this;
        }
    }

    public a(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f17261b = str;
        this.f17262c = i10;
        this.f17263d = str2;
        this.f17264e = str3;
        this.f17265f = j3;
        this.f17266g = j10;
        this.f17267h = str4;
    }

    @Override // r7.e
    public final String a() {
        return this.f17263d;
    }

    @Override // r7.e
    public final long b() {
        return this.f17265f;
    }

    @Override // r7.e
    public final String c() {
        return this.f17261b;
    }

    @Override // r7.e
    public final String d() {
        return this.f17267h;
    }

    @Override // r7.e
    public final String e() {
        return this.f17264e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str3 = this.f17261b;
        if (str3 != null ? str3.equals(eVar.c()) : eVar.c() == null) {
            if (h.a(this.f17262c, eVar.f()) && ((str = this.f17263d) != null ? str.equals(eVar.a()) : eVar.a() == null) && ((str2 = this.f17264e) != null ? str2.equals(eVar.e()) : eVar.e() == null) && this.f17265f == eVar.b() && this.f17266g == eVar.g()) {
                String str4 = this.f17267h;
                String d5 = eVar.d();
                if (str4 == null) {
                    if (d5 == null) {
                        return true;
                    }
                } else if (str4.equals(d5)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // r7.e
    public final int f() {
        return this.f17262c;
    }

    @Override // r7.e
    public final long g() {
        return this.f17266g;
    }

    public final int hashCode() {
        String str = this.f17261b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ h.b(this.f17262c)) * 1000003;
        String str2 = this.f17263d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17264e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j3 = this.f17265f;
        long j10 = this.f17266g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f17267h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("PersistedInstallationEntry{firebaseInstallationId=");
        c10.append(this.f17261b);
        c10.append(", registrationStatus=");
        c10.append(c.c(this.f17262c));
        c10.append(", authToken=");
        c10.append(this.f17263d);
        c10.append(", refreshToken=");
        c10.append(this.f17264e);
        c10.append(", expiresInSecs=");
        c10.append(this.f17265f);
        c10.append(", tokenCreationEpochInSecs=");
        c10.append(this.f17266g);
        c10.append(", fisError=");
        return b.b(c10, this.f17267h, "}");
    }
}
