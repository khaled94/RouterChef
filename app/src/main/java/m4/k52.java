package m4;

/* loaded from: classes.dex */
public final class k52 extends m92<k52, i52> implements ra2 {
    private static final k52 zzb;
    private e62 zze;

    static {
        k52 k52Var = new k52();
        zzb = k52Var;
        m92.n(k52.class, k52Var);
    }

    public static i52 v() {
        return zzb.q();
    }

    public static k52 x() {
        return zzb;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
            }
            if (i11 == 3) {
                return new k52();
            }
            if (i11 == 4) {
                return new i52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final e62 y() {
        e62 e62Var = this.zze;
        return e62Var == null ? e62.x() : e62Var;
    }
}
