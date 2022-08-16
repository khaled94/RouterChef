package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.raouf.routerchef.R;
import f.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class h extends CheckBox {

    /* renamed from: s */
    public final k f858s;

    /* renamed from: t */
    public final f f859t;

    /* renamed from: u */
    public final f0 f860u;

    /* renamed from: v */
    public o f861v;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c1.a(context);
        a1.a(this, getContext());
        k kVar = new k(this);
        this.f858s = kVar;
        kVar.b(attributeSet, i10);
        f fVar = new f(this);
        this.f859t = fVar;
        fVar.d(attributeSet, i10);
        f0 f0Var = new f0(this);
        this.f860u = f0Var;
        f0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private o getEmojiTextViewHelper() {
        if (this.f861v == null) {
            this.f861v = new o(this);
        }
        return this.f861v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f859t;
        if (fVar != null) {
            fVar.a();
        }
        f0 f0Var = this.f860u;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        k kVar = this.f858s;
        if (kVar != null) {
            Objects.requireNonNull(kVar);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f859t;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f859t;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        k kVar = this.f858s;
        if (kVar != null) {
            return kVar.f916b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        k kVar = this.f858s;
        if (kVar != null) {
            return kVar.f917c;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f859t;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f859t;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        k kVar = this.f858s;
        if (kVar != null) {
            if (kVar.f920f) {
                kVar.f920f = false;
                return;
            }
            kVar.f920f = true;
            kVar.a();
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
        f fVar = this.f859t;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f859t;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        k kVar = this.f858s;
        if (kVar != null) {
            kVar.f916b = colorStateList;
            kVar.f918d = true;
            kVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        k kVar = this.f858s;
        if (kVar != null) {
            kVar.f917c = mode;
            kVar.f919e = true;
            kVar.a();
        }
    }
}
