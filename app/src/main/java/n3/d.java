package n3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import m4.es;
import m4.jo;

@ParametersAreNonnullByDefault
@TargetApi(28)
/* loaded from: classes.dex */
public final class d extends b {
    public static final WindowInsets g(Activity activity, View view, WindowInsets windowInsets) {
        i1 i1Var;
        s sVar = s.B;
        if (((k1) sVar.f5793g.c()).y() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                i1Var = sVar.f5793g.c();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
            } else {
                i1Var = sVar.f5793g.c();
            }
            ((k1) i1Var).q(str);
        }
        h(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    public static final void h(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = 1;
        if (true != z10) {
            i11 = 2;
        }
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    @Override // n3.e
    public final void c(final Activity activity) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.M0)).booleanValue() || ((k1) s.B.f5793g.c()).y() != null || activity.isInMultiWindowMode()) {
            return;
        }
        h(true, activity);
        activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: n3.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d.g(activity, view, windowInsets);
            }
        });
    }
}
