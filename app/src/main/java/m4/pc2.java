package m4;

/* loaded from: classes.dex */
public final class pc2 extends m92<pc2, oc2> implements ra2 {
    private static final pc2 zzb;
    private int zze;
    private int zzf;
    private n82 zzg;
    private n82 zzh;

    static {
        pc2 pc2Var = new pc2();
        zzb = pc2Var;
        m92.n(pc2.class, pc2Var);
    }

    public pc2() {
        l82 l82Var = n82.f11571t;
        this.zzg = l82Var;
        this.zzh = l82Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new pc2();
            }
            if (i11 == 4) {
                return new oc2();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
