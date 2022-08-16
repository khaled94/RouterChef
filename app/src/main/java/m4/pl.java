package m4;

/* loaded from: classes.dex */
public final class pl extends m92<pl, ol> implements ra2 {
    private static final pl zzb;
    private int zze;
    private int zzf;
    private gm zzg;

    static {
        pl plVar = new pl();
        zzb = plVar;
        m92.n(pl.class, plVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", bl.f6562a, "zzg"});
            }
            if (i11 == 3) {
                return new pl();
            }
            if (i11 == 4) {
                return new ol();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
