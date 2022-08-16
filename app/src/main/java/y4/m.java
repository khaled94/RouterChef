package y4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final String f20559a;

    /* renamed from: b */
    public final String f20560b;

    /* renamed from: c */
    public final long f20561c;

    /* renamed from: d */
    public final long f20562d;

    /* renamed from: e */
    public final long f20563e;

    /* renamed from: f */
    public final long f20564f;

    /* renamed from: g */
    public final long f20565g;

    /* renamed from: h */
    public final Long f20566h;

    /* renamed from: i */
    public final Long f20567i;

    /* renamed from: j */
    public final Long f20568j;

    /* renamed from: k */
    public final Boolean f20569k;

    public m(String str, String str2, long j3, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        d4.m.e(str);
        d4.m.e(str2);
        boolean z10 = true;
        d4.m.a(j3 >= 0);
        d4.m.a(j10 >= 0);
        d4.m.a(j11 >= 0);
        d4.m.a(j13 < 0 ? false : z10);
        this.f20559a = str;
        this.f20560b = str2;
        this.f20561c = j3;
        this.f20562d = j10;
        this.f20563e = j11;
        this.f20564f = j12;
        this.f20565g = j13;
        this.f20566h = l10;
        this.f20567i = l11;
        this.f20568j = l12;
        this.f20569k = bool;
    }

    public final m a(Long l10, Long l11, Boolean bool) {
        return new m(this.f20559a, this.f20560b, this.f20561c, this.f20562d, this.f20563e, this.f20564f, this.f20565g, this.f20566h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final m b(long j3, long j10) {
        return new m(this.f20559a, this.f20560b, this.f20561c, this.f20562d, this.f20563e, this.f20564f, j3, Long.valueOf(j10), this.f20567i, this.f20568j, this.f20569k);
    }

    public final m c(long j3) {
        return new m(this.f20559a, this.f20560b, this.f20561c, this.f20562d, this.f20563e, j3, this.f20565g, this.f20566h, this.f20567i, this.f20568j, this.f20569k);
    }
}
