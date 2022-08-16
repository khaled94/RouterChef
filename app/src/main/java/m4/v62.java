package m4;

import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class v62 extends m92<v62, nk> implements ra2 {

    /* renamed from: s */
    public static final /* synthetic */ int f14592s = 0;
    private static final v62 zzb;
    private String zze = "";
    private u92<f62> zzf = za2.f16072v;

    static {
        v62 v62Var = new v62();
        zzb = v62Var;
        m92.n(v62.class, v62Var);
    }

    public static v62 w() {
        return zzb;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", f62.class});
            }
            if (i11 == 3) {
                return new v62();
            }
            if (i11 == 4) {
                return new nk(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final List<f62> x() {
        return this.zzf;
    }
}
