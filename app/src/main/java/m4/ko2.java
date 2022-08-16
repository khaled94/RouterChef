package m4;

/* loaded from: classes.dex */
public final class ko2 {

    /* renamed from: a */
    public final long f10513a;

    /* renamed from: b */
    public final long f10514b;

    /* renamed from: c */
    public final long f10515c;

    /* renamed from: d */
    public long f10516d = 0;

    /* renamed from: e */
    public long f10517e;

    /* renamed from: f */
    public long f10518f;

    /* renamed from: g */
    public long f10519g;

    /* renamed from: h */
    public long f10520h;

    public ko2(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f10513a = j3;
        this.f10514b = j10;
        this.f10517e = j11;
        this.f10518f = j12;
        this.f10519g = j13;
        this.f10515c = j14;
        this.f10520h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j3, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (((float) (j13 - j12)) / ((float) (j11 - j10))) * ((float) (j3 - j10));
        return ls1.u(((j12 + j15) - j14) - (j15 / 20), j12, (-1) + j13);
    }
}
