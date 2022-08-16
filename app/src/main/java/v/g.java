package v;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m */
    public int f19722m;

    public g(p pVar) {
        super(pVar);
        this.f19714e = pVar instanceof l ? 2 : 3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    @Override // v.f
    public final void d(int i10) {
        if (this.f19719j) {
            return;
        }
        this.f19719j = true;
        this.f19716g = i10;
        Iterator it = this.f19720k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
