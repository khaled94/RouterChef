package u6;

import androidx.activity.result.a;
import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class h extends a0.e.a {

    /* renamed from: a */
    public final String f19333a;

    /* renamed from: b */
    public final String f19334b;

    /* renamed from: c */
    public final String f19335c;

    /* renamed from: d */
    public final a0.e.a.AbstractC0128a f19336d = null;

    /* renamed from: e */
    public final String f19337e;

    /* renamed from: f */
    public final String f19338f;

    /* renamed from: g */
    public final String f19339g;

    public h(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f19333a = str;
        this.f19334b = str2;
        this.f19335c = str3;
        this.f19337e = str4;
        this.f19338f = str5;
        this.f19339g = str6;
    }

    @Override // u6.a0.e.a
    public final String a() {
        return this.f19338f;
    }

    @Override // u6.a0.e.a
    public final String b() {
        return this.f19339g;
    }

    @Override // u6.a0.e.a
    public final String c() {
        return this.f19335c;
    }

    @Override // u6.a0.e.a
    public final String d() {
        return this.f19333a;
    }

    @Override // u6.a0.e.a
    public final String e() {
        return this.f19337e;
    }

    public final boolean equals(Object obj) {
        String str;
        a0.e.a.AbstractC0128a abstractC0128a;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.a)) {
            return false;
        }
        a0.e.a aVar = (a0.e.a) obj;
        if (this.f19333a.equals(aVar.d()) && this.f19334b.equals(aVar.g()) && ((str = this.f19335c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((abstractC0128a = this.f19336d) != null ? abstractC0128a.equals(aVar.f()) : aVar.f() == null) && ((str2 = this.f19337e) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f19338f) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
            String str4 = this.f19339g;
            String b10 = aVar.b();
            if (str4 == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str4.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // u6.a0.e.a
    public final a0.e.a.AbstractC0128a f() {
        return this.f19336d;
    }

    @Override // u6.a0.e.a
    public final String g() {
        return this.f19334b;
    }

    public final int hashCode() {
        int hashCode = (((this.f19333a.hashCode() ^ 1000003) * 1000003) ^ this.f19334b.hashCode()) * 1000003;
        String str = this.f19335c;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.AbstractC0128a abstractC0128a = this.f19336d;
        int hashCode3 = (hashCode2 ^ (abstractC0128a == null ? 0 : abstractC0128a.hashCode())) * 1000003;
        String str2 = this.f19337e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19338f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f19339g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = a.c("Application{identifier=");
        c10.append(this.f19333a);
        c10.append(", version=");
        c10.append(this.f19334b);
        c10.append(", displayVersion=");
        c10.append(this.f19335c);
        c10.append(", organization=");
        c10.append(this.f19336d);
        c10.append(", installationUuid=");
        c10.append(this.f19337e);
        c10.append(", developmentPlatform=");
        c10.append(this.f19338f);
        c10.append(", developmentPlatformVersion=");
        return b.b(c10, this.f19339g, "}");
    }
}
