package m4;

/* loaded from: classes.dex */
public final class z42 extends m92<z42, y42> implements ra2 {
    private static final z42 zzb;
    private int zze;
    private int zzf;

    static {
        z42 z42Var = new z42();
        zzb = z42Var;
        m92.n(z42.class, z42Var);
    }

    public static y42 w() {
        return zzb.q();
    }

    public static z42 y(n82 n82Var, z82 z82Var) {
        return (z42) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            }
            if (i11 == 3) {
                return new z42();
            }
            if (i11 == 4) {
                return new y42(null);
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
}
