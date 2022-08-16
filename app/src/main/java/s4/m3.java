package s4;

/* loaded from: classes.dex */
public final class m3 extends b7<m3, l3> implements e8 {
    private static final m3 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        m3 m3Var = new m3();
        zza = m3Var;
        b7.l(m3.class, m3Var);
    }

    public static l3 u() {
        return zza.n();
    }

    public static /* synthetic */ void w(m3 m3Var, int i10) {
        m3Var.zze |= 1;
        m3Var.zzf = i10;
    }

    public static /* synthetic */ void x(m3 m3Var, long j3) {
        m3Var.zze |= 2;
        m3Var.zzg = j3;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new m3();
            }
            if (i11 == 4) {
                return new l3(null);
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

    public final long t() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
