package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class wp1 extends m92<wp1, tp1> implements ra2 {
    private static final wp1 zzb;
    private u92<vp1> zze = za2.f16072v;

    static {
        wp1 wp1Var = new wp1();
        zzb = wp1Var;
        m92.n(wp1.class, wp1Var);
    }

    public static tp1 w() {
        return zzb.q();
    }

    public static void y(wp1 wp1Var) {
        wp1Var.zze = za2.f16072v;
    }

    public static /* synthetic */ void z(wp1 wp1Var, vp1 vp1Var) {
        Objects.requireNonNull(vp1Var);
        u92<vp1> u92Var = wp1Var.zze;
        if (!u92Var.c()) {
            wp1Var.zze = m92.l(u92Var);
        }
        wp1Var.zze.add(vp1Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", vp1.class});
            }
            if (i11 == 3) {
                return new wp1();
            }
            if (i11 == 4) {
                return new tp1(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze.size();
    }
}
