package m4;

/* loaded from: classes.dex */
public final class u62 extends m92<u62, t62> implements ra2 {
    private static final u62 zzb;
    private String zze = "";
    private e62 zzf;

    static {
        u62 u62Var = new u62();
        zzb = u62Var;
        m92.n(u62.class, u62Var);
    }

    public static u62 x() {
        return zzb;
    }

    public static u62 y(n82 n82Var, z82 z82Var) {
        return (u62) m92.t(zzb, n82Var, z82Var);
    }

    public final boolean A() {
        return this.zzf != null;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new u62();
            }
            if (i11 == 4) {
                return new t62();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final e62 v() {
        e62 e62Var = this.zzf;
        return e62Var == null ? e62.x() : e62Var;
    }

    public final String z() {
        return this.zze;
    }
}
