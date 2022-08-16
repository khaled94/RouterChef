package m4;

import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class mi {
    public static int a(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = (length & (-4)) + 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13 += 4) {
            int i14 = ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | (bArr[i13 + 3] << 24)) * (-862048943);
            int i15 = i12 ^ (((i14 << 15) | (i14 >>> 17)) * 461845907);
            i12 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
        }
        int i16 = length & 3;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    i10 = (bArr[i11 + 2] & 255) << 16;
                }
                int i17 = i12 ^ length;
                int i18 = (i17 ^ (i17 >>> 16)) * (-2048144789);
                int i19 = (i18 ^ (i18 >>> 13)) * (-1028477387);
                return i19 ^ (i19 >>> 16);
            }
            i10 |= (bArr[i11 + 1] & 255) << 8;
        }
        int i20 = ((bArr[i11] & 255) | i10) * (-862048943);
        i12 ^= ((i20 >>> 17) | (i20 << 15)) * 461845907;
        int i172 = i12 ^ length;
        int i182 = (i172 ^ (i172 >>> 16)) * (-2048144789);
        int i192 = (i182 ^ (i182 >>> 13)) * (-1028477387);
        return i192 ^ (i192 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
        if (true != r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
        if (true != r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c6, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] b(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.mi.b(java.lang.String, boolean):java.lang.String[]");
    }
}
