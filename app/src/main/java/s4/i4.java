package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i4 extends b7<i4, h4> implements e8 {
    private static final i4 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        i4 i4Var = new i4();
        zza = i4Var;
        b7.l(i4.class, i4Var);
    }

    public static /* synthetic */ void A(i4 i4Var, String str) {
        Objects.requireNonNull(str);
        i4Var.zze |= 2;
        i4Var.zzg = str;
    }

    public static /* synthetic */ void B(i4 i4Var, String str) {
        Objects.requireNonNull(str);
        i4Var.zze |= 4;
        i4Var.zzh = str;
    }

    public static /* synthetic */ void C(i4 i4Var) {
        i4Var.zze &= -5;
        i4Var.zzh = zza.zzh;
    }

    public static /* synthetic */ void D(i4 i4Var, long j3) {
        i4Var.zze |= 8;
        i4Var.zzi = j3;
    }

    public static /* synthetic */ void E(i4 i4Var) {
        i4Var.zze &= -9;
        i4Var.zzi = 0L;
    }

    public static /* synthetic */ void F(i4 i4Var, double d5) {
        i4Var.zze |= 32;
        i4Var.zzk = d5;
    }

    public static /* synthetic */ void G(i4 i4Var) {
        i4Var.zze &= -33;
        i4Var.zzk = 0.0d;
    }

    public static h4 v() {
        return zza.n();
    }

    public static /* synthetic */ void z(i4 i4Var, long j3) {
        i4Var.zze |= 1;
        i4Var.zzf = j3;
    }

    public final boolean H() {
        return (this.zze & 32) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            if (i11 == 3) {
                return new i4();
            }
            if (i11 == 4) {
                return new h4(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final double s() {
        return this.zzk;
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzh;
    }
}
