package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements j {

    /* renamed from: a */
    public final b0 f1651a;

    public SavedStateHandleAttacher(b0 b0Var) {
        this.f1651a = b0Var;
    }

    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        if (bVar == g.b.ON_CREATE) {
            lVar.a().c(this);
            b0 b0Var = this.f1651a;
            if (b0Var.f1663b) {
                return;
            }
            b0Var.f1664c = b0Var.f1662a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            b0Var.f1663b = true;
            c0 c0Var = (c0) b0Var.f1665d.a();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
