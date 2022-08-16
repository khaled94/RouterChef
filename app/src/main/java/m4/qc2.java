package m4;

/* loaded from: classes.dex */
public final class qc2 extends m92<qc2, nc2> implements ra2 {
    private static final qc2 zzb;
    private int zze;
    private pc2 zzf;
    private n82 zzh;
    private n82 zzi;
    private int zzj;
    private n82 zzk;
    private byte zzl = 2;
    private u92<jc2> zzg = za2.f16072v;

    static {
        qc2 qc2Var = new qc2();
        zzb = qc2Var;
        m92.n(qc2.class, qc2Var);
    }

    public qc2() {
        l82 l82Var = n82.f11571t;
        this.zzh = l82Var;
        this.zzi = l82Var;
        this.zzk = l82Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", jc2.class, "zzh", "zzi", "zzj", "zzk"});
            }
            if (i11 == 3) {
                return new qc2();
            }
            if (i11 == 4) {
                return new nc2();
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzl = b10;
            return null;
        }
        return Byte.valueOf(this.zzl);
    }
}
