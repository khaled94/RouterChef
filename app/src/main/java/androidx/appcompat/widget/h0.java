package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e0.f;
import e0.l;
import f.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k0.b;
import q0.b;
import q0.k;
import q0.m;

/* loaded from: classes.dex */
public class h0 extends TextView implements m, b {

    /* renamed from: s */
    public final f f862s;

    /* renamed from: t */
    public final f0 f863t;

    /* renamed from: u */
    public final d0 f864u;

    /* renamed from: v */
    public o f865v;

    /* renamed from: w */
    public boolean f866w;

    /* renamed from: x */
    public Future<k0.b> f867x;

    public h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c1.a(context);
        this.f866w = false;
        a1.a(this, getContext());
        f fVar = new f(this);
        this.f862s = fVar;
        fVar.d(attributeSet, i10);
        f0 f0Var = new f0(this);
        this.f863t = f0Var;
        f0Var.f(attributeSet, i10);
        f0Var.b();
        this.f864u = new d0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private o getEmojiTextViewHelper() {
        if (this.f865v == null) {
            this.f865v = new o(this);
        }
        return this.f865v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f862s;
        if (fVar != null) {
            fVar.a();
        }
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.f17043g) {
            return super.getAutoSizeMaxTextSize();
        }
        f0 f0Var = this.f863t;
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
        f0 f0Var = this.f863t;
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
        f0 f0Var = this.f863t;
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
        f0 f0Var = this.f863t;
        return f0Var != null ? f0Var.f838i.f882f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f17043g) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f0 f0Var = this.f863t;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f838i.f877a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f862s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f862s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        d1 d1Var = this.f863t.f837h;
        if (d1Var != null) {
            return d1Var.f816a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        d1 d1Var = this.f863t.f837h;
        if (d1Var != null) {
            return d1Var.f817b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<k0.b> future = this.f867x;
        if (future != null) {
            try {
                this.f867x = null;
                k.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        d0 d0Var;
        return (Build.VERSION.SDK_INT >= 28 || (d0Var = this.f864u) == null) ? super.getTextClassifier() : d0Var.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return k.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f863t.h(this, onCreateInputConnection, editorInfo);
        p.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            Objects.requireNonNull(f0Var);
            if (q0.b.f17043g) {
                return;
            }
            f0Var.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<k0.b> future = this.f867x;
        if (future != null) {
            try {
                this.f867x = null;
                k.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        f0 f0Var = this.f863t;
        if (f0Var == null || q0.b.f17043g || !f0Var.e()) {
            return;
        }
        this.f863t.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (q0.b.f17043g) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        f0 f0Var = this.f863t;
        if (f0Var == null) {
            return;
        }
        f0Var.j(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (q0.b.f17043g) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        f0 f0Var = this.f863t;
        if (f0Var == null) {
            return;
        }
        f0Var.k(iArr, i10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q0.b.f17043g) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        f0 f0Var = this.f863t;
        if (f0Var == null) {
            return;
        }
        f0Var.l(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f862s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f862s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            k.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            k.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        k.d(this, i10);
    }

    public void setPrecomputedText(k0.b bVar) {
        k.e(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f862s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f862s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // q0.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f863t.m(colorStateList);
        this.f863t.b();
    }

    @Override // q0.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f863t.n(mode);
        this.f863t.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        d0 d0Var;
        if (Build.VERSION.SDK_INT < 28 && (d0Var = this.f864u) != null) {
            d0Var.f815b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<k0.b> future) {
        this.f867x = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f5555b;
        int i10 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
        }
        k.b.h(this, i10);
        getPaint().set(aVar.f5554a);
        k.c.e(this, aVar.f5556c);
        k.c.h(this, aVar.f5557d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = q0.b.f17043g;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        f0 f0Var = this.f863t;
        if (f0Var == null) {
            return;
        }
        Objects.requireNonNull(f0Var);
        if (z10 || f0Var.e()) {
            return;
        }
        f0Var.f838i.f(i10, f10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        if (this.f866w) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            l lVar = f.f4318a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i10);
        }
        this.f866w = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f866w = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f863t;
        if (f0Var != null) {
            f0Var.b();
        }
    }
}
