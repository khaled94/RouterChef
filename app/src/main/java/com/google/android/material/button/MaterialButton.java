package com.google.android.material.button;

import a6.j;
import a6.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.g;
import com.raouf.routerchef.R;
import f0.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import q0.k;
import u5.n;
import u5.s;

/* loaded from: classes.dex */
public class MaterialButton extends g implements Checkable, m {
    public static final int[] I = {16842911};
    public static final int[] J = {16842912};
    public Drawable A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int H;

    /* renamed from: v */
    public final j5.a f3083v;

    /* renamed from: x */
    public b f3085x;
    public PorterDuff.Mode y;

    /* renamed from: z */
    public ColorStateList f3086z;

    /* renamed from: w */
    public final LinkedHashSet<a> f3084w = new LinkedHashSet<>();
    public boolean F = false;
    public boolean G = false;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends s0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: u */
        public boolean f3087u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f3087u = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeInt(this.f3087u ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(e6.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131952599), attributeSet, R.attr.materialButtonStyle);
        boolean z10 = false;
        Context context2 = getContext();
        TypedArray d5 = n.d(context2, attributeSet, h6.a.D, R.attr.materialButtonStyle, 2131952599, new int[0]);
        this.E = d5.getDimensionPixelSize(12, 0);
        this.y = s.b(d5.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f3086z = x5.c.a(getContext(), d5, 14);
        this.A = x5.c.c(getContext(), d5, 10);
        this.H = d5.getInteger(11, 1);
        this.B = d5.getDimensionPixelSize(13, 0);
        j5.a aVar = new j5.a(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, 2131952599).a());
        this.f3083v = aVar;
        aVar.f5455c = d5.getDimensionPixelOffset(1, 0);
        aVar.f5456d = d5.getDimensionPixelOffset(2, 0);
        aVar.f5457e = d5.getDimensionPixelOffset(3, 0);
        aVar.f5458f = d5.getDimensionPixelOffset(4, 0);
        if (d5.hasValue(8)) {
            int dimensionPixelSize = d5.getDimensionPixelSize(8, -1);
            aVar.f5459g = dimensionPixelSize;
            aVar.c(aVar.f5454b.e(dimensionPixelSize));
            aVar.p = true;
        }
        aVar.f5460h = d5.getDimensionPixelSize(20, 0);
        aVar.f5461i = s.b(d5.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f5462j = x5.c.a(getContext(), d5, 6);
        aVar.f5463k = x5.c.a(getContext(), d5, 19);
        aVar.f5464l = x5.c.a(getContext(), d5, 16);
        aVar.f5468q = d5.getBoolean(5, false);
        aVar.f5470s = d5.getDimensionPixelSize(9, 0);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int f10 = z.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = z.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d5.hasValue(0)) {
            aVar.f5467o = true;
            setSupportBackgroundTintList(aVar.f5462j);
            setSupportBackgroundTintMode(aVar.f5461i);
        } else {
            aVar.e();
        }
        z.e.k(this, f10 + aVar.f5455c, paddingTop + aVar.f5457e, e10 + aVar.f5456d, paddingBottom + aVar.f5458f);
        d5.recycle();
        setCompoundDrawablePadding(this.E);
        g(this.A != null ? true : z10);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        j5.a aVar = this.f3083v;
        return aVar != null && aVar.f5468q;
    }

    public final boolean b() {
        int i10 = this.H;
        return i10 == 3 || i10 == 4;
    }

    public final boolean c() {
        int i10 = this.H;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.H;
        return i10 == 16 || i10 == 32;
    }

    public final boolean e() {
        j5.a aVar = this.f3083v;
        return aVar != null && !aVar.f5467o;
    }

    public final void f() {
        if (c()) {
            k.b.e(this, this.A, null, null, null);
        } else if (b()) {
            k.b.e(this, null, null, this.A, null);
        } else if (!d()) {
        } else {
            k.b.e(this, null, this.A, null, null);
        }
    }

    public final void g(boolean z10) {
        Drawable drawable = this.A;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A = mutate;
            a.b.h(mutate, this.f3086z);
            PorterDuff.Mode mode = this.y;
            if (mode != null) {
                a.b.i(this.A, mode);
            }
            int i10 = this.B;
            if (i10 == 0) {
                i10 = this.A.getIntrinsicWidth();
            }
            int i11 = this.B;
            if (i11 == 0) {
                i11 = this.A.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A;
            int i12 = this.C;
            int i13 = this.D;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.A.setVisible(true, z10);
        }
        if (z10) {
            f();
            return;
        }
        Drawable[] a10 = k.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.A) && ((!b() || drawable5 == this.A) && (!d() || drawable4 == this.A))) {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f3083v.f5459g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.A;
    }

    public int getIconGravity() {
        return this.H;
    }

    public int getIconPadding() {
        return this.E;
    }

    public int getIconSize() {
        return this.B;
    }

    public ColorStateList getIconTint() {
        return this.f3086z;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.y;
    }

    public int getInsetBottom() {
        return this.f3083v.f5458f;
    }

    public int getInsetTop() {
        return this.f3083v.f5457e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f3083v.f5464l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (e()) {
            return this.f3083v.f5454b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f3083v.f5463k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f3083v.f5460h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.g
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f3083v.f5462j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.g
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f3083v.f5461i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i10, int i11) {
        if (this.A == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (!d()) {
                return;
            }
            this.C = 0;
            if (this.H == 16) {
                this.D = 0;
                g(false);
                return;
            }
            int i12 = this.B;
            if (i12 == 0) {
                i12 = this.A.getIntrinsicHeight();
            }
            int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.E) - getPaddingBottom()) / 2;
            if (this.D == textHeight) {
                return;
            }
            this.D = textHeight;
            g(false);
        }
        this.D = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.H;
        boolean z10 = true;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.C = 0;
            g(false);
            return;
        }
        int i14 = this.B;
        if (i14 == 0) {
            i14 = this.A.getIntrinsicWidth();
        }
        int textWidth = i10 - getTextWidth();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int e10 = (((textWidth - z.e.e(this)) - i14) - this.E) - z.e.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            e10 /= 2;
        }
        boolean z11 = z.e.d(this) == 1;
        if (this.H != 4) {
            z10 = false;
        }
        if (z11 != z10) {
            e10 = -e10;
        }
        if (this.C == e10) {
            return;
        }
        this.C = e10;
        g(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.F;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            n.a.b(this, this.f3083v.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f17592s);
        setChecked(cVar.f3087u);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3087u = this.F;
        return cVar;
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A != null) {
            if (!this.A.setState(getDrawableState())) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.b(false) == null) {
                return;
            }
            aVar.b(false).setTint(i10);
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                j5.a aVar = this.f3083v;
                aVar.f5467o = true;
                aVar.f5453a.setSupportBackgroundTintList(aVar.f5462j);
                aVar.f5453a.setSupportBackgroundTintMode(aVar.f5461i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.f3083v.f5468q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!a() || !isEnabled() || this.F == z10) {
            return;
        }
        this.F = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z11 = this.F;
            if (!materialButtonToggleGroup.f3093x) {
                materialButtonToggleGroup.b(getId(), z11);
            }
        }
        if (this.G) {
            return;
        }
        this.G = true;
        Iterator<a> it = this.f3084w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.G = false;
    }

    public void setCornerRadius(int i10) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.p && aVar.f5459g == i10) {
                return;
            }
            aVar.f5459g = i10;
            aVar.p = true;
            aVar.c(aVar.f5454b.e(i10));
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            this.f3083v.b(false).n(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A != drawable) {
            this.A = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.H != i10) {
            this.H = i10;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.E != i10) {
            this.E = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.B == i10) {
                return;
            }
            this.B = i10;
            g(true);
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3086z != colorStateList) {
            this.f3086z = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.y != mode) {
            this.y = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(f.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        j5.a aVar = this.f3083v;
        aVar.d(aVar.f5457e, i10);
    }

    public void setInsetTop(int i10) {
        j5.a aVar = this.f3083v;
        aVar.d(i10, aVar.f5458f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f3085x = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f3085x;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.f5464l == colorStateList) {
                return;
            }
            aVar.f5464l = colorStateList;
            if (!(aVar.f5453a.getBackground() instanceof RippleDrawable)) {
                return;
            }
            ((RippleDrawable) aVar.f5453a.getBackground()).setColor(y5.a.a(colorStateList));
        }
    }

    public void setRippleColorResource(int i10) {
        if (e()) {
            setRippleColor(f.a.a(getContext(), i10));
        }
    }

    @Override // a6.m
    public void setShapeAppearanceModel(j jVar) {
        if (e()) {
            this.f3083v.c(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            j5.a aVar = this.f3083v;
            aVar.f5466n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.f5463k == colorStateList) {
                return;
            }
            aVar.f5463k = colorStateList;
            aVar.f();
        }
    }

    public void setStrokeColorResource(int i10) {
        if (e()) {
            setStrokeColor(f.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.f5460h == i10) {
                return;
            }
            aVar.f5460h = i10;
            aVar.f();
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.g
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.f5462j == colorStateList) {
                return;
            }
            aVar.f5462j = colorStateList;
            if (aVar.b(false) == null) {
                return;
            }
            a.b.h(aVar.b(false), aVar.f5462j);
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.g
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            j5.a aVar = this.f3083v;
            if (aVar.f5461i == mode) {
                return;
            }
            aVar.f5461i = mode;
            if (aVar.b(false) == null || aVar.f5461i == null) {
                return;
            }
            a.b.i(aVar.b(false), aVar.f5461i);
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.F);
    }
}
