package s4;

/* loaded from: classes.dex */
public final class k3 extends b7<k3, j3> implements e8 {
    private static final k3 zza;
    private int zze;
    private int zzf;
    private e4 zzg;
    private e4 zzh;
    private boolean zzi;

    static {
        k3 k3Var = new k3();
        zza = k3Var;
        b7.l(k3.class, k3Var);
    }

    public static /* synthetic */ void A(k3 k3Var, boolean z10) {
        k3Var.zze |= 8;
        k3Var.zzi = z10;
    }

    public static j3 t() {
        return zza.n();
    }

    public static /* synthetic */ void x(k3 k3Var, int i10) {
        k3Var.zze |= 1;
        k3Var.zzf = i10;
    }

    public static /* synthetic */ void y(k3 k3Var, e4 e4Var) {
        k3Var.zzg = e4Var;
        k3Var.zze |= 2;
    }

    public static /* synthetic */ void z(k3 k3Var, e4 e4Var) {
        k3Var.zzh = e4Var;
        k3Var.zze |= 4;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new k3();
            }
            if (i11 == 4) {
                return new j3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzf;
    }

    public final e4 v() {
        e4 e4Var = this.zzg;
        return e4Var == null ? e4.z() : e4Var;
    }

    public final e4 w() {
        e4 e4Var = this.zzh;
        return e4Var == null ? e4.z() : e4Var;
    }
}
