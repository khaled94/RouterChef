package d6;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import java.util.WeakHashMap;
import m0.f0;
import m0.g;
import m0.z;
import u5.s;
import x5.c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: s */
    public final TextInputLayout f3985s;

    /* renamed from: t */
    public final h0 f3986t;

    /* renamed from: u */
    public CharSequence f3987u;

    /* renamed from: v */
    public final CheckableImageButton f3988v;

    /* renamed from: w */
    public ColorStateList f3989w;

    /* renamed from: x */
    public PorterDuff.Mode f3990x;
    public View.OnLongClickListener y;

    /* renamed from: z */
    public boolean f3991z;

    public p(TextInputLayout textInputLayout, f1 f1Var) {
        super(textInputLayout.getContext());
        this.f3985s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3988v = checkableImageButton;
        CharSequence charSequence = null;
        h0 h0Var = new h0(getContext(), null);
        this.f3986t = h0Var;
        if (c.d(getContext())) {
            g.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        c(null);
        d(null);
        if (f1Var.o(62)) {
            this.f3989w = c.b(getContext(), f1Var, 62);
        }
        if (f1Var.o(63)) {
            this.f3990x = s.b(f1Var.j(63, -1), null);
        }
        if (f1Var.o(61)) {
            b(f1Var.g(61));
            if (f1Var.o(60)) {
                a(f1Var.n(60));
            }
            checkableImageButton.setCheckable(f1Var.a(59, true));
        }
        h0Var.setVisibility(8);
        h0Var.setId(R.id.textinput_prefix_text);
        h0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.g.f(h0Var, 1);
        h0Var.setTextAppearance(f1Var.l(55, 0));
        if (f1Var.o(56)) {
            h0Var.setTextColor(f1Var.c(56));
        }
        CharSequence n10 = f1Var.n(54);
        this.f3987u = !TextUtils.isEmpty(n10) ? n10 : charSequence;
        h0Var.setText(n10);
        g();
        addView(checkableImageButton);
        addView(h0Var);
    }

    public final void a(CharSequence charSequence) {
        if (this.f3988v.getContentDescription() != charSequence) {
            this.f3988v.setContentDescription(charSequence);
        }
    }

    public final void b(Drawable drawable) {
        this.f3988v.setImageDrawable(drawable);
        if (drawable != null) {
            j.a(this.f3985s, this.f3988v, this.f3989w, this.f3990x);
            e(true);
            j.c(this.f3985s, this.f3988v, this.f3989w);
            return;
        }
        e(false);
        c(null);
        d(null);
        a(null);
    }

    public final void c(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f3988v;
        View.OnLongClickListener onLongClickListener = this.y;
        checkableImageButton.setOnClickListener(onClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public final void d(View.OnLongClickListener onLongClickListener) {
        this.y = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3988v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public final void e(boolean z10) {
        int i10 = 0;
        if ((this.f3988v.getVisibility() == 0) != z10) {
            CheckableImageButton checkableImageButton = this.f3988v;
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            f();
            g();
        }
    }

    public final void f() {
        EditText editText = this.f3985s.f3347w;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (!(this.f3988v.getVisibility() == 0)) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            i10 = z.e.f(editText);
        }
        h0 h0Var = this.f3986t;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
        z.e.k(h0Var, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void g() {
        int i10 = 8;
        int i11 = (this.f3987u == null || this.f3991z) ? 8 : 0;
        if (this.f3988v.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f3986t.setVisibility(i11);
        this.f3985s.v();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        f();
    }
}
