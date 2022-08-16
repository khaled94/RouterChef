package m4;

import java.util.List;

/* loaded from: classes.dex */
public final class h62 extends m92<h62, e6> implements ra2 {
    private static final h62 zzb;
    private int zze;
    private u92<g62> zzf = za2.f16072v;

    static {
        h62 h62Var = new h62();
        zzb = h62Var;
        m92.n(h62.class, h62Var);
    }

    public static h62 y(byte[] bArr, z82 z82Var) {
        m92 k10 = m92.k(zzb, bArr, bArr.length, z82Var);
        m92.j(k10);
        return (h62) k10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", g62.class});
            }
            if (i11 == 3) {
                return new h62();
            }
            if (i11 == 4) {
                return new e6(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final int w() {
        return this.zze;
    }

    public final List<g62> z() {
        return this.zzf;
    }
}
