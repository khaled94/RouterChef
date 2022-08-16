package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s52 extends m92<s52, r52> implements ra2 {
    private static final s52 zzb;
    private int zze;
    private o52 zzf;
    private n82 zzg;
    private n82 zzh;

    static {
        s52 s52Var = new s52();
        zzb = s52Var;
        m92.n(s52.class, s52Var);
    }

    public s52() {
        l82 l82Var = n82.f11571t;
        this.zzg = l82Var;
        this.zzh = l82Var;
    }

    public static s52 A(n82 n82Var, z82 z82Var) {
        return (s52) m92.t(zzb, n82Var, z82Var);
    }

    public static /* synthetic */ void E(s52 s52Var, o52 o52Var) {
        Objects.requireNonNull(o52Var);
        s52Var.zzf = o52Var;
    }

    public static r52 x() {
        return zzb.q();
    }

    public static s52 z() {
        return zzb;
    }

    public final n82 B() {
        return this.zzg;
    }

    public final n82 C() {
        return this.zzh;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new s52();
            }
            if (i11 == 4) {
                return new r52(null);
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

    public final o52 w() {
        o52 o52Var = this.zzf;
        return o52Var == null ? o52.y() : o52Var;
    }
}
