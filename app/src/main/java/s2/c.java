package s2;

import androidx.activity.result.a;
import s.b;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a */
    public final Integer f17633a;

    /* renamed from: b */
    public final String f17634b;

    /* renamed from: c */
    public final String f17635c;

    /* renamed from: d */
    public final String f17636d;

    /* renamed from: e */
    public final String f17637e;

    /* renamed from: f */
    public final String f17638f;

    /* renamed from: g */
    public final String f17639g;

    /* renamed from: h */
    public final String f17640h;

    /* renamed from: i */
    public final String f17641i;

    /* renamed from: j */
    public final String f17642j;

    /* renamed from: k */
    public final String f17643k;

    /* renamed from: l */
    public final String f17644l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f17633a = num;
        this.f17634b = str;
        this.f17635c = str2;
        this.f17636d = str3;
        this.f17637e = str4;
        this.f17638f = str5;
        this.f17639g = str6;
        this.f17640h = str7;
        this.f17641i = str8;
        this.f17642j = str9;
        this.f17643k = str10;
        this.f17644l = str11;
    }

    @Override // s2.a
    public final String a() {
        return this.f17644l;
    }

    @Override // s2.a
    public final String b() {
        return this.f17642j;
    }

    @Override // s2.a
    public final String c() {
        return this.f17636d;
    }

    @Override // s2.a
    public final String d() {
        return this.f17640h;
    }

    @Override // s2.a
    public final String e() {
        return this.f17635c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f17633a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f17634b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f17635c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f17636d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f17637e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f17638f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f17639g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f17640h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f17641i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f17642j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f17643k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f17644l;
                                                    String a10 = aVar.a();
                                                    if (str11 == null) {
                                                        if (a10 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(a10)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // s2.a
    public final String f() {
        return this.f17641i;
    }

    @Override // s2.a
    public final String g() {
        return this.f17639g;
    }

    @Override // s2.a
    public final String h() {
        return this.f17643k;
    }

    public final int hashCode() {
        Integer num = this.f17633a;
        int i10 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f17634b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f17635c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17636d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f17637e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f17638f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f17639g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f17640h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f17641i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f17642j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f17643k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f17644l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode11 ^ i10;
    }

    @Override // s2.a
    public final String i() {
        return this.f17634b;
    }

    @Override // s2.a
    public final String j() {
        return this.f17638f;
    }

    @Override // s2.a
    public final String k() {
        return this.f17637e;
    }

    @Override // s2.a
    public final Integer l() {
        return this.f17633a;
    }

    public final String toString() {
        StringBuilder c10 = a.c("AndroidClientInfo{sdkVersion=");
        c10.append(this.f17633a);
        c10.append(", model=");
        c10.append(this.f17634b);
        c10.append(", hardware=");
        c10.append(this.f17635c);
        c10.append(", device=");
        c10.append(this.f17636d);
        c10.append(", product=");
        c10.append(this.f17637e);
        c10.append(", osBuild=");
        c10.append(this.f17638f);
        c10.append(", manufacturer=");
        c10.append(this.f17639g);
        c10.append(", fingerprint=");
        c10.append(this.f17640h);
        c10.append(", locale=");
        c10.append(this.f17641i);
        c10.append(", country=");
        c10.append(this.f17642j);
        c10.append(", mccMnc=");
        c10.append(this.f17643k);
        c10.append(", applicationBuild=");
        return b.b(c10, this.f17644l, "}");
    }
}
