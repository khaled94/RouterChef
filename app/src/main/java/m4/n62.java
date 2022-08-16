package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n62 extends m92<n62, m62> implements ra2 {
    private static final n62 zzb;
    private int zze;
    private q62 zzf;

    static {
        n62 n62Var = new n62();
        zzb = n62Var;
        m92.n(n62.class, n62Var);
    }

    public static /* synthetic */ void B(n62 n62Var, q62 q62Var) {
        Objects.requireNonNull(q62Var);
        n62Var.zzf = q62Var;
    }

    public static m62 w() {
        return zzb.q();
    }

    public static n62 y(n82 n82Var, z82 z82Var) {
        return (n62) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new n62();
            }
            if (i11 == 4) {
                return new m62(null);
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

    public final q62 z() {
        q62 q62Var = this.zzf;
        return q62Var == null ? q62.w() : q62Var;
    }
}
