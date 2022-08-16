package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class t<S> extends z<S> {

    /* renamed from: n0 */
    public int f3215n0;

    /* renamed from: o0 */
    public d<S> f3216o0;

    /* renamed from: p0 */
    public a f3217p0;

    @Override // androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.f1521x;
        }
        this.f3215n0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f3216o0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3217p0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.o
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(l(), this.f3215n0));
        return this.f3216o0.q();
    }

    @Override // androidx.fragment.app.o
    public final void N(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3215n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3216o0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3217p0);
    }
}
