package p1;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public static boolean f16941a = true;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (!f16941a) {
        } else {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f16941a = false;
            }
        }
    }
}
