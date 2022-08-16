package d6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import x5.c;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final Context f3955a;

    /* renamed from: b */
    public final TextInputLayout f3956b;

    /* renamed from: c */
    public LinearLayout f3957c;

    /* renamed from: d */
    public int f3958d;

    /* renamed from: e */
    public FrameLayout f3959e;

    /* renamed from: f */
    public Animator f3960f;

    /* renamed from: g */
    public final float f3961g;

    /* renamed from: h */
    public int f3962h;

    /* renamed from: i */
    public int f3963i;

    /* renamed from: j */
    public CharSequence f3964j;

    /* renamed from: k */
    public boolean f3965k;

    /* renamed from: l */
    public h0 f3966l;

    /* renamed from: m */
    public CharSequence f3967m;

    /* renamed from: n */
    public int f3968n;

    /* renamed from: o */
    public ColorStateList f3969o;
    public CharSequence p;

    /* renamed from: q */
    public boolean f3970q;

    /* renamed from: r */
    public h0 f3971r;

    /* renamed from: s */
    public int f3972s;

    /* renamed from: t */
    public ColorStateList f3973t;

    /* renamed from: u */
    public Typeface f3974u;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f3975a;

        /* renamed from: b */
        public final /* synthetic */ TextView f3976b;

        /* renamed from: c */
        public final /* synthetic */ int f3977c;

        /* renamed from: d */
        public final /* synthetic */ TextView f3978d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            k.this = r1;
            this.f3975a = i10;
            this.f3976b = textView;
            this.f3977c = i11;
            this.f3978d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h0 h0Var;
            k kVar = k.this;
            kVar.f3962h = this.f3975a;
            kVar.f3960f = null;
            TextView textView = this.f3976b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f3977c == 1 && (h0Var = k.this.f3966l) != null) {
                    h0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f3978d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f3978d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f3978d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public k(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3955a = context;
        this.f3956b = textInputLayout;
        this.f3961g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i10) {
        if (this.f3957c == null && this.f3959e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f3955a);
            this.f3957c = linearLayout;
            linearLayout.setOrientation(0);
            this.f3956b.addView(this.f3957c, -1, -2);
            this.f3959e = new FrameLayout(this.f3955a);
            this.f3957c.addView(this.f3959e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f3956b.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f3959e.setVisibility(0);
            this.f3959e.addView(textView);
        } else {
            this.f3957c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3957c.setVisibility(0);
        this.f3958d++;
    }

    public final void b() {
        if ((this.f3957c == null || this.f3956b.getEditText() == null) ? false : true) {
            EditText editText = this.f3956b.getEditText();
            boolean d5 = c.d(this.f3955a);
            LinearLayout linearLayout = this.f3957c;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.e.k(linearLayout, h(d5, R.dimen.material_helper_text_font_1_3_padding_horizontal, z.e.f(editText)), h(d5, R.dimen.material_helper_text_font_1_3_padding_top, this.f3955a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(d5, R.dimen.material_helper_text_font_1_3_padding_horizontal, z.e.e(editText)), 0);
        }
    }

    public final void c() {
        Animator animator = this.f3960f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 != i12 && i10 != i11) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i12 == i10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(e5.a.f4408a);
        list.add(ofFloat);
        if (i12 != i10) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f3961g, 0.0f);
        ofFloat2.setDuration(217L);
        ofFloat2.setInterpolator(e5.a.f4411d);
        list.add(ofFloat2);
    }

    public final boolean e() {
        return this.f3963i == 1 && this.f3966l != null && !TextUtils.isEmpty(this.f3964j);
    }

    public final TextView f(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f3971r;
            }
            return null;
        }
        return this.f3966l;
    }

    public final int g() {
        h0 h0Var = this.f3966l;
        if (h0Var != null) {
            return h0Var.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z10, int i10, int i11) {
        return z10 ? this.f3955a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public final void i() {
        this.f3964j = null;
        c();
        if (this.f3962h == 1) {
            this.f3963i = (!this.f3970q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        l(this.f3962h, this.f3963i, k(this.f3966l, ""));
    }

    public final void j(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3957c;
        if (linearLayout == null) {
            return;
        }
        if (!(i10 == 0 || i10 == 1) || (frameLayout = this.f3959e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f3958d - 1;
        this.f3958d = i11;
        LinearLayout linearLayout2 = this.f3957c;
        if (i11 != 0) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f3956b;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        return z.g.c(textInputLayout) && this.f3956b.isEnabled() && (this.f3963i != this.f3962h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i10, int i11, boolean z10) {
        TextView f10;
        TextView f11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3960f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3970q, this.f3971r, 2, i10, i11);
            d(arrayList, this.f3965k, this.f3966l, 1, i10, i11);
            androidx.lifecycle.h0.d(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, f(i10), i10, f(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (f11 = f(i11)) != null) {
                f11.setVisibility(0);
                f11.setAlpha(1.0f);
            }
            if (i10 != 0 && (f10 = f(i10)) != null) {
                f10.setVisibility(4);
                if (i10 == 1) {
                    f10.setText((CharSequence) null);
                }
            }
            this.f3962h = i11;
        }
        this.f3956b.w();
        this.f3956b.A(z10, false);
        this.f3956b.F();
    }
}
