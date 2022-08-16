package s4;

/* loaded from: classes.dex */
public final class f3 extends b7<f3, e3> implements e8 {
    private static final f3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        f3 f3Var = new f3();
        zza = f3Var;
        b7.l(f3.class, f3Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new f3();
            }
            if (i11 == 4) {
                return new e3();
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }
}
