package m4;

import android.view.View;

/* loaded from: classes.dex */
public final class fr1 {
    public static String a(View view) {
        if (view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
            } else if (view.getAlpha() != 0.0f) {
                return null;
            } else {
                return "viewAlphaZero";
            }
        }
        return "notAttached";
    }
}
