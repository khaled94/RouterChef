package m4;

/* loaded from: classes.dex */
public final class p5 extends m92<p5, o5> implements ra2 {
    private static final p5 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        p5 p5Var = new p5();
        zzb = p5Var;
        m92.n(p5.class, p5Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new p5();
            }
            if (i11 == 4) {
                return new o5();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
