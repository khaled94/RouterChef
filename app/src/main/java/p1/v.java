package p1;

import android.annotation.SuppressLint;
import android.view.View;
import e1.j;

/* loaded from: classes.dex */
public class v extends j {
    public static boolean K = true;

    @SuppressLint({"NewApi"})
    public float d(View view) {
        if (K) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                K = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void f(View view, float f10) {
        if (K) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                K = false;
            }
        }
        view.setAlpha(f10);
    }
}
