package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s62 extends m92<s62, r62> implements ra2 {
    private static final s62 zzb;
    private int zze;
    private u62 zzf;

    static {
        s62 s62Var = new s62();
        zzb = s62Var;
        m92.n(s62.class, s62Var);
    }

    public static /* synthetic */ void B(s62 s62Var, u62 u62Var) {
        Objects.requireNonNull(u62Var);
        s62Var.zzf = u62Var;
    }

    public static r62 w() {
        return zzb.q();
    }

    public static s62 y(n82 n82Var, z82 z82Var) {
        return (s62) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new s62();
            }
            if (i11 == 4) {
                return new r62(null);
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

    public final u62 z() {
        u62 u62Var = this.zzf;
        return u62Var == null ? u62.x() : u62Var;
    }
}
