package d6;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* loaded from: classes.dex */
public final class f implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ b f3947a;

    public f(b bVar) {
        this.f3947a = bVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        b.h(this.f3947a);
        b.f(this.f3947a, false);
    }
}
