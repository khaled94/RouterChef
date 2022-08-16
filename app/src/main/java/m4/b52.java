package m4;

/* loaded from: classes.dex */
public final class b52 extends m92<b52, a52> implements ra2 {
    private static final b52 zzb;
    private int zze;
    private n82 zzf = n82.f11571t;

    static {
        b52 b52Var = new b52();
        zzb = b52Var;
        m92.n(b52.class, b52Var);
    }

    public static a52 w() {
        return zzb.q();
    }

    public static b52 y(n82 n82Var, z82 z82Var) {
        return (b52) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new b52();
            }
            if (i11 == 4) {
                return new a52(null);
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
