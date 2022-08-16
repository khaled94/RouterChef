package d6;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* loaded from: classes.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: s */
    public final /* synthetic */ AutoCompleteTextView f3949s;

    /* renamed from: t */
    public final /* synthetic */ b f3950t;

    public h(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f3950t = bVar;
        this.f3949s = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f3950t.m()) {
                this.f3950t.f3383l = false;
            }
            b.g(this.f3950t, this.f3949s);
            b.h(this.f3950t);
        }
        return false;
    }
}
