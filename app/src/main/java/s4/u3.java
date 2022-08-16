package s4;

/* loaded from: classes.dex */
public final class u3 extends b7<u3, t3> implements e8 {
    private static final u3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private i3 zzh;

    static {
        u3 u3Var = new u3();
        zza = u3Var;
        b7.l(u3.class, u3Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new u3();
            }
            if (i11 == 4) {
                return new t3();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }
}
