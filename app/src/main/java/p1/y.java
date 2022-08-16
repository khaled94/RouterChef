package p1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class y extends x {
    public static boolean O = true;

    @Override // e1.j
    @SuppressLint({"NewApi"})
    public void a(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.a(view, i10);
        } else if (!O) {
        } else {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                O = false;
            }
        }
    }
}
