package com.google.android.material.chip;

import a6.j;
import a6.m;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.h;
import com.google.android.material.chip.a;
import com.raouf.routerchef.R;
import e5.g;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;
import u5.i;
import x5.d;
import x5.f;

/* loaded from: classes.dex */
public class Chip extends h implements a.AbstractC0043a, m, i<Chip> {
    public static final Rect P = new Rect();
    public static final int[] Q = {16842913};
    public static final int[] R = {16842911};
    public CompoundButton.OnCheckedChangeListener A;
    public i.a<Chip> B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public CharSequence J;
    public final b K;
    public boolean L;
    public final Rect M = new Rect();
    public final RectF N = new RectF();
    public final a O = new a();

    /* renamed from: w */
    public com.google.android.material.chip.a f3103w;

    /* renamed from: x */
    public InsetDrawable f3104x;
    public RippleDrawable y;

    /* renamed from: z */
    public View.OnClickListener f3105z;

    /* loaded from: classes.dex */
    public class a extends f {
        public a() {
            Chip.this = r1;
        }

        @Override // x5.f
        public final void c(int i10) {
        }

        @Override // x5.f
        public final void d(Typeface typeface, boolean z10) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f3103w;
            if (aVar.W0) {
                charSequence = aVar.X;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends t0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Chip chip) {
            super(chip);
            Chip.this = r1;
        }

        @Override // t0.a
        public final void m(List<Integer> list) {
            boolean z10 = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.P;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                com.google.android.material.chip.a aVar = chip2.f3103w;
                if (aVar != null && aVar.f3119d0) {
                    z10 = true;
                }
                if (!z10 || chip2.f3105z == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // t0.a
        public final boolean p(int i10, int i11) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 != 1) {
                    return false;
                }
                return Chip.this.g();
            }
            return false;
        }

