package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class o2 extends b7<o2, n2> implements e8 {
    private static final o2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private h7<q2> zzh = m8.f17993v;
    private boolean zzi;
    private t2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        o2 o2Var = new o2();
        zza = o2Var;
        b7.l(o2.class, o2Var);
    }

    public static /* synthetic */ void A(o2 o2Var, String str) {
        o2Var.zze |= 2;
        o2Var.zzg = str;
    }

    public static /* synthetic */ void B(o2 o2Var, int i10, q2 q2Var) {
        h7<q2> h7Var = o2Var.zzh;
        if (!h7Var.c()) {
            o2Var.zzh = b7.j(h7Var);
        }
        o2Var.zzh.set(i10, q2Var);
    }

    public static n2 u() {
        return zza.n();
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzm;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 64) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", q2.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            if (i11 == 3) {
                return new o2();
            }
            if (i11 == 4) {
                return new n2(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzf;
    }

    public final q2 w(int i10) {
        return this.zzh.get(i10);
    }

    public final t2 x() {
        t2 t2Var = this.zzj;
        return t2Var == null ? t2.t() : t2Var;
    }

    public final String y() {
        return this.zzg;
    }

    public final List<q2> z() {
        return this.zzh;
    }
}
