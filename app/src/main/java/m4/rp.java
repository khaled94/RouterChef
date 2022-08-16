package m4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rp {

    /* renamed from: a */
    public static final ArrayList<bo> f13412a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f13413b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (e(str)) {
            return 1;
        }
        if (f(str)) {
            return 2;
        }
        if ("text".equals(g(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(g(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f13412a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Objects.requireNonNull(f13412a.get(i10));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static so b(String str) {
        Matcher matcher = f13413b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        String group2 = matcher.group(2);
        try {
            return new so(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String c(int i10) {
        if (i10 != 32) {
            if (i10 == 33) {
                return "video/avc";
            }
            if (i10 == 35) {
                return "video/hevc";
            }
            if (i10 == 64) {
                return "audio/mp4a-latm";
            }
            if (i10 == 163) {
                return "video/wvc1";
            }
            if (i10 == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i10 == 165) {
                return "audio/ac3";
            }
            if (i10 == 166) {
                return "audio/eac3";
            }
            switch (i10) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    return "audio/mp4a-latm";
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i10) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "video/mp4v-es";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean d(String str, String str2) {
        char c10;
        so b10;
        if (str == null) {
            return false;
        }
        char c11 = '\n';
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (b10 = b(str2)) == null) {
                    return false;
                }
                int i10 = b10.f13795b;
                if (i10 != 2) {
                    c11 = i10 != 5 ? i10 != 29 ? i10 != 42 ? i10 != 22 ? i10 != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11;
                }
                return (c11 == 0 || c11 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean e(String str) {
        return "audio".equals(g(str));
    }

    public static boolean f(String str) {
        return "video".equals(g(str));
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
