package m4;

/* loaded from: classes.dex */
public final class qk extends m92<qk, pk> implements ra2 {
    private static final qk zzb;
    private int zze;
    private String zzf = "";
    private u92<ok> zzg = za2.f16072v;
    private int zzh;

    static {
        qk qkVar = new qk();
        zzb = qkVar;
        m92.n(qk.class, qkVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", ok.class, "zzh", bl.f6562a});
            }
            if (i11 == 3) {
                return new qk();
            }
            if (i11 == 4) {
                return new pk();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
