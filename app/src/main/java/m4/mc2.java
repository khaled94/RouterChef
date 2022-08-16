package m4;

/* loaded from: classes.dex */
public final class mc2 extends m92<mc2, kc2> implements ra2 {
    private static final mc2 zzb;
    private int zze;
    private lc2 zzf;
    private n82 zzh;
    private n82 zzi;
    private int zzj;
    private byte zzk = 2;
    private u92<jc2> zzg = za2.f16072v;

    static {
        mc2 mc2Var = new mc2();
        zzb = mc2Var;
        m92.n(mc2.class, mc2Var);
    }

    public mc2() {
        l82 l82Var = n82.f11571t;
        this.zzh = l82Var;
        this.zzi = l82Var;
    }

    public static kc2 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(mc2 mc2Var, jc2 jc2Var) {
        u92<jc2> u92Var = mc2Var.zzg;
        if (!u92Var.c()) {
            mc2Var.zzg = m92.l(u92Var);
        }
        mc2Var.zzg.add(jc2Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", jc2.class, "zzh", "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new mc2();
            }
            if (i11 == 4) {
                return new kc2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzk = b10;
            return null;
        }
        return Byte.valueOf(this.zzk);
    }
}
