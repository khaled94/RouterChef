package s4;

/* loaded from: classes.dex */
public final class v2 extends b7<v2, u2> implements e8 {
    private static final v2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private q2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        v2 v2Var = new v2();
        zza = v2Var;
        b7.l(v2.class, v2Var);
    }

    public static u2 u() {
        return zza.n();
    }

    public static /* synthetic */ void x(v2 v2Var, String str) {
        v2Var.zze |= 2;
        v2Var.zzg = str;
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 32) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            if (i11 == 3) {
                return new v2();
            }
            if (i11 == 4) {
                return new u2(null);
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

    public final q2 t() {
        q2 q2Var = this.zzh;
        return q2Var == null ? q2.t() : q2Var;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }
}
