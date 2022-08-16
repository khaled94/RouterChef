package m4;

/* loaded from: classes.dex */
public final class mm extends m92<mm, o5> implements ra2 {
    private static final mm zzb;
    private int zze;
    private int zzf = 1000;
    private om zzg;
    private gm zzh;

    static {
        mm mmVar = new mm();
        zzb = mmVar;
        m92.n(mm.class, mmVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", bl.f6562a, "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new mm();
            }
            if (i11 == 4) {
                return new o5(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
