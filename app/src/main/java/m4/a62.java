package m4;

/* loaded from: classes.dex */
public final class a62 extends m92<a62, z52> implements ra2 {
    private static final a62 zzb;
    private int zze;
    private int zzf;

    static {
        a62 a62Var = new a62();
        zzb = a62Var;
        m92.n(a62.class, a62Var);
    }

    public static z52 w() {
        return zzb.q();
    }

    public static a62 y() {
        return zzb;
    }

    public final int A() {
        int c10 = r01.c(this.zze);
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
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            }
            if (i11 == 3) {
                return new a62();
            }
            if (i11 == 4) {
                return new z52(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzf;
    }
}
