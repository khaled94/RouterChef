package m4;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class so2 implements mp2 {

    /* renamed from: a */
    public final byte[] f13798a = new byte[4096];

    @Override // m4.mp2
    public final int a(jp0 jp0Var, int i10, boolean z10) {
        int d5 = jp0Var.d(this.f13798a, 0, Math.min(4096, i10));
        if (d5 == -1) {
            if (!z10) {
                throw new EOFException();
            }
            return -1;
        }
        return d5;
    }

    @Override // m4.mp2
    public final void b(dd ddVar, int i10) {
        ddVar.i(i10);
    }

    @Override // m4.mp2
    public final int c(jp0 jp0Var, int i10) {
        return a(jp0Var, i10, true);
    }

    @Override // m4.mp2
    public final void d(dd ddVar, int i10) {
        ddVar.i(i10);
    }

    @Override // m4.mp2
    public final void e(long j3, int i10, int i11, int i12, lp2 lp2Var) {
    }

    @Override // m4.mp2
    public final void f(t tVar) {
    }
}
