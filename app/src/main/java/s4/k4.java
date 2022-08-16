package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class k4 extends b7<k4, j4> implements e8 {
    private static final k4 zza;
    private h7<m4> zze = m8.f17993v;

    static {
        k4 k4Var = new k4();
        zza = k4Var;
        b7.l(k4.class, k4Var);
    }

    public static k4 u() {
        return zza;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", m4.class});
            }
            if (i11 == 3) {
                return new k4();
            }
            if (i11 == 4) {
                return new j4();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zze.size();
    }

    public final List<m4> v() {
        return this.zze;
    }
}
