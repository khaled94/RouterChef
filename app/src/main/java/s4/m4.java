package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class m4 extends b7<m4, l4> implements e8 {
    private static final m4 zza;
    private int zze;
    private String zzf = "";
    private h7<r4> zzg = m8.f17993v;

    static {
        m4 m4Var = new m4();
        zza = m4Var;
        b7.l(m4.class, m4Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", r4.class});
            }
            if (i11 == 3) {
                return new m4();
            }
            if (i11 == 4) {
                return new l4();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zzf;
    }

    public final List<r4> u() {
        return this.zzg;
    }
}
