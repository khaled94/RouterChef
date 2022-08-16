package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class m2 extends b7<m2, l2> implements e8 {
    private static final m2 zza;
    private int zze;
    private int zzf;
    private h7<v2> zzg;
    private h7<o2> zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        m2 m2Var = new m2();
        zza = m2Var;
        b7.l(m2.class, m2Var);
    }

    public m2() {
        m8<Object> m8Var = m8.f17993v;
        this.zzg = m8Var;
        this.zzh = m8Var;
    }

    public static /* synthetic */ void A(m2 m2Var, int i10, v2 v2Var) {
        h7<v2> h7Var = m2Var.zzg;
        if (!h7Var.c()) {
            m2Var.zzg = b7.j(h7Var);
        }
        m2Var.zzg.set(i10, v2Var);
    }

    public static /* synthetic */ void B(m2 m2Var, int i10, o2 o2Var) {
        h7<o2> h7Var = m2Var.zzh;
        if (!h7Var.c()) {
            m2Var.zzh = b7.j(h7Var);
        }
        m2Var.zzh.set(i10, o2Var);
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", v2.class, "zzh", o2.class, "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new m2();
            }
            if (i11 == 4) {
                return new l2(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zzg.size();
    }

    public final o2 w(int i10) {
        return this.zzh.get(i10);
    }

    public final v2 x(int i10) {
        return this.zzg.get(i10);
    }

    public final List<o2> y() {
        return this.zzh;
    }

    public final List<v2> z() {
        return this.zzg;
    }
}
