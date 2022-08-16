package l3;

import android.view.MotionEvent;
import android.view.View;
import m4.w7;

/* loaded from: classes.dex */
public final class n implements View.OnTouchListener {

    /* renamed from: s */
    public final /* synthetic */ r f5770s;

    public n(r rVar) {
        this.f5770s = rVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        w7 w7Var = this.f5770s.f5786z;
        if (w7Var != null) {
            w7Var.b(motionEvent);
            return false;
        }
        return false;
    }
}
