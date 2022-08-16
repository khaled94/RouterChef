package u;

import s.e;
import s.i;
import u.c;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: r0 */
    public float f18980r0 = -1.0f;

    /* renamed from: s0 */
    public int f18981s0 = -1;

    /* renamed from: t0 */
    public int f18982t0 = -1;

    /* renamed from: u0 */
    public c f18983u0 = this.K;

    /* renamed from: v0 */
    public int f18984v0 = 0;

    /* renamed from: w0 */
    public boolean f18985w0;

    public f() {
        this.S.clear();
        this.S.add(this.f18983u0);
        int length = this.R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.R[i10] = this.f18983u0;
        }
    }

    @Override // u.d
    public final boolean B() {
        return this.f18985w0;
    }

    @Override // u.d
    public final boolean C() {
        return this.f18985w0;
    }

    @Override // u.d
    public final void S(e eVar, boolean z10) {
        if (this.V == null) {
            return;
        }
        int o10 = eVar.o(this.f18983u0);
        if (this.f18984v0 == 1) {
            this.f18933a0 = o10;
            this.f18935b0 = 0;
            L(this.V.k());
            Q(0);
            return;
        }
        this.f18933a0 = 0;
        this.f18935b0 = o10;
        Q(this.V.r());
        L(0);
    }

    public final void T(int i10) {
        this.f18983u0.j(i10);
        this.f18985w0 = true;
    }

    public final void U(int i10) {
        if (this.f18984v0 == i10) {
            return;
        }
        this.f18984v0 = i10;
        this.S.clear();
        this.f18983u0 = this.f18984v0 == 1 ? this.J : this.K;
        this.S.add(this.f18983u0);
        int length = this.R.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.R[i11] = this.f18983u0;
        }
    }

    @Override // u.d
    public final void c(e eVar, boolean z10) {
        i iVar;
        i iVar2;
        i iVar3;
        e eVar2 = (e) this.V;
        if (eVar2 == null) {
            return;
        }
        Object h10 = eVar2.h(c.a.LEFT);
        Object h11 = eVar2.h(c.a.RIGHT);
        d dVar = this.V;
        boolean z11 = true;
        boolean z12 = dVar != null && dVar.U[0] == 2;
        if (this.f18984v0 == 0) {
            h10 = eVar2.h(c.a.TOP);
            h11 = eVar2.h(c.a.BOTTOM);
            d dVar2 = this.V;
            if (dVar2 == null || dVar2.U[1] != 2) {
                z11 = false;
            }
            z12 = z11;
        }
        if (this.f18985w0) {
            c cVar = this.f18983u0;
            if (cVar.f18918c) {
                i l10 = eVar.l(cVar);
                eVar.e(l10, this.f18983u0.c());
                if (this.f18981s0 != -1) {
                    if (z12) {
                        iVar3 = eVar.l(h11);
                        eVar.f(iVar3, l10, 0, 5);
                    }
                    this.f18985w0 = false;
                    return;
                }
                if (this.f18982t0 != -1 && z12) {
                    i l11 = eVar.l(h11);
                    eVar.f(l10, eVar.l(h10), 0, 5);
                    iVar3 = l11;
                    eVar.f(iVar3, l10, 0, 5);
                }
                this.f18985w0 = false;
                return;
            }
        }
        if (this.f18981s0 != -1) {
            iVar = eVar.l(this.f18983u0);
            eVar.d(iVar, eVar.l(h10), this.f18981s0, 8);
            if (!z12) {
                return;
            }
            iVar2 = eVar.l(h11);
        } else if (this.f18982t0 == -1) {
            if (this.f18980r0 == -1.0f) {
                return;
            }
            i l12 = eVar.l(this.f18983u0);
            i l13 = eVar.l(h11);
            float f10 = this.f18980r0;
            s.c m10 = eVar.m();
            m10.f17553d.b(l12, -1.0f);
            m10.f17553d.b(l13, f10);
            eVar.c(m10);
            return;
        } else {
            iVar = eVar.l(this.f18983u0);
            i l14 = eVar.l(h11);
            eVar.d(iVar, l14, -this.f18982t0, 8);
            if (!z12) {
                return;
            }
            eVar.f(iVar, eVar.l(h10), 0, 5);
            iVar2 = l14;
        }
        eVar.f(iVar2, iVar, 0, 5);
    }

    @Override // u.d
    public final boolean d() {
        return true;
    }

    @Override // u.d
    public final c h(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f18984v0 != 0) {
                return null;
            }
            return this.f18983u0;
        }
        if (this.f18984v0 == 1) {
            return this.f18983u0;
        }
        return null;
    }
}
