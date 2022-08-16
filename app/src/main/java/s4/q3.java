package s4;

/* loaded from: classes.dex */
public final class q3 extends b7<q3, p3> implements e8 {
    private static final q3 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        q3 q3Var = new q3();
        zza = q3Var;
        b7.l(q3.class, q3Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new q3();
            }
            if (i11 == 4) {
                return new p3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }
}
