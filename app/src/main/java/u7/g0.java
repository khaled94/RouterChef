package u7;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g0 extends Exception {
    public g0(String str) {
        super(str);
        if (str == null) {
            return;
        }
        Objects.requireNonNull(str.toLowerCase(Locale.US));
    }
}
