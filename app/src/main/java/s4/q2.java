package s4;

/* loaded from: classes.dex */
public final class q2 extends b7<q2, p2> implements e8 {
    private static final q2 zza;
    private int zze;
    private y2 zzf;
    private t2 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        q2 q2Var = new q2();
        zza = q2Var;
        b7.l(q2.class, q2Var);
    }

    public static q2 t() {
        return zza;
    }

    public static /* synthetic */ void x(q2 q2Var, String str) {
        q2Var.zze |= 8;
        q2Var.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new q2();
            }
            if (i11 == 4) {
                return new p2(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final t2 u() {
        t2 t2Var = this.zzg;
        return t2Var == null ? t2.t() : t2Var;
    }

    public final y2 v() {
        y2 y2Var = this.zzf;
        return y2Var == null ? y2.u() : y2Var;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
