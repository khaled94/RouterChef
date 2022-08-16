package m4;

/* loaded from: classes.dex */
public final class o6 extends m92<o6, n6> implements ra2 {
    private static final o6 zzb;
    private int zze;
    private n82 zzf;
    private n82 zzg;
    private n82 zzh;
    private n82 zzi;

    static {
        o6 o6Var = new o6();
        zzb = o6Var;
        m92.n(o6.class, o6Var);
    }

    public o6() {
        l82 l82Var = n82.f11571t;
        this.zzf = l82Var;
        this.zzg = l82Var;
        this.zzh = l82Var;
        this.zzi = l82Var;
    }

    public static /* synthetic */ void C(o6 o6Var, n82 n82Var) {
        o6Var.zze |= 1;
        o6Var.zzf = n82Var;
    }

    public static /* synthetic */ void D(o6 o6Var, n82 n82Var) {
        o6Var.zze |= 2;
        o6Var.zzg = n82Var;
    }

    public static /* synthetic */ void E(o6 o6Var, n82 n82Var) {
        o6Var.zze |= 4;
        o6Var.zzh = n82Var;
    }

    public static /* synthetic */ void F(o6 o6Var, n82 n82Var) {
        o6Var.zze |= 8;
        o6Var.zzi = n82Var;
    }

    public static n6 v() {
        return zzb.q();
    }

    public static o6 x(byte[] bArr, z82 z82Var) {
        m92 k10 = m92.k(zzb, bArr, bArr.length, z82Var);
        m92.j(k10);
        return (o6) k10;
    }

    public final n82 A() {
        return this.zzi;
    }

    public final n82 B() {
        return this.zzh;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            if (i11 == 3) {
                return new o6();
            }
            if (i11 == 4) {
                return new n6(null);
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

    public final n82 z() {
        return this.zzg;
    }
}
