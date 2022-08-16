package m4;

/* loaded from: classes.dex */
public final class xm extends m92<xm, wm> implements ra2 {
    private static final xm zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        xm xmVar = new xm();
        zzb = xmVar;
        m92.n(xm.class, xmVar);
    }

    public static wm v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(xm xmVar, boolean z10) {
        xmVar.zze |= 1;
        xmVar.zzf = z10;
    }

    public static /* synthetic */ void y(xm xmVar, int i10) {
        xmVar.zze |= 2;
        xmVar.zzg = i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new xm();
            }
            if (i11 == 4) {
                return new wm(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final boolean z() {
        return this.zzf;
    }
}
