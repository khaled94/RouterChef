package m4;

/* loaded from: classes.dex */
public final class k42 extends m92<k42, j42> implements ra2 {
    private static final k42 zzb;
    private int zze;

    static {
        k42 k42Var = new k42();
        zzb = k42Var;
        m92.n(k42.class, k42Var);
    }

    public static j42 w() {
        return zzb.q();
    }

    public static k42 y() {
        return zzb;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            }
            if (i11 == 3) {
                return new k42();
            }
            if (i11 == 4) {
                return new j42(null);
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
}
