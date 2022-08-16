package s4;

import android.database.ContentObserver;

/* loaded from: classes.dex */
public final class b5 extends ContentObserver {
    public b5() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        n5.f18020h.incrementAndGet();
    }
}
