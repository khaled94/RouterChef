package m4;

/* loaded from: classes.dex */
public final class j6 extends m92<j6, i6> implements ra2 {
    private static final j6 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        j6 j6Var = new j6();
        zzb = j6Var;
        m92.n(j6.class, j6Var);
    }

    public static /* synthetic */ void A(j6 j6Var, long j3) {
        j6Var.zze |= 32;
        j6Var.zzk = j3;
    }

    public static i6 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(j6 j6Var, long j3) {
        j6Var.zze |= 4;
        j6Var.zzh = j3;
    }

    public static /* synthetic */ void y(j6 j6Var, long j3) {
        j6Var.zze |= 8;
        j6Var.zzi = j3;
    }

    public static /* synthetic */ void z(j6 j6Var, long j3) {
        j6Var.zze |= 16;
        j6Var.zzj = j3;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            if (i11 == 3) {
                return new j6();
            }
            if (i11 == 4) {
                return new i6(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
