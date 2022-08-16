package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r5 extends m92<r5, n5> implements ra2 {
    private static final r5 zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private u92<p5> zzq = za2.f16072v;

    static {
        r5 r5Var = new r5();
        zzb = r5Var;
        m92.n(r5.class, r5Var);
    }

    public static /* synthetic */ void A(r5 r5Var, String str) {
        r5Var.zze |= 16;
        r5Var.zzj = str;
    }

    public static /* synthetic */ void B(r5 r5Var, String str) {
        r5Var.zze |= 1024;
        r5Var.zzp = str;
    }

    public static /* synthetic */ void C(r5 r5Var, String str) {
        Objects.requireNonNull(str);
        r5Var.zze |= 1;
        r5Var.zzf = str;
    }

    public static /* synthetic */ void D(r5 r5Var, int i10) {
        r5Var.zzr = i10 - 1;
        r5Var.zze |= 2048;
    }

    public static n5 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(r5 r5Var, long j3) {
        r5Var.zze |= 2;
        r5Var.zzg = j3;
    }

    public static /* synthetic */ void y(r5 r5Var, String str) {
        Objects.requireNonNull(str);
        r5Var.zze |= 4;
        r5Var.zzh = str;
    }

    public static /* synthetic */ void z(r5 r5Var, String str) {
        r5Var.zze |= 8;
        r5Var.zzi = str;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", p5.class, "zzr", q5.f12697a});
            }
            if (i11 == 3) {
                return new r5();
            }
            if (i11 == 4) {
                return new n5(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
