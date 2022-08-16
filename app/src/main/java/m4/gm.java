package m4;

/* loaded from: classes.dex */
public final class gm extends m92<gm, fm> implements ra2 {
    private static final gm zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        gm gmVar = new gm();
        zzb = gmVar;
        m92.n(gm.class, gmVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new gm();
            }
            if (i11 == 4) {
                return new fm();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
