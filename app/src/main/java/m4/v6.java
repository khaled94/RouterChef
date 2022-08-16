package m4;

/* loaded from: classes.dex */
public final class v6 extends m92<v6, u6> implements ra2 {
    private static final v6 zzb;
    private int zze;
    private String zzf = "";

    static {
        v6 v6Var = new v6();
        zzb = v6Var;
        m92.n(v6.class, v6Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new v6();
            }
            if (i11 == 4) {
                return new u6();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
