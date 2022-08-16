package p1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class z extends y {
    @Override // p1.y, e1.j
    public final void a(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p1.v
    public final float d(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p1.v
    public final void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p1.w
    public final void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p1.w
    public final void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p1.x
    public final void i(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
