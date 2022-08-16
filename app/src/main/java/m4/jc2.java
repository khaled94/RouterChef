package m4;

/* loaded from: classes.dex */
public final class jc2 extends m92<jc2, ic2> implements ra2 {
    private static final jc2 zzb;
    private int zze;
    private n82 zzf;
    private n82 zzg;
    private byte zzh = 2;

    static {
        jc2 jc2Var = new jc2();
        zzb = jc2Var;
        m92.n(jc2.class, jc2Var);
    }

    public jc2() {
        l82 l82Var = n82.f11571t;
        this.zzf = l82Var;
        this.zzg = l82Var;
    }

    public static ic2 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(jc2 jc2Var, n82 n82Var) {
        jc2Var.zze |= 1;
        jc2Var.zzf = n82Var;
    }

    public static /* synthetic */ void y(jc2 jc2Var, n82 n82Var) {
        jc2Var.zze |= 2;
        jc2Var.zzg = n82Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new jc2();
            }
            if (i11 == 4) {
                return new ic2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzh = b10;
            return null;
        }
        return Byte.valueOf(this.zzh);
    }
}
