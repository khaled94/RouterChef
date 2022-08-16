package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class d3 extends b7<d3, c3> implements e8 {
    private static final d3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private h7<f3> zzi;
    private h7<b3> zzj;
    private h7<m2> zzk;
    private boolean zzm;
    private h7<o4> zzn;
    private String zzg = "";
    private String zzl = "";

    static {
        d3 d3Var = new d3();
        zza = d3Var;
        b7.l(d3.class, d3Var);
    }

    public d3() {
        m8<Object> m8Var = m8.f17993v;
        this.zzi = m8Var;
        this.zzj = m8Var;
        this.zzk = m8Var;
        this.zzn = m8Var;
    }

    public static /* synthetic */ void D(d3 d3Var, int i10, b3 b3Var) {
        h7<b3> h7Var = d3Var.zzj;
        if (!h7Var.c()) {
            d3Var.zzj = b7.j(h7Var);
        }
        d3Var.zzj.set(i10, b3Var);
    }

    public static void E(d3 d3Var) {
        d3Var.zzk = m8.f17993v;
    }

    public static c3 w() {
        return zza.n();
    }

    public static d3 y() {
        return zza;
    }

    public final List<m2> A() {
        return this.zzk;
    }

    public final List<o4> B() {
        return this.zzn;
    }

    public final List<f3> C() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzm;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", f3.class, "zzj", b3.class, "zzk", m2.class, "zzl", "zzm", "zzn", o4.class});
            }
            if (i11 == 3) {
                return new d3();
            }
            if (i11 == 4) {
                return new c3(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzn.size();
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final b3 v(int i10) {
        return this.zzj.get(i10);
    }

    public final String z() {
        return this.zzg;
    }
}
