package androidx.appcompat.widget;

import a6.f;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import com.raouf.routerchef.R;
import f0.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m0.f0;
import m0.x;
import m0.z;
import q0.k;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: l0 */
    public static final Property<SwitchCompat, Float> f711l0 = new a();

    /* renamed from: m0 */
    public static final int[] f712m0 = {16842912};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public CharSequence G;
    public CharSequence H;
    public CharSequence I;
    public CharSequence J;
    public boolean K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0 */
    public int f713a0;

    /* renamed from: b0 */
    public int f714b0;

    /* renamed from: c0 */
    public final TextPaint f715c0;

    /* renamed from: d0 */
    public ColorStateList f716d0;

    /* renamed from: e0 */
    public StaticLayout f717e0;

    /* renamed from: f0 */
    public StaticLayout f718f0;

    /* renamed from: g0 */
    public i.a f719g0;

    /* renamed from: h0 */
    public ObjectAnimator f720h0;

    /* renamed from: i0 */
    public o f721i0;

    /* renamed from: j0 */
    public b f722j0;

    /* renamed from: s */
    public Drawable f724s;

    /* renamed from: t */
    public ColorStateList f725t;

    /* renamed from: u */
    public PorterDuff.Mode f726u;

    /* renamed from: v */
    public boolean f727v;

    /* renamed from: w */
    public boolean f728w;

    /* renamed from: x */
    public Drawable f729x;
    public ColorStateList y;

    /* renamed from: z */
    public PorterDuff.Mode f730z;
    public VelocityTracker P = VelocityTracker.obtain();

    /* renamed from: k0 */
    public final Rect f723k0 = new Rect();

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.R);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d.e {

        /* renamed from: a */
        public final Reference<SwitchCompat> f731a;

        public b(SwitchCompat switchCompat) {
            this.f731a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.d.e
        public final void a() {
            SwitchCompat switchCompat = this.f731a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }

        @Override // androidx.emoji2.text.d.e
        public final void b() {
            SwitchCompat switchCompat = this.f731a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        int resourceId;
        i.a aVar = null;
        this.f725t = null;
        this.f726u = null;
        this.f727v = false;
        this.f728w = false;
        this.y = null;
        this.f730z = null;
        this.A = false;
        this.B = false;
        a1.a(this, getContext());
        boolean z10 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f715c0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = f.O;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        f1 f1Var = new f1(context, obtainStyledAttributes);
        z.o(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle);
        Drawable g10 = f1Var.g(2);
        this.f724s = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = f1Var.g(11);
        this.f729x = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(f1Var.n(0));
        setTextOffInternal(f1Var.n(1));
        this.K = f1Var.a(3, true);
        this.C = f1Var.f(8, 0);
        this.D = f1Var.f(5, 0);
        this.E = f1Var.f(6, 0);
        this.F = f1Var.a(4, false);
        ColorStateList c10 = f1Var.c(9);
        if (c10 != null) {
            this.f725t = c10;
            this.f727v = true;
        }
        PorterDuff.Mode e10 = m0.e(f1Var.j(10, -1), null);
        if (this.f726u != e10) {
            this.f726u = e10;
            this.f728w = true;
        }
        if (this.f727v || this.f728w) {
            a();
        }
        ColorStateList c11 = f1Var.c(12);
        if (c11 != null) {
            this.y = c11;
            this.A = true;
        }
        PorterDuff.Mode e11 = m0.e(f1Var.j(13, -1), null);
        if (this.f730z != e11) {
            this.f730z = e11;
            this.B = true;
        }
        if (this.A || this.B) {
            b();
        }
        int l10 = f1Var.l(7, 0);
        if (l10 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(l10, f.P);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = f.a.a(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            this.f716d0 = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i10 = obtainStyledAttributes2.getInt(1, -1);
            int i11 = obtainStyledAttributes2.getInt(2, -1);
            if (i10 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i10 != 2) {
                typeface = i10 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f11 = 0.0f;
            if (i11 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
                setSwitchTypeface(defaultFromStyle);
                int i12 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i11;
                textPaint.setFakeBoldText((i12 & 1) == 0 ? false : z10);
                textPaint.setTextSkewX((i12 & 2) != 0 ? -0.25f : f11);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.f719g0 = obtainStyledAttributes2.getBoolean(14, false) ? new i.a(getContext()) : aVar;
            setTextOnInternal(this.G);
            setTextOffInternal(this.I);
            obtainStyledAttributes2.recycle();
        }
        new f0(this).f(attributeSet, R.attr.switchStyle);
        f1Var.r();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.M = viewConfiguration.getScaledTouchSlop();
        this.Q = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private o getEmojiTextViewHelper() {
        if (this.f721i0 == null) {
            this.f721i0 = new o(this);
        }
        return this.f721i0;
    }

    private boolean getTargetCheckedState() {
        return this.R > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((n1.b(this) ? 1.0f - this.R : this.R) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f729x;
        if (drawable != null) {
            Rect rect = this.f723k0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f724s;
            Rect d5 = drawable2 != null ? m0.d(drawable2) : m0.f953c;
            return ((((this.S - this.U) - rect.left) - rect.right) - d5.left) - d5.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.I = charSequence;
        this.J = c(charSequence);
        this.f718f0 = null;
        if (this.K) {
            h();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.G = charSequence;
        this.H = c(charSequence);
        this.f717e0 = null;
        if (this.K) {
            h();
        }
    }

    public final void a() {
        Drawable drawable = this.f724s;
        if (drawable != null) {
            if (!this.f727v && !this.f728w) {
                return;
            }
            Drawable mutate = drawable.mutate();
            this.f724s = mutate;
            if (this.f727v) {
                a.b.h(mutate, this.f725t);
            }
            if (this.f728w) {
                a.b.i(this.f724s, this.f726u);
            }
            if (!this.f724s.isStateful()) {
                return;
            }
            this.f724s.setState(getDrawableState());
        }
    }

    public final void b() {
        Drawable drawable = this.f729x;
        if (drawable != null) {
            if (!this.A && !this.B) {
                return;
            }
            Drawable mutate = drawable.mutate();
            this.f729x = mutate;
            if (this.A) {
                a.b.h(mutate, this.y);
            }
            if (this.B) {
                a.b.i(this.f729x, this.f730z);
            }
            if (!this.f729x.isStateful()) {
                return;
            }
            this.f729x.setState(getDrawableState());
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        TransformationMethod e10 = getEmojiTextViewHelper().f974b.f19759a.e(this.f719g0);
        return e10 != null ? e10.getTransformation(charSequence, this) : charSequence;
    }

    public final Layout d(CharSequence charSequence) {
        TextPaint textPaint = this.f715c0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f723k0;
        int i12 = this.V;
        int i13 = this.W;
        int i14 = this.f713a0;
        int i15 = this.f714b0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f724s;
        Rect d5 = drawable != null ? m0.d(drawable) : m0.f953c;
        Drawable drawable2 = this.f729x;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d5 != null) {
                int i17 = d5.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d5.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d5.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d5.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f729x.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f729x.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f724s;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.U + rect.right;
            this.f724s.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                a.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f724s;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f729x;
        if (drawable2 != null) {
            a.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f724s;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f729x;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        setTextOnInternal(this.G);
        setTextOffInternal(this.I);
        requestLayout();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.I;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            new x(CharSequence.class).e(this, obj);
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.G;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            new x(CharSequence.class).e(this, obj);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!n1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.S;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.E : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (n1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.S;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.E : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.K;
    }

    public boolean getSplitTrack() {
        return this.F;
    }

    public int getSwitchMinWidth() {
        return this.D;
    }

    public int getSwitchPadding() {
        return this.E;
    }

    public CharSequence getTextOff() {
        return this.I;
    }

    public CharSequence getTextOn() {
        return this.G;
    }

    public Drawable getThumbDrawable() {
        return this.f724s;
    }

    public int getThumbTextPadding() {
        return this.C;
    }

    public ColorStateList getThumbTintList() {
        return this.f725t;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f726u;
    }

    public Drawable getTrackDrawable() {
        return this.f729x;
    }

    public ColorStateList getTrackTintList() {
        return this.y;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f730z;
    }

    public final void h() {
        if (this.f722j0 != null || !this.f721i0.f974b.f19759a.b() || !d.c()) {
            return;
        }
        d a10 = d.a();
        int b10 = a10.b();
        if (b10 != 3 && b10 != 0) {
            return;
        }
        b bVar = new b(this);
        this.f722j0 = bVar;
        a10.j(bVar);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f724s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f729x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f720h0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f720h0.end();
        this.f720h0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f712m0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        Rect rect = this.f723k0;
        Drawable drawable = this.f729x;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.W;
        int i12 = this.f714b0;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f724s;
        if (drawable != null) {
            if (!this.F || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d5 = m0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d5.left;
                rect.right -= d5.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f717e0 : this.f718f0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f716d0;
            if (colorStateList != null) {
                this.f715c0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f715c0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((i10 / 2) - (staticLayout.getWidth() / 2), ((i13 + i14) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.G : this.I;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f724s != null) {
            Rect rect = this.f723k0;
            Drawable drawable = this.f729x;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d5 = m0.d(this.f724s);
            i14 = Math.max(0, d5.left - rect.left);
            i19 = Math.max(0, d5.right - rect.right);
        } else {
            i14 = 0;
        }
        if (n1.b(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.S + i16) - i14) - i19;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i19;
            i16 = (i15 - this.S) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i20 = this.T;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i20 / 2);
            i17 = i20 + height;
            i18 = height;
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i17 = this.T + i18;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.T;
        }
        this.V = i16;
        this.W = i18;
        this.f714b0 = i17;
        this.f713a0 = i15;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.K) {
            if (this.f717e0 == null) {
                this.f717e0 = (StaticLayout) d(this.H);
            }
            if (this.f718f0 == null) {
                this.f718f0 = (StaticLayout) d(this.J);
            }
        }
        Rect rect = this.f723k0;
        Drawable drawable = this.f724s;
        int i15 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f724s.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f724s.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        if (this.K) {
            i14 = (this.C * 2) + Math.max(this.f717e0.getWidth(), this.f718f0.getWidth());
        } else {
            i14 = 0;
        }
        this.U = Math.max(i14, i13);
        Drawable drawable2 = this.f729x;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f729x.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f724s;
        if (drawable3 != null) {
            Rect d5 = m0.d(drawable3);
            i16 = Math.max(i16, d5.left);
            i17 = Math.max(i17, d5.right);
        }
        int max = Math.max(this.D, (this.U * 2) + i16 + i17);
        int max2 = Math.max(i15, i12);
        this.S = max;
        this.T = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.G : this.I;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L79;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            g();
        } else {
            f();
        }
        float f10 = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.g.c(this)) {
                if (!isChecked) {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f711l0, f10);
                this.f720h0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f720h0.setAutoCancel(true);
                this.f720h0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f720h0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.G);
        setTextOffInternal(this.I);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            requestLayout();
            if (!z10) {
                return;
            }
            h();
        }
    }

    public void setSplitTrack(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f715c0.getTypeface() == null || this.f715c0.getTypeface().equals(typeface)) && (this.f715c0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f715c0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            f();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            g();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f724s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f724s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.R = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(f.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f725t = colorStateList;
        this.f727v = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f726u = mode;
        this.f728w = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f729x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f729x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(f.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        this.A = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f730z = mode;
        this.B = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f724s || drawable == this.f729x;
    }
}
