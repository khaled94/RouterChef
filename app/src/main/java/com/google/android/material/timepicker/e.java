package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f3432a;

    public e(TimePickerView timePickerView) {
        this.f3432a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f3432a;
        int i10 = TimePickerView.M;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
