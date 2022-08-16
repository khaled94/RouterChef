package m0;

import android.view.View;
import com.raouf.routerchef.R;
import m0.z;

/* loaded from: classes.dex */
public final class v extends z.b<Boolean> {
    public v() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    @Override // m0.z.b
    public final Boolean b(View view) {
        return Boolean.valueOf(z.l.d(view));
    }

    @Override // m0.z.b
    public final void c(View view, Boolean bool) {
        z.l.i(view, bool.booleanValue());
    }

    @Override // m0.z.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
