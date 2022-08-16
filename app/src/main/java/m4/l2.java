package m4;

/* loaded from: classes.dex */
public final class l2 implements no2, v91 {

    /* renamed from: s */
    public final Object f10639s;

    /* renamed from: t */
    public final Object f10640t;

    public /* synthetic */ l2(eq1 eq1Var) {
        this.f10639s = eq1Var;
        this.f10640t = new dd();
    }

    public /* synthetic */ l2(fg2 fg2Var, Exception exc) {
        this.f10639s = fg2Var;
        this.f10640t = exc;
    }

    @Override // m4.no2
    public final void a() {
        byte[] bArr = ls1.f10976f;
        int length = bArr.length;
        ((dd) this.f10640t).f(bArr, 0);
    }

    @Override // m4.no2
    public final mo2 b(uo2 uo2Var, long j3) {
        int g10;
        long j10;
        long b10 = uo2Var.b();
        int min = (int) Math.min(20000L, uo2Var.c() - b10);
        ((dd) this.f10640t).e(min);
        ((qo2) uo2Var).o((byte[]) ((dd) this.f10640t).f7311d, 0, min, false);
        dd ddVar = (dd) this.f10640t;
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (ddVar.zza() >= 4) {
            if (m2.g((byte[]) ddVar.f7311d, ddVar.f7309b) != 442) {
                ddVar.i(1);
            } else {
                ddVar.i(4);
                long a10 = n2.a(ddVar);
                if (a10 != -9223372036854775807L) {
                    long b11 = ((eq1) this.f10639s).b(a10);
                    if (b11 > j3) {
                        if (j11 == -9223372036854775807L) {
                            return mo2.a(b11, b10);
                        }
                        j10 = i11;
                    } else if (100000 + b11 > j3) {
                        j10 = ddVar.f7309b;
                    } else {
                        i11 = ddVar.f7309b;
                        j11 = b11;
                    }
                    return mo2.b(b10 + j10);
                }
                int i12 = ddVar.f7310c;
                if (ddVar.zza() >= 10) {
                    ddVar.i(9);
                    int q10 = ddVar.q() & 7;
                    if (ddVar.zza() >= q10) {
                        ddVar.i(q10);
                        if (ddVar.zza() >= 4) {
                            if (m2.g((byte[]) ddVar.f7311d, ddVar.f7309b) == 443) {
                                ddVar.i(4);
                                int t10 = ddVar.t();
                                if (ddVar.zza() >= t10) {
                                    ddVar.i(t10);
                                }
                            }
                            while (ddVar.zza() >= 4 && (g10 = m2.g((byte[]) ddVar.f7311d, ddVar.f7309b)) != 442 && g10 != 441 && (g10 >>> 8) == 1) {
                                ddVar.i(4);
                                if (ddVar.zza() >= 2) {
                                    ddVar.h(Math.min(ddVar.f7310c, ddVar.f7309b + ddVar.t()));
                                }
                            }
                            i10 = ddVar.f7309b;
                        }
                    }
                }
                ddVar.h(i12);
                i10 = ddVar.f7309b;
            }
        }
        return j11 != -9223372036854775807L ? mo2.c(j11, b10 + i10) : mo2.f11267d;
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }
}
