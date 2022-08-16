package m4;

import e1.i;

/* loaded from: classes.dex */
public final class m1 implements to2 {

    /* renamed from: a */
    public final n1 f11068a = new n1(null);

    /* renamed from: b */
    public final dd f11069b = new dd(2786);

    /* renamed from: c */
    public boolean f11070c;

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
            qo2Var.o((byte[]) ddVar.f7311d, 0, 6, false);
            ddVar.h(0);
            if (ddVar.t() != 2935) {
                qo2Var2.f12948f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                qo2Var.p(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = (byte[]) ddVar.f7311d;
                if (bArr.length < 6) {
                    i10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i14 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    i10 = i14 + i14;
                } else {
                    byte b10 = bArr[4];
                    i10 = i.i((b10 & 192) >> 6, b10 & 63);
                }
                if (i10 == -1) {
                    return false;
                }
                qo2Var.p(i10 - 6, false);
            }
        }
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f11068a.e(vo2Var, new a3(Integer.MIN_VALUE, 0, 1));
        vo2Var.y();
        vo2Var.l(new ip2(-9223372036854775807L, 0L));
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.f11070c = false;
        this.f11068a.b();
    }

    @Override // m4.to2
    public final int h(uo2 uo2Var, gp2 gp2Var) {
        int d5 = uo2Var.d((byte[]) this.f11069b.f7311d, 0, 2786);
        if (d5 == -1) {
            return -1;
        }
        this.f11069b.h(0);
        this.f11069b.g(d5);
        if (!this.f11070c) {
            this.f11068a.f(0L, 4);
            this.f11070c = true;
        }
        this.f11068a.d(this.f11069b);
        return 0;
    }
}
