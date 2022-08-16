package p1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class w extends v {
    public static boolean L = true;
    public static boolean M = true;

    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (L) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                L = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (M) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                M = false;
            }
        }
    }
}
