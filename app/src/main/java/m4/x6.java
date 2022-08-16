package m4;

/* loaded from: classes.dex */
public final class x6 extends m92<x6, w6> implements ra2 {
    private static final x6 zzb;
    private int zze;
    private u92<n82> zzf = za2.f16072v;
    private n82 zzg = n82.f11571t;
    private int zzh = 1;
    private int zzi = 1;

    static {
        x6 x6Var = new x6();
        zzb = x6Var;
        m92.n(x6.class, x6Var);
    }

    public static w6 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(x6 x6Var, n82 n82Var) {
        u92<n82> u92Var = x6Var.zzf;
        if (!u92Var.c()) {
            x6Var.zzf = m92.l(u92Var);
        }
        x6Var.zzf.add(n82Var);
    }

    public static /* synthetic */ void y(x6 x6Var, n82 n82Var) {
        x6Var.zze |= 1;
        x6Var.zzg = n82Var;
    }

    public static /* synthetic */ void z(x6 x6Var, int i10) {
        x6Var.zzi = i10 - 1;
        x6Var.zze |= 4;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", r6.f13173a, "zzi", p6.f12409a});
            }
            if (i11 == 3) {
                return new x6();
            }
            if (i11 == 4) {
                return new w6(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
