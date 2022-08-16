package m4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class wm1 {

    /* renamed from: a */
    public final Pattern f15063a;

    public wm1() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) jo.f10145d.f10148c.a(es.G4));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f15063a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f15063a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
