package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k62 extends m92<k62, j62> implements ra2 {
    private static final k62 zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        k62 k62Var = new k62();
        zzb = k62Var;
        m92.n(k62.class, k62Var);
    }

    public static /* synthetic */ void A(k62 k62Var, int i10) {
        if (i10 != 1) {
            k62Var.zzf = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static j62 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(k62 k62Var, String str) {
        Objects.requireNonNull(str);
        k62Var.zze = str;
    }

    public static /* synthetic */ void y(k62 k62Var, int i10) {
        k62Var.zzg = i10;
    }

    public static void z(k62 k62Var, int i10) {
        if (i10 != 1) {
            k62Var.zzh = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new k62();
            }
            if (i11 == 4) {
                return new j62(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
