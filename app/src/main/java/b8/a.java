package b8;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final TimeZone f2597a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:45:0x00b2, B:46:0x00b6, B:50:0x00c6, B:51:0x00c9, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:71:0x011b, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:86:0x0197, B:88:0x01c8, B:89:0x01cf), top: B:101:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:45:0x00b2, B:46:0x00b6, B:50:0x00c6, B:51:0x00c9, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:71:0x011b, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:86:0x0197, B:88:0x01c8, B:89:0x01cf), top: B:101:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                StringBuilder c10 = androidx.activity.result.a.c("Invalid number: ");
                c10.append(str.substring(i10, i11));
                throw new NumberFormatException(c10.toString());
            }
            i12 = -digit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 < 0) {
                StringBuilder c11 = androidx.activity.result.a.c("Invalid number: ");
                c11.append(str.substring(i10, i11));
                throw new NumberFormatException(c11.toString());
            }
            i12 = (i12 * 10) - digit2;
            i13 = i14;
        }
        return -i12;
    }
}
