package m4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class te0 {

    /* renamed from: a */
    public static final Pattern f14034a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b */
    public static final Pattern f14035b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f14034a.matcher(str);
        int i10 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            while (i10 <= 0) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    sb.append(str2);
                }
                i10++;
            }
            str = str.substring(end);
        } else if (!f14035b.matcher(str).find()) {
            while (i10 <= 0) {
                String str3 = strArr[i10];
                if (str3 != null) {
                    sb.append(str3);
                }
                i10++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
