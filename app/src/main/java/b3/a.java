package b3;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b */
    public final long f2484b;

    /* renamed from: c */
    public final int f2485c;

    /* renamed from: d */
    public final int f2486d;

    /* renamed from: e */
    public final long f2487e;

    /* renamed from: f */
    public final int f2488f;

    public a(long j3, int i10, int i11, long j10, int i12) {
        this.f2484b = j3;
        this.f2485c = i10;
        this.f2486d = i11;
        this.f2487e = j10;
        this.f2488f = i12;
    }

    @Override // b3.e
    public final int a() {
        return this.f2486d;
    }

    @Override // b3.e
    public final long b() {
        return this.f2487e;
    }

    @Override // b3.e
    public final int c() {
        return this.f2485c;
    }

    @Override // b3.e
    public final int d() {
        return this.f2488f;
    }

    @Override // b3.e
    public final long e() {
        return this.f2484b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2484b == eVar.e() && this.f2485c == eVar.c() && this.f2486d == eVar.a() && this.f2487e == eVar.b() && this.f2488f == eVar.d();
    }

    public final int hashCode() {
        long j3 = this.f2484b;
        long j10 = this.f2487e;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f2485c) * 1000003) ^ this.f2486d) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f2488f;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("EventStoreConfig{maxStorageSizeInBytes=");
        c10.append(this.f2484b);
        c10.append(", loadBatchSize=");
        c10.append(this.f2485c);
        c10.append(", criticalSectionEnterTimeoutMs=");
        c10.append(this.f2486d);
        c10.append(", eventCleanUpAge=");
        c10.append(this.f2487e);
        c10.append(", maxBlobByteSizePerRow=");
        c10.append(this.f2488f);
        c10.append("}");
        return c10.toString();
    }
}
