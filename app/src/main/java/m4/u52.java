package m4;

/* loaded from: classes.dex */
public final class u52 extends m92<u52, t52> implements ra2 {
    private static final u52 zzb;
    private int zze;
    private int zzf;
    private n82 zzg = n82.f11571t;

    static {
        u52 u52Var = new u52();
        zzb = u52Var;
        m92.n(u52.class, u52Var);
    }

    public static void C(u52 u52Var) {
        u52Var.zze = 2;
    }

    public static t52 v() {
        return zzb.q();
    }

    public static u52 x() {
        return zzb;
    }

    public final int A() {
        int i10 = this.zze;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int B() {
        int c10 = r01.c(this.zzf);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new u52();
            }
            if (i11 == 4) {
                return new t52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final n82 y() {
        return this.zzg;
    }
}
