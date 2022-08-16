package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.raouf.routerchef.R;
import m0.a;
import n0.f;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f3429d;

    public b(ClockFaceView clockFaceView) {
        this.f3429d = clockFaceView;
    }

    @Override // m0.a
    public final void d(View view, f fVar) {
        this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            fVar.z(this.f3429d.Q.get(intValue - 1));
        }
        fVar.p(f.c.a(0, 1, intValue, 1, view.isSelected()));
        fVar.f16401a.setClickable(true);
        fVar.b(f.a.f16404e);
    }

    @Override // m0.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            float x10 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            this.f3429d.N.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
            this.f3429d.N.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
