package m4;

/* loaded from: classes.dex */
public final class hk extends m92<hk, gk> implements ra2 {
    private static final hk zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        hk hkVar = new hk();
        zzb = hkVar;
        m92.n(hk.class, hkVar);
    }

    public static gk v() {
        return zzb.q();
    }

    public static hk x() {
        return zzb;
    }

    public static /* synthetic */ void y(hk hkVar, boolean z10) {
        hkVar.zze |= 1;
        hkVar.zzf = z10;
    }

    public static /* synthetic */ void z(hk hkVar, int i10) {
        hkVar.zze |= 2;
        hkVar.zzg = i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new hk();
            }
            if (i11 == 4) {
                return new gk(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
