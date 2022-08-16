package e1;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends androidx.preference.a {
    public EditText K0;
    public CharSequence L0;
    public final RunnableC0063a M0 = new RunnableC0063a();
    public long N0 = -1;

    /* renamed from: e1.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0063a implements Runnable {
        public RunnableC0063a() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.n0();
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.n, androidx.fragment.app.o
    public final void F(Bundle bundle) {
        CharSequence charSequence;
        super.F(bundle);
        if (bundle == null) {
            charSequence = m0().f1749l0;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.L0 = charSequence;
    }

    @Override // androidx.preference.a, androidx.fragment.app.n, androidx.fragment.app.o
    public final void N(Bundle bundle) {
        super.N(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.L0);
    }

    @Override // androidx.preference.a
    public final void i0(View view) {
        super.i0(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.K0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.K0.setText(this.L0);
            EditText editText2 = this.K0;
            editText2.setSelection(editText2.getText().length());
            Objects.requireNonNull(m0());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.a
    public final void j0(boolean z10) {
        if (z10) {
            String obj = this.K0.getText().toString();
            EditTextPreference m02 = m0();
            if (!m02.b(obj)) {
                return;
            }
            m02.G(obj);
        }
    }

    @Override // androidx.preference.a
    public final void l0() {
        o0(true);
        n0();
    }

    public final EditTextPreference m0() {
        return (EditTextPreference) h0();
    }

    public final void n0() {
        long j3 = this.N0;
        if (j3 != -1 && j3 + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.K0;
            if (editText == null || !editText.isFocused() || ((InputMethodManager) this.K0.getContext().getSystemService("input_method")).showSoftInput(this.K0, 0)) {
                o0(false);
                return;
            }
            this.K0.removeCallbacks(this.M0);
            this.K0.postDelayed(this.M0, 50L);
        }
    }

    public final void o0(boolean z10) {
        this.N0 = z10 ? SystemClock.currentThreadTimeMillis() : -1L;
    }
}
