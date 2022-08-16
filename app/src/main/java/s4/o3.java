package s4;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o3 extends b7<o3, n3> implements e8 {
    private static final o3 zza;
    private int zze;
    private h7<s3> zzf = m8.f17993v;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        o3 o3Var = new o3();
        zza = o3Var;
        b7.l(o3.class, o3Var);
    }

    public static /* synthetic */ void B(o3 o3Var, int i10, s3 s3Var) {
        o3Var.M();
        o3Var.zzf.set(i10, s3Var);
    }

    public static /* synthetic */ void C(o3 o3Var, s3 s3Var) {
        o3Var.M();
        o3Var.zzf.add(s3Var);
    }

    public static /* synthetic */ void D(o3 o3Var, Iterable iterable) {
        o3Var.M();
        x5.g(iterable, o3Var.zzf);
    }

    public static void E(o3 o3Var) {
        o3Var.zzf = m8.f17993v;
    }

    public static /* synthetic */ void F(o3 o3Var, int i10) {
        o3Var.M();
        o3Var.zzf.remove(i10);
    }

    public static /* synthetic */ void G(o3 o3Var, String str) {
        Objects.requireNonNull(str);
        o3Var.zze |= 1;
        o3Var.zzg = str;
    }

    public static /* synthetic */ void H(o3 o3Var, long j3) {
        o3Var.zze |= 2;
        o3Var.zzh = j3;
    }

    public static /* synthetic */ void I(o3 o3Var, long j3) {
        o3Var.zze |= 4;
        o3Var.zzi = j3;
    }

    public static n3 w() {
        return zza.n();
    }

    public final List<s3> A() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zze & 8) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final void M() {
        h7<s3> h7Var = this.zzf;
        if (!h7Var.c()) {
            this.zzf = b7.j(h7Var);
        }
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", s3.class, "zzg", "zzh", "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new o3();
            }
            if (i11 == 4) {
                return new n3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzj;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final long u() {
        return this.zzi;
    }

    public final long v() {
        return this.zzh;
    }

    public final s3 y(int i10) {
        return this.zzf.get(i10);
    }

    public final String z() {
        return this.zzg;
    }
}
