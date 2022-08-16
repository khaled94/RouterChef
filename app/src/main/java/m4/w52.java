package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w52 extends m92<w52, v52> implements ra2 {
    private static final w52 zzb;
    private int zze;
    private a62 zzf;
    private n82 zzg = n82.f11571t;

    static {
        w52 w52Var = new w52();
        zzb = w52Var;
        m92.n(w52.class, w52Var);
    }

    public static /* synthetic */ void D(w52 w52Var, a62 a62Var) {
        Objects.requireNonNull(a62Var);
        w52Var.zzf = a62Var;
    }

    public static v52 w() {
        return zzb.q();
    }

    public static w52 y() {
        return zzb;
    }

    public static w52 z(n82 n82Var, z82 z82Var) {
        return (w52) m92.t(zzb, n82Var, z82Var);
    }

    public final a62 A() {
        a62 a62Var = this.zzf;
        return a62Var == null ? a62.y() : a62Var;
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
                return new w52();
            }
            if (i11 == 4) {
                return new v52(null);
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
