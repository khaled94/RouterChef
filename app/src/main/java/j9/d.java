package j9;

import e9.f;

/* loaded from: classes.dex */
public class d extends c {
    public static final int r(CharSequence charSequence) {
        f.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int s(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return ((String) charSequence).indexOf(c10, i10);
    }

    public static String t(String str) {
        f.e(str, "<this>");
        f.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, r(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
