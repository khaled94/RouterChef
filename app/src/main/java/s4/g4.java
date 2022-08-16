package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class g4 extends b7<g4, f4> implements e8 {
    private static final g4 zza;
    private int zze;
    private int zzf;
    private g7 zzg = s7.f18095v;

    static {
        g4 g4Var = new g4();
        zza = g4Var;
        b7.l(g4.class, g4Var);
    }

    public static f4 v() {
        return zza.n();
    }

    public static /* synthetic */ void y(g4 g4Var, int i10) {
        g4Var.zze |= 1;
        g4Var.zzf = i10;
    }

    public static void z(g4 g4Var, Iterable iterable) {
        g7 g7Var = g4Var.zzg;
        if (!((y5) g7Var).f18203s) {
            g4Var.zzg = b7.q(g7Var);
        }
        x5.g(iterable, g4Var.zzg);
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new g4();
            }
            if (i11 == 4) {
                return new f4(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return ((s7) this.zzg).f18097u;
    }

    public final int t() {
        return this.zzf;
    }

    public final long u(int i10) {
        return ((s7) this.zzg).e(i10);
    }

    public final List<Long> x() {
        return this.zzg;
    }
}
