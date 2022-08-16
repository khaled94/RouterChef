package m4;

/* loaded from: classes.dex */
public final class t42 extends m92<t42, r42> implements ra2 {
    private static final t42 zzb;
    private int zze;
    private n82 zzf = n82.f11571t;

    static {
        t42 t42Var = new t42();
        zzb = t42Var;
        m92.n(t42.class, t42Var);
    }

    public static r42 w() {
        return zzb.q();
    }

    public static t42 y(n82 n82Var, z82 z82Var) {
        return (t42) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new t42();
            }
            if (i11 == 4) {
                return new r42(null);
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
