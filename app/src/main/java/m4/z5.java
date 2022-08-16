package m4;

/* loaded from: classes.dex */
public final class z5 extends m92<z5, y5> implements ra2 {
    private static final z5 zzb;
    private int zze;
    private int zzf;

    static {
        z5 z5Var = new z5();
        zzb = z5Var;
        m92.n(z5.class, z5Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", b6.f6397a});
            }
            if (i11 == 3) {
                return new z5();
            }
            if (i11 == 4) {
                return new y5();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
