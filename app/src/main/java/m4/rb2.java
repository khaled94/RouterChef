package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rb2 extends pb2<qb2, qb2> {
    @Override // m4.pb2
    public final /* synthetic */ int a(qb2 qb2Var) {
        return qb2Var.a();
    }

    @Override // m4.pb2
    public final int b(qb2 qb2Var) {
        qb2 qb2Var2 = qb2Var;
        int i10 = qb2Var2.f12767d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < qb2Var2.f12764a; i12++) {
                int i13 = qb2Var2.f12765b[i12];
                int i14 = v82.i(8);
                int k10 = ((n82) qb2Var2.f12766c[i12]).k();
                i11 += v82.i(k10) + k10 + v82.i(24) + v82.i(i13 >>> 3) + v82.i(16) + i14 + i14;
            }
            qb2Var2.f12767d = i11;
            return i11;
        }
        return i10;
    }

    @Override // m4.pb2
    public final /* bridge */ /* synthetic */ qb2 c(Object obj) {
        m92 m92Var = (m92) obj;
        qb2 qb2Var = m92Var.zzc;
        if (qb2Var == qb2.f12763f) {
            qb2 b10 = qb2.b();
            m92Var.zzc = b10;
            return b10;
        }
        return qb2Var;
    }

    @Override // m4.pb2
    public final /* synthetic */ qb2 d(Object obj) {
        return ((m92) obj).zzc;
    }

    @Override // m4.pb2
    public final qb2 e(qb2 qb2Var, qb2 qb2Var2) {
        qb2 qb2Var3 = qb2Var2;
        if (qb2Var3.equals(qb2.f12763f)) {
            return qb2Var;
        }
        qb2 qb2Var4 = qb2Var;
        int i10 = qb2Var4.f12764a + qb2Var3.f12764a;
        int[] copyOf = Arrays.copyOf(qb2Var4.f12765b, i10);
        System.arraycopy(qb2Var3.f12765b, 0, copyOf, qb2Var4.f12764a, qb2Var3.f12764a);
        Object[] copyOf2 = Arrays.copyOf(qb2Var4.f12766c, i10);
        System.arraycopy(qb2Var3.f12766c, 0, copyOf2, qb2Var4.f12764a, qb2Var3.f12764a);
        return new qb2(i10, copyOf, copyOf2, true);
    }

    @Override // m4.pb2
    public final /* synthetic */ qb2 f() {
        return qb2.b();
    }

    @Override // m4.pb2
    public final qb2 g(qb2 qb2Var) {
        qb2Var.f12768e = false;
        return qb2Var;
    }

    @Override // m4.pb2
    public final /* bridge */ /* synthetic */ void h(qb2 qb2Var, int i10, int i11) {
        qb2Var.c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // m4.pb2
    public final /* bridge */ /* synthetic */ void i(qb2 qb2Var, int i10, long j3) {
        qb2Var.c((i10 << 3) | 1, Long.valueOf(j3));
    }

    @Override // m4.pb2
    public final /* bridge */ /* synthetic */ void j(qb2 qb2Var, int i10, qb2 qb2Var2) {
        qb2Var.c((i10 << 3) | 3, qb2Var2);
    }

    @Override // m4.pb2
    public final /* bridge */ /* synthetic */ void k(qb2 qb2Var, int i10, n82 n82Var) {
        qb2Var.c((i10 << 3) | 2, n82Var);
    }

    @Override // m4.pb2
    public final /* bridge */ /* synthetic */ void l(qb2 qb2Var, int i10, long j3) {
        qb2Var.c(i10 << 3, Long.valueOf(j3));
    }

    @Override // m4.pb2
    public final void m(Object obj) {
        ((m92) obj).zzc.f12768e = false;
    }

    @Override // m4.pb2
    public final /* synthetic */ void n(Object obj, qb2 qb2Var) {
        ((m92) obj).zzc = qb2Var;
    }

    @Override // m4.pb2
    public final /* synthetic */ void o(Object obj, qb2 qb2Var) {
        ((m92) obj).zzc = qb2Var;
    }

    @Override // m4.pb2
    public final void q() {
    }

    @Override // m4.pb2
    public final /* synthetic */ void r(qb2 qb2Var, w82 w82Var) {
        qb2Var.d(w82Var);
    }
}
