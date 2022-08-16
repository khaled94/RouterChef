package m4;

@Deprecated
/* loaded from: classes.dex */
public final class f62 extends m92<f62, um> implements ra2 {
    private static final f62 zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        f62 f62Var = new f62();
        zzb = f62Var;
        m92.n(f62.class, f62Var);
    }

    public static /* synthetic */ f62 v() {
        return zzb;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new f62();
            }
            if (i11 == 4) {
                return new um(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final String w() {
        return this.zzi;
    }

    public final String x() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzh;
    }
}
