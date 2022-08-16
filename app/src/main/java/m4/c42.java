package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c42 extends m92<c42, b42> implements ra2 {
    private static final c42 zzb;
    private int zze;
    private g42 zzf;
    private w52 zzg;

    static {
        c42 c42Var = new c42();
        zzb = c42Var;
        m92.n(c42.class, c42Var);
    }

    public static /* synthetic */ void D(c42 c42Var, w52 w52Var) {
        Objects.requireNonNull(w52Var);
        c42Var.zzg = w52Var;
    }

    public static b42 w() {
        return zzb.q();
    }

    public static c42 y(n82 n82Var, z82 z82Var) {
        return (c42) m92.t(zzb, n82Var, z82Var);
    }

    public final w52 A() {
        w52 w52Var = this.zzg;
        return w52Var == null ? w52.y() : w52Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new c42();
            }
            if (i11 == 4) {
                return new b42(null);
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

    public final g42 z() {
        g42 g42Var = this.zzf;
        return g42Var == null ? g42.y() : g42Var;
    }
}
