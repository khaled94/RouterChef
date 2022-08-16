package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dl extends m92<dl, cl> implements ra2 {
    private static final dl zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private im zzj;
    private xk zzl;
    private al zzm;
    private nl zzn;
    private bk zzo;
    private wl zzp;
    private xm zzq;
    private kk zzr;
    private String zzg = "";
    private int zzi = 1000;
    private t92 zzk = ga2.f8794v;

    static {
        dl dlVar = new dl();
        zzb = dlVar;
        m92.n(dl.class, dlVar);
    }

    public static /* synthetic */ void A(dl dlVar, String str) {
        Objects.requireNonNull(str);
        dlVar.zze |= 2;
        dlVar.zzg = str;
    }

    public static void B(dl dlVar, Iterable iterable) {
        t92 t92Var = dlVar.zzk;
        if (!((c82) t92Var).f6742s) {
            ga2 ga2Var = (ga2) t92Var;
            int i10 = ga2Var.f8796u;
            dlVar.zzk = ga2Var.j(i10 == 0 ? 10 : i10 + i10);
        }
        b82.h(iterable, dlVar.zzk);
    }

    public static void C(dl dlVar) {
        dlVar.zzk = ga2.f8794v;
    }

    public static /* synthetic */ void D(dl dlVar, xk xkVar) {
        dlVar.zzl = xkVar;
        dlVar.zze |= 32;
    }

    public static /* synthetic */ void E(dl dlVar, bk bkVar) {
        dlVar.zzo = bkVar;
        dlVar.zze |= 256;
    }

    public static /* synthetic */ void F(dl dlVar, wl wlVar) {
        Objects.requireNonNull(wlVar);
        dlVar.zzp = wlVar;
        dlVar.zze |= 512;
    }

    public static /* synthetic */ void G(dl dlVar, xm xmVar) {
        dlVar.zzq = xmVar;
        dlVar.zze |= 1024;
    }

    public static /* synthetic */ void H(dl dlVar, kk kkVar) {
        Objects.requireNonNull(kkVar);
        dlVar.zzr = kkVar;
        dlVar.zze |= 2048;
    }

    public static cl x() {
        return zzb.q();
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", bl.f6562a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
            }
            if (i11 == 3) {
                return new dl();
            }
            if (i11 == 4) {
                return new cl(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final bk v() {
        bk bkVar = this.zzo;
        return bkVar == null ? bk.w() : bkVar;
    }

    public final xk w() {
        xk xkVar = this.zzl;
        return xkVar == null ? xk.w() : xkVar;
    }

    public final String z() {
        return this.zzg;
    }
}
