package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ps1 extends m92<ps1, os1> implements ra2 {
    private static final r92<Integer, Object> zzb = new ok1();
    private static final ps1 zze;
    private int zzf;
    private q92 zzg = n92.f11578v;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        ps1 ps1Var = new ps1();
        zze = ps1Var;
        m92.n(ps1.class, ps1Var);
    }

    public static os1 v() {
        return zze.q();
    }

    public static /* synthetic */ void x(ps1 ps1Var, String str) {
        Objects.requireNonNull(str);
        ps1Var.zzf |= 1;
        ps1Var.zzh = str;
    }

    public static void y(ps1 ps1Var) {
        q92 q92Var = ps1Var.zzg;
        if (!((c82) q92Var).f6742s) {
            n92 n92Var = (n92) q92Var;
            int i10 = n92Var.f11580u;
            ps1Var.zzg = n92Var.j(i10 == 0 ? 10 : i10 + i10);
        }
        ((n92) ps1Var.zzg).h(2);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", ns1.f11914a, "zzh", "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new ps1();
            }
            if (i11 == 4) {
                return new os1(null);
            }
            if (i11 == 5) {
                return zze;
            }
            return null;
        }
        return (byte) 1;
    }
}
