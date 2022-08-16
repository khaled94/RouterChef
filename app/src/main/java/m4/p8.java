package m4;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class p8 {

    /* renamed from: a */
    public static final char[] f12428a = "0123456789abcdef".toCharArray();

    public static long a(double d5, DisplayMetrics displayMetrics) {
        return Math.round(d5 / displayMetrics.density);
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] c(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}
