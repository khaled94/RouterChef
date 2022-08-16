package com.google.android.material.textfield;

import a6.g;
import a6.j;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import u5.m;

/* loaded from: classes.dex */
public final class b extends d6.i {

    /* renamed from: e */
    public final a f3376e = new a();

    /* renamed from: f */
    public final c f3377f = new c();

    /* renamed from: g */
    public final d f3378g = new d(this.f3951a);

    /* renamed from: h */
    public final e f3379h = new e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    public final f f3380i = new f();

    /* renamed from: j */
    public final g f3381j = new g();

    /* renamed from: k */
    public final h f3382k = new h();

    /* renamed from: l */
    public boolean f3383l = false;

    /* renamed from: m */
    public boolean f3384m = false;

    /* renamed from: n */
    public long f3385n = Long.MAX_VALUE;

    /* renamed from: o */
    public StateListDrawable f3386o;
    public a6.g p;

    /* renamed from: q */
    public AccessibilityManager f3387q;

    /* renamed from: r */
    public ValueAnimator f3388r;

    /* renamed from: s */
    public ValueAnimator f3389s;

    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: com.google.android.material.textfield.b$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0049a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ AutoCompleteTextView f3391s;

            public RunnableC0049a(AutoCompleteTextView autoCompleteTextView) {
                a.this = r1;
                this.f3391s = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean isPopupShowing = this.f3391s.isPopupShowing();
                b.f(b.this, isPopupShowing);
                b.this.f3383l = isPopupShowing;
            }
        }

        public a() {
            b.this = r1;
        }

        @Override // u5.m, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView d5 = b.d(b.this.f3951a.getEditText());
            if (b.this.f3387q.isTouchExplorationEnabled() && b.e(d5) && !b.this.f3953c.hasFocus()) {
                d5.dismissDropDown();
            }
            d5.post(new RunnableC0049a(d5));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b */
    /* loaded from: classes.dex */
    public class C0050b implements ValueAnimator.AnimatorUpdateListener {
        public C0050b() {
            b.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f3953c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnFocusChangeListener {
        public c() {
            b.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            b.this.f3951a.setEndIconActivated(z10);
            if (!z10) {
                b.f(b.this, false);
                b.this.f3383l = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends TextInputLayout.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
            b.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, m0.a
        public final void d(View view, n0.f fVar) {
            super.d(view, fVar);
            if (!b.e(b.this.f3951a.getEditText())) {
                fVar.n(Spinner.class.getName());
            }
            if (fVar.j()) {
                fVar.s(null);
            }
        }

        @Override // m0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            AutoCompleteTextView d5 = b.d(b.this.f3951a.getEditText());
            if (accessibilityEvent.getEventType() != 1 || !b.this.f3387q.isEnabled() || b.e(b.this.f3951a.getEditText())) {
                return;
            }
            b.g(b.this, d5);
            b.h(b.this);
        }
    }

    /* loaded from: classes.dex */
    public class e implements TextInputLayout.f {
        public e() {
            b.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
        @Override // com.google.android.material.textfield.TextInputLayout.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.google.android.material.textfield.TextInputLayout r6) {
            /*
                r5 = this;
                android.widget.EditText r0 = r6.getEditText()
                android.widget.AutoCompleteTextView r0 = com.google.android.material.textfield.b.d(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f3951a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L17
                a6.g r1 = r1.p
                goto L1b
            L17:
                if (r2 != r4) goto L1e
                android.graphics.drawable.StateListDrawable r1 = r1.f3386o
            L1b:
                r0.setDropDownBackgroundDrawable(r1)
            L1e:
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                r1.i(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                java.util.Objects.requireNonNull(r1)
                d6.h r2 = new d6.h
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                com.google.android.material.textfield.b$c r2 = r1.f3377f
                r0.setOnFocusChangeListener(r2)
                d6.f r2 = new d6.f
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r1 = 0
                r0.setThreshold(r1)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$a r2 = r2.f3376e
                r0.removeTextChangedListener(r2)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$a r2 = r2.f3376e
                r0.addTextChangedListener(r2)
                r6.setEndIconCheckable(r4)
                r2 = 0
                r6.setErrorIconDrawable(r2)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L5d
                r1 = r4
            L5d:
                if (r1 != 0) goto L72
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                android.view.accessibility.AccessibilityManager r0 = r0.f3387q
                boolean r0 = r0.isTouchExplorationEnabled()
                if (r0 == 0) goto L72
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.internal.CheckableImageButton r0 = r0.f3953c
                java.util.WeakHashMap<android.view.View, m0.f0> r1 = m0.z.f5921a
                m0.z.d.s(r0, r3)
            L72:
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$d r0 = r0.f3378g
                r6.setTextInputAccessibilityDelegate(r0)
                r6.setEndIconVisible(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.b.e.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* loaded from: classes.dex */
    public class f implements TextInputLayout.g {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ AutoCompleteTextView f3398s;

            public a(AutoCompleteTextView autoCompleteTextView) {
                f.this = r1;
                this.f3398s = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3398s.removeTextChangedListener(b.this.f3376e);
            }
        }

        public f() {
            b.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f3377f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i10 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.f3381j);
                b bVar = b.this;
                AccessibilityManager accessibilityManager = bVar.f3387q;
                if (accessibilityManager == null) {
                    return;
                }
                n0.c.b(accessibilityManager, bVar.f3382k);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnAttachStateChangeListener {
        public g() {
            b.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            b.this.j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            AccessibilityManager accessibilityManager = bVar.f3387q;
            if (accessibilityManager != null) {
                n0.c.b(accessibilityManager, bVar.f3382k);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements n0.d {
        public h() {
            b.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public i() {
            b.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.g(b.this, (AutoCompleteTextView) b.this.f3951a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(b bVar, boolean z10) {
        if (bVar.f3384m != z10) {
            bVar.f3384m = z10;
            bVar.f3389s.cancel();
            bVar.f3388r.start();
        }
    }

    public static void g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(bVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (bVar.m()) {
            bVar.f3383l = false;
        }
        if (bVar.f3383l) {
            bVar.f3383l = false;
            return;
        }
        boolean z10 = bVar.f3384m;
        boolean z11 = !z10;
        if (z10 != z11) {
            bVar.f3384m = z11;
            bVar.f3389s.cancel();
            bVar.f3388r.start();
        }
        if (!bVar.f3384m) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    public static void h(b bVar) {
        bVar.f3383l = true;
        bVar.f3385n = System.currentTimeMillis();
    }

    @Override // d6.i
    public final void a() {
        float dimensionPixelOffset = this.f3952b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f3952b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f3952b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        a6.g l10 = l(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        a6.g l11 = l(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.p = l10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3386o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, l10);
        this.f3386o.addState(new int[0], l11);
        int i10 = this.f3954d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_dropdown_arrow;
        }
        this.f3951a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f3951a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f3951a.setEndIconOnClickListener(new i());
        this.f3951a.a(this.f3379h);
        this.f3951a.b(this.f3380i);
        this.f3389s = k(67, 0.0f, 1.0f);
        ValueAnimator k10 = k(50, 1.0f, 0.0f);
        this.f3388r = k10;
        k10.addListener(new d6.g(this));
        this.f3387q = (AccessibilityManager) this.f3952b.getSystemService("accessibility");
        this.f3951a.addOnAttachStateChangeListener(this.f3381j);
        j();
    }

    @Override // d6.i
    public final boolean b(int i10) {
        return i10 != 0;
    }

    public final void i(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f3951a.getBoxBackgroundMode();
        a6.g boxBackground = this.f3951a.getBoxBackground();
        int b10 = h6.a.b(autoCompleteTextView, R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode != 2) {
            if (boxBackgroundMode != 1) {
                return;
            }
            int boxBackgroundColor = this.f3951a.getBoxBackgroundColor();
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{h6.a.f(b10, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.q(autoCompleteTextView, rippleDrawable);
            return;
        }
        int b11 = h6.a.b(autoCompleteTextView, R.attr.colorSurface);
        a6.g gVar = new a6.g(boxBackground.f191s.f199a);
        int f10 = h6.a.f(b10, b11, 0.1f);
        gVar.o(new ColorStateList(iArr, new int[]{f10, 0}));
        gVar.setTint(b11);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f10, b11});
        a6.g gVar2 = new a6.g(boxBackground.f191s.f199a);
        gVar2.setTint(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
        WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
        z.d.q(autoCompleteTextView, layerDrawable);
    }

    public final void j() {
        TextInputLayout textInputLayout;
        if (this.f3387q == null || (textInputLayout = this.f3951a) == null) {
            return;
        }
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.b(textInputLayout)) {
            return;
        }
        n0.c.a(this.f3387q, this.f3382k);
    }

    public final ValueAnimator k(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e5.a.f4408a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new C0050b());
        return ofFloat;
    }

    public final a6.g l(float f10, float f11, float f12, int i10) {
        j.a aVar = new j.a();
        aVar.e(f10);
        aVar.f(f10);
        aVar.c(f11);
        aVar.d(f11);
        j a10 = aVar.a();
        Context context = this.f3952b;
        String str = a6.g.O;
        int b10 = x5.b.b(context, R.attr.colorSurface, a6.g.class.getSimpleName());
        a6.g gVar = new a6.g();
        gVar.m(context);
        gVar.o(ColorStateList.valueOf(b10));
        gVar.n(f12);
        gVar.setShapeAppearanceModel(a10);
        g.b bVar = gVar.f191s;
        if (bVar.f206h == null) {
            bVar.f206h = new Rect();
        }
        gVar.f191s.f206h.set(0, i10, 0, i10);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean m() {
        long currentTimeMillis = System.currentTimeMillis() - this.f3385n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
