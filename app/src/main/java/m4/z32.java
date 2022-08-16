package m4;

/* loaded from: classes.dex */
public final class z32 extends m92<z32, y32> implements ra2 {
    private static final z32 zzb;
    private int zze;

    static {
        z32 z32Var = new z32();
        zzb = z32Var;
        m92.n(z32.class, z32Var);
    }

    public static y32 w() {
        return zzb.q();
    }

    public static z32 y() {
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
                return new z32();
            }
            if (i11 == 4) {
                return new y32(null);
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
