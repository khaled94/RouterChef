package m4;

/* loaded from: classes.dex */
public final class ok extends m92<ok, nk> implements ra2 {
    private static final ok zzb;
    private int zze;
    private int zzf;
    private cm zzg;

    static {
        ok okVar = new ok();
        zzb = okVar;
        m92.n(ok.class, okVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", lk.f10880a, "zzg"});
            }
            if (i11 == 3) {
                return new ok();
            }
            if (i11 == 4) {
                return new nk();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
