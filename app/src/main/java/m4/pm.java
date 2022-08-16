package m4;

/* loaded from: classes.dex */
public final class pm extends m92<pm, s5> implements ra2 {
    private static final pm zzb;
    private int zze;
    private im zzf;
    private int zzg = 1000;
    private om zzh;
    private gm zzi;

    static {
        pm pmVar = new pm();
        zzb = pmVar;
        m92.n(pm.class, pmVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", bl.f6562a, "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new pm();
            }
            if (i11 == 4) {
                return new s5(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
