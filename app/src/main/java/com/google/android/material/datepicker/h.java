package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import com.raouf.routerchef.R;
import m0.z;
import n0.f;

/* loaded from: classes.dex */
public final class h<S> extends z<S> {
    public static final /* synthetic */ int x0 = 0;

    /* renamed from: n0 */
    public int f3183n0;

    /* renamed from: o0 */
    public com.google.android.material.datepicker.d<S> f3184o0;

    /* renamed from: p0 */
    public com.google.android.material.datepicker.a f3185p0;

    /* renamed from: q0 */
    public u f3186q0;

    /* renamed from: r0 */
    public int f3187r0;

    /* renamed from: s0 */
    public com.google.android.material.datepicker.c f3188s0;

    /* renamed from: t0 */
    public RecyclerView f3189t0;

    /* renamed from: u0 */
    public RecyclerView f3190u0;

    /* renamed from: v0 */
    public View f3191v0;

    /* renamed from: w0 */
    public View f3192w0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ int f3193s;

        public a(int i10) {
            h.this = r1;
            this.f3193s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = h.this.f3190u0;
            int i10 = this.f3193s;
            if (recyclerView.O) {
                return;
            }
            RecyclerView.m mVar = recyclerView.E;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.F0(recyclerView, i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends m0.a {
        @Override // m0.a
        public final void d(View view, f fVar) {
            this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
            fVar.o(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends b0 {
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i10, int i11) {
            super(context, i10);
            h.this = r1;
            this.G = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void I0(RecyclerView.x xVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = h.this.f3190u0.getWidth();
                iArr[1] = h.this.f3190u0.getWidth();
                return;
            }
            iArr[0] = h.this.f3190u0.getHeight();
            iArr[1] = h.this.f3190u0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d implements e {
        public d() {
            h.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.f1521x;
        }
        this.f3183n0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f3184o0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f3185p0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3186q0 = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    @Override // androidx.fragment.app.o
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        u uVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(l(), this.f3183n0);
        this.f3188s0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVar2 = this.f3185p0.f3144s;
        if (p.j0(contextThemeWrapper)) {
            i11 = R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        Resources resources = W().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = v.f3224x;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        z.p(gridView, new b());
        gridView.setAdapter((ListAdapter) new g());
        gridView.setNumColumns(uVar2.f3221v);
        gridView.setEnabled(false);
        this.f3190u0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f3190u0.setLayoutManager(new c(l(), i10, i10));
        this.f3190u0.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f3184o0, this.f3185p0, new d());
        this.f3190u0.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f3189t0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f3189t0.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer));
            this.f3189t0.setAdapter(new f0(this));
            this.f3189t0.g(new i(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            z.p(materialButton, new j(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f3191v0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3192w0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            i0(1);
            materialButton.setText(this.f3186q0.n());
            this.f3190u0.h(new k(this, xVar, materialButton));
            materialButton.setOnClickListener(new l(this));
            materialButton3.setOnClickListener(new m(this, xVar));
            materialButton2.setOnClickListener(new n(this, xVar));
        }
        if (!p.j0(contextThemeWrapper) && (recyclerView2 = (uVar = new u()).f2077a) != (recyclerView = this.f3190u0)) {
            if (recyclerView2 != null) {
                a0.a aVar = uVar.f2078b;
                ?? r12 = recyclerView2.f1921z0;
                if (r12 != 0) {
                    r12.remove(aVar);
                }
                uVar.f2077a.setOnFlingListener(null);
            }
            uVar.f2077a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    uVar.f2077a.h(uVar.f2078b);
                    uVar.f2077a.setOnFlingListener(uVar);
                    new Scroller(uVar.f2077a.getContext(), new DecelerateInterpolator());
                    uVar.b();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.f3190u0.f0(xVar.i(this.f3186q0));
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void N(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3183n0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f3184o0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3185p0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3186q0);
    }

    @Override // com.google.android.material.datepicker.z
    public final boolean e0(y<S> yVar) {
        return this.f3238m0.add(yVar);
    }

    public final LinearLayoutManager f0() {
        return (LinearLayoutManager) this.f3190u0.getLayoutManager();
    }

    public final void g0(int i10) {
        this.f3190u0.post(new a(i10));
    }

    public final void h0(u uVar) {
        RecyclerView recyclerView;
        int i10;
        x xVar = (x) this.f3190u0.getAdapter();
        int i11 = xVar.i(uVar);
        int i12 = i11 - xVar.i(this.f3186q0);
        boolean z10 = true;
        boolean z11 = Math.abs(i12) > 3;
        if (i12 <= 0) {
            z10 = false;
        }
        this.f3186q0 = uVar;
        if (!z11 || !z10) {
            if (z11) {
                recyclerView = this.f3190u0;
                i10 = i11 + 3;
            }
            g0(i11);
        }
        recyclerView = this.f3190u0;
        i10 = i11 - 3;
        recyclerView.f0(i10);
        g0(i11);
    }

    public final void i0(int i10) {
        this.f3187r0 = i10;
        if (i10 == 2) {
            this.f3189t0.getLayoutManager().u0(((f0) this.f3189t0.getAdapter()).h(this.f3186q0.f3220u));
            this.f3191v0.setVisibility(0);
            this.f3192w0.setVisibility(8);
        } else if (i10 != 1) {
        } else {
            this.f3191v0.setVisibility(8);
            this.f3192w0.setVisibility(0);
            h0(this.f3186q0);
        }
    }
}
