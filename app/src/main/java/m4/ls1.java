package m4;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ls1 {

    /* renamed from: a */
    public static final int f10971a;

    /* renamed from: b */
    public static final String f10972b;

    /* renamed from: c */
    public static final String f10973c;

    /* renamed from: d */
    public static final String f10974d;

    /* renamed from: e */
    public static final String f10975e;

    /* renamed from: g */
    public static HashMap<String, String> f10977g;

    /* renamed from: f */
    public static final byte[] f10976f = new byte[0];

    /* renamed from: h */
    public static final String[] f10978h = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: i */
    public static final String[] f10979i = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: j */
    public static final int[] f10980j = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: k */
    public static final int[] f10981k = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        f10971a = i10;
        String str = Build.DEVICE;
        f10972b = str;
        String str2 = Build.MANUFACTURER;
        f10973c = str2;
        String str3 = Build.MODEL;
        f10974d = str3;
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 17, String.valueOf(str3).length(), String.valueOf(str2).length()));
        b1.b(sb, str, ", ", str3, ", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i10);
        f10975e = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    }

    public static Looper a() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static t b(int i10, int i11, int i12) {
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "audio/raw";
        kq2Var.f10554w = i11;
        kq2Var.f10555x = i12;
        kq2Var.y = i10;
        return new t(kq2Var);
    }

    public static String c(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String b10 = x90.b(str);
        int i10 = 0;
        String str2 = b10.split("-", 2)[0];
        if (f10977g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            int length2 = f10978h.length;
            HashMap<String, String> hashMap = new HashMap<>(length + 86);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i11 = 0;
            while (true) {
                String[] strArr = f10978h;
                int length3 = strArr.length;
                if (i11 >= 86) {
                    break;
                }
                hashMap.put(strArr[i11], strArr[i11 + 1]);
                i11 += 2;
            }
            f10977g = hashMap;
        }
        String str4 = f10977g.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(b10.substring(str2.length()));
            b10 = valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4);
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return b10;
        }
        while (true) {
            String[] strArr2 = f10979i;
            int length4 = strArr2.length;
            if (i10 >= 18) {
                return b10;
            }
            if (b10.startsWith(strArr2[i10])) {
                String valueOf2 = String.valueOf(strArr2[i10 + 1]);
                String valueOf3 = String.valueOf(b10.substring(strArr2[i10].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i10 += 2;
        }
    }

    public static void e(long[] jArr, long j3) {
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

    public static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean g(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean h(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean i(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static byte[] j(String str) {
        return str.getBytes(bu1.f6617b);
    }

    public static float k(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static <T> T[] l(T[] tArr, int i10) {
        r01.f(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static String[] m() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = f10971a;
        if (i10 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            String[] strArr2 = new String[1];
            Locale locale = configuration.locale;
            strArr2[0] = i10 >= 21 ? locale.toLanguageTag() : locale.toString();
            strArr = strArr2;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = d(strArr[i11]);
        }
        return strArr;
    }

    public static String n(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            x90.e("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static int o(long[] jArr, long j3, boolean z10) {
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j3);
        return !z10 ? binarySearch : binarySearch - 1;
    }

    public static int p(long[] jArr, long j3, boolean z10) {
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

    public static int q(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int r(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int s(int i10) {
        if (i10 != 8) {
            if (i10 == 16) {
                return 2;
            }
            if (i10 == 24) {
                return 536870912;
            }
            return i10 != 32 ? 0 : 805306368;
        }
        return 3;
    }

    public static int t(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 + i11;
    }

    public static long u(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static long v(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 * f10);
    }

    public static long w(long j3, long j10, long j11) {
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 < 0 || j11 % j10 != 0) {
            if (i10 < 0 && j10 % j11 == 0) {
                return (j10 / j11) * j3;
            }
            return (long) ((j10 / j11) * j3);
        }
        return j3 / (j11 / j10);
    }

    public static Handler x() {
        Looper myLooper = Looper.myLooper();
        r01.d(myLooper);
        return new Handler(myLooper, null);
    }
}
