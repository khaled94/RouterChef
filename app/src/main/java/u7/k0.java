package u7;

import android.util.Log;
import e0.d;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d */
    public static final Pattern f19526d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f19527a;

    /* renamed from: b */
    public final String f19528b;

    /* renamed from: c */
    public final String f19529c;

    public k0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 != null && f19526d.matcher(str3).matches()) {
            this.f19527a = str3;
            this.f19528b = str;
            this.f19529c = d.a(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f19527a.equals(k0Var.f19527a) && this.f19528b.equals(k0Var.f19528b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19528b, this.f19527a});
    }
}
