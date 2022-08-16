package m4;

/* loaded from: classes.dex */
public final class rm extends m92<rm, u5> implements ra2 {
    private static final rm zzb;
    private int zze;
    private int zzf = 1000;
    private om zzg;
    private gm zzh;

    static {
        rm rmVar = new rm();
        zzb = rmVar;
        m92.n(rm.class, rmVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", bl.f6562a, "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new rm();
            }
            if (i11 == 4) {
                return new u5(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
