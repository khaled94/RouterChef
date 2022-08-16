package v0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: s */
    public final EditText f19764s;

    /* renamed from: u */
    public a f19766u;

    /* renamed from: t */
    public final boolean f19765t = false;

    /* renamed from: v */
    public boolean f19767v = true;

    /* loaded from: classes.dex */
    public static class a extends d.e {

        /* renamed from: a */
        public final Reference<EditText> f19768a;

        public a(EditText editText) {
            this.f19768a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public final void b() {
            g.a(this.f19768a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f19764s = editText;
    }

    public static void a(EditText editText, int i10) {
        if (i10 != 1 || editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        d.a().h(editableText);
        if (selectionStart >= 0 && selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionStart, selectionEnd);
        } else if (selectionStart >= 0) {
            Selection.setSelection(editableText, selectionStart);
        } else if (selectionEnd < 0) {
        } else {
            Selection.setSelection(editableText, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f19764s.isInEditMode()) {
            if ((!this.f19767v || (!this.f19765t && !d.c())) || i11 > i12 || !(charSequence instanceof Spannable)) {
                return;
            }
            int b10 = d.a().b();
            if (b10 != 0) {
                if (b10 == 1) {
                    d.a().i((Spannable) charSequence, i10, i12 + i10);
                    return;
                } else if (b10 != 3) {
                    return;
                }
            }
            d a10 = d.a();
            if (this.f19766u == null) {
                this.f19766u = new a(this.f19764s);
            }
            a10.j(this.f19766u);
        }
    }
}
