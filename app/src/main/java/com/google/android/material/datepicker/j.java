package com.google.android.material.datepicker;

import android.view.View;
import com.raouf.routerchef.R;
import m0.a;
import n0.f;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: d */
    public final /* synthetic */ h f3199d;

    public j(h hVar) {
        this.f3199d = hVar;
    }

    @Override // m0.a
    public final void d(View view, f fVar) {
        h hVar;
        int i10;
        this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
        if (this.f3199d.f3192w0.getVisibility() == 0) {
            hVar = this.f3199d;
            i10 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            hVar = this.f3199d;
            i10 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        fVar.s(hVar.u(i10));
    }
}
