package m4;

/* loaded from: classes.dex */
public final class m9 extends v9 {

    /* renamed from: h */
    public final boolean f11120h;

    public m9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", v5Var, i10, 61);
        this.f11120h = n8Var.f11565q.f8765a;
    }

    @Override // m4.v9
    public final void a() {
        long longValue = ((Long) this.f14620e.invoke(null, this.f14616a.f11550a, Boolean.valueOf(this.f11120h))).longValue();
        synchronized (this.f14619d) {
            try {
                v5 v5Var = this.f14619d;
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.R((k6) v5Var.f9883t, longValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
