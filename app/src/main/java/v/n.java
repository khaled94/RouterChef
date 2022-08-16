package v;

import androidx.activity.result.a;
import s.h;
import u.d;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k */
    public f f19727k;

    /* renamed from: l */
    public a f19728l = null;

    public n(d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f19727k = fVar;
        this.f19742h.f19714e = 6;
        this.f19743i.f19714e = 7;
        fVar.f19714e = 8;
        this.f19740f = 1;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.p, v.d
    public final void a(d dVar) {
        int i10;
        float f10;
        g gVar;
        g gVar2;
        if (h.b(this.f19744j) == 3) {
            d dVar2 = this.f19736b;
            l(dVar2.K, dVar2.M, 1);
            return;
        }
        g gVar3 = this.f19739e;
        if (gVar3.f19712c && !gVar3.f19719j && this.f19738d == 3) {
            d dVar3 = this.f19736b;
            int i11 = dVar3.f18966s;
            if (i11 == 2) {
                d dVar4 = dVar3.V;
                if (dVar4 != null) {
                    if (dVar4.f18940e.f19739e.f19719j) {
                        f10 = gVar.f19716g * dVar3.f18972z;
                        i10 = (int) (f10 + 0.5f);
                    }
                }
            } else if (i11 == 3) {
                if (dVar3.f18938d.f19739e.f19719j) {
                    int i12 = dVar3.Z;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f10 = gVar2.f19716g * dVar3.Y;
                            i10 = (int) (f10 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        }
                    }
                    f10 = gVar2.f19716g / dVar3.Y;
                    i10 = (int) (f10 + 0.5f);
                }
            }
            gVar3.d(i10);
        }
        f fVar = this.f19742h;
        if (!fVar.f19712c) {
            return;
        }
        f fVar2 = this.f19743i;
        if (!fVar2.f19712c) {
            return;
        }
        if (fVar.f19719j && fVar2.f19719j && this.f19739e.f19719j) {
            return;
        }
        if (!this.f19739e.f19719j && this.f19738d == 3) {
            d dVar5 = this.f19736b;
            if (dVar5.f18965r == 0 && !dVar5.z()) {
                int i13 = ((f) this.f19742h.f19721l.get(0)).f19716g;
                f fVar3 = this.f19742h;
                int i14 = i13 + fVar3.f19715f;
                int i15 = ((f) this.f19743i.f19721l.get(0)).f19716g + this.f19743i.f19715f;
                fVar3.d(i14);
                this.f19743i.d(i15);
                this.f19739e.d(i15 - i14);
                return;
            }
        }
        if (!this.f19739e.f19719j && this.f19738d == 3 && this.f19735a == 1 && this.f19742h.f19721l.size() > 0 && this.f19743i.f19721l.size() > 0) {
            int i16 = (((f) this.f19743i.f19721l.get(0)).f19716g + this.f19743i.f19715f) - (((f) this.f19742h.f19721l.get(0)).f19716g + this.f19742h.f19715f);
            g gVar4 = this.f19739e;
            int i17 = gVar4.f19722m;
            if (i16 < i17) {
                gVar4.d(i16);
            } else {
                gVar4.d(i17);
            }
        }
        if (!this.f19739e.f19719j || this.f19742h.f19721l.size() <= 0 || this.f19743i.f19721l.size() <= 0) {
            return;
        }
        f fVar4 = (f) this.f19742h.f19721l.get(0);
        f fVar5 = (f) this.f19743i.f19721l.get(0);
        int i18 = fVar4.f19716g;
        f fVar6 = this.f19742h;
        int i19 = fVar6.f19715f + i18;
        int i20 = fVar5.f19716g;
        int i21 = this.f19743i.f19715f + i20;
        float f11 = this.f19736b.f18945g0;
        if (fVar4 == fVar5) {
            f11 = 0.5f;
        } else {
            i18 = i19;
            i20 = i21;
        }
        fVar6.d((int) ((((i20 - i18) - this.f19739e.f19716g) * f11) + i18 + 0.5f));
        this.f19743i.d(this.f19742h.f19716g + this.f19739e.f19716g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x02bf, code lost:
        if (r9.f19736b.E != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0309, code lost:
        if (r0.f19738d == 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0339, code lost:
        if (r9.f19736b.E != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x033b, code lost:
        r0 = r9.f19727k;
        r1 = r9.f19742h;
        r3 = r9.f19728l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03a5, code lost:
        if (r0.f19738d == 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a7, code lost:
        r0.f19739e.f19720k.add(r9.f19739e);
        r9.f19739e.f19721l.add(r9.f19736b.f18938d.f19739e);
        r9.f19739e.f19710a = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.List<v.d>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.List<v.d>] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.d():void");
    }

    @Override // v.p
    public final void e() {
        f fVar = this.f19742h;
        if (fVar.f19719j) {
            this.f19736b.f18935b0 = fVar.f19716g;
        }
    }

    @Override // v.p
    public final void f() {
        this.f19737c = null;
        this.f19742h.c();
        this.f19743i.c();
        this.f19727k.c();
        this.f19739e.c();
        this.f19741g = false;
    }

    @Override // v.p
    public final boolean k() {
        return this.f19738d != 3 || this.f19736b.f18966s == 0;
    }

    public final void m() {
        this.f19741g = false;
        this.f19742h.c();
        this.f19742h.f19719j = false;
        this.f19743i.c();
        this.f19743i.f19719j = false;
        this.f19727k.c();
        this.f19727k.f19719j = false;
        this.f19739e.f19719j = false;
    }

    public final String toString() {
        StringBuilder c10 = a.c("VerticalRun ");
        c10.append(this.f19736b.f18951j0);
        return c10.toString();
    }
}
