package m4;

/* loaded from: classes.dex */
public final class o1 implements to2 {

    /* renamed from: a */
    public final p1 f11973a = new p1(null);

    /* renamed from: b */
    public final dd f11974b = new dd(16384);

    /* renamed from: c */
    public boolean f11975c;

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        qo2 qo2Var;
        int i10;
        dd ddVar = new dd(10);
        int i11 = 0;
        while (true) {
            qo2Var = (qo2) uo2Var;
            qo2Var.o((byte[]) ddVar.f7311d, 0, 10, false);
            ddVar.h(0);
            if (ddVar.r() != 4801587) {
                break;
            }
            ddVar.i(3);
            int p = ddVar.p();
            i11 += p + 10;
            qo2Var.p(p, false);
        }
        qo2 qo2Var2 = (qo2) uo2Var;
        qo2Var2.f12948f = 0;
        qo2Var.p(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            qo2Var.o((byte[]) ddVar.f7311d, 0, 7, false);
            ddVar.h(0);
            int t10 = ddVar.t();
            if (t10 == 44096 || t10 == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = (byte[]) ddVar.f7311d;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (t10 == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                qo2Var.p(i10 - 7, false);
            } else {
                qo2Var2.f12948f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                qo2Var.p(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f11973a.e(vo2Var, new a3(Integer.MIN_VALUE, 0, 1));
        vo2Var.y();
        vo2Var.l(new ip2(-9223372036854775807L, 0L));
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.f11975c = false;
        this.f11973a.b();
    }

    @Override // m4.to2
    public final int h(uo2 uo2Var, gp2 gp2Var) {
        int d5 = uo2Var.d((byte[]) this.f11974b.f7311d, 0, 16384);
        if (d5 == -1) {
            return -1;
        }
        this.f11974b.h(0);
        this.f11974b.g(d5);
        if (!this.f11975c) {
            this.f11973a.f(0L, 4);
            this.f11975c = true;
        }
        this.f11973a.d(this.f11974b);
        return 0;
    }
}
