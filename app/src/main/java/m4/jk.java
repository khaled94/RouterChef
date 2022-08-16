package m4;

/* loaded from: classes.dex */
public final class jk extends m92<jk, ik> implements ra2 {
    private static final jk zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        jk jkVar = new jk();
        zzb = jkVar;
        m92.n(jk.class, jkVar);
    }

    public static ik v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(jk jkVar, boolean z10) {
        jkVar.zze |= 1;
        jkVar.zzf = z10;
    }

    public static /* synthetic */ void y(jk jkVar, boolean z10) {
        jkVar.zze |= 2;
        jkVar.zzg = z10;
    }

    public static /* synthetic */ void z(jk jkVar, int i10) {
        jkVar.zze |= 4;
        jkVar.zzh = i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new jk();
            }
            if (i11 == 4) {
                return new ik(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
