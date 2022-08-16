package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.raouf.routerchef.R;
import f.a;
import q0.k;

/* loaded from: classes.dex */
public class e extends AutoCompleteTextView {

    /* renamed from: v */
    public static final int[] f820v = {16843126};

    /* renamed from: s */
    public final f f821s;

    /* renamed from: t */
    public final f0 f822t;

    /* renamed from: u */
    public final n f823u;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        c1.a(context);
        a1.a(this, getContext());
        f1 q10 = f1.q(getContext(), attributeSet, f820v, R.attr.autoCompleteTextViewStyle);
        if (q10.o(0)) {
            setDropDownBackgroundDrawable(q10.g(0));
        }
        q10.r();
        f fVar = new f(this);
        this.f821s = fVar;
        fVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        f0 f0Var = new f0(this);
        this.f822t = f0Var;
        f0Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        f0Var.b();
        n nVar = new n(this);
        this.f823u = nVar;
        nVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a10 = nVar.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f821s;
        if (fVar != null) {
            fVar.a();
        }
        f0 f0Var = this.f822t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f821s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f821s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p.c(onCreateInputConnection, editorInfo, this);
        return this.f823u.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f821s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f821s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.g(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f823u.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f823u.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f821s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f821s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f822t;
        if (f0Var != null) {
            f0Var.g(context, i10);
        }
    }
}
