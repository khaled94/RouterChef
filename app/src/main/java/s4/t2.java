package s4;

import h6.a;

/* loaded from: classes.dex */
public final class t2 extends b7<t2, r2> implements e8 {
    private static final t2 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        t2 t2Var = new t2();
        zza = t2Var;
        b7.l(t2.class, t2Var);
    }

    public static t2 t() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 16) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final int D() {
        int g10 = a.g(this.zzf);
        if (g10 == 0) {
            return 1;
        }
        return g10;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", s2.f18094a, "zzg", "zzh", "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new t2();
            }
            if (i11 == 4) {
                return new r2();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzj;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
