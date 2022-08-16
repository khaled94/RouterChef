package m4;

/* loaded from: classes.dex */
public final class gc implements nc {

    /* renamed from: a */
    public final long[] f8818a;

    /* renamed from: b */
    public final long[] f8819b;

    /* renamed from: c */
    public final long f8820c;

    public gc(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8818a = jArr;
        this.f8819b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f8820c = 0L;
            return;
        }
        int i10 = length - 1;
        this.f8820c = jArr2[i10] + jArr3[i10];
    }

    @Override // m4.nc
    public final long a(long j3) {
        return this.f8818a[wg.b(this.f8819b, j3, true)];
    }

    @Override // m4.nc
    public final boolean c() {
        return true;
    }

    @Override // m4.nc
    public final long zza() {
        return this.f8820c;
    }
}
