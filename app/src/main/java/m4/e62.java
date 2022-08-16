package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e62 extends m92<e62, d62> implements ra2 {
    private static final e62 zzb;
    private String zze = "";
    private n82 zzf = n82.f11571t;
    private int zzg;

    static {
        e62 e62Var = new e62();
        zzb = e62Var;
        m92.n(e62.class, e62Var);
    }

    public static /* synthetic */ void A(e62 e62Var, String str) {
        Objects.requireNonNull(str);
        e62Var.zze = str;
    }

    public static void D(e62 e62Var, int i10) {
        if (i10 != 1) {
            e62Var.zzg = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static d62 v() {
        return zzb.q();
    }

    public static e62 x() {
        return zzb;
    }

    public final int C() {
        int d5 = wo2.d(this.zzg);
        if (d5 == 0) {
            return 1;
        }
        return d5;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            if (i11 == 3) {
                return new e62();
            }
            if (i11 == 4) {
                return new d62(null);
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
