package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class w3 extends b7<w3, v3> implements e8 {
    private static final w3 zza;
    private h7<y3> zze = m8.f17993v;

    static {
        w3 w3Var = new w3();
        zza = w3Var;
        b7.l(w3.class, w3Var);
    }

    public static v3 s() {
        return zza.n();
    }

    public static /* synthetic */ void w(w3 w3Var, y3 y3Var) {
        h7<y3> h7Var = w3Var.zze;
        if (!h7Var.c()) {
            w3Var.zze = b7.j(h7Var);
        }
        w3Var.zze.add(y3Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", y3.class});
            }
            if (i11 == 3) {
                return new w3();
            }
            if (i11 == 4) {
                return new v3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final y3 u() {
        return this.zze.get(0);
    }

    public final List<y3> v() {
        return this.zze;
    }
}
