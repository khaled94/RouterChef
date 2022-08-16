package m4;

import o3.b;

/* loaded from: classes.dex */
public final class fn<AdT> extends ro {

    /* renamed from: s */
    public final b f8599s;

    /* renamed from: t */
    public final AdT f8600t;

    public fn(b bVar, AdT adt) {
        this.f8599s = bVar;
        this.f8600t = adt;
    }

    @Override // m4.to
    public final void H1(cn cnVar) {
        b bVar = this.f8599s;
        if (bVar != null) {
            bVar.a(cnVar.t());
        }
    }

    @Override // m4.to
    public final void c() {
        AdT adt;
        b bVar = this.f8599s;
        if (bVar == null || (adt = this.f8600t) == null) {
            return;
        }
        bVar.b(adt);
    }
}
