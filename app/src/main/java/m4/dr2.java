package m4;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dr2 {

    /* renamed from: a */
    public static final /* synthetic */ int f7615a = 0;

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static int b(byte[] bArr, int i10, int i11) {
        int c10 = c(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return c10;
        }
        while (true) {
            int length = bArr.length;
            if (c10 >= length - 1) {
                return length;
            }
            if ((c10 - i10) % 2 == 0 && bArr[c10 + 1] == 0) {
                return c10;
            }
            c10 = c(bArr, c10 + 1);
        }
    }

    public static int c(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 < length) {
                if (bArr[i10] == 0) {
                    return i10;
                }
                i10++;
            } else {
                return length;
            }
        }
    }

    public static int d(dd ddVar, int i10) {
        byte[] bArr = (byte[]) ddVar.f7311d;
        int i11 = ddVar.f7309b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x026d, code lost:
        if (r9 == 67) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.er2 e(int r34, m4.dd r35, boolean r36, int r37, m4.br2 r38) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.dr2.e(int, m4.dd, boolean, int, m4.br2):m4.er2");
    }

    public static String f(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static String g(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String h(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static boolean i(dd ddVar, int i10, int i11, boolean z10) {
        int i12;
        long j3;
        int i13;
        int i14;
        int i15 = ddVar.f7309b;
        while (true) {
            try {
                int i16 = 1;
                if (ddVar.zza() < i11) {
                    return true;
                }
                if (i10 >= 3) {
                    i13 = ddVar.l();
                    j3 = ddVar.w();
                    i12 = ddVar.t();
                } else {
                    i13 = ddVar.r();
                    j3 = ddVar.r();
                    i12 = 0;
                }
                if (i13 == 0 && j3 == 0 && i12 == 0) {
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & j3) != 0) {
                        return false;
                    }
                    j3 = ((j3 >> 24) << 21) | ((255 & (j3 >> 16)) << 14) | (j3 & 255) | (((j3 >> 8) & 255) << 7);
                }
                if (i10 == 4) {
                    if ((i12 & 64) == 0) {
                        i16 = 0;
                    }
                    int i17 = i16;
                    i16 = i12 & 1;
                    i14 = i17;
                } else if (i10 == 3) {
                    i14 = (i12 & 32) != 0 ? 1 : 0;
                    if ((i12 & 128) == 0) {
                        i16 = 0;
                    }
                } else {
                    i14 = 0;
                    i16 = 0;
                }
                if (i16 != 0) {
                    i14 += 4;
                }
                if (j3 < i14) {
                    return false;
                }
                if (ddVar.zza() < j3) {
                    return false;
                }
                ddVar.i((int) j3);
            } finally {
                ddVar.h(i15);
            }
        }
    }

    public static byte[] j(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? ls1.f10976f : Arrays.copyOfRange(bArr, i10, i11);
    }
}
