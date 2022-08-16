package m4;

/* loaded from: classes.dex */
public final class m52 extends m92<m52, l52> implements ra2 {
    private static final m52 zzb;
    private o52 zze;

    static {
        m52 m52Var = new m52();
        zzb = m52Var;
        m92.n(m52.class, m52Var);
    }

    public static l52 v() {
        return zzb.q();
    }

    public static m52 x(n82 n82Var, z82 z82Var) {
        return (m52) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
            }
            if (i11 == 3) {
                return new m52();
            }
            if (i11 == 4) {
                return new l52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final o52 y() {
        o52 o52Var = this.zze;
        return o52Var == null ? o52.y() : o52Var;
    }
}
