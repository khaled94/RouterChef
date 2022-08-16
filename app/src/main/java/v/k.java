package v;

import java.util.Iterator;
import u.a;
import u.d;

/* loaded from: classes.dex */
public final class k extends p {
    public k(d dVar) {
        super(dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.p, v.d
    public final void a(d dVar) {
        a aVar = (a) this.f19736b;
        int i10 = aVar.f18896t0;
        Iterator it = this.f19742h.f19721l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f19716g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            this.f19742h.d(i11 + aVar.f18898v0);
        } else {
            this.f19742h.d(i12 + aVar.f18898v0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.p
    public final void d() {
        p pVar;
        d dVar = this.f19736b;
        if (dVar instanceof a) {
            f fVar = this.f19742h;
            fVar.f19711b = true;
            a aVar = (a) dVar;
            int i10 = aVar.f18896t0;
            boolean z10 = aVar.f18897u0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f19714e = 4;
                while (i11 < aVar.f18987s0) {
                    d dVar2 = aVar.f18986r0[i11];
                    if (z10 || dVar2.f18949i0 != 8) {
                        f fVar2 = dVar2.f18938d.f19742h;
                        fVar2.f19720k.add(this.f19742h);
                        this.f19742h.f19721l.add(fVar2);
                    }
                    i11++;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    fVar.f19714e = 6;
                    while (i11 < aVar.f18987s0) {
                        d dVar3 = aVar.f18986r0[i11];
                        if (z10 || dVar3.f18949i0 != 8) {
                            f fVar3 = dVar3.f18940e.f19742h;
                            fVar3.f19720k.add(this.f19742h);
                            this.f19742h.f19721l.add(fVar3);
                        }
                        i11++;
                    }
                } else if (i10 != 3) {
                    return;
                } else {
                    fVar.f19714e = 7;
                    while (i11 < aVar.f18987s0) {
                        d dVar4 = aVar.f18986r0[i11];
                        if (z10 || dVar4.f18949i0 != 8) {
                            f fVar4 = dVar4.f18940e.f19743i;
                            fVar4.f19720k.add(this.f19742h);
                            this.f19742h.f19721l.add(fVar4);
                        }
                        i11++;
                    }
                }
                m(this.f19736b.f18940e.f19742h);
                pVar = this.f19736b.f18940e;
                m(pVar.f19743i);
            } else {
                fVar.f19714e = 5;
                while (i11 < aVar.f18987s0) {
                    d dVar5 = aVar.f18986r0[i11];
                    if (z10 || dVar5.f18949i0 != 8) {
                        f fVar5 = dVar5.f18938d.f19743i;
                        fVar5.f19720k.add(this.f19742h);
                        this.f19742h.f19721l.add(fVar5);
                    }
                    i11++;
                }
            }
            m(this.f19736b.f18938d.f19742h);
            pVar = this.f19736b.f18938d;
            m(pVar.f19743i);
        }
    }

    @Override // v.p
    public final void e() {
        d dVar = this.f19736b;
        if (dVar instanceof a) {
            int i10 = ((a) dVar).f18896t0;
            if (i10 != 0 && i10 != 1) {
                dVar.f18935b0 = this.f19742h.f19716g;
            } else {
                dVar.f18933a0 = this.f19742h.f19716g;
            }
        }
    }

    @Override // v.p
    public final void f() {
        this.f19737c = null;
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
