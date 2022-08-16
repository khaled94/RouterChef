package m4;

/* loaded from: classes.dex */
public final class fl extends m92<fl, el> implements ra2 {
    private static final fl zzb;
    private int zze;
    private int zzg;
    private gm zzi;
    private String zzf = "";
    private q92 zzh = n92.f11578v;

    static {
        fl flVar = new fl();
        zzb = flVar;
        m92.n(fl.class, flVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", bl.f6562a, "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new fl();
            }
            if (i11 == 4) {
                return new el();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
