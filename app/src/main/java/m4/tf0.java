package m4;

import java.util.List;

/* loaded from: classes.dex */
public final class tf0 {

    /* renamed from: b */
    public static final tf0 f14040b = new tf0(gx1.f9060w);

    /* renamed from: a */
    public final gw1<xe0> f14041a;

    static {
        pu1 pu1Var = gw1.f9058t;
    }

    public tf0(List<xe0> list) {
        this.f14041a = gw1.q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tf0.class == obj.getClass()) {
            return this.f14041a.equals(((tf0) obj).f14041a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14041a.hashCode();
    }
}
