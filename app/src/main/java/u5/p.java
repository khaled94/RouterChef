package u5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ View f19143s;

    public p(View view) {
        this.f19143s = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.f19143s.getContext().getSystemService("input_method")).showSoftInput(this.f19143s, 1);
    }
}
