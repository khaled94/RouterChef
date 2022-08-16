package m4;

import l0.d;

/* loaded from: classes.dex */
public final class e3 implements d3 {

    /* renamed from: a */
    public final vo2 f7705a;

    /* renamed from: b */
    public final mp2 f7706b;

    /* renamed from: c */
    public final g3 f7707c;

    /* renamed from: d */
    public final t f7708d;

    /* renamed from: e */
    public final int f7709e;

    /* renamed from: f */
    public long f7710f;

    /* renamed from: g */
    public int f7711g;

    /* renamed from: h */
    public long f7712h;

    public e3(vo2 vo2Var, mp2 mp2Var, g3 g3Var, String str, int i10) {
        this.f7705a = vo2Var;
        this.f7706b = mp2Var;
        this.f7707c = g3Var;
        int i11 = (g3Var.f8720b * g3Var.f8723e) / 8;
        int i12 = g3Var.f8722d;
        if (i12 == i11) {
            int i13 = g3Var.f8721c * i11;
            int i14 = i13 * 8;
            int max = Math.max(i11, i13 / 10);
            this.f7709e = max;
            kq2 kq2Var = new kq2();
            kq2Var.f10542j = str;
            kq2Var.f10537e = i14;
            kq2Var.f10538f = i14;
            kq2Var.f10543k = max;
            kq2Var.f10554w = g3Var.f8720b;
            kq2Var.f10555x = g3Var.f8721c;
            kq2Var.y = i10;
            this.f7708d = new t(kq2Var);
            return;
        }
        throw mq.a(d.a(50, "Expected block size: ", i11, "; got: ", i12), null);
    }

    @Override // m4.d3
    public final void a(long j3) {
        this.f7710f = j3;
        this.f7711g = 0;
        this.f7712h = 0L;
    }

    @Override // m4.d3
    public final void b(int i10, long j3) {
        this.f7705a.l(new i3(this.f7707c, 1, i10, j3));
        this.f7706b.f(this.f7708d);
    }

    @Override // m4.d3
    public final boolean c(uo2 uo2Var, long j3) {
        int i10;
        g3 g3Var;
        int i11;
        int i12;
        long j10 = j3;
        while (true) {
            i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.f7711g) >= (i12 = this.f7709e)) {
                break;
            }
            int a10 = this.f7706b.a(uo2Var, (int) Math.min(i12 - i11, j10), true);
            if (a10 == -1) {
                j10 = 0;
            } else {
                this.f7711g += a10;
                j10 -= a10;
            }
        }
        int i13 = this.f7707c.f8722d;
        int i14 = this.f7711g / i13;
        if (i14 > 0) {
            long j11 = this.f7710f;
            long w10 = ls1.w(this.f7712h, 1000000L, g3Var.f8721c);
            int i15 = i14 * i13;
            int i16 = this.f7711g - i15;
            this.f7706b.e(j11 + w10, 1, i15, i16, null);
            this.f7712h += i14;
            this.f7711g = i16;
        }
        return i10 <= 0;
    }
}
