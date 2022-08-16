package m4;

import android.util.Pair;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public static final byte[] f10624a = ls1.j("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
        if (r27 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
        r27 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0dfd A[LOOP:17: B:589:0x0d32->B:603:0x0dfd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:595:0x0d8f -> B:596:0x0da3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(m4.d0 r55, m4.cp2 r56, long r57, m4.il2 r59, boolean r60, m4.cu1 r61) {
        /*
            Method dump skipped, instructions count: 3694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.l0.a(m4.d0, m4.cp2, long, m4.il2, boolean, m4.cu1):java.util.List");
    }

    public static void b(dd ddVar) {
        int i10 = ddVar.f7309b;
        ddVar.i(4);
        if (ddVar.l() != 1751411826) {
            i10 += 4;
        }
        ddVar.h(i10);
    }

    public static int c(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static int d(dd ddVar) {
        int q10 = ddVar.q();
        int i10 = q10 & 127;
        while ((q10 & 128) == 128) {
            q10 = ddVar.q();
            i10 = (i10 << 7) | (q10 & 127);
        }
        return i10;
    }

    public static int e(dd ddVar) {
        ddVar.h(16);
        return ddVar.l();
    }

    public static Pair<String, byte[]> f(dd ddVar, int i10) {
        ddVar.h(i10 + 12);
        ddVar.i(1);
        d(ddVar);
        ddVar.i(2);
        int q10 = ddVar.q();
        if ((q10 & 128) != 0) {
            ddVar.i(2);
        }
        if ((q10 & 64) != 0) {
            ddVar.i(ddVar.t());
        }
        if ((q10 & 32) != 0) {
            ddVar.i(2);
        }
        ddVar.i(1);
        d(ddVar);
        String c10 = rp.c(ddVar.q());
        if ("audio/mpeg".equals(c10) || "audio/vnd.dts".equals(c10) || "audio/vnd.dts.hd".equals(c10)) {
            return Pair.create(c10, null);
        }
        ddVar.i(12);
        ddVar.i(1);
        int d5 = d(ddVar);
        byte[] bArr = new byte[d5];
        ddVar.d(bArr, 0, d5);
        return Pair.create(c10, bArr);
    }

    public static Pair<Integer, x0> g(dd ddVar, int i10, int i11) {
        Pair<Integer, x0> pair;
        Integer num;
        x0 x0Var;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = ddVar.f7309b;
        while (i14 - i10 < i11) {
            ddVar.h(i14);
            int l10 = ddVar.l();
            boolean z10 = true;
            wo2.f(l10 > 0, "childAtomSize must be positive");
            if (ddVar.l() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < l10) {
                    ddVar.h(i15);
                    int l11 = ddVar.l();
                    int l12 = ddVar.l();
                    if (l12 == 1718775137) {
                        num2 = Integer.valueOf(ddVar.l());
                    } else if (l12 == 1935894637) {
                        ddVar.i(4);
                        str = ddVar.B(4, bu1.f6617b);
                    } else if (l12 == 1935894633) {
                        i17 = i15;
                        i16 = l11;
                    }
                    i15 += l11;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    wo2.f(num2 != null, "frma atom is mandatory");
                    wo2.f(i17 != -1, "schi atom is mandatory");
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = num2;
                            x0Var = null;
                            break;
                        }
                        ddVar.h(i18);
                        int l13 = ddVar.l();
                        if (ddVar.l() == 1952804451) {
                            int l14 = ddVar.l();
                            ddVar.i(1);
                            if (((l14 >> 24) & 255) == 0) {
                                ddVar.i(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int q10 = ddVar.q();
                                i13 = q10 & 15;
                                i12 = (q10 & 240) >> 4;
                            }
                            boolean z11 = ddVar.q() == 1;
                            int q11 = ddVar.q();
                            byte[] bArr2 = new byte[16];
                            ddVar.d(bArr2, 0, 16);
                            if (!z11 || q11 != 0) {
                                bArr = null;
                            } else {
                                int q12 = ddVar.q();
                                byte[] bArr3 = new byte[q12];
                                ddVar.d(bArr3, 0, q12);
                                bArr = bArr3;
                            }
                            num = num2;
                            x0Var = new x0(z11, str, q11, bArr2, i12, i13, bArr);
                        } else {
                            i18 += l13;
                        }
                    }
                    if (x0Var == null) {
                        z10 = false;
                    }
                    wo2.f(z10, "tenc atom is mandatory");
                    int i19 = ls1.f10971a;
                    pair = Pair.create(num, x0Var);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i14 += l10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(m4.dd r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, m4.il2 r35, m4.i0 r36, int r37) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.l0.h(m4.dd, int, int, int, int, java.lang.String, boolean, m4.il2, m4.i0, int):void");
    }
}
