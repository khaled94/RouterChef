package p5;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: s */
    public final Dialog f16953s;

    /* renamed from: t */
    public final int f16954t;

    /* renamed from: u */
    public final int f16955u;

    /* renamed from: v */
    public final int f16956v;

    public a(Dialog dialog, Rect rect) {
        this.f16953s = dialog;
        this.f16954t = rect.left;
        this.f16955u = rect.top;
        this.f16956v = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f16954t;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f16955u;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f16956v;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f16953s.onTouchEvent(obtain);
    }
}
