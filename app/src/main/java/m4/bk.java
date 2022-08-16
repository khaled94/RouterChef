package m4;

/* loaded from: classes.dex */
public final class bk extends m92<bk, ak> implements ra2 {
    private static final bk zzb;
    private int zze;
    private int zzf;
    private int zzg = 1000;
    private qk zzh;
    private tk zzi;
    private u92<ok> zzj;
    private vk zzk;
    private yl zzl;
    private pl zzm;
    private hl zzn;
    private jl zzo;
    private u92<km> zzp;

    static {
        bk bkVar = new bk();
        zzb = bkVar;
        m92.n(bk.class, bkVar);
    }

    public bk() {
        za2<Object> za2Var = za2.f16072v;
        this.zzj = za2Var;
        this.zzp = za2Var;
    }

    public static bk w() {
        return zzb;
    }

    public static void y(bk bkVar, zj zjVar) {
        bkVar.zzf = zjVar.f16250s;
        bkVar.zze |= 1;
    }

    public static /* synthetic */ void z(bk bkVar, tk tkVar) {
        bkVar.zzi = tkVar;
        bkVar.zze |= 8;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", yj.f15795a, "zzg", bl.f6562a, "zzh", "zzi", "zzj", ok.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", km.class});
            }
            if (i11 == 3) {
                return new bk();
            }
            if (i11 == 4) {
                return new ak(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final tk x() {
        tk tkVar = this.zzi;
        return tkVar == null ? tk.w() : tkVar;
    }
}
