package n0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.b;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final d f16399a;

    public e(d dVar) {
        this.f16399a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f16399a.equals(((e) obj).f16399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16399a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        AutoCompleteTextView autoCompleteTextView;
        b.h hVar = (b.h) this.f16399a;
        TextInputLayout textInputLayout = b.this.f3951a;
        if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null) {
            return;
        }
        int i10 = 1;
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        CheckableImageButton checkableImageButton = b.this.f3953c;
        if (z10) {
            i10 = 2;
        }
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.s(checkableImageButton, i10);
    }
}
