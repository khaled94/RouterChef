package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class o4 extends b7<o4, n4> implements e8 {
    private static final o4 zza;
    private int zze;
    private h7<r4> zzf = m8.f17993v;
    private k4 zzg;

    static {
        o4 o4Var = new o4();
        zza = o4Var;
        b7.l(o4.class, o4Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", r4.class, "zzg"});
            }
            if (i11 == 3) {
                return new o4();
            }
            if (i11 == 4) {
                return new n4();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final k4 s() {
        k4 k4Var = this.zzg;
        return k4Var == null ? k4.u() : k4Var;
    }

    public final List<r4> u() {
        return this.zzf;
    }
}
