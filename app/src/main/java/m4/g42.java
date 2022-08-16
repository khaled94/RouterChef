package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g42 extends m92<g42, f42> implements ra2 {
    private static final g42 zzb;
    private int zze;
    private k42 zzf;
    private n82 zzg = n82.f11571t;

    static {
        g42 g42Var = new g42();
        zzb = g42Var;
        m92.n(g42.class, g42Var);
    }

    public static /* synthetic */ void D(g42 g42Var, k42 k42Var) {
        Objects.requireNonNull(k42Var);
        g42Var.zzf = k42Var;
    }

    public static f42 w() {
        return zzb.q();
    }

    public static g42 y() {
        return zzb;
    }

    public static g42 z(n82 n82Var, z82 z82Var) {
        return (g42) m92.t(zzb, n82Var, z82Var);
    }

    public final k42 A() {
        k42 k42Var = this.zzf;
        return k42Var == null ? k42.y() : k42Var;
    }

    public final n82 B() {
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
                return new g42();
            }
            if (i11 == 4) {
                return new f42(null);
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
