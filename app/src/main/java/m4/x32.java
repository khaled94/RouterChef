package m4;

/* loaded from: classes.dex */
public final class x32 extends m92<x32, w32> implements ra2 {
    private static final x32 zzb;
    private int zze;
    private z32 zzf;

    static {
        x32 x32Var = new x32();
        zzb = x32Var;
        m92.n(x32.class, x32Var);
    }

    public static w32 w() {
        return zzb.q();
    }

    public static x32 y(n82 n82Var, z82 z82Var) {
        return (x32) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new x32();
            }
            if (i11 == 4) {
                return new w32(null);
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

    public final z32 z() {
        z32 z32Var = this.zzf;
        return z32Var == null ? z32.y() : z32Var;
    }
}
