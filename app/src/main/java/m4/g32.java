package m4;

/* loaded from: classes.dex */
public final class g32 {

    /* renamed from: a */
    public final long f8730a;

    /* renamed from: b */
    public final long f8731b;

    /* renamed from: c */
    public long f8732c = -9223372036854775807L;

    /* renamed from: d */
    public long f8733d = -9223372036854775807L;

    /* renamed from: f */
    public long f8735f = -9223372036854775807L;

    /* renamed from: g */
    public long f8736g = -9223372036854775807L;

    /* renamed from: j */
    public float f8739j = 0.97f;

    /* renamed from: i */
    public float f8738i = 1.03f;

    /* renamed from: k */
    public float f8740k = 1.0f;

    /* renamed from: l */
    public long f8741l = -9223372036854775807L;

    /* renamed from: e */
    public long f8734e = -9223372036854775807L;

    /* renamed from: h */
    public long f8737h = -9223372036854775807L;

    /* renamed from: m */
    public long f8742m = -9223372036854775807L;

    /* renamed from: n */
    public long f8743n = -9223372036854775807L;

    public /* synthetic */ g32(long j3, long j10) {
        this.f8730a = j3;
        this.f8731b = j10;
    }

    public final long a() {
        return this.f8737h;
    }

    public final void b() {
        long j3 = this.f8737h;
        if (j3 == -9223372036854775807L) {
            return;
        }
        long j10 = j3 + this.f8731b;
        this.f8737h = j10;
        long j11 = this.f8736g;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.f8737h = j11;
        }
        this.f8741l = -9223372036854775807L;
    }

    public final void c() {
        long j3 = this.f8732c;
        if (j3 != -9223372036854775807L) {
            long j10 = this.f8733d;
            if (j10 != -9223372036854775807L) {
                j3 = j10;
            }
            long j11 = this.f8735f;
            if (j11 != -9223372036854775807L && j3 < j11) {
                j3 = j11;
            }
            long j12 = this.f8736g;
            if (j12 != -9223372036854775807L && j3 > j12) {
                j3 = j12;
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f8734e == j3) {
            return;
        }
        this.f8734e = j3;
        this.f8737h = j3;
        this.f8742m = -9223372036854775807L;
        this.f8743n = -9223372036854775807L;
        this.f8741l = -9223372036854775807L;
    }
}
