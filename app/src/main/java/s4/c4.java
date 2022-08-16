package s4;

/* loaded from: classes.dex */
public final class c4 extends b7<c4, z3> implements e8 {
    private static final c4 zza;
    private int zze;
    private int zzf = 1;
    private h7<q3> zzg = m8.f17993v;

    static {
        c4 c4Var = new c4();
        zza = c4Var;
        b7.l(c4.class, c4Var);
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", b4.f17742a, "zzg", q3.class});
            }
            if (i11 == 3) {
                return new c4();
            }
            if (i11 == 4) {
                return new z3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }
}
