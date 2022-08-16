package u;

import s.b;
import s.e;
import s.i;
import u.c;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: t0 */
    public int f18896t0 = 0;

    /* renamed from: u0 */
    public boolean f18897u0 = true;

    /* renamed from: v0 */
    public int f18898v0 = 0;

    /* renamed from: w0 */
    public boolean f18899w0 = false;

    @Override // u.d
    public final boolean B() {
        return this.f18899w0;
    }

    @Override // u.d
    public final boolean C() {
        return this.f18899w0;
    }

    public final boolean U() {
        int i10;
        c h10;
        c h11;
        c h12;
        int i11;
        int i12;
        c.a aVar = c.a.BOTTOM;
        c.a aVar2 = c.a.TOP;
        c.a aVar3 = c.a.RIGHT;
        c.a aVar4 = c.a.LEFT;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f18987s0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f18986r0[i13];
            if ((this.f18897u0 || dVar.d()) && ((((i11 = this.f18896t0) == 0 || i11 == 1) && !dVar.B()) || (((i12 = this.f18896t0) == 2 || i12 == 3) && !dVar.C()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f18987s0; i15++) {
            d dVar2 = this.f18986r0[i15];
            if (this.f18897u0 || dVar2.d()) {
                if (!z11) {
                    int i16 = this.f18896t0;
                    if (i16 == 0) {
                        h12 = dVar2.h(aVar4);
                    } else if (i16 == 1) {
                        h12 = dVar2.h(aVar3);
                    } else if (i16 == 2) {
                        h12 = dVar2.h(aVar2);
                    } else {
                        if (i16 == 3) {
                            h12 = dVar2.h(aVar);
                        }
                        z11 = true;
                    }
                    i14 = h12.c();
                    z11 = true;
                }
                int i17 = this.f18896t0;
                if (i17 == 0) {
                    h11 = dVar2.h(aVar4);
                } else {
                    if (i17 == 1) {
                        h10 = dVar2.h(aVar3);
                    } else if (i17 == 2) {
                        h11 = dVar2.h(aVar2);
                    } else if (i17 == 3) {
                        h10 = dVar2.h(aVar);
                    }
                    i14 = Math.max(i14, h10.c());
                }
                i14 = Math.min(i14, h11.c());
            }
        }
        int i18 = i14 + this.f18898v0;
        int i19 = this.f18896t0;
        if (i19 == 0 || i19 == 1) {
            J(i18, i18);
        } else {
            K(i18, i18);
        }
        this.f18899w0 = true;
        return true;
    }

    public final int V() {
        int i10 = this.f18896t0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // u.d
    public final void c(e eVar, boolean z10) {
        Object[] objArr;
        boolean z11;
        i iVar;
        c cVar;
        int i10;
        int i11;
        i iVar2;
        int i12;
        c[] cVarArr = this.R;
        cVarArr[0] = this.J;
        cVarArr[2] = this.K;
        cVarArr[1] = this.L;
        cVarArr[3] = this.M;
        int i13 = 0;
        while (true) {
            objArr = this.R;
            if (i13 >= objArr.length) {
                break;
            }
            objArr[i13].f18924i = eVar.l(objArr[i13]);
            i13++;
        }
        int i14 = this.f18896t0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        c cVar2 = objArr[i14];
        if (!this.f18899w0) {
            U();
        }
        if (this.f18899w0) {
            this.f18899w0 = false;
            int i15 = this.f18896t0;
            if (i15 == 0 || i15 == 1) {
                eVar.e(this.J.f18924i, this.f18933a0);
                iVar2 = this.L.f18924i;
                i12 = this.f18933a0;
            } else if (i15 != 2 && i15 != 3) {
                return;
            } else {
                eVar.e(this.K.f18924i, this.f18935b0);
                iVar2 = this.M.f18924i;
                i12 = this.f18935b0;
            }
            eVar.e(iVar2, i12);
            return;
        }
        for (int i16 = 0; i16 < this.f18987s0; i16++) {
            d dVar = this.f18986r0[i16];
            if ((this.f18897u0 || dVar.d()) && ((((i11 = this.f18896t0) == 0 || i11 == 1) && dVar.U[0] == 3 && dVar.J.f18921f != null && dVar.L.f18921f != null) || ((i11 == 2 || i11 == 3) && dVar.U[1] == 3 && dVar.K.f18921f != null && dVar.M.f18921f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.J.e() || this.L.e();
        boolean z13 = this.K.e() || this.M.e();
        boolean z14 = !z11 && (((i10 = this.f18896t0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))));
        int i17 = 5;
        if (!z14) {
            i17 = 4;
        }
        for (int i18 = 0; i18 < this.f18987s0; i18++) {
            d dVar2 = this.f18986r0[i18];
            if (this.f18897u0 || dVar2.d()) {
                i l10 = eVar.l(dVar2.R[this.f18896t0]);
                c[] cVarArr2 = dVar2.R;
                int i19 = this.f18896t0;
                cVarArr2[i19].f18924i = l10;
                int i20 = (cVarArr2[i19].f18921f == null || cVarArr2[i19].f18921f.f18919d != this) ? 0 : cVarArr2[i19].f18922g + 0;
                if (i19 != 0 && i19 != 2) {
                    s.c m10 = eVar.m();
                    i n10 = eVar.n();
                    n10.f17587v = 0;
                    m10.d(cVar2.f18924i, l10, n10, this.f18898v0 + i20);
                    eVar.c(m10);
                } else {
                    s.c m11 = eVar.m();
                    i n11 = eVar.n();
                    n11.f17587v = 0;
                    m11.e(cVar2.f18924i, l10, n11, this.f18898v0 - i20);
                    eVar.c(m11);
                }
                eVar.d(cVar2.f18924i, l10, this.f18898v0 + i20, i17);
            }
        }
        int i21 = this.f18896t0;
        if (i21 == 0) {
            eVar.d(this.L.f18924i, this.J.f18924i, 0, 8);
            eVar.d(this.J.f18924i, this.V.L.f18924i, 0, 4);
            iVar = this.J.f18924i;
            cVar = this.V.J;
        } else if (i21 == 1) {
            eVar.d(this.J.f18924i, this.L.f18924i, 0, 8);
            eVar.d(this.J.f18924i, this.V.J.f18924i, 0, 4);
            iVar = this.J.f18924i;
            cVar = this.V.L;
        } else if (i21 == 2) {
            eVar.d(this.M.f18924i, this.K.f18924i, 0, 8);
            eVar.d(this.K.f18924i, this.V.M.f18924i, 0, 4);
            iVar = this.K.f18924i;
            cVar = this.V.K;
        } else if (i21 != 3) {
            return;
        } else {
            eVar.d(this.K.f18924i, this.M.f18924i, 0, 8);
            eVar.d(this.K.f18924i, this.V.K.f18924i, 0, 4);
            iVar = this.K.f18924i;
            cVar = this.V.M;
        }
        eVar.d(iVar, cVar.f18924i, 0, 0);
    }

    @Override // u.d
    public final boolean d() {
        return true;
    }

    @Override // u.d
    public final String toString() {
        String b10 = b.b(androidx.activity.result.a.c("[Barrier] "), this.f18951j0, " {");
        for (int i10 = 0; i10 < this.f18987s0; i10++) {
            d dVar = this.f18986r0[i10];
            if (i10 > 0) {
                b10 = d7.a.c(b10, ", ");
            }
            StringBuilder c10 = androidx.activity.result.a.c(b10);
            c10.append(dVar.f18951j0);
            b10 = c10.toString();
        }
        return d7.a.c(b10, "}");
    }
}
