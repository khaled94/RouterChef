package m4;

/* loaded from: classes.dex */
public final class o42 extends m92<o42, n42> implements ra2 {
    private static final o42 zzb;
    private q42 zze;
    private int zzf;

    static {
        o42 o42Var = new o42();
        zzb = o42Var;
        m92.n(o42.class, o42Var);
    }

    public static n42 w() {
        return zzb.q();
    }

    public static o42 y(n82 n82Var, z82 z82Var) {
        return (o42) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new o42();
            }
            if (i11 == 4) {
                return new n42(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzf;
    }

    public final q42 z() {
        q42 q42Var = this.zze;
        return q42Var == null ? q42.y() : q42Var;
    }
}
