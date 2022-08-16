package m4;

/* loaded from: classes.dex */
public final class hf2 {

    /* renamed from: c */
    public static final hf2 f9226c;

    /* renamed from: a */
    public final long f9227a;

    /* renamed from: b */
    public final long f9228b;

    static {
        hf2 hf2Var = new hf2(0L, 0L);
        new hf2(Long.MAX_VALUE, Long.MAX_VALUE);
        new hf2(Long.MAX_VALUE, 0L);
        new hf2(0L, Long.MAX_VALUE);
        f9226c = hf2Var;
    }

    public hf2(long j3, long j10) {
        boolean z10 = true;
        r01.f(j3 >= 0);
        r01.f(j10 < 0 ? false : z10);
        this.f9227a = j3;
        this.f9228b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hf2.class == obj.getClass()) {
            hf2 hf2Var = (hf2) obj;
            if (this.f9227a == hf2Var.f9227a && this.f9228b == hf2Var.f9228b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9227a) * 31) + ((int) this.f9228b);
    }
}
