package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class vp1 extends m92<vp1, up1> implements ra2 {
    private static final vp1 zzb;
    private sp1 zze;

    static {
        vp1 vp1Var = new vp1();
        zzb = vp1Var;
        m92.n(vp1.class, vp1Var);
    }

    public static up1 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(vp1 vp1Var, sp1 sp1Var) {
        Objects.requireNonNull(sp1Var);
        vp1Var.zze = sp1Var;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
            }
            if (i11 == 3) {
                return new vp1();
            }
            if (i11 == 4) {
                return new up1(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
