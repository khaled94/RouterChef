package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class e4 extends b7<e4, d4> implements e8 {
    private static final e4 zza;
    private g7 zze;
    private g7 zzf;
    private h7<m3> zzg;
    private h7<g4> zzh;

    static {
        e4 e4Var = new e4();
        zza = e4Var;
        b7.l(e4.class, e4Var);
    }

    public e4() {
        s7 s7Var = s7.f18095v;
        this.zze = s7Var;
        this.zzf = s7Var;
        m8<Object> m8Var = m8.f17993v;
        this.zzg = m8Var;
        this.zzh = m8Var;
    }

    public static void F(e4 e4Var, Iterable iterable) {
        g7 g7Var = e4Var.zze;
        if (!((y5) g7Var).f18203s) {
            e4Var.zze = b7.q(g7Var);
        }
        x5.g(iterable, e4Var.zze);
    }

    public static void G(e4 e4Var) {
        e4Var.zze = s7.f18095v;
    }

    public static void H(e4 e4Var, Iterable iterable) {
        g7 g7Var = e4Var.zzf;
        if (!((y5) g7Var).f18203s) {
            e4Var.zzf = b7.q(g7Var);
        }
        x5.g(iterable, e4Var.zzf);
    }

    public static void I(e4 e4Var) {
        e4Var.zzf = s7.f18095v;
    }

    public static void J(e4 e4Var, Iterable iterable) {
        h7<m3> h7Var = e4Var.zzg;
        if (!h7Var.c()) {
            e4Var.zzg = b7.j(h7Var);
        }
        x5.g(iterable, e4Var.zzg);
    }

    public static void K(e4 e4Var, int i10) {
        h7<m3> h7Var = e4Var.zzg;
        if (!h7Var.c()) {
            e4Var.zzg = b7.j(h7Var);
        }
        e4Var.zzg.remove(i10);
    }

    public static void L(e4 e4Var, Iterable iterable) {
        h7<g4> h7Var = e4Var.zzh;
        if (!h7Var.c()) {
            e4Var.zzh = b7.j(h7Var);
        }
        x5.g(iterable, e4Var.zzh);
    }

    public static void M(e4 e4Var, int i10) {
        h7<g4> h7Var = e4Var.zzh;
        if (!h7Var.c()) {
            e4Var.zzh = b7.j(h7Var);
        }
        e4Var.zzh.remove(i10);
    }

    public static d4 x() {
        return zza.n();
    }

    public static e4 z() {
        return zza;
    }

    public final g4 A(int i10) {
        return this.zzh.get(i10);
    }

    public final List<m3> B() {
        return this.zzg;
    }

    public final List<Long> C() {
        return this.zzf;
    }

    public final List<g4> D() {
        return this.zzh;
    }

    public final List<Long> E() {
        return this.zze;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", m3.class, "zzh", g4.class});
            }
            if (i11 == 3) {
                return new e4();
            }
            if (i11 == 4) {
                return new d4(null);
            }
            if (i11 == 5) {
                return zza;
            }
            return null;
        }
        return (byte) 1;
    }

    public final int s() {
        return this.zzg.size();
    }

    public final int t() {
        return ((s7) this.zzf).f18097u;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final int v() {
        return ((s7) this.zze).f18097u;
    }

    public final m3 w(int i10) {
        return this.zzg.get(i10);
    }
}
