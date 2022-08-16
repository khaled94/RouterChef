package m4;

import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sp1 extends m92<sp1, rp1> implements ra2 {
    private static final sp1 zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";

    static {
        sp1 sp1Var = new sp1();
        zzb = sp1Var;
        m92.n(sp1.class, sp1Var);
    }

    public static /* synthetic */ void D(sp1 sp1Var, String str) {
        Objects.requireNonNull(str);
        sp1Var.zzq = str;
    }

    public static /* synthetic */ void E(sp1 sp1Var, String str) {
        Objects.requireNonNull(str);
        sp1Var.zzr = str;
    }

    public static /* synthetic */ void F(sp1 sp1Var, String str) {
        Objects.requireNonNull(str);
        sp1Var.zzs = str;
    }

    public static /* synthetic */ void I(sp1 sp1Var, String str) {
        Objects.requireNonNull(str);
        sp1Var.zzu = str;
    }

    public static /* synthetic */ void L(sp1 sp1Var, int i10) {
        if (i10 != 1) {
            sp1Var.zzm = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ void M(sp1 sp1Var, int i10) {
        if (i10 != 1) {
            sp1Var.zzp = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static rp1 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(sp1 sp1Var, String str) {
        Objects.requireNonNull(str);
        sp1Var.zzi = str;
    }

    public static /* synthetic */ void y(sp1 sp1Var, String str) {
        Objects.requireNonNull(str);
        sp1Var.zzj = str;
    }

    public static /* synthetic */ void z(sp1 sp1Var) {
        String str = Build.VERSION.RELEASE;
        Objects.requireNonNull(str);
        sp1Var.zzk = str;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            }
            if (i11 == 3) {
                return new sp1();
            }
            if (i11 == 4) {
                return new rp1(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
