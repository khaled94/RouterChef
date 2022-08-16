package com.google.android.material.chip;

import a6.g;
import a6.j;
import a6.k;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.raouf.routerchef.R;
import f0.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import u5.l;
import x5.d;

/* loaded from: classes.dex */
public final class a extends g implements Drawable.Callback, l.b {
    public static final int[] Z0 = {16842910};

    /* renamed from: a1 */
    public static final ShapeDrawable f3115a1 = new ShapeDrawable(new OvalShape());
    public final l D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public boolean K0;
    public int L0;
    public ColorFilter N0;
    public PorterDuffColorFilter O0;
    public ColorStateList P0;
    public ColorStateList Q;
    public ColorStateList R;
    public int[] R0;
    public float S;
    public boolean S0;
    public ColorStateList T0;
    public ColorStateList U;
    public float V;
    public TextUtils.TruncateAt V0;
    public ColorStateList W;
    public int X0;
    public boolean Y;
    public boolean Y0;
    public Drawable Z;

    /* renamed from: a0 */
    public ColorStateList f3116a0;

    /* renamed from: b0 */
    public float f3117b0;

    /* renamed from: c0 */
    public boolean f3118c0;

    /* renamed from: d0 */
    public boolean f3119d0;

    /* renamed from: e0 */
    public Drawable f3120e0;

    /* renamed from: f0 */
    public RippleDrawable f3121f0;

    /* renamed from: g0 */
    public ColorStateList f3122g0;

    /* renamed from: h0 */
    public float f3123h0;

    /* renamed from: i0 */
    public SpannableStringBuilder f3124i0;

    /* renamed from: j0 */
    public boolean f3125j0;

    /* renamed from: k0 */
    public boolean f3126k0;

    /* renamed from: l0 */
    public Drawable f3127l0;

    /* renamed from: m0 */
    public ColorStateList f3128m0;

    /* renamed from: n0 */
    public e5.g f3129n0;

    /* renamed from: o0 */
    public e5.g f3130o0;

    /* renamed from: p0 */
    public float f3131p0;

    /* renamed from: q0 */
    public float f3132q0;

    /* renamed from: r0 */
    public float f3133r0;

    /* renamed from: s0 */
    public float f3134s0;

    /* renamed from: t0 */
    public float f3135t0;

    /* renamed from: u0 */
    public float f3136u0;

    /* renamed from: v0 */
    public float f3137v0;

    /* renamed from: w0 */
    public float f3138w0;
    public final Context x0;
    public float T = -1.0f;

    /* renamed from: y0 */
    public final Paint f3139y0 = new Paint(1);

