package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v32 extends m92<v32, u32> implements ra2 {
    private static final v32 zzb;
    private int zze;
    private n82 zzf = n82.f11571t;
    private z32 zzg;

    static {
        v32 v32Var = new v32();
        zzb = v32Var;
        m92.n(v32.class, v32Var);
    }

    public static /* synthetic */ void D(v32 v32Var, z32 z32Var) {
        Objects.requireNonNull(z32Var);
        v32Var.zzg = z32Var;
    }

    public static u32 w() {
        return zzb.q();
    }

    public static v32 y(n82 n82Var, z82 z82Var) {
        return (v32) m92.t(zzb, n82Var, z82Var);
    }

    public final n82 A() {
        return this.zzf;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new v32();
            }
            if (i11 == 4) {
                return new u32(null);
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
        z32 z32Var = this.zzg;
        return z32Var == null ? z32.y() : z32Var;
    }
}
