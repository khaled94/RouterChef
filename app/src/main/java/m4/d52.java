package m4;

/* loaded from: classes.dex */
public final class d52 extends m92<d52, c52> implements ra2 {
    private static final d52 zzb;
    private int zze;
    private int zzf;

    static {
        d52 d52Var = new d52();
        zzb = d52Var;
        m92.n(d52.class, d52Var);
    }

    public static c52 w() {
        return zzb.q();
    }

    public static d52 y(n82 n82Var, z82 z82Var) {
        return (d52) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new d52();
            }
            if (i11 == 4) {
                return new c52(null);
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
