package m4;

/* loaded from: classes.dex */
public final class ed0 implements le2 {

    /* renamed from: a */
    public final pm2 f7793a = new pm2();

    /* renamed from: b */
    public long f7794b = 15000000;

    /* renamed from: c */
    public long f7795c = 30000000;

    /* renamed from: d */
    public long f7796d = 2500000;

    /* renamed from: e */
    public long f7797e = 5000000;

    /* renamed from: f */
    public int f7798f;

    /* renamed from: g */
    public boolean f7799g;

    @Override // m4.le2
    public final void a() {
        i(false);
    }

    @Override // m4.le2
    public final void b() {
    }

    @Override // m4.le2
    public final void c() {
        i(true);
    }

    @Override // m4.le2
    public final boolean d(long j3, float f10) {
        boolean z10 = true;
        boolean z11 = j3 > this.f7795c ? false : j3 < this.f7794b ? true : true;
        int a10 = this.f7793a.a();
        int i10 = this.f7798f;
        if (!z11 && (!z11 || !this.f7799g || a10 >= i10)) {
            z10 = false;
        }
        this.f7799g = z10;
        return z10;
    }

    @Override // m4.le2
    public final boolean e(long j3, float f10, boolean z10, long j10) {
        long j11 = z10 ? this.f7797e : this.f7796d;
        return j11 <= 0 || j3 >= j11;
    }

    @Override // m4.le2
    public final pm2 f() {
        return this.f7793a;
    }

    @Override // m4.le2
    public final void g() {
        i(true);
    }

    @Override // m4.le2
    public final void h(ff2[] ff2VarArr, kl2[] kl2VarArr) {
        this.f7798f = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            if (kl2VarArr[i10] != null) {
                this.f7798f += ff2VarArr[i10].a() != 1 ? 131072000 : 13107200;
            }
        }
        this.f7793a.c(this.f7798f);
    }

    public final void i(boolean z10) {
        this.f7798f = 0;
        this.f7799g = false;
        if (z10) {
            pm2 pm2Var = this.f7793a;
            synchronized (pm2Var) {
                pm2Var.c(0);
            }
        }
    }

    @Override // m4.le2
    public final long zza() {
        return 0L;
    }
}