        @Override // t0.a
        public final void q(int i10, n0.f fVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                fVar.q(closeIconContentDescription);
                fVar.l(Chip.this.getCloseIconTouchBoundsInt());
                fVar.b(f.a.f16404e);
                fVar.f16401a.setEnabled(Chip.this.isEnabled());
                return;
            }
            fVar.q(charSequence);
            fVar.l(Chip.P);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public RectF getCloseIconTouchBounds() {
        this.N.setEmpty();
        if (e() && this.f3105z != null) {
            com.google.android.material.chip.a aVar = this.f3103w;
            aVar.B(aVar.getBounds(), this.N);
        }
        return this.N;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.M.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.M;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.D0.f19138f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.AbstractC0043a
    public final void a() {
        d(this.I);
        requestLayout();
        invalidateOutline();
    }

    public final boolean d(int i10) {
        this.I = i10;
        int i11 = 0;
        if (!this.G) {
            if (this.f3104x != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int max = Math.max(0, i10 - ((int) this.f3103w.S));
        int max2 = Math.max(0, i10 - this.f3103w.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f3104x != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int i12 = max2 > 0 ? max2 / 2 : 0;
        if (max > 0) {
            i11 = max / 2;
        }
        int i13 = i11;
        if (this.f3104x != null) {
            Rect rect = new Rect();
            this.f3104x.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                j();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f3104x = new InsetDrawable((Drawable) this.f3103w, i12, i13, i12, i13);
        j();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.L
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.K
            android.view.accessibility.AccessibilityManager r1 = r0.f18416h
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L74
            android.view.accessibility.AccessibilityManager r1 = r0.f18416h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1e
            goto L74
        L1e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L44
            r4 = 9
            if (r1 == r4) goto L44
            r4 = 10
            if (r1 == r4) goto L34
            goto L74
        L34:
            int r1 = r0.f18421m
            if (r1 == r7) goto L74
            if (r1 != r7) goto L3b
            goto L72
        L3b:
            r0.f18421m = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L72
        L44:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L62
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = b(r8)
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L62
            r1 = r2
            goto L63
        L62:
            r1 = r3
        L63:
            int r4 = r0.f18421m
            if (r4 != r1) goto L68
            goto L70
        L68:
            r0.f18421m = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L70:
            if (r1 == r7) goto L74
        L72:
            r0 = r2
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 != 0) goto L7f
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L7e
            goto L7f
        L7e:
            r2 = r3
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.L) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.K;
        Objects.requireNonNull(bVar);
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i10 < repeatCount && bVar.n(i11, null)) {
                                    i10++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f18420l;
                    if (i12 != Integer.MIN_VALUE) {
                        bVar.p(i12, 16);
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = bVar.n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = bVar.n(1, null);
            }
        }
        if (z10 && this.K.f18420l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.h, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f3103w;
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (aVar != null && com.google.android.material.chip.a.H(aVar.f3120e0)) {
            com.google.android.material.chip.a aVar2 = this.f3103w;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.F) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.E) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.D) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.F) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.E) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.D) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            z10 = aVar2.d0(iArr);
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f3103w;
        return (aVar == null || aVar.E() == null) ? false : true;
    }

    public final boolean f() {
        com.google.android.material.chip.a aVar = this.f3103w;
        return aVar != null && aVar.f3125j0;
    }

    public final boolean g() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f3105z;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.L) {
            this.K.s(1, 1);
        }
        return z10;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f3110z.f19080d) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3104x;
        return insetDrawable == null ? this.f3103w : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3127l0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3128m0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.R;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return Math.max(0.0f, aVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3103w;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3138w0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar == null || (drawable = aVar.Z) == null) {
            return null;
        }
        return f0.a.a(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3117b0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3116a0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.S;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3131p0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.V;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3124i0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3137v0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3123h0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3136u0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3122g0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.V0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.L) {
            b bVar = this.K;
            if (bVar.f18420l == 1 || bVar.f18419k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3130o0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3133r0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3132q0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f3103w.f191s.f199a;
    }

    public g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3129n0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3135t0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            return aVar.f3134s0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f3104x != null) {
            this.f3104x = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            j();
        }
    }

    public final void i() {
        if (e()) {
            com.google.android.material.chip.a aVar = this.f3103w;
            if ((aVar != null && aVar.f3119d0) && this.f3105z != null) {
                z.p(this, this.K);
                this.L = true;
                return;
            }
        }
        z.p(this, null);
        this.L = false;
    }

    public final void j() {
        int[] iArr = y5.a.f20873a;
        k();
    }

    public final void k() {
        this.y = new RippleDrawable(y5.a.a(this.f3103w.W), getBackgroundDrawable(), null);
        this.f3103w.n0();
        RippleDrawable rippleDrawable = this.y;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.q(this, rippleDrawable);
        l();
    }

    public final void l() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f3103w) == null) {
            return;
        }
        int C = (int) (aVar.C() + aVar.f3138w0 + aVar.f3135t0);
        com.google.android.material.chip.a aVar2 = this.f3103w;
        int z10 = (int) (aVar2.z() + aVar2.f3131p0 + aVar2.f3134s0);
        if (this.f3104x != null) {
            Rect rect = new Rect();
            this.f3104x.getPadding(rect);
            z10 += rect.left;
            C += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.e.k(this, z10, paddingTop, C, paddingBottom);
    }

    public final void m() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.O);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.a.b(this, this.f3103w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.L) {
            b bVar = this.K;
            int i11 = bVar.f18420l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.k(i11);
            }
            if (!z10) {
                return;
            }
            bVar.n(i10, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z10 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z10 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z10);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.f19112u) {
                i10 = 0;
                for (int i12 = 0; i12 < chipGroup.getChildCount(); i12++) {
                    if (chipGroup.getChildAt(i12) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i12)) == this) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            i10 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(i11, 1, i10, 1, isChecked()).f16417a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.H != i10) {
            this.H = i10;
            l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L21;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.D
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.D
            if (r0 == 0) goto L34
            r5.g()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.y) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.y) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.K(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.K(aVar.x0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar == null) {
            this.C = z10;
        } else if (!aVar.f3125j0) {
        } else {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.L(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.L(f.a.b(aVar.x0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.M(f.a.a(aVar.x0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.N(aVar.x0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.N(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.O(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.O(f.a.a(aVar.x0, i10));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.P(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f3103w;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.U0 = new WeakReference<>(null);
            }
            this.f3103w = aVar;
            aVar.W0 = false;
            Objects.requireNonNull(aVar);
            aVar.U0 = new WeakReference<>(this);
            d(this.I);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.Q(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.Q(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.R(f.a.b(aVar.x0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.S(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.T(f.a.a(aVar.x0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.U(aVar.x0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.U(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.V(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.W(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.W(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.X(f.a.a(aVar.x0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.Y(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.Y(aVar.x0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.Z(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar == null || aVar.f3124i0 == charSequence) {
            return;
        }
        k0.a c10 = k0.a.c();
        aVar.f3124i0 = (SpannableStringBuilder) c10.d(charSequence, c10.f5548c);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.a0(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.a0(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.Z(f.a.b(aVar.x0, i10));
        }
        i();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.b0(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.b0(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.c0(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.c0(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.e0(f.a.a(aVar.x0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.f0(z10);
        }
        i();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.n(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3103w == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar == null) {
            return;
        }
        aVar.V0 = truncateAt;
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.G = z10;
        d(this.I);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.f3130o0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.f3130o0 = g.a(aVar.x0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.g0(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.g0(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.h0(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.h0(aVar.x0.getResources().getDimension(i10));
        }
    }

    @Override // u5.i
    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.B = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f3103w == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.X0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3105z = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.i0(colorStateList);
        }
        if (!this.f3103w.S0) {
            k();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.i0(f.a.a(aVar.x0, i10));
            if (this.f3103w.S0) {
                return;
            }
            k();
        }
    }

    @Override // a6.m
    public void setShapeAppearanceModel(j jVar) {
        this.f3103w.setShapeAppearanceModel(jVar);
    }

    public void setShowMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.f3129n0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.f3129n0 = g.a(aVar.x0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.W0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f3103w;
        if (aVar2 == null) {
            return;
        }
        aVar2.j0(charSequence);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.k0(new d(aVar.x0, i10));
        }
        m();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.k0(dVar);
        }
        m();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.l0(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.l0(aVar.x0.getResources().getDimension(i10));
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.m0(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.m0(aVar.x0.getResources().getDimension(i10));
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f3103w;
        if (aVar != null) {
            aVar.k0(new d(aVar.x0, i10));
        }
        m();
    }
}
