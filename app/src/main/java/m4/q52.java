package m4;

/* loaded from: classes.dex */
public final class q52 extends m92<q52, p52> implements ra2 {
    private static final q52 zzb;
    private int zze;
    private s52 zzf;
    private n82 zzg = n82.f11571t;

    static {
        q52 q52Var = new q52();
        zzb = q52Var;
        m92.n(q52.class, q52Var);
    }

    public static p52 w() {
        return zzb.q();
    }

    public static q52 y(n82 n82Var, z82 z82Var) {
        return (q52) m92.t(zzb, n82Var, z82Var);
    }

    public final n82 A() {
        return this.zzg;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new q52();
            }
            if (i11 == 4) {
                return new p52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }

    public final s52 z() {
        s52 s52Var = this.zzf;
        return s52Var == null ? s52.z() : s52Var;
    }
}
