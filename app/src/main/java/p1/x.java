package p1;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class x extends w {
    public static boolean N = true;

    @SuppressLint({"NewApi"})
    public void i(View view, int i10, int i11, int i12, int i13) {
        if (N) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                N = false;
            }
        }
    }
}
