package m4;

import c4.a;

/* loaded from: classes.dex */
public final class x9 extends m92<x9, t5> implements ra2 {
    private static final x9 zzb;
    private int zze;
    private z9 zzf;
    private n82 zzg;
    private n82 zzh;

    static {
        x9 x9Var = new x9();
        zzb = x9Var;
        m92.n(x9.class, x9Var);
    }

    public x9() {
        l82 l82Var = n82.f11571t;
        this.zzg = l82Var;
        this.zzh = l82Var;
    }

    public static x9 w(n82 n82Var, z82 z82Var) {
        return (x9) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new x9();
            }
            if (i11 == 4) {
                return new t5((a) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final z9 x() {
        z9 z9Var = this.zzf;
        return z9Var == null ? z9.A() : z9Var;
    }

    public final n82 y() {
        return this.zzh;
    }

    public final n82 z() {
        return this.zzg;
    }
}
