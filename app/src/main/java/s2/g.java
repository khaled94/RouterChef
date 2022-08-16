package s2;

import java.util.List;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: a */
    public final long f17662a;

    /* renamed from: b */
    public final long f17663b;

    /* renamed from: c */
    public final k f17664c;

    /* renamed from: d */
    public final Integer f17665d;

    /* renamed from: e */
    public final String f17666e;

    /* renamed from: f */
    public final List<l> f17667f;

    /* renamed from: g */
    public final p f17668g;

    public g(long j3, long j10, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.f17662a = j3;
        this.f17663b = j10;
        this.f17664c = kVar;
        this.f17665d = num;
        this.f17666e = str;
        this.f17667f = list;
        this.f17668g = pVar;
    }

    @Override // s2.m
    public final k a() {
        return this.f17664c;
    }

    @Override // s2.m
    public final List<l> b() {
        return this.f17667f;
    }

    @Override // s2.m
    public final Integer c() {
        return this.f17665d;
    }

    @Override // s2.m
    public final String d() {
        return this.f17666e;
    }

    @Override // s2.m
    public final p e() {
        return this.f17668g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f17662a == mVar.f() && this.f17663b == mVar.g() && ((kVar = this.f17664c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f17665d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f17666e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f17667f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f17668g;
            p e10 = mVar.e();
            if (pVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (pVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.m
    public final long f() {
        return this.f17662a;
    }

    @Override // s2.m
    public final long g() {
        return this.f17663b;
    }

    public final int hashCode() {
        long j3 = this.f17662a;
        long j10 = this.f17663b;
        int i10 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        k kVar = this.f17664c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f17665d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f17666e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f17667f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f17668g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("LogRequest{requestTimeMs=");
        c10.append(this.f17662a);
        c10.append(", requestUptimeMs=");
        c10.append(this.f17663b);
        c10.append(", clientInfo=");
        c10.append(this.f17664c);
        c10.append(", logSource=");
        c10.append(this.f17665d);
        c10.append(", logSourceName=");
        c10.append(this.f17666e);
        c10.append(", logEvents=");
        c10.append(this.f17667f);
        c10.append(", qosTier=");
        c10.append(this.f17668g);
        c10.append("}");
        return c10.toString();
    }
}
