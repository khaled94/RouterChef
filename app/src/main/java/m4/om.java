package m4;

/* loaded from: classes.dex */
public final class om extends m92<om, s5> implements ra2 {
    private static final om zzb;
    private int zze;
    private int zzf;

    static {
        om omVar = new om();
        zzb = omVar;
        m92.n(om.class, omVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", nm.f11837a});
            }
            if (i11 == 3) {
                return new om();
            }
            if (i11 == 4) {
                return new s5();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
