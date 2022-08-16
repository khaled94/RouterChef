package r9;

import androidx.activity.result.a;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d */
    public static final Pattern f17492d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f17493e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f17494a;

    /* renamed from: b */
    public final String f17495b;
    @Nullable

    /* renamed from: c */
    public final String f17496c;

    public x(String str, String str2, @Nullable String str3) {
        this.f17494a = str;
        this.f17495b = str2;
        this.f17496c = str3;
    }

    public static x a(String str) {
        Matcher matcher = f17492d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        String str2 = null;
        Matcher matcher2 = f17493e.matcher(str);
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder c10 = a.c("Parameter is not formatted correctly: \"");
                c10.append(str.substring(end));
                c10.append("\" for: \"");
                c10.append(str);
                c10.append('\"');
                throw new IllegalArgumentException(c10.toString());
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new x(str, lowerCase, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof x) && ((x) obj).f17494a.equals(this.f17494a);
    }

    public final int hashCode() {
        return this.f17494a.hashCode();
    }

    public final String toString() {
        return this.f17494a;
    }
}
