package m4;

/* loaded from: classes.dex */
public final class g62 extends m92<g62, l6> implements ra2 {
    private static final g62 zzb;
    private c62 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        g62 g62Var = new g62();
        zzb = g62Var;
        m92.n(g62.class, g62Var);
    }

    public final int A() {
        int d5 = wo2.d(this.zzh);
        if (d5 == 0) {
            return 1;
        }
        return d5;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new g62();
            }
            if (i11 == 4) {
                return new l6(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzg;
    }

    public final c62 w() {
        c62 c62Var = this.zze;
        return c62Var == null ? c62.x() : c62Var;
    }

    public final boolean y() {
        return this.zze != null;
    }

    public final int z() {
        int i10 = this.zzf;
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
}
