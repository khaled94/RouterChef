package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xk extends m92<xk, wk> implements ra2 {
    private static final xk zzb;
    private int zze;
    private gm zzg;
    private int zzh;
    private im zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        xk xkVar = new xk();
        zzb = xkVar;
        m92.n(xk.class, xkVar);
    }

    public static xk w() {
        return zzb;
    }

    public static /* synthetic */ void x(xk xkVar, String str) {
        xkVar.zze |= 1;
        xkVar.zzf = str;
    }

    public static /* synthetic */ void y(xk xkVar, im imVar) {
        Objects.requireNonNull(imVar);
        xkVar.zzi = imVar;
        xkVar.zze |= 8;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                bl blVar = bl.f6562a;
                return new ab2(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", blVar, "zzl", blVar, "zzm", blVar});
            } else if (i11 == 3) {
                return new xk();
            } else {
                if (i11 == 4) {
                    return new wk(null);
                }
                if (i11 == 5) {
                    return zzb;
                }
                return null;
            }
        }
        return (byte) 1;
    }
}
