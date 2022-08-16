package w;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.e0;

@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public final class a {
    public static String a(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                return e0.a("?", i10);
            }
        }
        return "UNKNOWN";
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
