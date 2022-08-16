package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class xo0 implements kq0 {

    /* renamed from: a */
    public final boolean f15430a;

    /* renamed from: b */
    public final ArrayList<i01> f15431b = new ArrayList<>(1);

    /* renamed from: c */
    public int f15432c;

    /* renamed from: d */
    public gs0 f15433d;

    public xo0(boolean z10) {
        this.f15430a = z10;
    }

    @Override // m4.kq0
    public final void f(i01 i01Var) {
        Objects.requireNonNull(i01Var);
        if (!this.f15431b.contains(i01Var)) {
            this.f15431b.add(i01Var);
            this.f15432c++;
        }
    }

    public final void p(int i10) {
        gs0 gs0Var = this.f15433d;
        int i11 = ls1.f10971a;
        for (int i12 = 0; i12 < this.f15432c; i12++) {
            this.f15431b.get(i12).k(gs0Var, this.f15430a, i10);
        }
    }

    public final void q() {
        gs0 gs0Var = this.f15433d;
        int i10 = ls1.f10971a;
        for (int i11 = 0; i11 < this.f15432c; i11++) {
            this.f15431b.get(i11).m(gs0Var, this.f15430a);
        }
        this.f15433d = null;
    }

    public final void r(gs0 gs0Var) {
        for (int i10 = 0; i10 < this.f15432c; i10++) {
            this.f15431b.get(i10).c();
        }
    }

    public final void s(gs0 gs0Var) {
        this.f15433d = gs0Var;
        for (int i10 = 0; i10 < this.f15432c; i10++) {
            this.f15431b.get(i10).h(this, gs0Var, this.f15430a);
        }
    }

    @Override // m4.kq0, m4.vy0
    public /* synthetic */ Map zza() {
        return Collections.emptyMap();
    }
}
