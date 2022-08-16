package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class r implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ p f3214s;

    public r(p pVar) {
        this.f3214s = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p pVar = this.f3214s;
        pVar.W0.setEnabled(pVar.h0().k());
        this.f3214s.U0.toggle();
        p pVar2 = this.f3214s;
        pVar2.n0(pVar2.U0);
        this.f3214s.l0();
    }
}
