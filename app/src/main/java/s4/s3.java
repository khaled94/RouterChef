package s4;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s3 extends b7<s3, r3> implements e8 {
    private static final s3 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private h7<s3> zzk = m8.f17993v;

    static {
        s3 s3Var = new s3();
        zza = s3Var;
        b7.l(s3.class, s3Var);
    }

    public static /* synthetic */ void B(s3 s3Var, String str) {
        Objects.requireNonNull(str);
        s3Var.zze |= 1;
        s3Var.zzf = str;
    }

    public static /* synthetic */ void C(s3 s3Var, String str) {
        Objects.requireNonNull(str);
        s3Var.zze |= 2;
        s3Var.zzg = str;
    }

    public static /* synthetic */ void D(s3 s3Var) {
        s3Var.zze &= -3;
        s3Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void E(s3 s3Var, long j3) {
        s3Var.zze |= 4;
        s3Var.zzh = j3;
    }

    public static /* synthetic */ void F(s3 s3Var) {
        s3Var.zze &= -5;
        s3Var.zzh = 0L;
    }

    public static /* synthetic */ void G(s3 s3Var, double d5) {
        s3Var.zze |= 16;
        s3Var.zzj = d5;
    }

    public static /* synthetic */ void H(s3 s3Var) {
        s3Var.zze &= -17;
        s3Var.zzj = 0.0d;
    }

    public static void I(s3 s3Var, s3 s3Var2) {
        h7<s3> h7Var = s3Var.zzk;
        if (!h7Var.c()) {
            s3Var.zzk = b7.j(h7Var);
        }
        s3Var.zzk.add(s3Var2);
    }

    public static void J(s3 s3Var, Iterable iterable) {
        h7<s3> h7Var = s3Var.zzk;
        if (!h7Var.c()) {
            s3Var.zzk = b7.j(h7Var);
        }
        x5.g(iterable, s3Var.zzk);
    }

    public static void K(s3 s3Var) {
        s3Var.zzk = m8.f17993v;
    }

    public static r3 w() {
        return zza.n();
    }

    public final List<s3> A() {
        return this.zzk;
    }

    public final boolean L() {
        return (this.zze & 16) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", s3.class});
            }
            if (i11 == 3) {
                return new s3();
            }
            if (i11 == 4) {
                return new r3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final double s() {
        return this.zzj;
    }

    public final float t() {
        return this.zzi;
    }

    public final int u() {
        return this.zzk.size();
    }

    public final long v() {
        return this.zzh;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
