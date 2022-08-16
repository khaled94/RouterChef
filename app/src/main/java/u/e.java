package u;

import a0.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import l0.g;
import v.b;
import v.c;
import v.p;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: u0 */
    public int f18975u0;

    /* renamed from: y0 */
    public int f18978y0;

    /* renamed from: z0 */
    public int f18979z0;

    /* renamed from: s0 */
    public b f18973s0 = new b(this);

    /* renamed from: t0 */
    public v.e f18974t0 = new v.e(this);

    /* renamed from: v0 */
    public b.AbstractC0141b f18976v0 = null;

    /* renamed from: w0 */
    public boolean f18977w0 = false;
    public s.e x0 = new s.e();
    public int A0 = 0;
    public int B0 = 0;
    public b[] C0 = new b[4];
    public b[] D0 = new b[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<c> H0 = null;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public HashSet<d> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    public static boolean c0(d dVar, b.AbstractC0141b abstractC0141b, b.a aVar) {
        int i10;
        int i11;
        if (abstractC0141b == null) {
            return false;
        }
        if (dVar.f18949i0 == 8 || (dVar instanceof f) || (dVar instanceof a)) {
            aVar.f19694e = 0;
            aVar.f19695f = 0;
            return false;
        }
        int[] iArr = dVar.U;
        aVar.f19690a = iArr[0];
        aVar.f19691b = iArr[1];
        aVar.f19692c = dVar.r();
        aVar.f19693d = dVar.k();
        aVar.f19698i = false;
        aVar.f19699j = 0;
        boolean z10 = aVar.f19690a == 3;
        boolean z11 = aVar.f19691b == 3;
        boolean z12 = z10 && dVar.Y > 0.0f;
        boolean z13 = z11 && dVar.Y > 0.0f;
        if (z10 && dVar.u(0) && dVar.f18965r == 0 && !z12) {
            aVar.f19690a = 2;
            if (z11 && dVar.f18966s == 0) {
                aVar.f19690a = 1;
            }
            z10 = false;
        }
        if (z11 && dVar.u(1) && dVar.f18966s == 0 && !z13) {
            aVar.f19691b = 2;
            if (z10 && dVar.f18965r == 0) {
                aVar.f19691b = 1;
            }
            z11 = false;
        }
        if (dVar.B()) {
            aVar.f19690a = 1;
            z10 = false;
        }
        if (dVar.C()) {
            aVar.f19691b = 1;
            z11 = false;
        }
        if (z12) {
            if (dVar.f18967t[0] == 4) {
                aVar.f19690a = 1;
            } else if (!z11) {
                if (aVar.f19691b == 1) {
                    i11 = aVar.f19693d;
                } else {
                    aVar.f19690a = 2;
                    ((ConstraintLayout.b) abstractC0141b).b(dVar, aVar);
                    i11 = aVar.f19695f;
                }
                aVar.f19690a = 1;
                aVar.f19692c = (int) (dVar.Y * i11);
            }
        }
        if (z13) {
            if (dVar.f18967t[1] == 4) {
                aVar.f19691b = 1;
            } else if (!z10) {
                if (aVar.f19690a == 1) {
                    i10 = aVar.f19692c;
                } else {
                    aVar.f19691b = 2;
                    ((ConstraintLayout.b) abstractC0141b).b(dVar, aVar);
                    i10 = aVar.f19694e;
                }
                aVar.f19691b = 1;
                aVar.f19693d = dVar.Z == -1 ? (int) (i10 / dVar.Y) : (int) (dVar.Y * i10);
            }
        }
        ((ConstraintLayout.b) abstractC0141b).b(dVar, aVar);
        dVar.Q(aVar.f19694e);
        dVar.L(aVar.f19695f);
        dVar.E = aVar.f19697h;
        dVar.I(aVar.f19696g);
        aVar.f19699j = 0;
        return aVar.f19698i;
    }

    @Override // u.j, u.d
    public final void D() {
        this.x0.u();
        this.f18978y0 = 0;
        this.f18979z0 = 0;
        super.D();
    }

    @Override // u.d
    public final void R(boolean z10, boolean z11) {
        super.R(z10, z11);
        int size = this.f18988r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18988r0.get(i10).R(z10, z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0272, code lost:
        r0 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0627 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x07d4 A[LOOP:32: B:461:0x07d2->B:462:0x07d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // u.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 2249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.T():void");
    }

    public final void U(d dVar, int i10) {
        if (i10 == 0) {
            int i11 = this.A0 + 1;
            b[] bVarArr = this.D0;
            if (i11 >= bVarArr.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.D0;
            int i12 = this.A0;
            bVarArr2[i12] = new b(dVar, 0, this.f18977w0);
            this.A0 = i12 + 1;
        } else if (i10 != 1) {
        } else {
            int i13 = this.B0 + 1;
            b[] bVarArr3 = this.C0;
            if (i13 >= bVarArr3.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.C0;
            int i14 = this.B0;
            bVarArr4[i14] = new b(dVar, 1, this.f18977w0);
            this.B0 = i14 + 1;
        }
    }

    public final void V(s.e eVar) {
        boolean z10;
        boolean d02 = d0(64);
        c(eVar, d02);
        int size = this.f18988r0.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = this.f18988r0.get(i10);
            boolean[] zArr = dVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar2 = this.f18988r0.get(i11);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i12 = 0; i12 < aVar.f18987s0; i12++) {
                        d dVar3 = aVar.f18986r0[i12];
                        if (aVar.f18897u0 || dVar3.d()) {
                            int i13 = aVar.f18896t0;
                            if (i13 == 0 || i13 == 1) {
                                dVar3.T[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                dVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar4 = this.f18988r0.get(i14);
            if (dVar4.b()) {
                if (dVar4 instanceof i) {
                    this.L0.add(dVar4);
                } else {
                    dVar4.c(eVar, d02);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<d> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) it.next();
                HashSet<d> hashSet = this.L0;
                int i15 = 0;
                while (true) {
                    if (i15 >= iVar.f18987s0) {
                        z10 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(iVar.f18986r0[i15])) {
                        z10 = true;
                        continue;
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z10) {
                    iVar.c(eVar, d02);
                    this.L0.remove(iVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<d> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().c(eVar, d02);
                }
                this.L0.clear();
            }
        }
        if (s.e.p) {
            HashSet<d> hashSet2 = new HashSet<>();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar5 = this.f18988r0.get(i16);
                if (!dVar5.b()) {
                    hashSet2.add(dVar5);
                }
            }
            a(this, eVar, hashSet2, this.U[0] == 2 ? 0 : 1, false);
            Iterator<d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d next = it3.next();
                a.a(this, eVar, next);
                next.c(eVar, d02);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                d dVar6 = this.f18988r0.get(i17);
                if (dVar6 instanceof e) {
                    int[] iArr = dVar6.U;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar6.M(1);
                    }
                    if (i19 == 2) {
                        dVar6.P(1);
                    }
                    dVar6.c(eVar, d02);
                    if (i18 == 2) {
                        dVar6.M(i18);
                    }
                    if (i19 == 2) {
                        dVar6.P(i19);
                    }
                } else {
                    a.a(this, eVar, dVar6);
                    if (!dVar6.b()) {
                        dVar6.c(eVar, d02);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            g.a(this, eVar, null, 0);
        }
        if (this.B0 > 0) {
            g.a(this, eVar, null, 1);
        }
    }

    public final void W(c cVar) {
        WeakReference<c> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.K0.get().c()) {
            this.K0 = new WeakReference<>(cVar);
        }
    }

    public final void X(c cVar) {
        WeakReference<c> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.I0.get().c()) {
            this.I0 = new WeakReference<>(cVar);
        }
    }

    public final void Y(c cVar) {
        WeakReference<c> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.J0.get().c()) {
            this.J0 = new WeakReference<>(cVar);
        }
    }

    public final void Z(c cVar) {
        WeakReference<c> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.H0.get().c()) {
            this.H0 = new WeakReference<>(cVar);
        }
    }

    public final boolean a0(boolean z10, int i10) {
        boolean z11;
        int i11;
        v.g gVar;
        int i12;
        v.g gVar2;
        v.e eVar = this.f18974t0;
        boolean z12 = true;
        boolean z13 = z10 & true;
        int j3 = eVar.f19702a.j(0);
        int j10 = eVar.f19702a.j(1);
        int s10 = eVar.f19702a.s();
        int t10 = eVar.f19702a.t();
        if (z13 && (j3 == 2 || j10 == 2)) {
            Iterator<p> it = eVar.f19706e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f19740f == i10 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && j3 == 2) {
                    eVar.f19702a.M(1);
                    e eVar2 = eVar.f19702a;
                    eVar2.Q(eVar.d(eVar2, 0));
                    e eVar3 = eVar.f19702a;
                    gVar2 = eVar3.f18938d.f19739e;
                    i12 = eVar3.r();
                    gVar2.d(i12);
                }
            } else if (z13 && j10 == 2) {
                eVar.f19702a.P(1);
                e eVar4 = eVar.f19702a;
                eVar4.L(eVar.d(eVar4, 1));
                e eVar5 = eVar.f19702a;
                gVar2 = eVar5.f18940e.f19739e;
                i12 = eVar5.k();
                gVar2.d(i12);
            }
        }
        e eVar6 = eVar.f19702a;
        int[] iArr = eVar6.U;
        if (i10 == 0) {
            if (iArr[0] == 1 || iArr[0] == 4) {
                int r10 = eVar6.r() + s10;
                eVar.f19702a.f18938d.f19743i.d(r10);
                gVar = eVar.f19702a.f18938d.f19739e;
                i11 = r10 - s10;
                gVar.d(i11);
                z11 = true;
            }
            z11 = false;
        } else {
            if (iArr[1] == 1 || iArr[1] == 4) {
                int k10 = eVar6.k() + t10;
                eVar.f19702a.f18940e.f19743i.d(k10);
                i11 = k10 - t10;
                gVar = eVar.f19702a.f18940e.f19739e;
                gVar.d(i11);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator<p> it2 = eVar.f19706e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f19740f == i10 && (next2.f19736b != eVar.f19702a || next2.f19741g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = eVar.f19706e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f19740f == i10 && (z11 || next3.f19736b != eVar.f19702a)) {
                if (!next3.f19742h.f19719j || !next3.f19743i.f19719j || (!(next3 instanceof c) && !next3.f19739e.f19719j)) {
                    z12 = false;
                    break;
                }
            }
        }
        eVar.f19702a.M(j3);
        eVar.f19702a.P(j10);
        return z12;
    }

    public final void b0() {
        this.f18974t0.f19703b = true;
    }

    public final boolean d0(int i10) {
        return (this.E0 & i10) == i10;
    }

    public final void e0(int i10) {
        this.E0 = i10;
        s.e.p = d0(512);
    }

    @Override // u.d
    public final void o(StringBuilder sb) {
        sb.append(this.f18950j + ":{\n");
        sb.append("  actualWidth:" + this.W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator<d> it = this.f18988r0.iterator();
        while (it.hasNext()) {
            it.next().o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
