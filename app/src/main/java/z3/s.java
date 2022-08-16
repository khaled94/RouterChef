package z3;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class s extends q<Bundle> {
    public s(int i10, Bundle bundle) {
        super(i10, 1, bundle);
    }

    @Override // z3.q
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // z3.q
    public final boolean b() {
        return false;
    }
}
