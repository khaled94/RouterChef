package m4;

/* loaded from: classes.dex */
public final class q42 extends m92<q42, p42> implements ra2 {
    private static final q42 zzb;
    private int zze;

    static {
        q42 q42Var = new q42();
        zzb = q42Var;
        m92.n(q42.class, q42Var);
    }

    public static p42 w() {
        return zzb.q();
    }

    public static q42 y() {
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
                return new q42();
            }
            if (i11 == 4) {
                return new p42(null);
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
