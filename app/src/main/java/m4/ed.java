package m4;

/* loaded from: classes.dex */
public final class ed implements bd {

    /* renamed from: a */
    public final rg f7788a;

    /* renamed from: b */
    public final int f7789b;

    /* renamed from: c */
    public final int f7790c;

    /* renamed from: d */
    public int f7791d;

    /* renamed from: e */
    public int f7792e;

    public ed(yc ycVar) {
        rg rgVar = ycVar.P0;
        this.f7788a = rgVar;
        rgVar.n(12);
        this.f7790c = rgVar.d() & 255;
        this.f7789b = rgVar.d();
    }

    @Override // m4.bd
    public final int a() {
        int i10 = this.f7790c;
        if (i10 == 8) {
            return this.f7788a.c();
        }
        if (i10 == 16) {
            return this.f7788a.e();
        }
        int i11 = this.f7791d;
        this.f7791d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f7792e & 15;
        }
        int c10 = this.f7788a.c();
        this.f7792e = c10;
        return (c10 & 240) >> 4;
    }

    @Override // m4.bd
    public final boolean c() {
        return false;
    }

    @Override // m4.bd
    public final int zza() {
        return this.f7789b;
    }
}
