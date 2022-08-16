package m4;

/* loaded from: classes.dex */
public final class nd {

    /* renamed from: a */
    public static final int[] f11631a = {wg.c("isom"), wg.c("iso2"), wg.c("iso3"), wg.c("iso4"), wg.c("iso5"), wg.c("iso6"), wg.c("avc1"), wg.c("hvc1"), wg.c("hev1"), wg.c("mp41"), wg.c("mp42"), wg.c("3g2a"), wg.c("3g2b"), wg.c("3gr6"), wg.c("3gs6"), wg.c("3ge6"), wg.c("3gg6"), wg.c("M4V "), wg.c("M4A "), wg.c("f4v "), wg.c("kddi"), wg.c("M4VP"), wg.c("qt  "), wg.c("MSNV")};

    public static boolean a(hc hcVar, boolean z10) {
        boolean z11;
        long j3 = hcVar.f9182b;
        if (j3 == -1 || j3 > 4096) {
            j3 = 4096;
        }
        int i10 = (int) j3;
        rg rgVar = new rg(64);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < i10) {
            rgVar.k(8);
            hcVar.b(rgVar.f13267a, 0, 8);
            long g10 = rgVar.g();
            int b10 = rgVar.b();
            int i12 = 16;
            if (g10 == 1) {
                hcVar.b(rgVar.f13267a, 8, 8);
                rgVar.m(16);
                g10 = rgVar.h();
            } else {
                i12 = 8;
            }
            long j10 = i12;
            if (g10 < j10) {
                return false;
            }
            i11 += i12;
            if (b10 != zc.C) {
                if (b10 == zc.L || b10 == zc.N) {
                    z11 = true;
                    break;
                } else if ((i11 + g10) - j10 >= i10) {
                    break;
                } else {
                    int i13 = (int) (g10 - j10);
                    i11 += i13;
                    if (b10 == zc.f16096b) {
                        if (i13 < 8) {
                            return false;
                        }
                        rgVar.k(i13);
                        hcVar.b(rgVar.f13267a, 0, i13);
                        int i14 = i13 >> 2;
                        for (int i15 = 0; i15 < i14; i15++) {
                            if (i15 != 1) {
                                int b11 = rgVar.b();
                                if ((b11 >>> 8) != wg.c("3gp")) {
                                    int[] iArr = f11631a;
                                    int length = iArr.length;
                                    for (int i16 = 0; i16 < 24; i16++) {
                                        if (iArr[i16] != b11) {
                                        }
                                    }
                                    continue;
                                }
                                z12 = true;
                                break;
                            }
                            rgVar.o(4);
                        }
                        if (!z12) {
                            return false;
                        }
                    } else if (i13 != 0) {
                        hcVar.a(i13);
                    }
                }
            }
        }
        z11 = false;
        return z12 && z10 == z11;
    }
}
