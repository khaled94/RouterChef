package m4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class vm1 {
    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void b(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void c(Bundle bundle, String str, List<String> list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void d(Bundle bundle, String str, Boolean bool, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public static void e(Bundle bundle, String str, Integer num, boolean z10) {
        if (z10) {
            bundle.putInt(str, num.intValue());
        }
    }

    public static void f(Bundle bundle, String str, String str2, boolean z10) {
        if (z10) {
            bundle.putString(str, str2);
        }
    }
}
