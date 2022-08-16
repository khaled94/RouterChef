package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.raouf.routerchef.R;
import f8.h2;
import m0.c;
import m0.s;
import m0.z;
import p0.a;
import p0.b;
import q0.k;
import q0.l;

/* loaded from: classes.dex */
public class m extends EditText implements s {

    /* renamed from: s */
    public final f f946s;

    /* renamed from: t */
    public final f0 f947t;

    /* renamed from: u */
    public final d0 f948u;

    /* renamed from: v */
    public final l f949v;

    /* renamed from: w */
    public final n f950w;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        c1.a(context);
        a1.a(this, getContext());
        f fVar = new f(this);
        this.f946s = fVar;
        fVar.d(attributeSet, R.attr.editTextStyle);
        f0 f0Var = new f0(this);
        this.f947t = f0Var;
        f0Var.f(attributeSet, R.attr.editTextStyle);
        f0Var.b();
        this.f948u = new d0(this);
        this.f949v = new l();
        n nVar = new n(this);
        this.f950w = nVar;
        nVar.b(attributeSet, R.attr.editTextStyle);
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

    @Override // m0.s
    public final c a(c cVar) {
        return this.f949v.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f946s;
        if (fVar != null) {
            fVar.a();
        }
        f0 f0Var = this.f947t;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f946s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f946s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        d0 d0Var;
        return (Build.VERSION.SDK_INT >= 28 || (d0Var = this.f948u) == null) ? super.getTextClassifier() : d0Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] i11;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f947t.h(this, onCreateInputConnection, editorInfo);
        p.c(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && (i10 = Build.VERSION.SDK_INT) <= 30 && (i11 = z.i(this)) != null) {
            a.c(editorInfo, i11);
            h2 h2Var = new h2(this);
            if (i10 >= 25) {
                cVar = new b(onCreateInputConnection, h2Var);
            } else if (a.a(editorInfo).length != 0) {
                cVar = new p0.c(onCreateInputConnection, h2Var);
            }
            onCreateInputConnection = cVar;
        }
        return this.f950w.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && z.i(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = y.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && z.i(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                c.b aVar = i11 >= 31 ? new c.a(primaryClip, 1) : new c.C0094c(primaryClip, 1);
                if (i10 != 16908322) {
                    i12 = 1;
                }
                aVar.d(i12);
                z.l(this, aVar.a());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f946s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f946s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f950w.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f950w.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f946s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f946s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f947t;
        if (f0Var != null) {
            f0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        d0 d0Var;
        if (Build.VERSION.SDK_INT < 28 && (d0Var = this.f948u) != null) {
            d0Var.f815b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
