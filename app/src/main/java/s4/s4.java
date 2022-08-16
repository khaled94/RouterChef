package s4;

import android.database.ContentObserver;

/* loaded from: classes.dex */
public final class s4 extends ContentObserver {
    public s4() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        t4.f18106d.set(true);
    }
}
