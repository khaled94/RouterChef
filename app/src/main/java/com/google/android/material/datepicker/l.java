package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ h f3203s;

    public l(h hVar) {
        this.f3203s = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f3203s;
        int i10 = hVar.f3187r0;
        if (i10 == 2) {
            hVar.i0(1);
        } else if (i10 != 1) {
        } else {
            hVar.i0(2);
        }
    }
}
