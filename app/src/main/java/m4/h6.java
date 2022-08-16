package m4;

/* loaded from: classes.dex */
public final class h6 extends m92<h6, g6> implements ra2 {
    private static final h6 zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        h6 h6Var = new h6();
        zzb = h6Var;
        m92.n(h6.class, h6Var);
    }

    public static /* synthetic */ void A(h6 h6Var, long j3) {
        h6Var.zze |= 8;
        h6Var.zzi = j3;
    }

    public static /* synthetic */ void B(h6 h6Var) {
        h6Var.zze &= -9;
        h6Var.zzi = -1L;
    }

    public static /* synthetic */ void C(h6 h6Var, long j3) {
        h6Var.zze |= 16;
        h6Var.zzj = j3;
    }

    public static /* synthetic */ void D(h6 h6Var, long j3) {
        h6Var.zze |= 32;
        h6Var.zzk = j3;
    }

    public static /* synthetic */ void E(h6 h6Var, long j3) {
        h6Var.zze |= 128;
        h6Var.zzm = j3;
    }

    public static /* synthetic */ void F(h6 h6Var, long j3) {
        h6Var.zze |= 256;
        h6Var.zzn = j3;
    }

    public static /* synthetic */ void G(h6 h6Var, long j3) {
        h6Var.zze |= 512;
        h6Var.zzo = j3;
    }

    public static /* synthetic */ void H(h6 h6Var, long j3) {
        h6Var.zze |= 2048;
        h6Var.zzq = j3;
    }

    public static /* synthetic */ void I(h6 h6Var, long j3) {
        h6Var.zze |= 4096;
        h6Var.zzr = j3;
    }

    public static /* synthetic */ void J(h6 h6Var, long j3) {
        h6Var.zze |= 8192;
        h6Var.zzs = j3;
    }

    public static /* synthetic */ void K(h6 h6Var, long j3) {
        h6Var.zze |= 16384;
        h6Var.zzt = j3;
    }

    public static /* synthetic */ void L(h6 h6Var, long j3) {
        h6Var.zze |= 32768;
        h6Var.zzu = j3;
    }

    public static /* synthetic */ void M(h6 h6Var, long j3) {
        h6Var.zze |= 65536;
        h6Var.zzv = j3;
    }

    public static /* synthetic */ void N(h6 h6Var, long j3) {
        h6Var.zze |= 131072;
        h6Var.zzw = j3;
    }

    public static /* synthetic */ void O(h6 h6Var, long j3) {
        h6Var.zze |= 262144;
        h6Var.zzx = j3;
    }

    public static /* synthetic */ void P(h6 h6Var, int i10) {
        h6Var.zzl = i10 - 1;
        h6Var.zze |= 64;
    }

    public static /* synthetic */ void Q(h6 h6Var, int i10) {
        h6Var.zzp = i10 - 1;
        h6Var.zze |= 1024;
    }

    public static g6 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(h6 h6Var, long j3) {
        h6Var.zze |= 1;
        h6Var.zzf = j3;
    }

    public static /* synthetic */ void y(h6 h6Var, long j3) {
        h6Var.zze |= 2;
        h6Var.zzg = j3;
    }

    public static /* synthetic */ void z(h6 h6Var, long j3) {
        h6Var.zze |= 4;
        h6Var.zzh = j3;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                q6 q6Var = q6.f12714a;
                return new ab2(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", q6Var, "zzm", "zzn", "zzo", "zzp", q6Var, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
            } else if (i11 == 3) {
                return new h6();
            } else {
                if (i11 == 4) {
                    return new g6(null);
                }
                if (i11 == 5) {
                    return zzb;
                }
                return null;
            }
        }
        return (byte) 1;
    }
}
