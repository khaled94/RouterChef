package m4;

import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wl extends m92<wl, tl> implements ra2 {
    private static final wl zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private u92<sl> zzf = za2.f16072v;
    private String zzj = "";
    private String zzk = "";

    static {
        wl wlVar = new wl();
        zzb = wlVar;
        m92.n(wl.class, wlVar);
    }

    public static /* synthetic */ void A(wl wlVar, long j3) {
        wlVar.zze |= 4;
        wlVar.zzi = j3;
    }

    public static /* synthetic */ void B(wl wlVar, String str) {
        Objects.requireNonNull(str);
        wlVar.zze |= 8;
        wlVar.zzj = str;
    }

    public static /* synthetic */ void C(wl wlVar) {
        String str = Build.MODEL;
        Objects.requireNonNull(str);
        wlVar.zze |= 16;
        wlVar.zzk = str;
    }

    public static /* synthetic */ void D(wl wlVar, long j3) {
        wlVar.zze |= 32;
        wlVar.zzl = j3;
    }

    public static tl v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(wl wlVar, Iterable iterable) {
        u92<sl> u92Var = wlVar.zzf;
        if (!u92Var.c()) {
            wlVar.zzf = m92.l(u92Var);
        }
        b82.h(iterable, wlVar.zzf);
    }

    public static /* synthetic */ void y(wl wlVar, int i10) {
        wlVar.zze |= 1;
        wlVar.zzg = i10;
    }

    public static /* synthetic */ void z(wl wlVar, int i10) {
        wlVar.zze |= 2;
        wlVar.zzh = i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", sl.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            if (i11 == 3) {
                return new wl();
            }
            if (i11 == 4) {
                return new tl(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
