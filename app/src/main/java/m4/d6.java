package m4;

/* loaded from: classes.dex */
public final class d6 extends m92<d6, c6> implements ra2 {
    private static final d6 zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        d6 d6Var = new d6();
        zzb = d6Var;
        m92.n(d6.class, d6Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", a6.f6052a, "zzg"});
            }
            if (i11 == 3) {
                return new d6();
            }
            if (i11 == 4) {
                return new c6();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
