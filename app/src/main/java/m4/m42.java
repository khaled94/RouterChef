package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m42 extends m92<m42, l42> implements ra2 {
    private static final m42 zzb;
    private int zze;
    private q42 zzf;
    private n82 zzg = n82.f11571t;

    static {
        m42 m42Var = new m42();
        zzb = m42Var;
        m92.n(m42.class, m42Var);
    }

    public static /* synthetic */ void C(m42 m42Var, q42 q42Var) {
        Objects.requireNonNull(q42Var);
        m42Var.zzf = q42Var;
    }

    public static l42 w() {
        return zzb.q();
    }

    public static m42 y(n82 n82Var, z82 z82Var) {
        return (m42) m92.t(zzb, n82Var, z82Var);
    }

    public final n82 A() {
        return this.zzg;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new m42();
            }
            if (i11 == 4) {
                return new l42(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }

    public final q42 z() {
        q42 q42Var = this.zzf;
        return q42Var == null ? q42.y() : q42Var;
    }
}
