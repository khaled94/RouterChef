package m4;

/* loaded from: classes.dex */
public final class f52 extends m92<f52, e52> implements ra2 {
    private static final f52 zzb;
    private int zze;
    private n82 zzf = n82.f11571t;

    static {
        f52 f52Var = new f52();
        zzb = f52Var;
        m92.n(f52.class, f52Var);
    }

    public static e52 w() {
        return zzb.q();
    }

    public static f52 y(n82 n82Var, z82 z82Var) {
        return (f52) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new f52();
            }
            if (i11 == 4) {
                return new e52(null);
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
