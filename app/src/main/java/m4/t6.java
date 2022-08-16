package m4;

/* loaded from: classes.dex */
public final class t6 extends m92<t6, s6> implements ra2 {
    private static final t6 zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private n82 zzh = n82.f11571t;

    static {
        t6 t6Var = new t6();
        zzb = t6Var;
        m92.n(t6.class, t6Var);
    }

    public static t6 x() {
        return zzb;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new t6();
            }
            if (i11 == 4) {
                return new s6();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final long v() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
