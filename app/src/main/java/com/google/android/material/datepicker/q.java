package com.google.android.material.datepicker;

import android.view.View;
import m0.l0;

/* loaded from: classes.dex */
public final class q implements m0.q {

    /* renamed from: a */
    public final /* synthetic */ int f3211a;

    /* renamed from: b */
    public final /* synthetic */ View f3212b;

    /* renamed from: c */
    public final /* synthetic */ int f3213c;

    public q(int i10, View view, int i11) {
        this.f3211a = i10;
        this.f3212b = view;
        this.f3213c = i11;
    }

    @Override // m0.q
    public final l0 a(View view, l0 l0Var) {
        int i10 = l0Var.b(7).f4312b;
        if (this.f3211a >= 0) {
            this.f3212b.getLayoutParams().height = this.f3211a + i10;
            View view2 = this.f3212b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f3212b;
        view3.setPadding(view3.getPaddingLeft(), this.f3213c + i10, this.f3212b.getPaddingRight(), this.f3212b.getPaddingBottom());
        return l0Var;
    }
}
