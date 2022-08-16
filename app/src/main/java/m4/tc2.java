package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tc2 extends m92<tc2, rc2> implements ra2 {
    private static final tc2 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private n82 zzh = n82.f11571t;

    static {
        tc2 tc2Var = new tc2();
        zzb = tc2Var;
        m92.n(tc2.class, tc2Var);
    }

    public static rc2 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(tc2 tc2Var) {
        tc2Var.zze |= 2;
        tc2Var.zzg = "image/png";
    }

    public static /* synthetic */ void y(tc2 tc2Var, n82 n82Var) {
        Objects.requireNonNull(n82Var);
        tc2Var.zze |= 4;
        tc2Var.zzh = n82Var;
    }

    public static /* synthetic */ void z(tc2 tc2Var) {
        tc2Var.zzf = 1;
        tc2Var.zze = 1 | tc2Var.zze;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", sc2.f13593a, "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new tc2();
            }
            if (i11 == 4) {
                return new rc2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
