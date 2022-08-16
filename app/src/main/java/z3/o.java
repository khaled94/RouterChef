package z3;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class o extends q<Void> {
    public o(int i10, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // z3.q
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new r("Invalid response to one way request", null));
        }
    }

    @Override // z3.q
    public final boolean b() {
        return true;
    }
}
