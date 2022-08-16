package m4;

/* loaded from: classes.dex */
public final class kk extends m92<kk, ek> implements ra2 {
    private static final kk zzb;
    private u92<dk> zze = za2.f16072v;

    static {
        kk kkVar = new kk();
        zzb = kkVar;
        m92.n(kk.class, kkVar);
    }

    public static ek v() {
        return zzb.q();
    }

    public static /* synthetic */ void x(kk kkVar, dk dkVar) {
        u92<dk> u92Var = kkVar.zze;
        if (!u92Var.c()) {
            kkVar.zze = m92.l(u92Var);
        }
        kkVar.zze.add(dkVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", dk.class});
            }
            if (i11 == 3) {
                return new kk();
            }
            if (i11 == 4) {
                return new ek(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
