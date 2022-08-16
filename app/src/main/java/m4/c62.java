package m4;

/* loaded from: classes.dex */
public final class c62 extends m92<c62, b62> implements ra2 {
    private static final c62 zzb;
    private String zze = "";
    private n82 zzf = n82.f11571t;
    private int zzg;

    static {
        c62 c62Var = new c62();
        zzb = c62Var;
        m92.n(c62.class, c62Var);
    }

    public static b62 v() {
        return zzb.q();
    }

    public static c62 x() {
        return zzb;
    }

    public final int C() {
        int i10 = this.zzg;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? i10 != 4 ? 0 : 6 : 5;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new c62();
            }
            if (i11 == 4) {
                return new b62(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final n82 y() {
        return this.zzf;
    }

    public final String z() {
        return this.zze;
    }
}
