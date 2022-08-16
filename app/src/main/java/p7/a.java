package p7;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: a */
    public final String f16965a;

    /* renamed from: b */
    public final long f16966b;

    /* renamed from: c */
    public final long f16967c;

    public a(String str, long j3, long j10) {
        this.f16965a = str;
        this.f16966b = j3;
        this.f16967c = j10;
    }

    @Override // p7.j
    public final String a() {
        return this.f16965a;
    }

    @Override // p7.j
    public final long b() {
        return this.f16967c;
    }

    @Override // p7.j
    public final long c() {
        return this.f16966b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f16965a.equals(jVar.a()) && this.f16966b == jVar.c() && this.f16967c == jVar.b();
    }

    public final int hashCode() {
        long j3 = this.f16966b;
        long j10 = this.f16967c;
        return ((((this.f16965a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("InstallationTokenResult{token=");
        c10.append(this.f16965a);
        c10.append(", tokenExpirationTimestamp=");
        c10.append(this.f16966b);
        c10.append(", tokenCreationTimestamp=");
        c10.append(this.f16967c);
        c10.append("}");
        return c10.toString();
    }
}
