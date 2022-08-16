package m4;

/* loaded from: classes.dex */
public final class x62 extends m92<x62, w62> implements ra2 {
    private static final x62 zzb;
    private int zze;
    private n82 zzf = n82.f11571t;

    static {
        x62 x62Var = new x62();
        zzb = x62Var;
        m92.n(x62.class, x62Var);
    }

    public static w62 w() {
        return zzb.q();
    }

    public static x62 y(n82 n82Var, z82 z82Var) {
        return (x62) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new x62();
            }
            if (i11 == 4) {
                return new w62(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }

    public final n82 z() {
        return this.zzf;
    }
}
