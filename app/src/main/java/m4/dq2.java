package m4;

/* loaded from: classes.dex */
public final class dq2 implements uo2 {

    /* renamed from: a */
    public final uo2 f7593a;

    /* renamed from: b */
    public final long f7594b;

    public dq2(uo2 uo2Var, long j3) {
        this.f7593a = uo2Var;
        r01.f(uo2Var.b() >= j3);
        this.f7594b = j3;
    }

    @Override // m4.uo2
    public final int a() {
        throw null;
    }

    @Override // m4.uo2
    public final long b() {
        return this.f7593a.b() - this.f7594b;
    }

    @Override // m4.uo2
    public final long c() {
        return this.f7593a.c() - this.f7594b;
    }

    @Override // m4.uo2, m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        return this.f7593a.d(bArr, i10, i11);
    }

    @Override // m4.uo2
    public final int e(byte[] bArr, int i10, int i11) {
        throw null;
    }

    @Override // m4.uo2
    public final long g() {
        return this.f7593a.g() - this.f7594b;
    }

    @Override // m4.uo2
    public final void i() {
        this.f7593a.i();
    }

    @Override // m4.uo2
    public final void j(byte[] bArr, int i10, int i11) {
        ((qo2) this.f7593a).n(bArr, i10, i11, false);
    }

    @Override // m4.uo2
    public final void l(byte[] bArr, int i10, int i11) {
        ((qo2) this.f7593a).o(bArr, i10, i11, false);
    }

    @Override // m4.uo2
    public final void m(int i10) {
        ((qo2) this.f7593a).q(i10);
    }

    @Override // m4.uo2
    public final boolean n(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f7593a.n(bArr, 0, 8, true);
    }

    @Override // m4.uo2
    public final boolean o(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f7593a.o(bArr, 0, 8, true);
    }

    @Override // m4.uo2
    public final void w(int i10) {
        ((qo2) this.f7593a).p(i10, false);
    }
}
