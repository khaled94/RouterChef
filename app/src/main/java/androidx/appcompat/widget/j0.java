package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public final class j0 extends ToggleButton {

    /* renamed from: s */
    public final f f912s;

    /* renamed from: t */
    public final f0 f913t;

    /* renamed from: u */
    public o f914u;

    public j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        a1.a(this, getContext());
        f fVar = new f(this);
        this.f912s = fVar;
        fVar.d(attributeSet, 16842827);
        f0 f0Var = new f0(this);
        this.f913t = f0Var;
        f0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().b(attributeSet, 16842827);
    }

    private o getEmojiTextViewHelper() {
        if (this.f914u == null) {
            this.f914u = new o(this);
        }
        return this.f914u;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f912s;
        if (fVar != null) {
            fVar.a();
        }
        f0 f0Var = this.f913t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f912s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f912s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f912s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f912s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f912s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f912s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }
}
