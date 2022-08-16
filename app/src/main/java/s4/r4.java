package s4;

import a6.d;
import java.util.List;

/* loaded from: classes.dex */
public final class r4 extends b7<r4, p4> implements e8 {
    private static final r4 zza;
    private int zze;
    private int zzf;
    private h7<r4> zzg = m8.f17993v;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        r4 r4Var = new r4();
        zza = r4Var;
        b7.l(r4.class, r4Var);
    }

    public final boolean A() {
        return (this.zze & 4) != 0;
    }

    public final int B() {
        int c10 = d.c(this.zzf);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", q4.f18070a, "zzg", r4.class, "zzh", "zzi", "zzj", "zzk"});
            }
            if (i11 == 3) {
                return new r4();
            }
            if (i11 == 4) {
                return new p4();
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

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzi;
    }

    public final List<r4> w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }

    public final boolean z() {
        return (this.zze & 16) != 0;
    }
}
