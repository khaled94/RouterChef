package androidx.activity.result;

import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;

/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements j {
    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        if (!g.b.ON_START.equals(bVar)) {
            if (g.b.ON_STOP.equals(bVar)) {
                throw null;
            }
            if (g.b.ON_DESTROY.equals(bVar)) {
                throw null;
            }
            return;
        }
        throw null;
    }
}
