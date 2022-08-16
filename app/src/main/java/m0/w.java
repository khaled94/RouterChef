package m0;

import android.text.TextUtils;
import android.view.View;
import com.raouf.routerchef.R;
import m0.z;

/* loaded from: classes.dex */
public final class w extends z.b<CharSequence> {
    public w(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // m0.z.b
    public final CharSequence b(View view) {
        return z.l.b(view);
    }

    @Override // m0.z.b
    public final void c(View view, CharSequence charSequence) {
        z.l.h(view, charSequence);
    }

    @Override // m0.z.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
