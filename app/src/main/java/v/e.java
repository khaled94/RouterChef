package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.d;
import u.f;
import u.h;
import v.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public u.e f19702a;

    /* renamed from: d */
    public u.e f19705d;

    /* renamed from: b */
    public boolean f19703b = true;

    /* renamed from: c */
    public boolean f19704c = true;

    /* renamed from: e */
    public ArrayList<p> f19706e = new ArrayList<>();

    /* renamed from: f */
    public b.AbstractC0141b f19707f = null;

    /* renamed from: g */
    public b.a f19708g = new b.a();

    /* renamed from: h */
    public ArrayList<m> f19709h = new ArrayList<>();

    public e(u.e eVar) {
        new ArrayList();
        this.f19702a = eVar;
        this.f19705d = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List<v.f>, java.util.ArrayList] */
    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f19713d;
        if (pVar.f19737c == null) {
            u.e eVar = this.f19702a;
            if (pVar == eVar.f18938d || pVar == eVar.f18940e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar);
                arrayList.add(mVar);
            }
            pVar.f19737c = mVar;
            mVar.f19726b.add(pVar);
            Iterator it = pVar.f19742h.f19720k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            Iterator it2 = pVar.f19743i.f19720k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                Iterator it3 = ((n) pVar).f19727k.f19720k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            Iterator it4 = pVar.f19742h.f19721l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i10, 0, fVar2, arrayList, mVar);
            }
            Iterator it5 = pVar.f19743i.f19721l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 != 1 || !(pVar instanceof n)) {
                return;
            }
            Iterator it6 = ((n) pVar).f19727k.f19721l.iterator();
            while (it6.hasNext()) {
                a((f) it6.next(), i10, 2, fVar2, arrayList, mVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r2.f18966s == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(u.e r17) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.b(u.e):void");
    }

    public final void c() {
        p jVar;
        ArrayList<p> arrayList = this.f19706e;
        arrayList.clear();
        this.f19705d.f18938d.f();
        this.f19705d.f18940e.f();
        arrayList.add(this.f19705d.f18938d);
        arrayList.add(this.f19705d.f18940e);
        Iterator<d> it = this.f19705d.f18988r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof f) {
                jVar = new j(next);
            } else {
                if (next.y()) {
                    if (next.f18934b == null) {
                        next.f18934b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f18934b);
                } else {
                    arrayList.add(next.f18938d);
                }
                if (next.z()) {
                    if (next.f18936c == null) {
                        next.f18936c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f18936c);
                } else {
                    arrayList.add(next.f18940e);
                }
                if (next instanceof h) {
                    jVar = new k(next);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f19736b != this.f19705d) {
                next2.d();
            }
        }
        this.f19709h.clear();
        e(this.f19702a.f18938d, 0, this.f19709h);
        e(this.f19702a.f18940e, 1, this.f19709h);
        this.f19703b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List<v.f>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(u.e r17, int r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.d(u.e, int):int");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<v.d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final void e(p pVar, int i10, ArrayList<m> arrayList) {
        Iterator it = pVar.f19742h.f19720k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f19743i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f19742h, i10, 0, pVar.f19743i, arrayList, null);
            }
        }
        Iterator it2 = pVar.f19743i.f19720k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f19742h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f19743i, i10, 1, pVar.f19742h, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((n) pVar).f19727k.f19720k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(d dVar, int i10, int i11, int i12, int i13) {
        b.a aVar = this.f19708g;
        aVar.f19690a = i10;
        aVar.f19691b = i12;
        aVar.f19692c = i11;
        aVar.f19693d = i13;
        ((ConstraintLayout.b) this.f19707f).b(dVar, aVar);
        dVar.Q(this.f19708g.f19694e);
        dVar.L(this.f19708g.f19695f);
        b.a aVar2 = this.f19708g;
        dVar.E = aVar2.f19697h;
        dVar.I(aVar2.f19696g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (r10 == 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r8 == 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
        r2.f19722m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
        r2.d(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r12 = this;
            u.e r0 = r12.f19702a
            java.util.ArrayList<u.d> r0 = r0.f18988r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            u.d r1 = (u.d) r1
            boolean r2 = r1.f18932a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.U
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f18965r
            int r4 = r1.f18966s
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            v.l r4 = r1.f18938d
            v.g r4 = r4.f19739e
            boolean r5 = r4.f19719j
            v.n r6 = r1.f18940e
            v.g r6 = r6.f19739e
            boolean r7 = r6.f19719j
            if (r5 == 0) goto L54
            if (r7 == 0) goto L54
            int r5 = r4.f19716g
            int r7 = r6.f19716g
            r6 = 1
            r2 = r12
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L8d
        L54:
            if (r5 == 0) goto L6e
            if (r3 == 0) goto L6e
            int r5 = r4.f19716g
            int r7 = r6.f19716g
            r4 = 1
            r6 = 2
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            v.n r2 = r1.f18940e
            v.g r2 = r2.f19739e
            int r3 = r1.k()
            if (r10 != r11) goto L8a
            goto L87
        L6e:
            if (r7 == 0) goto L8f
            if (r2 == 0) goto L8f
            int r5 = r4.f19716g
            int r7 = r6.f19716g
            r4 = 2
            r6 = 1
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            v.l r2 = r1.f18938d
            v.g r2 = r2.f19739e
            int r3 = r1.r()
            if (r8 != r11) goto L8a
        L87:
            r2.f19722m = r3
            goto L8f
        L8a:
            r2.d(r3)
        L8d:
            r1.f18932a = r9
        L8f:
            boolean r2 = r1.f18932a
            if (r2 == 0) goto L8
            v.n r2 = r1.f18940e
            v.a r2 = r2.f19728l
            if (r2 == 0) goto L8
            int r1 = r1.f18937c0
            r2.d(r1)
            goto L8
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.g():void");
    }
}
