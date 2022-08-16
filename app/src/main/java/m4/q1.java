package m4;

/* loaded from: classes.dex */
public final class q1 implements to2 {

    /* renamed from: c */
    public final dd f12670c;

    /* renamed from: d */
    public final nl1 f12671d;

    /* renamed from: e */
    public vo2 f12672e;

    /* renamed from: f */
    public long f12673f;

    /* renamed from: h */
    public boolean f12675h;

    /* renamed from: i */
    public boolean f12676i;

    /* renamed from: a */
    public final r1 f12668a = new r1(true, null);

    /* renamed from: b */
    public final dd f12669b = new dd(2048);

    /* renamed from: g */
    public long f12674g = -1;

    public q1() {
        dd ddVar = new dd(10);
        this.f12670c = ddVar;
        byte[] bArr = (byte[]) ddVar.f7311d;
        this.f12671d = new nl1(bArr, bArr.length);
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        qo2 qo2Var;
        int i10 = 0;
        while (true) {
            qo2Var = (qo2) uo2Var;
            qo2Var.o((byte[]) this.f12670c.f7311d, 0, 10, false);
            this.f12670c.h(0);
            if (this.f12670c.r() != 4801587) {
                break;
            }
            this.f12670c.i(3);
            int p = this.f12670c.p();
            i10 += p + 10;
            qo2Var.p(p, false);
        }
        qo2 qo2Var2 = (qo2) uo2Var;
        qo2Var2.f12948f = 0;
        qo2Var.p(i10, false);
        if (this.f12674g == -1) {
            this.f12674g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            qo2Var.o((byte[]) this.f12670c.f7311d, 0, 2, false);
            this.f12670c.h(0);
            if ((this.f12670c.t() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qo2Var.o((byte[]) this.f12670c.f7311d, 0, 4, false);
                this.f12671d.f(14);
                int c10 = this.f12671d.c(13);
                if (c10 > 6) {
                    qo2Var.p(c10 - 6, false);
                    i12 += c10;
                }
            }
            i13++;
            qo2Var2.f12948f = 0;
            qo2Var.p(i13, false);
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f12672e = vo2Var;
        this.f12668a.e(vo2Var, new a3(Integer.MIN_VALUE, 0, 1));
        vo2Var.y();
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.f12675h = false;
        this.f12668a.b();
        this.f12673f = j10;
    }

    @Override // m4.to2
    public final int h(uo2 uo2Var, gp2 gp2Var) {
        r01.d(this.f12672e);
        int d5 = uo2Var.d((byte[]) this.f12669b.f7311d, 0, 2048);
        if (!this.f12676i) {
            this.f12672e.l(new ip2(-9223372036854775807L, 0L));
            this.f12676i = true;
        }
        if (d5 == -1) {
            return -1;
        }
        this.f12669b.h(0);
        this.f12669b.g(d5);
        if (!this.f12675h) {
            this.f12668a.f(this.f12673f, 4);
            this.f12675h = true;
        }
        this.f12668a.d(this.f12669b);
        return 0;
    }
}
