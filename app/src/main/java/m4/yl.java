package m4;

/* loaded from: classes.dex */
public final class yl extends m92<yl, xl> implements ra2 {
    private static final yl zzb;
    private int zze;
    private int zzf = 1000;
    private int zzg = 1000;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private am zzp;

    static {
        yl ylVar = new yl();
        zzb = ylVar;
        m92.n(yl.class, ylVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                bl blVar = bl.f6562a;
                return new ab2(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zze", "zzf", blVar, "zzg", blVar, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
            } else if (i11 == 3) {
                return new yl();
            } else {
                if (i11 == 4) {
                    return new xl();
                }
                if (i11 == 5) {
                    return zzb;
                }
                return null;
            }
        }
        return (byte) 1;
    }
}
