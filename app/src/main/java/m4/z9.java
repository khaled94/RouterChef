package m4;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z9 extends m92<z9, y9> implements ra2 {
    private static final z9 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        z9 z9Var = new z9();
        zzb = z9Var;
        m92.n(z9.class, z9Var);
    }

    public static z9 A() {
        return zzb;
    }

    public static z9 B(n82 n82Var) {
        z9 z9Var = zzb;
        z82 a10 = z82.a();
        try {
            r82 t10 = n82Var.t();
            m92 m92Var = (m92) z9Var.u(4, null);
            try {
                try {
                    try {
                        eb2 a11 = ya2.f15637c.a(m92Var.getClass());
                        s82 s82Var = t10.f13198b;
                        if (s82Var == null) {
                            s82Var = new s82(t10);
                        }
                        a11.g(m92Var, s82Var, a10);
                        a11.c(m92Var);
                        try {
                            t10.A(0);
                            m92.j(m92Var);
                            m92.j(m92Var);
                            return (z9) m92Var;
                        } catch (x92 e10) {
                            throw e10;
                        }
                    } catch (x92 e11) {
                        if (!e11.f15257s) {
                            throw e11;
                        }
                        throw new x92(e11);
                    }
                } catch (IOException e12) {
                    if (!(e12.getCause() instanceof x92)) {
                        throw new x92(e12);
                    }
                    throw ((x92) e12.getCause());
                }
            } catch (RuntimeException e13) {
                if (!(e13.getCause() instanceof x92)) {
                    throw e13;
                }
                throw ((x92) e13.getCause());
            }
        } catch (x92 e14) {
            throw e14;
        }
    }

    public static z9 C(n82 n82Var, z82 z82Var) {
        return (z9) m92.t(zzb, n82Var, z82Var);
    }

    public static /* synthetic */ void F(z9 z9Var, String str) {
        Objects.requireNonNull(str);
        z9Var.zze |= 1;
        z9Var.zzf = str;
    }

    public static /* synthetic */ void G(z9 z9Var, long j3) {
        z9Var.zze |= 16;
        z9Var.zzj = j3;
    }

    public static /* synthetic */ void H(z9 z9Var, String str) {
        Objects.requireNonNull(str);
        z9Var.zze |= 2;
        z9Var.zzg = str;
    }

    public static /* synthetic */ void I(z9 z9Var, long j3) {
        z9Var.zze |= 4;
        z9Var.zzh = j3;
    }

    public static /* synthetic */ void J(z9 z9Var, long j3) {
        z9Var.zze |= 8;
        z9Var.zzi = j3;
    }

    public static y9 y() {
        return zzb.q();
    }

    public final String D() {
        return this.zzg;
    }

    public final String E() {
        return this.zzf;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            }
            if (i11 == 3) {
                return new z9();
            }
            if (i11 == 4) {
                return new y9(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final long v() {
        return this.zzi;
    }

    public final long w() {
        return this.zzh;
    }

    public final long x() {
        return this.zzj;
    }
}
