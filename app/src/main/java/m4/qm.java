package m4;

import j0.d;

/* loaded from: classes.dex */
public final class qm extends m92<qm, t5> implements ra2 {
    private static final qm zzb;
    private int zze;
    private int zzf = 1000;
    private om zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        qm qmVar = new qm();
        zzb = qmVar;
        m92.n(qm.class, qmVar);
    }

    public static /* synthetic */ qm v() {
        return zzb;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", bl.f6562a, "zzg", "zzh", "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new qm();
            }
            if (i11 == 4) {
                return new t5((d) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
