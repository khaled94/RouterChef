package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class z extends SeekBar {

    /* renamed from: s */
    public final a0 f1046s;

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        a1.a(this, getContext());
        a0 a0Var = new a0(this);
        this.f1046s = a0Var;
        a0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a0 a0Var = this.f1046s;
        Drawable drawable = a0Var.f774e;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(a0Var.f773d.getDrawableState())) {
            return;
        }
        a0Var.f773d.invalidateDrawable(drawable);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1046s.f774e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1046s.d(canvas);
    }
}
