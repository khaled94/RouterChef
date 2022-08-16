package com.google.android.material.datepicker;

import a6.g;
import a6.j;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.n;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.raouf.routerchef.R;
import j0.d;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.f0;
import m0.j0;
import m0.k0;
import m0.n0;
import m0.o0;
import m0.p0;
import m0.z;

/* loaded from: classes.dex */
public final class p<S> extends n {
    public static final /* synthetic */ int Y0 = 0;
    public final LinkedHashSet<s<? super S>> C0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> D0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> E0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> F0 = new LinkedHashSet<>();
    public int G0;
    public d<S> H0;
    public z<S> I0;
    public com.google.android.material.datepicker.a J0;
    public h<S> K0;
    public int L0;
    public CharSequence M0;
    public boolean N0;
    public int O0;
    public int P0;
    public CharSequence Q0;
    public int R0;
    public CharSequence S0;
    public TextView T0;
    public CheckableImageButton U0;
    public g V0;
    public Button W0;
    public boolean X0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            p.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<s<? super S>> it = p.this.C0.iterator();
            while (it.hasNext()) {
                p.this.h0().o();
                it.next().a();
            }
            p.this.e0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
            p.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = p.this.D0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            p.this.e0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class c extends y<S> {
        public c() {
            p.this = r1;
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            p pVar = p.this;
            int i10 = p.Y0;
            pVar.m0();
            p pVar2 = p.this;
            pVar2.W0.setEnabled(pVar2.h0().k());
        }
    }

    public static int i0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d5 = d0.d();
        d5.set(5, 1);
        Calendar b10 = d0.b(d5);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean j0(Context context) {
        return k0(context, 16843277);
    }

    public static boolean k0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x5.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.f1521x;
        }
        this.G0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.H0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.J0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.L0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.O0 = bundle.getInt("INPUT_MODE_KEY");
        this.P0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.R0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.S0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.o
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.N0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.N0) {
            view = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(i0(context), -2);
        } else {
            view = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(i0(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.T0 = textView;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.g.f(textView, 1);
        this.U0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.M0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.L0);
        }
        this.U0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.U0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], f.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.U0.setChecked(this.O0 != 0);
        z.p(this.U0, null);
        n0(this.U0);
        this.U0.setOnClickListener(new r(this));
        this.W0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (h0().k()) {
            this.W0.setEnabled(true);
        } else {
            this.W0.setEnabled(false);
        }
        this.W0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.Q0;
        if (charSequence2 != null) {
            this.W0.setText(charSequence2);
        } else {
            int i10 = this.P0;
            if (i10 != 0) {
                this.W0.setText(i10);
            }
        }
        this.W0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.S0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.R0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void N(Bundle bundle) {
        super.N(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.G0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.H0);
        a.b bVar = new a.b(this.J0);
        u uVar = this.K0.f3186q0;
        if (uVar != null) {
            bVar.f3154c = Long.valueOf(uVar.f3223x);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f3155d);
        u j3 = u.j(bVar.f3152a);
        u j10 = u.j(bVar.f3153b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f3154c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(j3, j10, cVar, l10 == null ? null : u.j(l10.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.L0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.M0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.Q0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.R0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.S0);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void O() {
        d dVar;
        super.O();
        Window window = g0().getWindow();
        if (this.N0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.V0);
            if (!this.X0) {
                View findViewById = X().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = valueOf == null || valueOf.intValue() == 0;
                int a10 = h6.a.a(window.getContext(), 16842801, -16777216);
                if (z11) {
                    valueOf = Integer.valueOf(a10);
                }
                Integer valueOf2 = Integer.valueOf(a10);
                if (i10 >= 30) {
                    k0.a(window, false);
                } else {
                    j0.a(window, false);
                }
                window.getContext();
                int e10 = i10 < 27 ? e0.a.e(h6.a.a(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(e10);
                boolean z12 = h6.a.e(0) || h6.a.e(valueOf.intValue());
                boolean e11 = h6.a.e(valueOf2.intValue());
                if (h6.a.e(e10) || (e10 == 0 && e11)) {
                    z10 = true;
                }
                View decorView = window.getDecorView();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    dVar = new p0(window);
                } else {
                    dVar = i11 >= 26 ? new o0(window, decorView) : new n0(window, decorView);
                }
                dVar.c(z12);
                dVar.b(z10);
                q qVar = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.i.u(findViewById, qVar);
                this.X0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = t().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.V0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new p5.a(g0(), rect));
        }
        l0();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void P() {
        this.I0.f3238m0.clear();
        this.U = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.n
    public final Dialog f0() {
        Context W = W();
        W();
        int i10 = this.G0;
        if (i10 == 0) {
            i10 = h0().g();
        }
        Dialog dialog = new Dialog(W, i10);
        Context context = dialog.getContext();
        this.N0 = j0(context);
        int b10 = x5.b.b(context, R.attr.colorSurface, p.class.getCanonicalName());
        g gVar = new g(new j(j.b(context, null, R.attr.materialCalendarStyle, 2131952632)));
        this.V0 = gVar;
        gVar.m(context);
        this.V0.o(ColorStateList.valueOf(b10));
        g gVar2 = this.V0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        gVar2.n(z.i.i(decorView));
        return dialog;
    }

    public final d<S> h0() {
        if (this.H0 == null) {
            this.H0 = (d) this.f1521x.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.H0;
    }

    public final void l0() {
        z<S> zVar;
        W();
        int i10 = this.G0;
        if (i10 == 0) {
            i10 = h0().g();
        }
        d<S> h02 = h0();
        com.google.android.material.datepicker.a aVar = this.J0;
        h<S> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", h02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f3147v);
        hVar.a0(bundle);
        this.K0 = hVar;
        if (this.U0.isChecked()) {
            d<S> h03 = h0();
            com.google.android.material.datepicker.a aVar2 = this.J0;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", h03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            zVar.a0(bundle2);
        } else {
            zVar = this.K0;
        }
        this.I0 = zVar;
        m0();
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(k());
        bVar.e(R.id.mtrl_calendar_frame, this.I0);
        bVar.h();
        this.I0.e0(new c());
    }

    public final void m0() {
        d<S> h02 = h0();
        l();
        String e10 = h02.e();
        this.T0.setContentDescription(String.format(u(R.string.mtrl_picker_announce_current_selection), e10));
        this.T0.setText(e10);
    }

    public final void n0(CheckableImageButton checkableImageButton) {
        this.U0.setContentDescription(checkableImageButton.getContext().getString(this.U0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.E0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.F0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.W;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
