package m0;

import android.view.View;
import com.raouf.routerchef.R;
import m0.z;

/* loaded from: classes.dex */
public final class y extends z.b<Boolean> {
    public y() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // m0.z.b
    public final Boolean b(View view) {
        return Boolean.valueOf(z.l.c(view));
    }

    @Override // m0.z.b
    public final void c(View view, Boolean bool) {
        z.l.g(view, bool.booleanValue());
    }

    @Override // m0.z.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
