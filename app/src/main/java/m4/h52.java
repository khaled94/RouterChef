package m4;

/* loaded from: classes.dex */
public final class h52 extends m92<h52, g52> implements ra2 {
    private static final h52 zzb;

    static {
        h52 h52Var = new h52();
        zzb = h52Var;
        m92.n(h52.class, h52Var);
    }

    public static h52 w() {
        return zzb;
    }

    public static h52 x(n82 n82Var, z82 z82Var) {
        return (h52) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0000", null);
            }
            if (i11 == 3) {
                return new h52();
            }
            if (i11 == 4) {
                return new g52();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
