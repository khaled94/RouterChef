package m4;

/* loaded from: classes.dex */
public final class e42 extends m92<e42, d42> implements ra2 {
    private static final e42 zzb;
    private i42 zze;
    private y52 zzf;

    static {
        e42 e42Var = new e42();
        zzb = e42Var;
        m92.n(e42.class, e42Var);
    }

    public static d42 v() {
        return zzb.q();
    }

    public static e42 x(n82 n82Var, z82 z82Var) {
        return (e42) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new e42();
            }
            if (i11 == 4) {
                return new d42(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final i42 y() {
        i42 i42Var = this.zze;
        return i42Var == null ? i42.y() : i42Var;
    }

    public final y52 z() {
        y52 y52Var = this.zzf;
        return y52Var == null ? y52.y() : y52Var;
    }
}
