package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b3 extends b7<b3, z2> implements e8 {
    private static final b3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        b3 b3Var = new b3();
        zza = b3Var;
        b7.l(b3.class, b3Var);
    }

    public static /* synthetic */ void v(b3 b3Var, String str) {
        Objects.requireNonNull(str);
        b3Var.zze |= 1;
        b3Var.zzf = str;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new b3();
            }
            if (i11 == 4) {
                return new z2(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzi;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }
}
