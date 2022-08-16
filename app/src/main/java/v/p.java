package v;

import u.c;
import u.d;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a */
    public int f19735a;

    /* renamed from: b */
    public d f19736b;

    /* renamed from: c */
    public m f19737c;

    /* renamed from: d */
    public int f19738d;

    /* renamed from: e */
    public g f19739e = new g(this);

    /* renamed from: f */
    public int f19740f = 0;

    /* renamed from: g */
    public boolean f19741g = false;

    /* renamed from: h */
    public f f19742h = new f(this);

    /* renamed from: i */
    public f f19743i = new f(this);

    /* renamed from: j */
    public int f19744j = 1;

    public p(d dVar) {
        this.f19736b = dVar;
    }

    @Override // v.d
    public void a(d dVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f19721l.add(fVar2);
        fVar.f19715f = i10;
        fVar2.f19720k.add(fVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f19721l.add(fVar2);
        fVar.f19721l.add(this.f19739e);
        fVar.f19717h = i10;
        fVar.f19718i = gVar;
        fVar2.f19720k.add(fVar);
        gVar.f19720k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            d dVar = this.f19736b;
            int i13 = dVar.f18969v;
            i12 = Math.max(dVar.f18968u, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            d dVar2 = this.f19736b;
            int i14 = dVar2.y;
            i12 = Math.max(dVar2.f18971x, i10);
            if (i14 > 0) {
                i12 = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public final f h(c cVar) {
        p pVar;
        p pVar2;
        c cVar2 = cVar.f18921f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f18919d;
        int ordinal = cVar2.f18920e.ordinal();
        if (ordinal == 1) {
            pVar = dVar.f18938d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                pVar2 = dVar.f18938d;
            } else if (ordinal != 4) {
                if (ordinal == 5) {
                    return dVar.f18940e.f19727k;
                }
                return null;
            } else {
                pVar2 = dVar.f18940e;
            }
            return pVar2.f19743i;
        } else {
            pVar = dVar.f18940e;
        }
        return pVar.f19742h;
    }

    public final f i(c cVar, int i10) {
        c cVar2 = cVar.f18921f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f18919d;
        p pVar = i10 == 0 ? dVar.f18938d : dVar.f18940e;
        int ordinal = cVar2.f18920e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f19742h;
        }
        if (ordinal != 3 && ordinal != 4) {
            return null;
        }
        return pVar.f19743i;
    }

    public long j() {
        g gVar = this.f19739e;
        if (gVar.f19719j) {
            return gVar.f19716g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r9.f19735a == 3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(u.c r13, u.c r14, int r15) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.p.l(u.c, u.c, int):void");
    }
}
