package m4;

import a6.d;

/* loaded from: classes.dex */
public final class t2 implements no2 {

    /* renamed from: s */
    public final eq1 f13902s;

    /* renamed from: t */
    public final dd f13903t = new dd();

    /* renamed from: u */
    public final int f13904u;

    public t2(int i10, eq1 eq1Var) {
        this.f13904u = i10;
        this.f13902s = eq1Var;
    }

    @Override // m4.no2
    public final void a() {
        dd ddVar = this.f13903t;
        byte[] bArr = ls1.f10976f;
        int length = bArr.length;
        ddVar.f(bArr, 0);
    }

    @Override // m4.no2
    public final mo2 b(uo2 uo2Var, long j3) {
        long j10;
        long b10 = uo2Var.b();
        int min = (int) Math.min(112800L, uo2Var.c() - b10);
        this.f13903t.e(min);
        ((qo2) uo2Var).o((byte[]) this.f13903t.f7311d, 0, min, false);
        dd ddVar = this.f13903t;
        int i10 = ddVar.f7310c;
        long j11 = -1;
        long j12 = -1;
        long j13 = -9223372036854775807L;
        while (ddVar.zza() >= 188) {
            byte[] bArr = (byte[]) ddVar.f7311d;
            int i11 = ddVar.f7309b;
            while (i11 < i10 && bArr[i11] != 71) {
                i11++;
            }
            int i12 = i11 + 188;
            if (i12 > i10) {
                break;
            }
            long g10 = d.g(ddVar, i11, this.f13904u);
            if (g10 != -9223372036854775807L) {
                long b11 = this.f13902s.b(g10);
                if (b11 > j3) {
                    if (j13 == -9223372036854775807L) {
                        return mo2.a(b11, b10);
                    }
                    j10 = b10 + j12;
                } else if (100000 + b11 > j3) {
                    j10 = b10 + i11;
                } else {
                    j13 = b11;
                    j12 = i11;
                }
                return mo2.b(j10);
            }
            ddVar.h(i12);
            j11 = i12;
        }
        return j13 != -9223372036854775807L ? mo2.c(j13, b10 + j11) : mo2.f11267d;
    }
}
