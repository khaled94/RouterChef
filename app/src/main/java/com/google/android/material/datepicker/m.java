package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class m implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ x f3204s;

    /* renamed from: t */
    public final /* synthetic */ h f3205t;

    public m(h hVar, x xVar) {
        this.f3205t = hVar;
        this.f3204s = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int S0 = this.f3205t.f0().S0() + 1;
        if (S0 < this.f3205t.f3190u0.getAdapter().a()) {
            this.f3205t.h0(this.f3204s.h(S0));
        }
    }
}
