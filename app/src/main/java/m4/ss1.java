package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ss1 extends m92<ss1, qs1> implements ra2 {
    private static final ss1 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private ps1 zzi;

    static {
        ss1 ss1Var = new ss1();
        zzb = ss1Var;
        m92.n(ss1.class, ss1Var);
    }

    public static qs1 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(ss1 ss1Var, String str) {
        Objects.requireNonNull(str);
        ss1Var.zze |= 2;
        ss1Var.zzg = str;
    }

    public static /* synthetic */ void y(ss1 ss1Var, ps1 ps1Var) {
        ss1Var.zzi = ps1Var;
        ss1Var.zze |= 8;
    }

    public static /* synthetic */ void z(ss1 ss1Var) {
        ss1Var.zzf = 1;
        ss1Var.zze = 1 | ss1Var.zze;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", rs1.f13426a, "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new ss1();
            }
            if (i11 == 4) {
                return new qs1(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
