package m4;

/* loaded from: classes.dex */
public final class f6 extends m92<f6, e6> implements ra2 {
    private static final f6 zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        f6 f6Var = new f6();
        zzb = f6Var;
        m92.n(f6.class, f6Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", q6.f12714a});
            }
            if (i11 == 3) {
                return new f6();
            }
            if (i11 == 4) {
                return new e6();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
