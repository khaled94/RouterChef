package m4;

/* loaded from: classes.dex */
public final class y62 extends m92<y62, uk> implements ra2 {
    private static final y62 zzb;
    private int zze;

    static {
        y62 y62Var = new y62();
        zzb = y62Var;
        m92.n(y62.class, y62Var);
    }

    public static y62 w() {
        return zzb;
    }

    public static y62 x(n82 n82Var, z82 z82Var) {
        return (y62) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            }
            if (i11 == 3) {
                return new y62();
            }
            if (i11 == 4) {
                return new uk(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