    /* renamed from: z0 */
    public final Paint.FontMetrics f3140z0 = new Paint.FontMetrics();
    public final RectF A0 = new RectF();
    public final PointF B0 = new PointF();
    public final Path C0 = new Path();
    public int M0 = 255;
    public PorterDuff.Mode Q0 = PorterDuff.Mode.SRC_IN;
    public WeakReference<AbstractC0043a> U0 = new WeakReference<>(null);
    public CharSequence X = "";
    public boolean W0 = true;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0043a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(new j(j.b(context, attributeSet, R.attr.chipStyle, 2131952613)));
        m(context);
        this.x0 = context;
        l lVar = new l(this);
        this.D0 = lVar;
        lVar.f19133a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Z0;
        setState(iArr);
        d0(iArr);
        int[] iArr2 = y5.a.f20873a;
        f3115a1.setTint(-1);
    }

    public static boolean G(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean H(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f10 = this.f3138w0 + this.f3137v0;
            if (a.c.a(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f3123h0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f3123h0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f3123h0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f10 = this.f3138w0 + this.f3137v0 + this.f3123h0 + this.f3136u0 + this.f3135t0;
            if (a.c.a(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public final float C() {
        if (q0()) {
            return this.f3136u0 + this.f3123h0 + this.f3137v0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.Y0 ? k() : this.T;
    }

    public final Drawable E() {
        Drawable drawable = this.f3120e0;
        if (drawable != null) {
            return f0.a.a(drawable);
        }
        return null;
    }

    public final float F() {
        Drawable drawable = this.K0 ? this.f3127l0 : this.Z;
        float f10 = this.f3117b0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public final void I() {
        AbstractC0043a abstractC0043a = this.U0.get();
        if (abstractC0043a != null) {
            abstractC0043a.a();
        }
    }

    public final boolean J(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.Q;
        int d5 = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.E0) : 0);
        boolean z12 = true;
        if (this.E0 != d5) {
            this.E0 = d5;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.R;
        int d10 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.F0) : 0);
        if (this.F0 != d10) {
            this.F0 = d10;
            onStateChange = true;
        }
        int b10 = e0.a.b(d10, d5);
        if ((this.G0 != b10) | (this.f191s.f201c == null)) {
            this.G0 = b10;
            o(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.U;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.H0) : 0;
        if (this.H0 != colorForState) {
            this.H0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.T0 == null || !y5.a.b(iArr)) ? 0 : this.T0.getColorForState(iArr, this.I0);
        if (this.I0 != colorForState2) {
            this.I0 = colorForState2;
            if (this.S0) {
                onStateChange = true;
            }
        }
        d dVar = this.D0.f19138f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f20039j) == null) ? 0 : colorStateList.getColorForState(iArr, this.J0);
        if (this.J0 != colorForState3) {
            this.J0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i10 : state) {
                if (i10 == 16842912) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z13 = z10 && this.f3125j0;
        if (this.K0 == z13 || this.f3127l0 == null) {
            z11 = false;
        } else {
            float z14 = z();
            this.K0 = z13;
            if (z14 != z()) {
                onStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.P0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.L0) : 0;
        if (this.L0 != colorForState4) {
            this.L0 = colorForState4;
            this.O0 = q5.a.a(this, this.P0, this.Q0);
        } else {
            z12 = onStateChange;
        }
        if (H(this.Z)) {
            z12 |= this.Z.setState(iArr);
        }
        if (H(this.f3127l0)) {
            z12 |= this.f3127l0.setState(iArr);
        }
        if (H(this.f3120e0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z12 |= this.f3120e0.setState(iArr3);
        }
        int[] iArr4 = y5.a.f20873a;
        if (H(this.f3121f0)) {
            z12 |= this.f3121f0.setState(iArr2);
        }
        if (z12) {
            invalidateSelf();
        }
        if (z11) {
            I();
        }
        return z12;
    }

    public final void K(boolean z10) {
        if (this.f3125j0 != z10) {
            this.f3125j0 = z10;
            float z11 = z();
            if (!z10 && this.K0) {
                this.K0 = false;
            }
            float z12 = z();
            invalidateSelf();
            if (z11 == z12) {
                return;
            }
            I();
        }
    }

    public final void L(Drawable drawable) {
        if (this.f3127l0 != drawable) {
            float z10 = z();
            this.f3127l0 = drawable;
            float z11 = z();
            r0(this.f3127l0);
            x(this.f3127l0);
            invalidateSelf();
            if (z10 == z11) {
                return;
            }
            I();
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f3128m0 != colorStateList) {
            this.f3128m0 = colorStateList;
            if (this.f3126k0 && this.f3127l0 != null && this.f3125j0) {
                a.b.h(this.f3127l0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.f3126k0 != z10) {
            boolean o02 = o0();
            this.f3126k0 = z10;
            boolean o03 = o0();
            if (!(o02 != o03)) {
                return;
            }
            if (o03) {
                x(this.f3127l0);
            } else {
                r0(this.f3127l0);
            }
            invalidateSelf();
            I();
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public final void P(float f10) {
        if (this.T != f10) {
            this.T = f10;
            setShapeAppearanceModel(this.f191s.f199a.e(f10));
        }
    }

    public final void Q(float f10) {
        if (this.f3138w0 != f10) {
            this.f3138w0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2 = this.Z;
        Drawable drawable3 = null;
        Drawable a10 = drawable2 != null ? f0.a.a(drawable2) : null;
        if (a10 != drawable) {
            float z10 = z();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.Z = drawable3;
            float z11 = z();
            r0(a10);
            if (p0()) {
                x(this.Z);
            }
            invalidateSelf();
            if (z10 == z11) {
                return;
            }
            I();
        }
    }

    public final void S(float f10) {
        if (this.f3117b0 != f10) {
            float z10 = z();
            this.f3117b0 = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 == z11) {
                return;
            }
            I();
        }
    }

    public final void T(ColorStateList colorStateList) {
        this.f3118c0 = true;
        if (this.f3116a0 != colorStateList) {
            this.f3116a0 = colorStateList;
            if (p0()) {
                a.b.h(this.Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void U(boolean z10) {
        if (this.Y != z10) {
            boolean p02 = p0();
            this.Y = z10;
            boolean p03 = p0();
            if (!(p02 != p03)) {
                return;
            }
            if (p03) {
                x(this.Z);
            } else {
                r0(this.Z);
            }
            invalidateSelf();
            I();
        }
    }

    public final void V(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidateSelf();
            I();
        }
    }

    public final void W(float f10) {
        if (this.f3131p0 != f10) {
            this.f3131p0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.Y0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(float f10) {
        if (this.V != f10) {
            this.V = f10;
            this.f3139y0.setStrokeWidth(f10);
            if (this.Y0) {
                t(f10);
            }
            invalidateSelf();
        }
    }

    public final void Z(Drawable drawable) {
        Drawable E = E();
        if (E != drawable) {
            float C = C();
            this.f3120e0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = y5.a.f20873a;
            this.f3121f0 = new RippleDrawable(y5.a.a(this.W), this.f3120e0, f3115a1);
            float C2 = C();
            r0(E);
            if (q0()) {
                x(this.f3120e0);
            }
            invalidateSelf();
            if (C == C2) {
                return;
            }
            I();
        }
    }

    @Override // u5.l.b
    public final void a() {
        I();
        invalidateSelf();
    }

    public final void a0(float f10) {
        if (this.f3137v0 != f10) {
            this.f3137v0 = f10;
            invalidateSelf();
            if (!q0()) {
                return;
            }
            I();
        }
    }

    public final void b0(float f10) {
        if (this.f3123h0 != f10) {
            this.f3123h0 = f10;
            invalidateSelf();
            if (!q0()) {
                return;
            }
            I();
        }
    }

    public final void c0(float f10) {
        if (this.f3136u0 != f10) {
            this.f3136u0 = f10;
            invalidateSelf();
            if (!q0()) {
                return;
            }
            I();
        }
    }

    public final boolean d0(int[] iArr) {
        if (!Arrays.equals(this.R0, iArr)) {
            this.R0 = iArr;
            if (!q0()) {
                return false;
            }
            return J(getState(), iArr);
        }
        return false;
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.M0) == 0) {
            return;
        }
        int saveLayerAlpha = i10 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        if (!this.Y0) {
            this.f3139y0.setColor(this.E0);
            this.f3139y0.setStyle(Paint.Style.FILL);
            this.A0.set(bounds);
            canvas.drawRoundRect(this.A0, D(), D(), this.f3139y0);
        }
        if (!this.Y0) {
            this.f3139y0.setColor(this.F0);
            this.f3139y0.setStyle(Paint.Style.FILL);
            Paint paint = this.f3139y0;
            ColorFilter colorFilter = this.N0;
            if (colorFilter == null) {
                colorFilter = this.O0;
            }
            paint.setColorFilter(colorFilter);
            this.A0.set(bounds);
            canvas.drawRoundRect(this.A0, D(), D(), this.f3139y0);
        }
        if (this.Y0) {
            super.draw(canvas);
        }
        if (this.V > 0.0f && !this.Y0) {
            this.f3139y0.setColor(this.H0);
            this.f3139y0.setStyle(Paint.Style.STROKE);
            if (!this.Y0) {
                Paint paint2 = this.f3139y0;
                ColorFilter colorFilter2 = this.N0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.O0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.A0;
            float f11 = this.V / 2.0f;
            rectF.set(bounds.left + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.T - (this.V / 2.0f);
            canvas.drawRoundRect(this.A0, f12, f12, this.f3139y0);
        }
        this.f3139y0.setColor(this.I0);
        this.f3139y0.setStyle(Paint.Style.FILL);
        this.A0.set(bounds);
        if (!this.Y0) {
            canvas.drawRoundRect(this.A0, D(), D(), this.f3139y0);
        } else {
            RectF rectF2 = new RectF(bounds);
            Path path = this.C0;
            k kVar = this.J;
            g.b bVar = this.f191s;
            kVar.a(bVar.f199a, bVar.f208j, rectF2, this.I, path);
            f(canvas, this.f3139y0, this.C0, this.f191s.f199a, h());
        }
        if (p0()) {
            y(bounds, this.A0);
            RectF rectF3 = this.A0;
            float f13 = rectF3.left;
            float f14 = rectF3.top;
            canvas.translate(f13, f14);
            this.Z.setBounds(0, 0, (int) this.A0.width(), (int) this.A0.height());
            this.Z.draw(canvas);
            canvas.translate(-f13, -f14);
        }
        if (o0()) {
            y(bounds, this.A0);
            RectF rectF4 = this.A0;
            float f15 = rectF4.left;
            float f16 = rectF4.top;
            canvas.translate(f15, f16);
            this.f3127l0.setBounds(0, 0, (int) this.A0.width(), (int) this.A0.height());
            this.f3127l0.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (!this.W0 || this.X == null) {
            i11 = saveLayerAlpha;
            i12 = 0;
            i13 = 255;
        } else {
            PointF pointF = this.B0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.X != null) {
                float z10 = z() + this.f3131p0 + this.f3134s0;
                if (a.c.a(this) == 0) {
                    pointF.x = bounds.left + z10;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - z10;
                    align = Paint.Align.RIGHT;
                }
                this.D0.f19133a.getFontMetrics(this.f3140z0);
                Paint.FontMetrics fontMetrics = this.f3140z0;
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF5 = this.A0;
            rectF5.setEmpty();
            if (this.X != null) {
                float z11 = z() + this.f3131p0 + this.f3134s0;
                float C = C() + this.f3138w0 + this.f3135t0;
                if (a.c.a(this) == 0) {
                    rectF5.left = bounds.left + z11;
                    f10 = bounds.right - C;
                } else {
                    rectF5.left = bounds.left + C;
                    f10 = bounds.right - z11;
                }
                rectF5.right = f10;
                rectF5.top = bounds.top;
                rectF5.bottom = bounds.bottom;
            }
            l lVar = this.D0;
            if (lVar.f19138f != null) {
                lVar.f19133a.drawableState = getState();
                l lVar2 = this.D0;
                lVar2.f19138f.e(this.x0, lVar2.f19133a, lVar2.f19134b);
            }
            this.D0.f19133a.setTextAlign(align);
            boolean z12 = Math.round(this.D0.a(this.X.toString())) > Math.round(this.A0.width());
            if (z12) {
                i14 = canvas.save();
                canvas.clipRect(this.A0);
            } else {
                i14 = 0;
            }
            CharSequence charSequence = this.X;
            if (z12 && this.V0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.D0.f19133a, this.A0.width(), this.V0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.B0;
            i11 = saveLayerAlpha;
            i12 = 0;
            i13 = 255;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.D0.f19133a);
            if (z12) {
                canvas.restoreToCount(i14);
            }
        }
        if (q0()) {
            A(bounds, this.A0);
            RectF rectF6 = this.A0;
            float f17 = rectF6.left;
            float f18 = rectF6.top;
            canvas.translate(f17, f18);
            this.f3120e0.setBounds(i12, i12, (int) this.A0.width(), (int) this.A0.height());
            int[] iArr = y5.a.f20873a;
            this.f3121f0.setBounds(this.f3120e0.getBounds());
            this.f3121f0.jumpToCurrentState();
            this.f3121f0.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.M0 >= i13) {
            return;
        }
        canvas.restoreToCount(i11);
    }

    public final void e0(ColorStateList colorStateList) {
        if (this.f3122g0 != colorStateList) {
            this.f3122g0 = colorStateList;
            if (q0()) {
                a.b.h(this.f3120e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f0(boolean z10) {
        if (this.f3119d0 != z10) {
            boolean q02 = q0();
            this.f3119d0 = z10;
            boolean q03 = q0();
            if (!(q02 != q03)) {
                return;
            }
            if (q03) {
                x(this.f3120e0);
            } else {
                r0(this.f3120e0);
            }
            invalidateSelf();
            I();
        }
    }

    public final void g0(float f10) {
        if (this.f3133r0 != f10) {
            float z10 = z();
            this.f3133r0 = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 == z11) {
                return;
            }
            I();
        }
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.S;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.D0.a(this.X.toString()) + z() + this.f3131p0 + this.f3134s0 + this.f3135t0 + this.f3138w0), this.X0);
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.Y0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.T);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.S, this.T);
        }
        outline.setAlpha(this.M0 / 255.0f);
    }

    public final void h0(float f10) {
        if (this.f3132q0 != f10) {
            float z10 = z();
            this.f3132q0 = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 == z11) {
                return;
            }
            I();
        }
    }

    public final void i0(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            this.T0 = this.S0 ? y5.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!G(this.Q) && !G(this.R) && !G(this.U) && (!this.S0 || !G(this.T0))) {
            d dVar = this.D0.f19138f;
            if (!((dVar == null || (colorStateList = dVar.f20039j) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.f3126k0 && this.f3127l0 != null && this.f3125j0) && !H(this.Z) && !H(this.f3127l0) && !G(this.P0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.X, charSequence)) {
            this.X = charSequence;
            this.D0.f19136d = true;
            invalidateSelf();
            I();
        }
    }

    public final void k0(d dVar) {
        l lVar = this.D0;
        Context context = this.x0;
        if (lVar.f19138f != dVar) {
            lVar.f19138f = dVar;
            if (dVar != null) {
                dVar.f(context, lVar.f19133a, lVar.f19134b);
                l.b bVar = lVar.f19137e.get();
                if (bVar != null) {
                    lVar.f19133a.drawableState = bVar.getState();
                }
                dVar.e(context, lVar.f19133a, lVar.f19134b);
                lVar.f19136d = true;
            }
            l.b bVar2 = lVar.f19137e.get();
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
            bVar2.onStateChange(bVar2.getState());
        }
    }

    public final void l0(float f10) {
        if (this.f3135t0 != f10) {
            this.f3135t0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void m0(float f10) {
        if (this.f3134s0 != f10) {
            this.f3134s0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void n0() {
        if (this.S0) {
            this.S0 = false;
            this.T0 = null;
            onStateChange(getState());
        }
    }

    public final boolean o0() {
        return this.f3126k0 && this.f3127l0 != null && this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (p0()) {
            onLayoutDirectionChanged |= a.c.b(this.Z, i10);
        }
        if (o0()) {
            onLayoutDirectionChanged |= a.c.b(this.f3127l0, i10);
        }
        if (q0()) {
            onLayoutDirectionChanged |= a.c.b(this.f3120e0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (p0()) {
            onLevelChange |= this.Z.setLevel(i10);
        }
        if (o0()) {
            onLevelChange |= this.f3127l0.setLevel(i10);
        }
        if (q0()) {
            onLevelChange |= this.f3120e0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.Y0) {
            super.onStateChange(iArr);
        }
        return J(iArr, this.R0);
    }

    public final boolean p0() {
        return this.Y && this.Z != null;
    }

    public final boolean q0() {
        return this.f3119d0 && this.f3120e0 != null;
    }

    public final void r0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.M0 != i10) {
            this.M0 = i10;
            invalidateSelf();
        }
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.N0 != colorFilter) {
            this.N0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.P0 != colorStateList) {
            this.P0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // a6.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.Q0 != mode) {
            this.Q0 = mode;
            this.O0 = q5.a.a(this, this.P0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (p0()) {
            visible |= this.Z.setVisible(z10, z11);
        }
        if (o0()) {
            visible |= this.f3127l0.setVisible(z10, z11);
        }
        if (q0()) {
            visible |= this.f3120e0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.c.b(drawable, a.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f3120e0) {
            if (drawable.isStateful()) {
                drawable.setState(this.R0);
            }
            a.b.h(drawable, this.f3122g0);
            return;
        }
        Drawable drawable2 = this.Z;
        if (drawable == drawable2 && this.f3118c0) {
            a.b.h(drawable2, this.f3116a0);
        }
        if (!drawable.isStateful()) {
            return;
        }
        drawable.setState(getState());
    }

    public final void y(Rect rect, RectF rectF) {
        float f10;
        rectF.setEmpty();
        if (p0() || o0()) {
            float f11 = this.f3131p0 + this.f3132q0;
            float F = F();
            if (a.c.a(this) == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + F;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - F;
            }
            Drawable drawable = this.K0 ? this.f3127l0 : this.Z;
            float f14 = this.f3117b0;
            if (f14 <= 0.0f && drawable != null) {
                f14 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.x0.getResources().getDisplayMetrics()));
                if (drawable.getIntrinsicHeight() <= f14) {
                    f10 = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f14;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float z() {
        if (p0() || o0()) {
            return F() + this.f3132q0 + this.f3133r0;
        }
        return 0.0f;
    }
}
