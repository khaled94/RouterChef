package com.google.android.material.textfield;

import a6.j;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.m0;
import c0.a;
import com.google.android.material.internal.CheckableImageButton;
import com.raouf.routerchef.R;
import d6.i;
import d6.k;
import d6.l;
import d6.o;
import d6.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import p1.m;
import q0.k;
import u5.n;
import u5.s;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public ColorDrawable A0;
    public int B0;
    public Drawable C0;
    public boolean D;
    public View.OnLongClickListener D0;
    public int E;
    public View.OnLongClickListener E0;
    public boolean F;
    public final CheckableImageButton F0;
    public h0 G;
    public ColorStateList G0;
    public int H;
    public PorterDuff.Mode H0;
    public int I;
    public ColorStateList I0;
    public CharSequence J;
    public ColorStateList J0;
    public boolean K;
    public int K0;
    public h0 L;
    public int L0;
    public ColorStateList M;
    public int M0;
    public int N;
    public ColorStateList N0;
    public p1.c O;
    public int O0;
    public p1.c P;
    public int P0;
    public ColorStateList Q;
    public int Q0;
    public ColorStateList R;
    public int R0;
    public CharSequence S;
    public int S0;
    public final h0 T;
    public boolean T0;
    public boolean U;
    public final u5.e U0;
    public CharSequence V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public ValueAnimator X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a0 */
    public a6.g f3321a0;

    /* renamed from: b0 */
    public a6.g f3322b0;

    /* renamed from: c0 */
    public a6.g f3323c0;

    /* renamed from: d0 */
    public j f3324d0;

    /* renamed from: e0 */
    public boolean f3325e0;

    /* renamed from: f0 */
    public final int f3326f0;

    /* renamed from: g0 */
    public int f3327g0;

    /* renamed from: h0 */
    public int f3328h0;

    /* renamed from: i0 */
    public int f3329i0;

    /* renamed from: j0 */
    public int f3330j0;

    /* renamed from: k0 */
    public int f3331k0;

    /* renamed from: l0 */
    public int f3332l0;

    /* renamed from: m0 */
    public int f3333m0;

    /* renamed from: q0 */
    public Typeface f3337q0;

    /* renamed from: r0 */
    public ColorDrawable f3338r0;

    /* renamed from: s */
    public final FrameLayout f3339s;

    /* renamed from: s0 */
    public int f3340s0;

    /* renamed from: t */
    public final p f3341t;

    /* renamed from: u */
    public final LinearLayout f3343u;

    /* renamed from: v */
    public final FrameLayout f3345v;

    /* renamed from: v0 */
    public final SparseArray<i> f3346v0;

    /* renamed from: w */
    public EditText f3347w;

    /* renamed from: w0 */
    public final CheckableImageButton f3348w0;

    /* renamed from: x */
    public CharSequence f3349x;

    /* renamed from: y0 */
    public ColorStateList f3350y0;

    /* renamed from: z0 */
    public PorterDuff.Mode f3352z0;
    public int y = -1;

    /* renamed from: z */
    public int f3351z = -1;
    public int A = -1;
    public int B = -1;
    public final k C = new k(this);

    /* renamed from: n0 */
    public final Rect f3334n0 = new Rect();

    /* renamed from: o0 */
    public final Rect f3335o0 = new Rect();

    /* renamed from: p0 */
    public final RectF f3336p0 = new RectF();

    /* renamed from: t0 */
    public final LinkedHashSet<f> f3342t0 = new LinkedHashSet<>();

    /* renamed from: u0 */
    public int f3344u0 = 0;
    public final LinkedHashSet<g> x0 = new LinkedHashSet<>();

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.A(!textInputLayout.Z0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.D) {
                textInputLayout2.t(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.K) {
                textInputLayout3.B(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f3348w0.performClick();
            TextInputLayout.this.f3348w0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f3347w.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.U0.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends m0.a {

        /* renamed from: d */
        public final TextInputLayout f3357d;

        public e(TextInputLayout textInputLayout) {
            this.f3357d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
            if (r2 != null) goto L29;
         */
        @Override // m0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(android.view.View r14, n0.f r15) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, n0.f):void");
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    /* loaded from: classes.dex */
    public static class h extends s0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: u */
        public CharSequence f3358u;

        /* renamed from: v */
        public boolean f3359v;

        /* renamed from: w */
        public CharSequence f3360w;

        /* renamed from: x */
        public CharSequence f3361x;
        public CharSequence y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3358u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3359v = parcel.readInt() != 1 ? false : true;
            this.f3360w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3361x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("TextInputLayout.SavedState{");
            c10.append(Integer.toHexString(System.identityHashCode(this)));
            c10.append(" error=");
            c10.append((Object) this.f3358u);
            c10.append(" hint=");
            c10.append((Object) this.f3360w);
            c10.append(" helperText=");
            c10.append((Object) this.f3361x);
            c10.append(" placeholderText=");
            c10.append((Object) this.y);
            c10.append("}");
            return c10.toString();
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            TextUtils.writeToParcel(this.f3358u, parcel, i10);
            parcel.writeInt(this.f3359v ? 1 : 0);
            TextUtils.writeToParcel(this.f3360w, parcel, i10);
            TextUtils.writeToParcel(this.f3361x, parcel, i10);
            TextUtils.writeToParcel(this.y, parcel, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(e6.a.a(context, attributeSet, R.attr.textInputStyle, 2131952441), attributeSet, R.attr.textInputStyle);
        ?? r62;
        int i10;
        SparseArray<i> sparseArray = new SparseArray<>();
        this.f3346v0 = sparseArray;
        u5.e eVar = new u5.e(this);
        this.U0 = eVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3339s = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f3345v = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f3343u = linearLayout;
        h0 h0Var = new h0(context2, null);
        this.T = h0Var;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        h0Var.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.F0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f3348w0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = e5.a.f4408a;
        eVar.O = linearInterpolator;
        eVar.k(false);
        eVar.N = linearInterpolator;
        eVar.k(false);
        eVar.m(8388659);
        int[] iArr = h6.a.T;
        n.a(context2, attributeSet, R.attr.textInputStyle, 2131952441);
        n.b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131952441, 22, 20, 35, 40, 44);
        f1 f1Var = new f1(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131952441));
        p pVar = new p(this, f1Var);
        this.f3341t = pVar;
        this.U = f1Var.a(43, true);
        setHint(f1Var.n(4));
        this.W0 = f1Var.a(42, true);
        this.V0 = f1Var.a(37, true);
        if (f1Var.o(6)) {
            setMinEms(f1Var.j(6, -1));
        } else if (f1Var.o(3)) {
            setMinWidth(f1Var.f(3, -1));
        }
        if (f1Var.o(5)) {
            setMaxEms(f1Var.j(5, -1));
        } else if (f1Var.o(2)) {
            setMaxWidth(f1Var.f(2, -1));
        }
        this.f3324d0 = new j(j.b(context2, attributeSet, R.attr.textInputStyle, 2131952441));
        this.f3326f0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3328h0 = f1Var.e(9, 0);
        this.f3330j0 = f1Var.f(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3331k0 = f1Var.f(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3329i0 = this.f3330j0;
        float d5 = f1Var.d(13);
        float d10 = f1Var.d(12);
        float d11 = f1Var.d(10);
        float d12 = f1Var.d(11);
        j jVar = this.f3324d0;
        Objects.requireNonNull(jVar);
        j.a aVar = new j.a(jVar);
        if (d5 >= 0.0f) {
            aVar.e(d5);
        }
        if (d10 >= 0.0f) {
            aVar.f(d10);
        }
        if (d11 >= 0.0f) {
            aVar.d(d11);
        }
        if (d12 >= 0.0f) {
            aVar.c(d12);
        }
        this.f3324d0 = new j(aVar);
        ColorStateList b10 = x5.c.b(context2, f1Var, 7);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.O0 = defaultColor;
            this.f3333m0 = defaultColor;
            if (b10.isStateful()) {
                this.P0 = b10.getColorForState(new int[]{-16842910}, -1);
                this.Q0 = b10.getColorForState(new int[]{16842908, 16842910}, -1);
                i10 = b10.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.Q0 = this.O0;
                ColorStateList a10 = f.a.a(context2, R.color.mtrl_filled_background_color);
                this.P0 = a10.getColorForState(new int[]{-16842910}, -1);
                i10 = a10.getColorForState(new int[]{16843623}, -1);
            }
            this.R0 = i10;
        } else {
            this.f3333m0 = 0;
            this.O0 = 0;
            this.P0 = 0;
            this.Q0 = 0;
            this.R0 = 0;
        }
        if (f1Var.o(1)) {
            ColorStateList c10 = f1Var.c(1);
            this.J0 = c10;
            this.I0 = c10;
        }
        ColorStateList b11 = x5.c.b(context2, f1Var, 14);
        this.M0 = f1Var.b();
        Object obj = c0.a.f2602a;
        this.K0 = a.c.a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.S0 = a.c.a(context2, R.color.mtrl_textinput_disabled_color);
        this.L0 = a.c.a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b11 != null) {
            setBoxStrokeColorStateList(b11);
        }
        if (f1Var.o(15)) {
            setBoxStrokeErrorColor(x5.c.b(context2, f1Var, 15));
        }
        if (f1Var.l(44, -1) != -1) {
            r62 = 0;
            setHintTextAppearance(f1Var.l(44, 0));
        } else {
            r62 = 0;
        }
        int i11 = r62 == true ? 1 : 0;
        int i12 = r62 == true ? 1 : 0;
        int l10 = f1Var.l(35, i11);
        CharSequence n10 = f1Var.n(30);
        boolean a11 = f1Var.a(31, r62);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (x5.c.d(context2)) {
            m0.g.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r62);
        }
        if (f1Var.o(33)) {
            this.G0 = x5.c.b(context2, f1Var, 33);
        }
        if (f1Var.o(34)) {
            this.H0 = s.b(f1Var.j(34, -1), null);
        }
        if (f1Var.o(32)) {
            setErrorIconDrawable(f1Var.g(32));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.s(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int l11 = f1Var.l(40, 0);
        boolean a12 = f1Var.a(39, false);
        CharSequence n11 = f1Var.n(38);
        int l12 = f1Var.l(52, 0);
        CharSequence n12 = f1Var.n(51);
        int l13 = f1Var.l(65, 0);
        CharSequence n13 = f1Var.n(64);
        boolean a13 = f1Var.a(18, false);
        setCounterMaxLength(f1Var.j(19, -1));
        this.I = f1Var.l(22, 0);
        this.H = f1Var.l(20, 0);
        setBoxBackgroundMode(f1Var.j(8, 0));
        if (x5.c.d(context2)) {
            m0.g.h((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int l14 = f1Var.l(26, 0);
        sparseArray.append(-1, new d6.d(this, l14));
        sparseArray.append(0, new o(this));
        sparseArray.append(1, new com.google.android.material.textfield.c(this, l14 == 0 ? f1Var.l(47, 0) : l14));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, l14));
        sparseArray.append(3, new com.google.android.material.textfield.b(this, l14));
        if (!f1Var.o(48)) {
            if (f1Var.o(28)) {
                this.f3350y0 = x5.c.b(context2, f1Var, 28);
            }
            if (f1Var.o(29)) {
                this.f3352z0 = s.b(f1Var.j(29, -1), null);
            }
        }
        if (f1Var.o(27)) {
            setEndIconMode(f1Var.j(27, 0));
            if (f1Var.o(25)) {
                setEndIconContentDescription(f1Var.n(25));
            }
            setEndIconCheckable(f1Var.a(24, true));
        } else if (f1Var.o(48)) {
            if (f1Var.o(49)) {
                this.f3350y0 = x5.c.b(context2, f1Var, 49);
            }
            if (f1Var.o(50)) {
                this.f3352z0 = s.b(f1Var.j(50, -1), null);
            }
            setEndIconMode(f1Var.a(48, false) ? 1 : 0);
            setEndIconContentDescription(f1Var.n(46));
        }
        h0Var.setId(R.id.textinput_suffix_text);
        h0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        z.g.f(h0Var, 1);
        setErrorContentDescription(n10);
        setCounterOverflowTextAppearance(this.H);
        setHelperTextTextAppearance(l11);
        setErrorTextAppearance(l10);
        setCounterTextAppearance(this.I);
        setPlaceholderText(n12);
        setPlaceholderTextAppearance(l12);
        setSuffixTextAppearance(l13);
        if (f1Var.o(36)) {
            setErrorTextColor(f1Var.c(36));
        }
        if (f1Var.o(41)) {
            setHelperTextColor(f1Var.c(41));
        }
        if (f1Var.o(45)) {
            setHintTextColor(f1Var.c(45));
        }
        if (f1Var.o(23)) {
            setCounterTextColor(f1Var.c(23));
        }
        if (f1Var.o(21)) {
            setCounterOverflowTextColor(f1Var.c(21));
        }
        if (f1Var.o(53)) {
            setPlaceholderTextColor(f1Var.c(53));
        }
        if (f1Var.o(66)) {
            setSuffixTextColor(f1Var.c(66));
        }
        setEnabled(f1Var.a(0, true));
        f1Var.r();
        z.d.s(this, 2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26 && i13 >= 26) {
            z.k.l(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(h0Var);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(pVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(a12);
        setErrorEnabled(a11);
        setCounterEnabled(a13);
        setHelperText(n11);
        setSuffixText(n13);
    }

    private i getEndIconDelegate() {
        i iVar = this.f3346v0.get(this.f3344u0);
        return iVar != null ? iVar : this.f3346v0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.F0.getVisibility() == 0) {
            return this.F0;
        }
        if (i() && k()) {
            return this.f3348w0;
        }
        return null;
    }

    public static void o(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                o((ViewGroup) childAt, z10);
            }
        }
    }

    public static void q(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean a10 = z.c.a(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        boolean z11 = onLongClickListener != null;
        if (a10 || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i10 = 2;
        }
        z.d.s(checkableImageButton, i10);
    }

    private void setEditText(EditText editText) {
        if (this.f3347w == null) {
            if (this.f3344u0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3347w = editText;
            int i10 = this.y;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.A);
            }
            int i11 = this.f3351z;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.B);
            }
            m();
            setTextInputAccessibilityDelegate(new e(this));
            this.U0.q(this.f3347w.getTypeface());
            u5.e eVar = this.U0;
            float textSize = this.f3347w.getTextSize();
            if (eVar.f19092i != textSize) {
                eVar.f19092i = textSize;
                eVar.k(false);
            }
            u5.e eVar2 = this.U0;
            float letterSpacing = this.f3347w.getLetterSpacing();
            if (eVar2.U != letterSpacing) {
                eVar2.U = letterSpacing;
                eVar2.k(false);
            }
            int gravity = this.f3347w.getGravity();
            this.U0.m((gravity & (-113)) | 48);
            u5.e eVar3 = this.U0;
            if (eVar3.f19090g != gravity) {
                eVar3.f19090g = gravity;
                eVar3.k(false);
            }
            this.f3347w.addTextChangedListener(new a());
            if (this.I0 == null) {
                this.I0 = this.f3347w.getHintTextColors();
            }
            if (this.U) {
                if (TextUtils.isEmpty(this.V)) {
                    CharSequence hint = this.f3347w.getHint();
                    this.f3349x = hint;
                    setHint(hint);
                    this.f3347w.setHint((CharSequence) null);
                }
                this.W = true;
            }
            if (this.G != null) {
                t(this.f3347w.getText().length());
            }
            w();
            this.C.b();
            this.f3341t.bringToFront();
            this.f3343u.bringToFront();
            this.f3345v.bringToFront();
            this.F0.bringToFront();
            Iterator<f> it = this.f3342t0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            D();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.V)) {
            this.V = charSequence;
            u5.e eVar = this.U0;
            if (charSequence == null || !TextUtils.equals(eVar.A, charSequence)) {
                eVar.A = charSequence;
                eVar.B = null;
                Bitmap bitmap = eVar.D;
                if (bitmap != null) {
                    bitmap.recycle();
                    eVar.D = null;
                }
                eVar.k(false);
            }
            if (this.T0) {
                return;
            }
            n();
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.K == z10) {
            return;
        }
        if (z10) {
            h0 h0Var = this.L;
            if (h0Var != null) {
                this.f3339s.addView(h0Var);
                this.L.setVisibility(0);
            }
        } else {
            h0 h0Var2 = this.L;
            if (h0Var2 != null) {
                h0Var2.setVisibility(8);
            }
            this.L = null;
        }
        this.K = z10;
    }

    public final void A(boolean z10, boolean z11) {
        u5.e eVar;
        ColorStateList colorStateList;
        h0 h0Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3347w;
        boolean z12 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f3347w;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean e10 = this.C.e();
        ColorStateList colorStateList2 = this.I0;
        if (colorStateList2 != null) {
            this.U0.l(colorStateList2);
            u5.e eVar2 = this.U0;
            ColorStateList colorStateList3 = this.I0;
            if (eVar2.f19094k != colorStateList3) {
                eVar2.f19094k = colorStateList3;
                eVar2.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.I0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.S0) : this.S0;
            this.U0.l(ColorStateList.valueOf(colorForState));
            u5.e eVar3 = this.U0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (eVar3.f19094k != valueOf) {
                eVar3.f19094k = valueOf;
                eVar3.k(false);
            }
        } else if (e10) {
            u5.e eVar4 = this.U0;
            h0 h0Var2 = this.C.f3966l;
            eVar4.l(h0Var2 != null ? h0Var2.getTextColors() : null);
        } else {
            if (this.F && (h0Var = this.G) != null) {
                eVar = this.U0;
                colorStateList = h0Var.getTextColors();
            } else if (z13 && (colorStateList = this.J0) != null) {
                eVar = this.U0;
            }
            eVar.l(colorStateList);
        }
        if (z12 || !this.V0 || (isEnabled() && z13)) {
            if (!z11 && !this.T0) {
                return;
            }
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.X0.cancel();
            }
            if (!z10 || !this.W0) {
                this.U0.o(1.0f);
            } else {
                c(1.0f);
            }
            this.T0 = false;
            if (f()) {
                n();
            }
            EditText editText3 = this.f3347w;
            B(editText3 == null ? 0 : editText3.getText().length());
            p pVar = this.f3341t;
            pVar.f3991z = false;
            pVar.g();
            E();
        } else if (!z11 && this.T0) {
        } else {
            ValueAnimator valueAnimator2 = this.X0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.X0.cancel();
            }
            if (!z10 || !this.W0) {
                this.U0.o(0.0f);
            } else {
                c(0.0f);
            }
            if (f() && (!((d6.e) this.f3321a0).Q.isEmpty()) && f()) {
                ((d6.e) this.f3321a0).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.T0 = true;
            j();
            p pVar2 = this.f3341t;
            pVar2.f3991z = true;
            pVar2.g();
            E();
        }
    }

    public final void B(int i10) {
        if (i10 == 0 && !this.T0) {
            if (this.L == null || !this.K || TextUtils.isEmpty(this.J)) {
                return;
            }
            this.L.setText(this.J);
            m.a(this.f3339s, this.O);
            this.L.setVisibility(0);
            this.L.bringToFront();
            announceForAccessibility(this.J);
            return;
        }
        j();
    }

    public final void C(boolean z10, boolean z11) {
        int defaultColor = this.N0.getDefaultColor();
        int colorForState = this.N0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.N0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f3332l0 = colorForState2;
        } else if (z11) {
            this.f3332l0 = colorForState;
        } else {
            this.f3332l0 = defaultColor;
        }
    }

    public final void D() {
        int i10;
        if (this.f3347w == null) {
            return;
        }
        if (k() || l()) {
            i10 = 0;
        } else {
            EditText editText = this.f3347w;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            i10 = z.e.e(editText);
        }
        h0 h0Var = this.T;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f3347w.getPaddingTop();
        int paddingBottom = this.f3347w.getPaddingBottom();
        WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
        z.e.k(h0Var, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void E() {
        int visibility = this.T.getVisibility();
        boolean z10 = false;
        int i10 = (this.S == null || this.T0) ? 8 : 0;
        if (visibility != i10) {
            i endIconDelegate = getEndIconDelegate();
            if (i10 == 0) {
                z10 = true;
            }
            endIconDelegate.c(z10);
        }
        x();
        this.T.setVisibility(i10);
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F():void");
    }

    public final void a(f fVar) {
        this.f3342t0.add(fVar);
        if (this.f3347w != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f3339s.addView(view, layoutParams2);
        this.f3339s.setLayoutParams(layoutParams);
        z();
        setEditText((EditText) view);
    }

    public final void b(g gVar) {
        this.x0.add(gVar);
    }

    public final void c(float f10) {
        if (this.U0.f19086c == f10) {
            return;
        }
        if (this.X0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.X0 = valueAnimator;
            valueAnimator.setInterpolator(e5.a.f4409b);
            this.X0.setDuration(167L);
            this.X0.addUpdateListener(new d());
        }
        this.X0.setFloatValues(this.U0.f19086c, f10);
        this.X0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            a6.g r0 = r7.f3321a0
            if (r0 != 0) goto L5
            return
        L5:
            a6.g$b r1 = r0.f191s
            a6.j r1 = r1.f199a
            a6.j r2 = r7.f3324d0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L4a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.f3344u0
            if (r0 != r3) goto L4a
            int r0 = r7.f3327g0
            if (r0 != r4) goto L4a
            android.util.SparseArray<d6.i> r0 = r7.f3346v0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.textfield.b r0 = (com.google.android.material.textfield.b) r0
            android.widget.EditText r1 = r7.f3347w
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            java.util.Objects.requireNonNull(r0)
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L33
            r2 = r6
            goto L34
        L33:
            r2 = r5
        L34:
            if (r2 != 0) goto L4a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f3951a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L4a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L47
            goto L4a
        L47:
            r0.i(r1)
        L4a:
            int r0 = r7.f3327g0
            r1 = -1
            if (r0 != r4) goto L5e
            int r0 = r7.f3329i0
            if (r0 <= r1) goto L59
            int r0 = r7.f3332l0
            if (r0 == 0) goto L59
            r0 = r6
            goto L5a
        L59:
            r0 = r5
        L5a:
            if (r0 == 0) goto L5e
            r0 = r6
            goto L5f
        L5e:
            r0 = r5
        L5f:
            if (r0 == 0) goto L6b
            a6.g r0 = r7.f3321a0
            int r2 = r7.f3329i0
            float r2 = (float) r2
            int r4 = r7.f3332l0
            r0.q(r2, r4)
        L6b:
            int r0 = r7.f3333m0
            int r2 = r7.f3327g0
            if (r2 != r6) goto L82
            r0 = 2130968845(0x7f04010d, float:1.7546355E38)
            android.content.Context r2 = r7.getContext()
            int r0 = h6.a.a(r2, r0, r5)
            int r2 = r7.f3333m0
            int r0 = e0.a.b(r2, r0)
        L82:
            r7.f3333m0 = r0
            a6.g r2 = r7.f3321a0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.o(r0)
            int r0 = r7.f3344u0
            if (r0 != r3) goto L9a
            android.widget.EditText r0 = r7.f3347w
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L9a:
            a6.g r0 = r7.f3322b0
            if (r0 == 0) goto Ld0
            a6.g r2 = r7.f3323c0
            if (r2 != 0) goto La3
            goto Ld0
        La3:
            int r2 = r7.f3329i0
            if (r2 <= r1) goto Lac
            int r1 = r7.f3332l0
            if (r1 == 0) goto Lac
            r5 = r6
        Lac:
            if (r5 == 0) goto Lcd
            android.widget.EditText r1 = r7.f3347w
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto Lb9
            int r1 = r7.K0
            goto Lbb
        Lb9:
            int r1 = r7.f3332l0
        Lbb:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.o(r1)
            a6.g r0 = r7.f3323c0
            int r1 = r7.f3332l0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.o(r1)
        Lcd:
            r7.invalidate()
        Ld0:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f3347w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f3349x != null) {
            boolean z10 = this.W;
            this.W = false;
            CharSequence hint = editText.getHint();
            this.f3347w.setHint(this.f3349x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f3347w.setHint(hint);
                this.W = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f3339s.getChildCount());
        for (int i11 = 0; i11 < this.f3339s.getChildCount(); i11++) {
            View childAt = this.f3339s.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f3347w) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.Z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Z0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a6.g gVar;
        super.draw(canvas);
        if (this.U) {
            u5.e eVar = this.U0;
            Objects.requireNonNull(eVar);
            int save = canvas.save();
            if (eVar.B != null && eVar.f19085b) {
                eVar.L.setTextSize(eVar.F);
                float f10 = eVar.f19099q;
                float f11 = eVar.f19100r;
                float f12 = eVar.E;
                if (f12 != 1.0f) {
                    canvas.scale(f12, f12, f10, f11);
                }
                canvas.translate(f10, f11);
                eVar.W.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f3323c0 == null || (gVar = this.f3322b0) == null) {
            return;
        }
        gVar.draw(canvas);
        if (!this.f3347w.isFocused()) {
            return;
        }
        Rect bounds = this.f3323c0.getBounds();
        Rect bounds2 = this.f3322b0.getBounds();
        float f13 = this.U0.f19086c;
        int centerX = bounds2.centerX();
        int i10 = bounds2.left;
        LinearInterpolator linearInterpolator = e5.a.f4408a;
        bounds.left = Math.round((i10 - centerX) * f13) + centerX;
        bounds.right = Math.round(f13 * (bounds2.right - centerX)) + centerX;
        this.f3323c0.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (this.Y0) {
            return;
        }
        boolean z12 = true;
        this.Y0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        u5.e eVar = this.U0;
        if (eVar != null) {
            eVar.J = drawableState;
            ColorStateList colorStateList2 = eVar.f19095l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = eVar.f19094k) != null && colorStateList.isStateful())) {
                eVar.k(false);
                z11 = true;
            } else {
                z11 = false;
            }
            z10 = z11 | false;
        } else {
            z10 = false;
        }
        if (this.f3347w != null) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (!z.g.c(this) || !isEnabled()) {
                z12 = false;
            }
            A(z12, false);
        }
        w();
        F();
        if (z10) {
            invalidate();
        }
        this.Y0 = false;
    }

    public final int e() {
        float e10;
        if (!this.U) {
            return 0;
        }
        int i10 = this.f3327g0;
        if (i10 == 0) {
            e10 = this.U0.e();
        } else if (i10 != 2) {
            return 0;
        } else {
            e10 = this.U0.e() / 2.0f;
        }
        return (int) e10;
    }

    public final boolean f() {
        return this.U && !TextUtils.isEmpty(this.V) && (this.f3321a0 instanceof d6.e);
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft = this.f3347w.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3347w;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public a6.g getBoxBackground() {
        int i10 = this.f3327g0;
        if (i10 == 1 || i10 == 2) {
            return this.f3321a0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3333m0;
    }

    public int getBoxBackgroundMode() {
        return this.f3327g0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3328h0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        a6.c cVar;
        if (s.a(this)) {
            cVar = this.f3324d0.f227h;
        } else {
            cVar = this.f3324d0.f226g;
        }
        return cVar.a(this.f3336p0);
    }

    public float getBoxCornerRadiusBottomStart() {
        a6.c cVar;
        if (s.a(this)) {
            cVar = this.f3324d0.f226g;
        } else {
            cVar = this.f3324d0.f227h;
        }
        return cVar.a(this.f3336p0);
    }

    public float getBoxCornerRadiusTopEnd() {
        a6.c cVar;
        if (s.a(this)) {
            cVar = this.f3324d0.f224e;
        } else {
            cVar = this.f3324d0.f225f;
        }
        return cVar.a(this.f3336p0);
    }

    public float getBoxCornerRadiusTopStart() {
        a6.c cVar;
        if (s.a(this)) {
            cVar = this.f3324d0.f225f;
        } else {
            cVar = this.f3324d0.f224e;
        }
        return cVar.a(this.f3336p0);
    }

    public int getBoxStrokeColor() {
        return this.M0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.N0;
    }

    public int getBoxStrokeWidth() {
        return this.f3330j0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3331k0;
    }

    public int getCounterMaxLength() {
        return this.E;
    }

    public CharSequence getCounterOverflowDescription() {
        h0 h0Var;
        if (!this.D || !this.F || (h0Var = this.G) == null) {
            return null;
        }
        return h0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.Q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.I0;
    }

    public EditText getEditText() {
        return this.f3347w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3348w0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3348w0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f3344u0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3348w0;
    }

    public CharSequence getError() {
        k kVar = this.C;
        if (kVar.f3965k) {
            return kVar.f3964j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.C.f3967m;
    }

    public int getErrorCurrentTextColors() {
        return this.C.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.F0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.C.g();
    }

    public CharSequence getHelperText() {
        k kVar = this.C;
        if (kVar.f3970q) {
            return kVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        h0 h0Var = this.C.f3971r;
        if (h0Var != null) {
            return h0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.U) {
            return this.V;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.U0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.U0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.J0;
    }

    public int getMaxEms() {
        return this.f3351z;
    }

    public int getMaxWidth() {
        return this.B;
    }

    public int getMinEms() {
        return this.y;
    }

    public int getMinWidth() {
        return this.A;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3348w0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3348w0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.K) {
            return this.J;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.N;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.M;
    }

    public CharSequence getPrefixText() {
        return this.f3341t.f3987u;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3341t.f3986t.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3341t.f3986t;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3341t.f3988v.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3341t.f3988v.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.S;
    }

    public ColorStateList getSuffixTextColor() {
        return this.T.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.T;
    }

    public Typeface getTypeface() {
        return this.f3337q0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f3347w.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final boolean i() {
        return this.f3344u0 != 0;
    }

    public final void j() {
        h0 h0Var = this.L;
        if (h0Var == null || !this.K) {
            return;
        }
        h0Var.setText((CharSequence) null);
        m.a(this.f3339s, this.P);
        this.L.setVisibility(4);
    }

    public final boolean k() {
        return this.f3345v.getVisibility() == 0 && this.f3348w0.getVisibility() == 0;
    }

    public final boolean l() {
        return this.F0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m():void");
    }

    public final void n() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (!f()) {
            return;
        }
        RectF rectF = this.f3336p0;
        u5.e eVar = this.U0;
        int width = this.f3347w.getWidth();
        int gravity = this.f3347w.getGravity();
        boolean b10 = eVar.b(eVar.A);
        eVar.C = b10;
        if (gravity == 17 || (gravity & 7) == 1) {
            f13 = width / 2.0f;
            f12 = eVar.X / 2.0f;
        } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? b10 : !b10) {
            f10 = eVar.f19088e.left;
            rectF.left = f10;
            Rect rect = eVar.f19088e;
            float f14 = rect.top;
            rectF.top = f14;
            if (gravity != 17 || (gravity & 7) == 1) {
                f11 = (width / 2.0f) + (eVar.X / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                if (b10) {
                    f11 = eVar.X + f10;
                }
                f11 = rect.right;
            } else {
                if (!b10) {
                    f11 = eVar.X + f10;
                }
                f11 = rect.right;
            }
            rectF.right = f11;
            rectF.bottom = eVar.e() + f14;
            float f15 = rectF.left;
            float f16 = this.f3326f0;
            rectF.left = f15 - f16;
            rectF.right += f16;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f3329i0);
            d6.e eVar2 = (d6.e) this.f3321a0;
            Objects.requireNonNull(eVar2);
            eVar2.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        } else {
            f13 = eVar.f19088e.right;
            f12 = eVar.X;
        }
        f10 = f13 - f12;
        rectF.left = f10;
        Rect rect2 = eVar.f19088e;
        float f142 = rect2.top;
        rectF.top = f142;
        if (gravity != 17) {
        }
        f11 = (width / 2.0f) + (eVar.X / 2.0f);
        rectF.right = f11;
        rectF.bottom = eVar.e() + f142;
        float f152 = rectF.left;
        float f162 = this.f3326f0;
        rectF.left = f152 - f162;
        rectF.right += f162;
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f3329i0);
        d6.e eVar22 = (d6.e) this.f3321a0;
        Objects.requireNonNull(eVar22);
        eVar22.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.U0.i(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        if (this.f3347w != null && this.f3347w.getMeasuredHeight() < (max = Math.max(this.f3343u.getMeasuredHeight(), this.f3341t.getMeasuredHeight()))) {
            this.f3347w.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean v10 = v();
        if (z10 || v10) {
            this.f3347w.post(new c());
        }
        if (this.L != null && (editText = this.f3347w) != null) {
            this.L.setGravity(editText.getGravity());
            this.L.setPadding(this.f3347w.getCompoundPaddingLeft(), this.f3347w.getCompoundPaddingTop(), this.f3347w.getCompoundPaddingRight(), this.f3347w.getCompoundPaddingBottom());
        }
        D();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f17592s);
        setError(hVar.f3358u);
        if (hVar.f3359v) {
            this.f3348w0.post(new b());
        }
        setHint(hVar.f3360w);
        setHelperText(hVar.f3361x);
        setPlaceholderText(hVar.y);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.f3325e0;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float a10 = this.f3324d0.f224e.a(this.f3336p0);
            float a11 = this.f3324d0.f225f.a(this.f3336p0);
            float a12 = this.f3324d0.f227h.a(this.f3336p0);
            float a13 = this.f3324d0.f226g.a(this.f3336p0);
            float f10 = z10 ? a10 : a11;
            if (z10) {
                a10 = a11;
            }
            float f11 = z10 ? a12 : a13;
            if (z10) {
                a12 = a13;
            }
            boolean a14 = s.a(this);
            this.f3325e0 = a14;
            float f12 = a14 ? a10 : f10;
            if (!a14) {
                f10 = a10;
            }
            float f13 = a14 ? a12 : f11;
            if (!a14) {
                f11 = a12;
            }
            a6.g gVar = this.f3321a0;
            if (gVar != null && gVar.k() == f12) {
                a6.g gVar2 = this.f3321a0;
                if (gVar2.f191s.f199a.f225f.a(gVar2.h()) == f10) {
                    a6.g gVar3 = this.f3321a0;
                    if (gVar3.f191s.f199a.f227h.a(gVar3.h()) == f13) {
                        a6.g gVar4 = this.f3321a0;
                        if (gVar4.f191s.f199a.f226g.a(gVar4.h()) == f11) {
                            return;
                        }
                    }
                }
            }
            j jVar = this.f3324d0;
            Objects.requireNonNull(jVar);
            j.a aVar = new j.a(jVar);
            aVar.e(f12);
            aVar.f(f10);
            aVar.c(f13);
            aVar.d(f11);
            this.f3324d0 = aVar.a();
            d();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.C.e()) {
            hVar.f3358u = getError();
        }
        hVar.f3359v = i() && this.f3348w0.isChecked();
        hVar.f3360w = getHint();
        hVar.f3361x = getHelperText();
        hVar.y = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        d6.j.c(this, this.f3348w0, this.f3350y0);
    }

    public final void r(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(2131952037);
            Context context = getContext();
            Object obj = c0.a.f2602a;
            textView.setTextColor(a.c.a(context, R.color.design_error));
        }
    }

    public final void s() {
        if (this.G != null) {
            EditText editText = this.f3347w;
            t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f3333m0 != i10) {
            this.f3333m0 = i10;
            this.O0 = i10;
            this.Q0 = i10;
            this.R0 = i10;
            d();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = c0.a.f2602a;
        setBoxBackgroundColor(a.c.a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.O0 = defaultColor;
        this.f3333m0 = defaultColor;
        this.P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.Q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.R0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        d();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f3327g0) {
            return;
        }
        this.f3327g0 = i10;
        if (this.f3347w == null) {
            return;
        }
        m();
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f3328h0 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.M0 != i10) {
            this.M0 = i10;
            F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.M0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            F();
        }
        this.K0 = colorStateList.getDefaultColor();
        this.S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.M0 = defaultColor;
        F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            F();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f3330j0 = i10;
        F();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f3331k0 = i10;
        F();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.D != z10) {
            if (z10) {
                h0 h0Var = new h0(getContext(), null);
                this.G = h0Var;
                h0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f3337q0;
                if (typeface != null) {
                    this.G.setTypeface(typeface);
                }
                this.G.setMaxLines(1);
                this.C.a(this.G, 2);
                m0.g.h((ViewGroup.MarginLayoutParams) this.G.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                u();
                s();
            } else {
                this.C.j(this.G, 2);
                this.G = null;
            }
            this.D = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.E != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.E = i10;
            if (!this.D) {
                return;
            }
            s();
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.H != i10) {
            this.H = i10;
            u();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            u();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.I != i10) {
            this.I = i10;
            u();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            u();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.I0 = colorStateList;
        this.J0 = colorStateList;
        if (this.f3347w != null) {
            A(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        o(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f3348w0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f3348w0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f3348w0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f3348w0.setImageDrawable(drawable);
        if (drawable != null) {
            d6.j.a(this, this.f3348w0, this.f3350y0, this.f3352z0);
            p();
        }
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f3344u0;
        if (i11 == i10) {
            return;
        }
        this.f3344u0 = i10;
        Iterator<g> it = this.x0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i11);
        }
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f3327g0)) {
            getEndIconDelegate().a();
            d6.j.a(this, this.f3348w0, this.f3350y0, this.f3352z0);
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("The current box background mode ");
        c10.append(this.f3327g0);
        c10.append(" is not supported by the end icon mode ");
        c10.append(i10);
        throw new IllegalStateException(c10.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f3348w0;
        View.OnLongClickListener onLongClickListener = this.D0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3348w0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f3350y0 != colorStateList) {
            this.f3350y0 = colorStateList;
            d6.j.a(this, this.f3348w0, colorStateList, this.f3352z0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f3352z0 != mode) {
            this.f3352z0 = mode;
            d6.j.a(this, this.f3348w0, this.f3350y0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (k() != z10) {
            this.f3348w0.setVisibility(z10 ? 0 : 8);
            x();
            D();
            v();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.C.f3965k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            k kVar = this.C;
            kVar.c();
            kVar.f3964j = charSequence;
            kVar.f3966l.setText(charSequence);
            int i10 = kVar.f3962h;
            if (i10 != 1) {
                kVar.f3963i = 1;
            }
            kVar.l(i10, kVar.f3963i, kVar.k(kVar.f3966l, charSequence));
            return;
        }
        this.C.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        k kVar = this.C;
        kVar.f3967m = charSequence;
        h0 h0Var = kVar.f3966l;
        if (h0Var != null) {
            h0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        k kVar = this.C;
        if (kVar.f3965k == z10) {
            return;
        }
        kVar.c();
        if (z10) {
            h0 h0Var = new h0(kVar.f3955a, null);
            kVar.f3966l = h0Var;
            h0Var.setId(R.id.textinput_error);
            kVar.f3966l.setTextAlignment(5);
            Typeface typeface = kVar.f3974u;
            if (typeface != null) {
                kVar.f3966l.setTypeface(typeface);
            }
            int i10 = kVar.f3968n;
            kVar.f3968n = i10;
            h0 h0Var2 = kVar.f3966l;
            if (h0Var2 != null) {
                kVar.f3956b.r(h0Var2, i10);
            }
            ColorStateList colorStateList = kVar.f3969o;
            kVar.f3969o = colorStateList;
            h0 h0Var3 = kVar.f3966l;
            if (h0Var3 != null && colorStateList != null) {
                h0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = kVar.f3967m;
            kVar.f3967m = charSequence;
            h0 h0Var4 = kVar.f3966l;
            if (h0Var4 != null) {
                h0Var4.setContentDescription(charSequence);
            }
            kVar.f3966l.setVisibility(4);
            h0 h0Var5 = kVar.f3966l;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.g.f(h0Var5, 1);
            kVar.a(kVar.f3966l, 0);
        } else {
            kVar.i();
            kVar.j(kVar.f3966l, 0);
            kVar.f3966l = null;
            kVar.f3956b.w();
            kVar.f3956b.F();
        }
        kVar.f3965k = z10;
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
        d6.j.c(this, this.F0, this.G0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.F0.setImageDrawable(drawable);
        y();
        d6.j.a(this, this.F0, this.G0, this.H0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.F0;
        View.OnLongClickListener onLongClickListener = this.E0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.E0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.F0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            d6.j.a(this, this.F0, colorStateList, this.H0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            d6.j.a(this, this.F0, this.G0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        k kVar = this.C;
        kVar.f3968n = i10;
        h0 h0Var = kVar.f3966l;
        if (h0Var != null) {
            kVar.f3956b.r(h0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        k kVar = this.C;
        kVar.f3969o = colorStateList;
        h0 h0Var = kVar.f3966l;
        if (h0Var == null || colorStateList == null) {
            return;
        }
        h0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            A(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (!this.C.f3970q) {
                return;
            }
            setHelperTextEnabled(false);
            return;
        }
        if (!this.C.f3970q) {
            setHelperTextEnabled(true);
        }
        k kVar = this.C;
        kVar.c();
        kVar.p = charSequence;
        kVar.f3971r.setText(charSequence);
        int i10 = kVar.f3962h;
        if (i10 != 2) {
            kVar.f3963i = 2;
        }
        kVar.l(i10, kVar.f3963i, kVar.k(kVar.f3971r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        k kVar = this.C;
        kVar.f3973t = colorStateList;
        h0 h0Var = kVar.f3971r;
        if (h0Var == null || colorStateList == null) {
            return;
        }
        h0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        k kVar = this.C;
        if (kVar.f3970q == z10) {
            return;
        }
        kVar.c();
        if (z10) {
            h0 h0Var = new h0(kVar.f3955a, null);
            kVar.f3971r = h0Var;
            h0Var.setId(R.id.textinput_helper_text);
            kVar.f3971r.setTextAlignment(5);
            Typeface typeface = kVar.f3974u;
            if (typeface != null) {
                kVar.f3971r.setTypeface(typeface);
            }
            kVar.f3971r.setVisibility(4);
            h0 h0Var2 = kVar.f3971r;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.g.f(h0Var2, 1);
            int i10 = kVar.f3972s;
            kVar.f3972s = i10;
            h0 h0Var3 = kVar.f3971r;
            if (h0Var3 != null) {
                h0Var3.setTextAppearance(i10);
            }
            ColorStateList colorStateList = kVar.f3973t;
            kVar.f3973t = colorStateList;
            h0 h0Var4 = kVar.f3971r;
            if (h0Var4 != null && colorStateList != null) {
                h0Var4.setTextColor(colorStateList);
            }
            kVar.a(kVar.f3971r, 1);
            kVar.f3971r.setAccessibilityDelegate(new l(kVar));
        } else {
            kVar.c();
            int i11 = kVar.f3962h;
            if (i11 == 2) {
                kVar.f3963i = 0;
            }
            kVar.l(i11, kVar.f3963i, kVar.k(kVar.f3971r, ""));
            kVar.j(kVar.f3971r, 1);
            kVar.f3971r = null;
            kVar.f3956b.w();
            kVar.f3956b.F();
        }
        kVar.f3970q = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        k kVar = this.C;
        kVar.f3972s = i10;
        h0 h0Var = kVar.f3971r;
        if (h0Var != null) {
            h0Var.setTextAppearance(i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.U) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.W0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.U) {
            this.U = z10;
            if (!z10) {
                this.W = false;
                if (!TextUtils.isEmpty(this.V) && TextUtils.isEmpty(this.f3347w.getHint())) {
                    this.f3347w.setHint(this.V);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f3347w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.V)) {
                        setHint(hint);
                    }
                    this.f3347w.setHint((CharSequence) null);
                }
                this.W = true;
            }
            if (this.f3347w == null) {
                return;
            }
            z();
        }
    }

    public void setHintTextAppearance(int i10) {
        u5.e eVar = this.U0;
        x5.d dVar = new x5.d(eVar.f19084a.getContext(), i10);
        ColorStateList colorStateList = dVar.f20039j;
        if (colorStateList != null) {
            eVar.f19095l = colorStateList;
        }
        float f10 = dVar.f20040k;
        if (f10 != 0.0f) {
            eVar.f19093j = f10;
        }
        ColorStateList colorStateList2 = dVar.f20030a;
        if (colorStateList2 != null) {
            eVar.S = colorStateList2;
        }
        eVar.Q = dVar.f20034e;
        eVar.R = dVar.f20035f;
        eVar.P = dVar.f20036g;
        eVar.T = dVar.f20038i;
        x5.a aVar = eVar.f19107z;
        if (aVar != null) {
            aVar.f20029c = true;
        }
        u5.d dVar2 = new u5.d(eVar);
        dVar.a();
        eVar.f19107z = new x5.a(dVar2, dVar.f20043n);
        dVar.c(eVar.f19084a.getContext(), eVar.f19107z);
        eVar.k(false);
        this.J0 = this.U0.f19095l;
        if (this.f3347w != null) {
            A(false, false);
            z();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            if (this.I0 == null) {
                this.U0.l(colorStateList);
            }
            this.J0 = colorStateList;
            if (this.f3347w == null) {
                return;
            }
            A(false, false);
        }
    }

    public void setMaxEms(int i10) {
        this.f3351z = i10;
        EditText editText = this.f3347w;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.B = i10;
        EditText editText = this.f3347w;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.y = i10;
        EditText editText = this.f3347w;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.A = i10;
        EditText editText = this.f3347w;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3348w0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3348w0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f3344u0 != 1) {
            setEndIconMode(1);
        } else if (z10) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f3350y0 = colorStateList;
        d6.j.a(this, this.f3348w0, colorStateList, this.f3352z0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f3352z0 = mode;
        d6.j.a(this, this.f3348w0, this.f3350y0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.L == null) {
            h0 h0Var = new h0(getContext(), null);
            this.L = h0Var;
            h0Var.setId(R.id.textinput_placeholder);
            h0 h0Var2 = this.L;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.s(h0Var2, 2);
            p1.c cVar = new p1.c();
            cVar.f16907u = 87L;
            LinearInterpolator linearInterpolator = e5.a.f4408a;
            cVar.f16908v = linearInterpolator;
            this.O = cVar;
            cVar.f16906t = 67L;
            p1.c cVar2 = new p1.c();
            cVar2.f16907u = 87L;
            cVar2.f16908v = linearInterpolator;
            this.P = cVar2;
            setPlaceholderTextAppearance(this.N);
            setPlaceholderTextColor(this.M);
        }
        int i10 = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.K) {
                setPlaceholderTextEnabled(true);
            }
            this.J = charSequence;
        }
        EditText editText = this.f3347w;
        if (editText != null) {
            i10 = editText.getText().length();
        }
        B(i10);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.N = i10;
        h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            h0 h0Var = this.L;
            if (h0Var == null || colorStateList == null) {
                return;
            }
            h0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        p pVar = this.f3341t;
        Objects.requireNonNull(pVar);
        pVar.f3987u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f3986t.setText(charSequence);
        pVar.g();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f3341t.f3986t.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3341t.f3986t.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f3341t.f3988v.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f3341t.a(charSequence);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3341t.b(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f3341t.c(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3341t.d(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        p pVar = this.f3341t;
        if (pVar.f3989w != colorStateList) {
            pVar.f3989w = colorStateList;
            d6.j.a(pVar.f3985s, pVar.f3988v, colorStateList, pVar.f3990x);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f3341t;
        if (pVar.f3990x != mode) {
            pVar.f3990x = mode;
            d6.j.a(pVar.f3985s, pVar.f3988v, pVar.f3989w, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f3341t.e(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.S = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.T.setText(charSequence);
        E();
    }

    public void setSuffixTextAppearance(int i10) {
        this.T.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.T.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f3347w;
        if (editText != null) {
            z.p(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3337q0) {
            this.f3337q0 = typeface;
            this.U0.q(typeface);
            k kVar = this.C;
            if (typeface != kVar.f3974u) {
                kVar.f3974u = typeface;
                h0 h0Var = kVar.f3966l;
                if (h0Var != null) {
                    h0Var.setTypeface(typeface);
                }
                h0 h0Var2 = kVar.f3971r;
                if (h0Var2 != null) {
                    h0Var2.setTypeface(typeface);
                }
            }
            h0 h0Var3 = this.G;
            if (h0Var3 == null) {
                return;
            }
            h0Var3.setTypeface(typeface);
        }
    }

    public final void t(int i10) {
        boolean z10 = this.F;
        int i11 = this.E;
        String str = null;
        if (i11 == -1) {
            this.G.setText(String.valueOf(i10));
            this.G.setContentDescription(null);
            this.F = false;
        } else {
            this.F = i10 > i11;
            Context context = getContext();
            this.G.setContentDescription(context.getString(this.F ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(this.E)));
            if (z10 != this.F) {
                u();
            }
            k0.a c10 = k0.a.c();
            h0 h0Var = this.G;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.E));
            k0.c cVar = c10.f5548c;
            if (string != null) {
                str = ((SpannableStringBuilder) c10.d(string, cVar)).toString();
            }
            h0Var.setText(str);
        }
        if (this.f3347w == null || z10 == this.F) {
            return;
        }
        A(false, false);
        F();
        w();
    }

    public final void u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h0 h0Var = this.G;
        if (h0Var != null) {
            r(h0Var, this.F ? this.H : this.I);
            if (!this.F && (colorStateList2 = this.Q) != null) {
                this.G.setTextColor(colorStateList2);
            }
            if (!this.F || (colorStateList = this.R) == null) {
                return;
            }
            this.G.setTextColor(colorStateList);
        }
    }

    public final boolean v() {
        boolean z10;
        if (this.f3347w == null) {
            return false;
        }
        boolean z11 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f3341t.getMeasuredWidth() > 0) {
            int measuredWidth = this.f3341t.getMeasuredWidth() - this.f3347w.getPaddingLeft();
            if (this.f3338r0 == null || this.f3340s0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f3338r0 = colorDrawable;
                this.f3340s0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = k.b.a(this.f3347w);
            Drawable drawable = a10[0];
            ColorDrawable colorDrawable2 = this.f3338r0;
            if (drawable != colorDrawable2) {
                k.b.e(this.f3347w, colorDrawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f3338r0 != null) {
                Drawable[] a11 = k.b.a(this.f3347w);
                k.b.e(this.f3347w, null, a11[1], a11[2], a11[3]);
                this.f3338r0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if ((this.F0.getVisibility() == 0 || ((i() && k()) || this.S != null)) && this.f3343u.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.T.getMeasuredWidth() - this.f3347w.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = m0.g.c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] a12 = k.b.a(this.f3347w);
            ColorDrawable colorDrawable3 = this.A0;
            if (colorDrawable3 == null || this.B0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.A0 = colorDrawable4;
                    this.B0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = a12[2];
                ColorDrawable colorDrawable5 = this.A0;
                if (drawable2 != colorDrawable5) {
                    this.C0 = a12[2];
                    k.b.e(this.f3347w, a12[0], a12[1], colorDrawable5, a12[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.B0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                k.b.e(this.f3347w, a12[0], a12[1], this.A0, a12[3]);
            }
        } else if (this.A0 == null) {
            return z10;
        } else {
            Drawable[] a13 = k.b.a(this.f3347w);
            if (a13[2] == this.A0) {
                k.b.e(this.f3347w, a13[0], a13[1], this.C0, a13[3]);
            } else {
                z11 = z10;
            }
            this.A0 = null;
        }
        return z11;
    }

    public final void w() {
        Drawable background;
        int i10;
        h0 h0Var;
        EditText editText = this.f3347w;
        if (editText == null || this.f3327g0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (m0.a(background)) {
            background = background.mutate();
        }
        if (this.C.e()) {
            i10 = this.C.g();
        } else if (!this.F || (h0Var = this.G) == null) {
            background.clearColorFilter();
            this.f3347w.refreshDrawableState();
            return;
        } else {
            i10 = h0Var.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.l.c(i10, PorterDuff.Mode.SRC_IN));
    }

    public final void x() {
        int i10 = 8;
        this.f3345v.setVisibility((this.f3348w0.getVisibility() != 0 || l()) ? 8 : 0);
        boolean z10 = k() || l() || !((this.S == null || this.T0) ? true : false);
        LinearLayout linearLayout = this.f3343u;
        if (z10) {
            i10 = 0;
        }
        linearLayout.setVisibility(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L15
            d6.k r0 = r3.C
            boolean r2 = r0.f3965k
            if (r2 == 0) goto L15
            boolean r0 = r0.e()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = r1
        L16:
            com.google.android.material.internal.CheckableImageButton r2 = r3.F0
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r2.setVisibility(r1)
            r3.x()
            r3.D()
            boolean r0 = r3.i()
            if (r0 != 0) goto L2f
            r3.v()
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.y():void");
    }

    public final void z() {
        if (this.f3327g0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3339s.getLayoutParams();
            int e10 = e();
            if (e10 == layoutParams.topMargin) {
                return;
            }
            layoutParams.topMargin = e10;
            this.f3339s.requestLayout();
        }
    }
}
