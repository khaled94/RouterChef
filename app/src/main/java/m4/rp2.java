package m4;

import m2.a;

/* loaded from: classes.dex */
public final class rp2 implements no2 {

    /* renamed from: s */
    public final bp2 f13415s;

    /* renamed from: t */
    public final int f13416t;

    /* renamed from: u */
    public final zo2 f13417u = new zo2();

    public /* synthetic */ rp2(bp2 bp2Var, int i10) {
        this.f13415s = bp2Var;
        this.f13416t = i10;
    }

    @Override // m4.no2
    public final /* synthetic */ void a() {
    }

    @Override // m4.no2
    public final mo2 b(uo2 uo2Var, long j3) {
        long b10 = uo2Var.b();
        long c10 = c(uo2Var);
        long g10 = uo2Var.g();
        ((qo2) uo2Var).p(Math.max(6, this.f13415s.f6589c), false);
        long c11 = c(uo2Var);
        return (c10 > j3 || c11 <= j3) ? c11 <= j3 ? mo2.c(c11, uo2Var.g()) : mo2.a(c10, b10) : mo2.b(g10);
    }

    public final long c(uo2 uo2Var) {
        while (uo2Var.g() < uo2Var.c() - 6) {
            bp2 bp2Var = this.f13415s;
            int i10 = this.f13416t;
            zo2 zo2Var = this.f13417u;
            long g10 = uo2Var.g();
            int i11 = 2;
            byte[] bArr = new byte[2];
            qo2 qo2Var = (qo2) uo2Var;
            qo2Var.o(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                uo2Var.i();
                qo2Var.p((int) (g10 - uo2Var.b()), false);
            } else {
                dd ddVar = new dd(16);
                System.arraycopy(bArr, 0, (byte[]) ddVar.f7311d, 0, 2);
                byte[] bArr2 = (byte[]) ddVar.f7311d;
                int i12 = 0;
                while (i12 < 14) {
                    int e10 = uo2Var.e(bArr2, i11 + i12, 14 - i12);
                    if (e10 == -1) {
                        break;
                    }
                    i12 += e10;
                    i11 = 2;
                }
                ddVar.g(i12);
                uo2Var.i();
                qo2Var.p((int) (g10 - uo2Var.b()), false);
                if (a.x(ddVar, bp2Var, i10, zo2Var)) {
                    break;
                }
            }
            qo2Var.p(1, false);
        }
        if (uo2Var.g() >= uo2Var.c() - 6) {
            ((qo2) uo2Var).p((int) (uo2Var.c() - uo2Var.g()), false);
            return this.f13415s.f6596j;
        }
        return this.f13417u.f16302a;
    }
}
