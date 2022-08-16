package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class j1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        k1 k1Var = k1.B;
        if (k1Var != null && k1Var.f921s == view) {
            k1.c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new k1(view, charSequence);
            return;
        }
        k1 k1Var2 = k1.C;
        if (k1Var2 != null && k1Var2.f921s == view) {
            k1Var2.b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
