package m4;

/* loaded from: classes.dex */
public final class al extends m92<al, yk> implements ra2 {
    private static final al zzb;
    private int zze;
    private int zzf;
    private im zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        al alVar = new al();
        zzb = alVar;
        m92.n(al.class, alVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zk.f16262a, "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new al();
            }
            if (i11 == 4) {
                return new yk();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
