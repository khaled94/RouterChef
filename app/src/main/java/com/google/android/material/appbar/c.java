package com.google.android.material.appbar;

import android.view.View;
import n0.j;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f3008a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3009b;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f3008a = appBarLayout;
        this.f3009b = z10;
    }

    @Override // n0.j
    public final boolean a(View view) {
        this.f3008a.setExpanded(this.f3009b);
        return true;
    }
}
