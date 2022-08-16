package androidx.lifecycle;

import androidx.lifecycle.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements j {

    /* renamed from: a */
    public final d[] f1625a;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f1625a = dVarArr;
    }

    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        new HashMap();
        for (d dVar : this.f1625a) {
            dVar.a();
        }
        for (d dVar2 : this.f1625a) {
            dVar2.a();
        }
    }
}
