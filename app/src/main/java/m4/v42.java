package m4;

/* loaded from: classes.dex */
public final class v42 extends m92<v42, u42> implements ra2 {
    private static final v42 zzb;
    private int zze;
    private int zzf;

    static {
        v42 v42Var = new v42();
        zzb = v42Var;
        m92.n(v42.class, v42Var);
    }

    public static u42 w() {
        return zzb.q();
    }

    public static v42 y(n82 n82Var, z82 z82Var) {
        return (v42) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new v42();
            }
            if (i11 == 4) {
                return new u42(null);
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
