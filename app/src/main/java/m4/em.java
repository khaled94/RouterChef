package m4;

/* loaded from: classes.dex */
public final class em extends m92<em, dm> implements ra2 {
    private static final em zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private gm zzh;

    static {
        em emVar = new em();
        zzb = emVar;
        m92.n(em.class, emVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", bl.f6562a, "zzh"});
            }
            if (i11 == 3) {
                return new em();
            }
            if (i11 == 4) {
                return new dm();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
