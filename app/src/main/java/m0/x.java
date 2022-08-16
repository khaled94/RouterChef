package m0;

import android.text.TextUtils;
import android.view.View;
import com.raouf.routerchef.R;
import m0.z;

/* loaded from: classes.dex */
public final class x extends z.b<CharSequence> {
    public x(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // m0.z.b
    public final CharSequence b(View view) {
        return z.n.a(view);
    }

    @Override // m0.z.b
    public final void c(View view, CharSequence charSequence) {
        z.n.b(view, charSequence);
    }

    @Override // m0.z.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
