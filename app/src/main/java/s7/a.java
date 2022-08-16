package s7;

import c1.e;
import s.h;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a */
    public final String f18347a;

    /* renamed from: b */
    public final String f18348b;

    /* renamed from: c */
    public final String f18349c;

    /* renamed from: d */
    public final f f18350d;

    /* renamed from: e */
    public final int f18351e;

    public a(String str, String str2, String str3, f fVar, int i10) {
        this.f18347a = str;
        this.f18348b = str2;
        this.f18349c = str3;
        this.f18350d = fVar;
        this.f18351e = i10;
    }

    @Override // s7.d
    public final f a() {
        return this.f18350d;
    }

    @Override // s7.d
    public final String b() {
        return this.f18348b;
    }

    @Override // s7.d
    public final String c() {
        return this.f18349c;
    }

    @Override // s7.d
    public final int d() {
        return this.f18351e;
    }

    @Override // s7.d
    public final String e() {
        return this.f18347a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f18347a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f18348b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f18349c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f18350d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i10 = this.f18351e;
                        int d5 = dVar.d();
                        if (i10 == 0) {
                            if (d5 == 0) {
                                return true;
                            }
                        } else if (h.a(i10, d5)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18347a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f18348b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18349c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f18350d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        int i11 = this.f18351e;
        if (i11 != 0) {
            i10 = h.b(i11);
        }
        return hashCode4 ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("InstallationResponse{uri=");
        c10.append(this.f18347a);
        c10.append(", fid=");
        c10.append(this.f18348b);
        c10.append(", refreshToken=");
        c10.append(this.f18349c);
        c10.append(", authToken=");
        c10.append(this.f18350d);
        c10.append(", responseCode=");
        c10.append(e.a(this.f18351e));
        c10.append("}");
        return c10.toString();
    }
}
