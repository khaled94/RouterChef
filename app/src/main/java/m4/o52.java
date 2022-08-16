package m4;

/* loaded from: classes.dex */
public final class o52 extends m92<o52, n52> implements ra2 {
    private static final o52 zzb;
    private u52 zze;
    private k52 zzf;
    private int zzg;

    static {
        o52 o52Var = new o52();
        zzb = o52Var;
        m92.n(o52.class, o52Var);
    }

    public static void D(o52 o52Var, int i10) {
        if (i10 != 1) {
            o52Var.zzg = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static n52 w() {
        return zzb.q();
    }

    public static o52 y() {
        return zzb;
    }

    public final int C() {
        int i10 = this.zzg;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new o52();
            }
            if (i11 == 4) {
                return new n52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final k52 v() {
        k52 k52Var = this.zzf;
        return k52Var == null ? k52.x() : k52Var;
    }

    public final u52 z() {
        u52 u52Var = this.zze;
        return u52Var == null ? u52.x() : u52Var;
    }
}
