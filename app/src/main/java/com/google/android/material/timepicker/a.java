package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: s */
    public final /* synthetic */ ClockFaceView f3428s;

    public a(ClockFaceView clockFaceView) {
        this.f3428s = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f3428s.isShown()) {
            return true;
        }
        this.f3428s.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f3428s;
        int height = ((this.f3428s.getHeight() / 2) - clockFaceView.N.f3425x) - clockFaceView.U;
        if (height != clockFaceView.L) {
            clockFaceView.L = height;
            clockFaceView.s();
            ClockHandView clockHandView = clockFaceView.N;
            clockHandView.F = clockFaceView.L;
            clockHandView.invalidate();
        }
        return true;
    }
}
