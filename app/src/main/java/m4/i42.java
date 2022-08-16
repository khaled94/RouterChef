package m4;

/* loaded from: classes.dex */
public final class i42 extends m92<i42, h42> implements ra2 {
    private static final i42 zzb;
    private k42 zze;
    private int zzf;

    static {
        i42 i42Var = new i42();
        zzb = i42Var;
        m92.n(i42.class, i42Var);
    }

    public static h42 w() {
        return zzb.q();
    }

    public static i42 y() {
        return zzb;
    }

    public static i42 z(n82 n82Var, z82 z82Var) {
        return (i42) m92.t(zzb, n82Var, z82Var);
    }

    public final k42 A() {
        k42 k42Var = this.zze;
        return k42Var == null ? k42.y() : k42Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new i42();
            }
            if (i11 == 4) {
                return new h42(null);
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
}
