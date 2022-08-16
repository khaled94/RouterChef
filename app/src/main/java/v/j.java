package v;

import u.d;
import u.f;

/* loaded from: classes.dex */
public final class j extends p {
    public j(d dVar) {
        super(dVar);
        dVar.f18938d.f();
        dVar.f18940e.f();
        this.f19740f = ((f) dVar).f18984v0;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.p, v.d
    public final void a(d dVar) {
        f fVar = this.f19742h;
        if (fVar.f19712c && !fVar.f19719j) {
            this.f19742h.d((int) ((((f) fVar.f19721l.get(0)).f19716g * ((f) this.f19736b).f18980r0) + 0.5f));
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.p
    public final void d() {
        p pVar;
        d dVar = this.f19736b;
        f fVar = (f) dVar;
        int i10 = fVar.f18981s0;
        int i11 = fVar.f18982t0;
        if (fVar.f18984v0 == 1) {
            f fVar2 = this.f19742h;
            if (i10 != -1) {
                fVar2.f19721l.add(dVar.V.f18938d.f19742h);
                this.f19736b.V.f18938d.f19742h.f19720k.add(this.f19742h);
                this.f19742h.f19715f = i10;
            } else if (i11 != -1) {
                fVar2.f19721l.add(dVar.V.f18938d.f19743i);
                this.f19736b.V.f18938d.f19743i.f19720k.add(this.f19742h);
                this.f19742h.f19715f = -i11;
            } else {
                fVar2.f19711b = true;
                fVar2.f19721l.add(dVar.V.f18938d.f19743i);
                this.f19736b.V.f18938d.f19743i.f19720k.add(this.f19742h);
            }
            m(this.f19736b.f18938d.f19742h);
            pVar = this.f19736b.f18938d;
        } else {
            f fVar3 = this.f19742h;
            if (i10 != -1) {
                fVar3.f19721l.add(dVar.V.f18940e.f19742h);
                this.f19736b.V.f18940e.f19742h.f19720k.add(this.f19742h);
                this.f19742h.f19715f = i10;
            } else if (i11 != -1) {
                fVar3.f19721l.add(dVar.V.f18940e.f19743i);
                this.f19736b.V.f18940e.f19743i.f19720k.add(this.f19742h);
                this.f19742h.f19715f = -i11;
            } else {
                fVar3.f19711b = true;
                fVar3.f19721l.add(dVar.V.f18940e.f19743i);
                this.f19736b.V.f18940e.f19743i.f19720k.add(this.f19742h);
            }
            m(this.f19736b.f18940e.f19742h);
            pVar = this.f19736b.f18940e;
        }
        m(pVar.f19743i);
    }

    @Override // v.p
    public final void e() {
        d dVar = this.f19736b;
        if (((f) dVar).f18984v0 == 1) {
            dVar.f18933a0 = this.f19742h.f19716g;
        } else {
            dVar.f18935b0 = this.f19742h.f19716g;
        }
    }

    @Override // v.p
    public final void f() {
        this.f19742h.c();
    }

    @Override // v.p
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<v.f>, java.util.ArrayList] */
    public final void m(f fVar) {
        this.f19742h.f19720k.add(fVar);
        fVar.f19721l.add(this.f19742h);
    }
}
