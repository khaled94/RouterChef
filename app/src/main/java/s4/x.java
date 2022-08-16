package s4;

import c1.f;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class x implements Comparator<n> {

    /* renamed from: s */
    public final /* synthetic */ h f18171s;

    /* renamed from: t */
    public final /* synthetic */ a4 f18172t;

    public x(h hVar, a4 a4Var) {
        this.f18171s = hVar;
        this.f18172t = a4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(n nVar, n nVar2) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        h hVar = this.f18171s;
        a4 a4Var = this.f18172t;
        if (nVar3 instanceof s) {
            return !(nVar4 instanceof s) ? 1 : 0;
        } else if (nVar4 instanceof s) {
            return -1;
        } else {
            return hVar == null ? nVar3.h().compareTo(nVar4.h()) : (int) f.b(hVar.a(a4Var, Arrays.asList(nVar3, nVar4)).f().doubleValue());
        }
    }
}
