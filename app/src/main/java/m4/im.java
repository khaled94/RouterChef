package m4;

/* loaded from: classes.dex */
public final class im extends m92<im, hm> implements ra2 {
    private static final im zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        im imVar = new im();
        zzb = imVar;
        m92.n(im.class, imVar);
    }

    public static hm v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(im imVar, int i10) {
        imVar.zze |= 1;
        imVar.zzf = i10;
    }

    public static /* synthetic */ void y(im imVar, int i10) {
        imVar.zze |= 2;
        imVar.zzg = i10;
    }

    public static /* synthetic */ void z(im imVar, int i10) {
        imVar.zze |= 4;
        imVar.zzh = i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new im();
            }
            if (i11 == 4) {
                return new hm(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
