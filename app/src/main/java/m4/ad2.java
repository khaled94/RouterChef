package m4;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ad2 extends m92<ad2, fc2> implements ra2 {
    private static final ad2 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private hc2 zzk;
    private u92<xc2> zzl;
    private tc2 zzn;
    private boolean zzo;
    private u92<String> zzp;
    private boolean zzr;
    private boolean zzs;
    private zc2 zzu;
    private u92<String> zzv;
    private u92<String> zzw;
    private byte zzx = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzq = "";
    private n82 zzt = n82.f11571t;

    static {
        ad2 ad2Var = new ad2();
        zzb = ad2Var;
        m92.n(ad2.class, ad2Var);
    }

    public ad2() {
        za2<Object> za2Var = za2.f16072v;
        this.zzl = za2Var;
        this.zzp = za2Var;
        this.zzv = za2Var;
        this.zzw = za2Var;
    }

    public static /* synthetic */ void A(ad2 ad2Var, String str) {
        Objects.requireNonNull(str);
        ad2Var.zze |= 4;
        ad2Var.zzh = str;
    }

    public static /* synthetic */ void B(ad2 ad2Var, String str) {
        Objects.requireNonNull(str);
        ad2Var.zze |= 8;
        ad2Var.zzi = str;
    }

    public static /* synthetic */ void C(ad2 ad2Var, hc2 hc2Var) {
        ad2Var.zzk = hc2Var;
        ad2Var.zze |= 32;
    }

    public static /* synthetic */ void D(ad2 ad2Var, xc2 xc2Var) {
        u92<xc2> u92Var = ad2Var.zzl;
        if (!u92Var.c()) {
            ad2Var.zzl = m92.l(u92Var);
        }
        ad2Var.zzl.add(xc2Var);
    }

    public static /* synthetic */ void E(ad2 ad2Var, String str) {
        ad2Var.zze |= 64;
        ad2Var.zzm = str;
    }

    public static /* synthetic */ void F(ad2 ad2Var) {
        ad2Var.zze &= -65;
        ad2Var.zzm = zzb.zzm;
    }

    public static /* synthetic */ void G(ad2 ad2Var, tc2 tc2Var) {
        ad2Var.zzn = tc2Var;
        ad2Var.zze |= 128;
    }

    public static /* synthetic */ void H(ad2 ad2Var, zc2 zc2Var) {
        ad2Var.zzu = zc2Var;
        ad2Var.zze |= 8192;
    }

    public static /* synthetic */ void I(ad2 ad2Var, Iterable iterable) {
        u92<String> u92Var = ad2Var.zzv;
        if (!u92Var.c()) {
            ad2Var.zzv = m92.l(u92Var);
        }
        b82.h(iterable, ad2Var.zzv);
    }

    public static /* synthetic */ void J(ad2 ad2Var, Iterable iterable) {
        u92<String> u92Var = ad2Var.zzw;
        if (!u92Var.c()) {
            ad2Var.zzw = m92.l(u92Var);
        }
        b82.h(iterable, ad2Var.zzw);
    }

    public static /* synthetic */ void K(ad2 ad2Var, int i10) {
        ad2Var.zzf = i10 - 1;
        ad2Var.zze |= 1;
    }

    public static fc2 v() {
        return zzb.q();
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", xc2.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", uc2.f14361a, "zzg", ec2.f7787a, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
            }
            if (i11 == 3) {
                return new ad2();
            }
            if (i11 == 4) {
                return new fc2(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzx = b10;
            return null;
        }
        return Byte.valueOf(this.zzx);
    }

    public final String x() {
        return this.zzm;
    }

    public final String y() {
        return this.zzh;
    }

    public final List<xc2> z() {
        return this.zzl;
    }
}
