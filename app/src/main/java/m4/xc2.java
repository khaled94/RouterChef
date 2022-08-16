package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xc2 extends m92<xc2, wc2> implements ra2 {
    private static final xc2 zzb;
    private int zze;
    private int zzf;
    private mc2 zzh;
    private qc2 zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private q92 zzk = n92.f11578v;
    private String zzl = "";
    private u92<String> zzn = za2.f16072v;

    static {
        xc2 xc2Var = new xc2();
        zzb = xc2Var;
        m92.n(xc2.class, xc2Var);
    }

    public static /* synthetic */ void A(xc2 xc2Var, String str) {
        Objects.requireNonNull(str);
        xc2Var.zze |= 2;
        xc2Var.zzg = str;
    }

    public static /* synthetic */ void B(xc2 xc2Var, mc2 mc2Var) {
        xc2Var.zzh = mc2Var;
        xc2Var.zze |= 4;
    }

    public static /* synthetic */ void C(xc2 xc2Var, String str) {
        Objects.requireNonNull(str);
        u92<String> u92Var = xc2Var.zzn;
        if (!u92Var.c()) {
            xc2Var.zzn = m92.l(u92Var);
        }
        xc2Var.zzn.add(str);
    }

    public static /* synthetic */ void D(xc2 xc2Var, int i10) {
        xc2Var.zzm = i10 - 1;
        xc2Var.zze |= 64;
    }

    public static wc2 w() {
        return zzb.q();
    }

    public static /* synthetic */ void z(xc2 xc2Var, int i10) {
        xc2Var.zze |= 1;
        xc2Var.zzf = i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", vc2.f14661a, "zzn"});
            }
            if (i11 == 3) {
                return new xc2();
            }
            if (i11 == 4) {
                return new wc2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzo = b10;
            return null;
        }
        return Byte.valueOf(this.zzo);
    }

    public final int v() {
        return this.zzn.size();
    }

    public final String y() {
        return this.zzg;
    }
}
