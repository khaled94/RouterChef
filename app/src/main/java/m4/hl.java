package m4;

/* loaded from: classes.dex */
public final class hl extends m92<hl, gl> implements ra2 {
    private static final hl zzb;
    private int zze;
    private int zzf;
    private q92 zzg = n92.f11578v;

    static {
        hl hlVar = new hl();
        zzb = hlVar;
        m92.n(hl.class, hlVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", bl.f6562a, "zzg"});
            }
            if (i11 == 3) {
                return new hl();
            }
            if (i11 == 4) {
                return new gl();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
