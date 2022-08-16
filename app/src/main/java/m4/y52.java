package m4;

/* loaded from: classes.dex */
public final class y52 extends m92<y52, x52> implements ra2 {
    private static final y52 zzb;
    private a62 zze;
    private int zzf;
    private int zzg;

    static {
        y52 y52Var = new y52();
        zzb = y52Var;
        m92.n(y52.class, y52Var);
    }

    public static x52 w() {
        return zzb.q();
    }

    public static y52 y() {
        return zzb;
    }

    public static y52 z(n82 n82Var, z82 z82Var) {
        return (y52) m92.t(zzb, n82Var, z82Var);
    }

    public final a62 A() {
        a62 a62Var = this.zze;
        return a62Var == null ? a62.y() : a62Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new y52();
            }
            if (i11 == 4) {
                return new x52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzf;
    }
}
