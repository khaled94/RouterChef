package h4;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class h {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
