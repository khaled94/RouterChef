package m4;

/* loaded from: classes.dex */
public final class sm extends m92<sm, u5> implements ra2 {
    private static final sm zzb;
    private int zze;
    private int zzf = 1000;
    private om zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        sm smVar = new sm();
        zzb = smVar;
        m92.n(sm.class, smVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zze", "zzf", bl.f6562a, "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            if (i11 == 3) {
                return new sm();
            }
            if (i11 == 4) {
                return new u5();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
