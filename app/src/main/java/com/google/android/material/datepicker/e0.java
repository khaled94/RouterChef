package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ int f3174s;

    /* renamed from: t */
    public final /* synthetic */ f0 f3175t;

    public e0(f0 f0Var, int i10) {
        this.f3175t = f0Var;
        this.f3174s = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u f10 = u.f(this.f3174s, this.f3175t.f3177c.f3186q0.f3219t);
        a aVar = this.f3175t.f3177c.f3185p0;
        if (f10.compareTo(aVar.f3144s) < 0) {
            f10 = aVar.f3144s;
        } else if (f10.compareTo(aVar.f3145t) > 0) {
            f10 = aVar.f3145t;
        }
        this.f3175t.f3177c.h0(f10);
        this.f3175t.f3177c.i0(1);
    }
}
