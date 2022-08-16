package v0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a */
    public final TextView f19753a;

    /* renamed from: b */
    public a f19754b;

    /* loaded from: classes.dex */
    public static class a extends d.e {

        /* renamed from: a */
        public final Reference<TextView> f19755a;

        /* renamed from: b */
        public final Reference<d> f19756b;

        public a(TextView textView, d dVar) {
            this.f19755a = new WeakReference(textView);
            this.f19756b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.e
        public final void b() {
            InputFilter[] filters;
            TextView textView = this.f19755a.get();
            d dVar = this.f19756b.get();
            boolean z10 = false;
            if (dVar != null && textView != null && (filters = textView.getFilters()) != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= filters.length) {
                        break;
                    } else if (filters[i10] == dVar) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence h10 = androidx.emoji2.text.d.a().h(textView.getText());
                int selectionStart = Selection.getSelectionStart(h10);
                int selectionEnd = Selection.getSelectionEnd(h10);
                textView.setText(h10);
                if (!(h10 instanceof Spannable)) {
                    return;
                }
                Spannable spannable = (Spannable) h10;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd < 0) {
                } else {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }

    public d(TextView textView) {
        this.f19753a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f19753a.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.d.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f19753a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.d.a().i(charSequence, 0, charSequence.length());
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
        if (this.f19754b == null) {
            this.f19754b = new a(this.f19753a, this);
        }
        a10.j(this.f19754b);
        return charSequence;
    }
}
