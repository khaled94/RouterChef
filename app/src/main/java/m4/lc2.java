package m4;

/* loaded from: classes.dex */
public final class lc2 extends m92<lc2, il> implements ra2 {
    private static final lc2 zzb;
    private int zze;
    private n82 zzf;
    private n82 zzg;
    private n82 zzh;

    static {
        lc2 lc2Var = new lc2();
        zzb = lc2Var;
        m92.n(lc2.class, lc2Var);
    }

    public lc2() {
        l82 l82Var = n82.f11571t;
        this.zzf = l82Var;
        this.zzg = l82Var;
        this.zzh = l82Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new lc2();
            }
            if (i11 == 4) {
                return new il(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
