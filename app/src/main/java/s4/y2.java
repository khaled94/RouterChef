package s4;

import java.util.List;
import m4.k2;

/* loaded from: classes.dex */
public final class y2 extends b7<y2, w2> implements e8 {
    private static final y2 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private h7<String> zzi = m8.f17993v;

    static {
        y2 y2Var = new y2();
        zza = y2Var;
        b7.l(y2.class, y2Var);
    }

    public static y2 u() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final int B() {
        int a10 = k2.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", x2.f18176a, "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new y2();
            }
            if (i11 == 4) {
                return new w2();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzi.size();
    }

    public final String v() {
        return this.zzg;
    }

    public final List<String> w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
