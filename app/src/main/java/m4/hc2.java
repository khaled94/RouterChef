package m4;

/* loaded from: classes.dex */
public final class hc2 extends m92<hc2, gc2> implements ra2 {
    private static final hc2 zzb;
    private int zze;
    private String zzf = "";

    static {
        hc2 hc2Var = new hc2();
        zzb = hc2Var;
        m92.n(hc2.class, hc2Var);
    }

    public static gc2 v() {
        return zzb.q();
    }

    public static /* synthetic */ hc2 w() {
        return zzb;
    }

    public static /* synthetic */ void x(hc2 hc2Var, String str) {
        hc2Var.zze |= 1;
        hc2Var.zzf = str;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new hc2();
            }
            if (i11 == 4) {
                return new gc2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
