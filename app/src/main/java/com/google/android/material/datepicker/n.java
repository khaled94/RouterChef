package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ x f3206s;

    /* renamed from: t */
    public final /* synthetic */ h f3207t;

    public n(h hVar, x xVar) {
        this.f3207t = hVar;
        this.f3206s = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int T0 = this.f3207t.f0().T0() - 1;
        if (T0 >= 0) {
            this.f3207t.h0(this.f3206s.h(T0));
        }
    }
}
