package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
final class SavedStateHandleController implements j {

    /* renamed from: a */
    public boolean f1652a;

    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            this.f1652a = false;
            lVar.a().c(this);
        }
    }
}
