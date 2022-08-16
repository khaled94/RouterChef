package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import n0.j;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f3003a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f3004b;

    /* renamed from: c */
    public final /* synthetic */ View f3005c;

    /* renamed from: d */
    public final /* synthetic */ int f3006d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3007e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f3007e = baseBehavior;
        this.f3003a = coordinatorLayout;
        this.f3004b = appBarLayout;
        this.f3005c = view;
        this.f3006d = i10;
    }

    @Override // n0.j
    public final boolean a(View view) {
        this.f3007e.G(this.f3003a, this.f3004b, this.f3005c, this.f3006d, new int[]{0, 0});
        return true;
    }
}
