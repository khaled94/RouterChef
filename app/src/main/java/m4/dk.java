package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dk extends m92<dk, ck> implements ra2 {
    private static final dk zzb;
    private int zze;
    private int zzf;
    private hk zzg;
    private jk zzh;

    static {
        dk dkVar = new dk();
        zzb = dkVar;
        m92.n(dk.class, dkVar);
    }

    public static ck v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(dk dkVar, hk hkVar) {
        Objects.requireNonNull(hkVar);
        dkVar.zzg = hkVar;
        dkVar.zze |= 2;
    }

    public static /* synthetic */ void y(dk dkVar, jk jkVar) {
        Objects.requireNonNull(jkVar);
        dkVar.zzh = jkVar;
        dkVar.zze |= 4;
    }

    public static /* synthetic */ void z(dk dkVar) {
        dkVar.zzf = 1;
        dkVar.zze = 1 | dkVar.zze;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", fk.f8583a, "zzg", "zzh"});
            }
            if (i11 == 3) {
                return new dk();
            }
            if (i11 == 4) {
                return new ck(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
