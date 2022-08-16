package s4;

/* loaded from: classes.dex */
public final class i3 extends b7<i3, h3> implements e8 {
    private static final i3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        i3 i3Var = new i3();
        zza = i3Var;
        b7.l(i3.class, i3Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            if (i11 == 3) {
                return new i3();
            }
            if (i11 == 4) {
                return new h3();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }
}
