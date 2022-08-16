package m4;

import android.os.Build;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class wg {

    /* renamed from: a */
    public static final int f14958a;

    /* renamed from: b */
    public static final String f14959b;

    /* renamed from: c */
    public static final String f14960c;

    /* renamed from: d */
    public static final String f14961d;

    /* renamed from: e */
    public static final String f14962e;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        }
        f14958a = i10;
        String str = Build.DEVICE;
        f14959b = str;
        String str2 = Build.MANUFACTURER;
        f14960c = str2;
        String str3 = Build.MODEL;
        f14961d = str3;
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 17, String.valueOf(str3).length(), String.valueOf(str2).length()));
        b1.b(sb, str, ", ", str3, ", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i10);
        f14962e = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static int a(long[] jArr, long j3, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j3);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static int b(long[] jArr, long j3, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j3);
            i10 = binarySearch + 1;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static int c(String str) {
        int length = str.length();
        n9.d.g(length <= 4);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 << 8) | str.charAt(i11);
        }
        return i10;
    }

    public static int d(int i10) {
        if (i10 != 8) {
            if (i10 == 16) {
                return 2;
            }
            if (i10 == 24) {
                return Integer.MIN_VALUE;
            }
            return i10 != 32 ? 0 : 1073741824;
        }
        return 3;
    }

    public static int e(int i10, int i11) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 1073741824) {
                return i11 * 4;
            }
            if (i10 == 2) {
                return i11 + i11;
            }
            if (i10 != 3) {
                throw new IllegalArgumentException();
            }
            return i11;
        }
        return i11 * 3;
    }

    public static long f(long j3, long j10, long j11) {
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 < 0 || j11 % j10 != 0) {
            if (i10 < 0 && j10 % j11 == 0) {
                return (j10 / j11) * j3;
            }
            return (long) ((j10 / j11) * j3);
        }
        return j3 / (j11 / j10);
    }

    public static void g(long[] jArr, long j3) {
        int i10 = (j3 > 1000000L ? 1 : (j3 == 1000000L ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j3 % 1000000 == 0) {
            long j10 = j3 / 1000000;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j10;
                i11++;
            }
        } else if (i10 >= 0 || 1000000 % j3 != 0) {
            double d5 = 1000000.0d / j3;
            while (i11 < jArr.length) {
                jArr[i11] = (long) (jArr[i11] * d5);
                i11++;
            }
        } else {
            long j11 = 1000000 / j3;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j11;
                i11++;
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
