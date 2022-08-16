package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.raouf.routerchef.R;
import java.util.Objects;
import q0.b;
import q0.k;
import q0.m;

/* loaded from: classes.dex */
public class g extends Button implements b, m {

    /* renamed from: s */
    public final f f850s;

    /* renamed from: t */
    public final f0 f851t;

    /* renamed from: u */
    public o f852u;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c1.a(context);
        a1.a(this, getContext());
        f fVar = new f(this);
        this.f850s = fVar;
        fVar.d(attributeSet, i10);
        f0 f0Var = new f0(this);
        this.f851t = f0Var;
        f0Var.f(attributeSet, i10);
        f0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private o getEmojiTextViewHelper() {
        if (this.f852u == null) {
            this.f852u = new o(this);
        }
        return this.f852u;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f850s;
        if (fVar != null) {
            fVar.a();
        }
        f0 f0Var = this.f851t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.f17043g) {
            return super.getAutoSizeMaxTextSize();
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return -1;
        }
        return Math.round(f0Var.f838i.f881e);
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.f17043g) {
            return super.getAutoSizeMinTextSize();
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return -1;
        }
        return Math.round(f0Var.f838i.f880d);
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.f17043g) {
            return super.getAutoSizeStepGranularity();
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return -1;
        }
        return Math.round(f0Var.f838i.f879c);
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f17043g) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f0 f0Var = this.f851t;
        return f0Var != null ? f0Var.f838i.f882f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f17043g) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f838i.f877a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f850s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f850s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        d1 d1Var = this.f851t.f837h;
        if (d1Var != null) {
            return d1Var.f816a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        d1 d1Var = this.f851t.f837h;
        if (d1Var != null) {
            return d1Var.f817b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f0 f0Var = this.f851t;
        if (f0Var != null) {
            Objects.requireNonNull(f0Var);
            if (b.f17043g) {
                return;
            }
            f0Var.c();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        f0 f0Var = this.f851t;
        if (f0Var == null || b.f17043g || !f0Var.e()) {
            return;
        }
        this.f851t.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (b.f17043g) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return;
        }
        f0Var.j(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (b.f17043g) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return;
        }
        f0Var.k(iArr, i10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.f17043g) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return;
        }
        f0Var.l(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f850s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f850s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        f0 f0Var = this.f851t;
        if (f0Var != null) {
            f0Var.i(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f850s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f850s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // q0.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f851t.m(colorStateList);
        this.f851t.b();
    }

    @Override // q0.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f851t.n(mode);
        this.f851t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f851t;
        if (f0Var != null) {
            f0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = b.f17043g;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        f0 f0Var = this.f851t;
        if (f0Var == null) {
            return;
        }
        Objects.requireNonNull(f0Var);
        if (z10 || f0Var.e()) {
            return;
        }
        f0Var.f838i.f(i10, f10);
    }
}
