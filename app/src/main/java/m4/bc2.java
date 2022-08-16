package m4;

/* loaded from: classes.dex */
public final class bc2 {

    /* renamed from: a */
    public static final is f6451a;

    static {
        if (zb2.f16091e && zb2.f16090d) {
            int i10 = d82.f7261a;
        }
        f6451a = new is();
    }

    public static int a(byte[] bArr, int i10, int i11) {
        int i12;
        byte b10 = bArr[i10 - 1];
        int i13 = i11 - i10;
        if (i13 != 0) {
            if (i13 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    i12 = (b11 << 8) ^ b10;
                    return i12;
                }
            } else if (i13 != 2) {
                throw new AssertionError();
            } else {
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    i12 = (b13 << 16) ^ ((b12 << 8) ^ b10);
                    return i12;
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.bc2.b(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new ac2(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String d(byte[] bArr, int i10, int i11) {
        return f6451a.c(bArr, i10, i11);
    }

    public static boolean e(byte[] bArr, int i10, int i11) {
        return f6451a.a(0, bArr, i10, i11) == 0;
    }
}
