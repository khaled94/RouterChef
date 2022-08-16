package v;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public p f19725a;

    /* renamed from: b */
    public ArrayList<p> f19726b = new ArrayList<>();

    public m(p pVar) {
        this.f19725a = null;
        this.f19725a = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final long a(f fVar, long j3) {
        p pVar = fVar.f19713d;
        if (pVar instanceof k) {
            return j3;
        }
        int size = fVar.f19720k.size();
        long j10 = j3;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f19720k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f19713d != pVar) {
                    j10 = Math.min(j10, a(fVar2, fVar2.f19715f + j3));
                }
            }
        }
        if (fVar != pVar.f19743i) {
            return j10;
        }
        long j11 = j3 - pVar.j();
        return Math.min(Math.min(j10, a(pVar.f19742h, j11)), j11 - pVar.f19742h.f19715f);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final long b(f fVar, long j3) {
        p pVar = fVar.f19713d;
        if (pVar instanceof k) {
            return j3;
        }
        int size = fVar.f19720k.size();
        long j10 = j3;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f19720k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f19713d != pVar) {
                    j10 = Math.max(j10, b(fVar2, fVar2.f19715f + j3));
                }
            }
        }
        if (fVar != pVar.f19742h) {
            return j10;
        }
        long j11 = j3 + pVar.j();
        return Math.max(Math.max(j10, b(pVar.f19743i, j11)), j11 - pVar.f19743i.f19715f);
    }
}
