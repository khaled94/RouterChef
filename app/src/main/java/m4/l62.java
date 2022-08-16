package m4;

/* loaded from: classes.dex */
public final class l62 extends m92<l62, i62> implements ra2 {
    private static final l62 zzb;
    private int zze;
    private u92<k62> zzf = za2.f16072v;

    static {
        l62 l62Var = new l62();
        zzb = l62Var;
        m92.n(l62.class, l62Var);
    }

    public static i62 v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(l62 l62Var, int i10) {
        l62Var.zze = i10;
    }

    public static /* synthetic */ void y(l62 l62Var, k62 k62Var) {
        u92<k62> u92Var = l62Var.zzf;
        if (!u92Var.c()) {
            l62Var.zzf = m92.l(u92Var);
        }
        l62Var.zzf.add(k62Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", k62.class});
            }
            if (i11 == 3) {
                return new l62();
            }
            if (i11 == 4) {
                return new i62(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
