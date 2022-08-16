package m4;

/* loaded from: classes.dex */
public final class q62 extends m92<q62, p62> implements ra2 {
    private static final q62 zzb;
    private String zze = "";

    static {
        q62 q62Var = new q62();
        zzb = q62Var;
        m92.n(q62.class, q62Var);
    }

    public static q62 w() {
        return zzb;
    }

    public static q62 x(n82 n82Var, z82 z82Var) {
        return (q62) m92.t(zzb, n82Var, z82Var);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            }
            if (i11 == 3) {
                return new q62();
            }
            if (i11 == 4) {
                return new p62();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }

    public final String y() {
        return this.zze;
    }
}
