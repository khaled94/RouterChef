package m4;

/* loaded from: classes.dex */
public final class j82 extends l82 {

    /* renamed from: v */
    public final int f9874v;

    /* renamed from: w */
    public final int f9875w;

    public j82(byte[] bArr, int i10, int i11) {
        super(bArr);
        n82.z(i10, i10 + i11, bArr.length);
        this.f9874v = i10;
        this.f9875w = i11;
    }

    @Override // m4.l82
    public final int H() {
        return this.f9874v;
    }

    @Override // m4.l82, m4.n82
    public final byte g(int i10) {
        n82.d(i10, this.f9875w);
        return this.f10679u[this.f9874v + i10];
    }

    @Override // m4.l82, m4.n82
    public final byte h(int i10) {
        return this.f10679u[this.f9874v + i10];
    }

    @Override // m4.l82, m4.n82
    public final int k() {
        return this.f9875w;
    }

    @Override // m4.l82, m4.n82
    public final void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f10679u, this.f9874v + i10, bArr, i11, i12);
    }
}
