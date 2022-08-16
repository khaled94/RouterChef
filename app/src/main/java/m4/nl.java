package m4;

/* loaded from: classes.dex */
public final class nl extends m92<nl, kl> implements ra2 {
    private static final nl zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        nl nlVar = new nl();
        zzb = nlVar;
        m92.n(nl.class, nlVar);
    }

    public static /* synthetic */ void C(nl nlVar, int i10) {
        nlVar.zzf = i10 - 1;
        nlVar.zze |= 1;
    }

    public static /* synthetic */ void D(nl nlVar, int i10) {
        nlVar.zzg = i10 - 1;
        nlVar.zze |= 2;
    }

    public static kl v() {
        return zzb.q();
    }

    public static nl x() {
        return zzb;
    }

    public final int A() {
        int i10;
        int i11 = this.zzg;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? i11 != 4 ? 0 : 5 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int B() {
        int i10;
        int i11 = this.zzf;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", ml.f11237a, "zzg", ll.f10906a});
            }
            if (i11 == 3) {
                return new nl();
            }
            if (i11 == 4) {
                return new kl(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
