package m4;

/* loaded from: classes.dex */
public final class zc2 extends m92<zc2, yc2> implements ra2 {
    private static final zc2 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        zc2 zc2Var = new zc2();
        zzb = zc2Var;
        m92.n(zc2.class, zc2Var);
    }

    public static yc2 v() {
        return zzb.q();
    }

    public static /* synthetic */ zc2 w() {
        return zzb;
    }

    public static /* synthetic */ void x(zc2 zc2Var, String str) {
        zc2Var.zze |= 1;
        zc2Var.zzf = str;
    }

    public static /* synthetic */ void y(zc2 zc2Var, long j3) {
        zc2Var.zze |= 2;
        zc2Var.zzg = j3;
    }

    public static /* synthetic */ void z(zc2 zc2Var, boolean z10) {
        zc2Var.zze |= 4;
        zc2Var.zzh = z10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new zc2();
            }
            if (i11 == 4) {
                return new yc2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
