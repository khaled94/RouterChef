package m4;

/* loaded from: classes.dex */
public final class j9 extends v9 {
    public j9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "xNZCZdqL8o1jZKUOIQXHHGKMYJmFGBT5z1mMXWF7VHR3erPGPRFl7DocpCFVg9bF", "1GRZIGWaJCWi5hYVyOzM0ARje4NaXoHaW7HEe5QbRxs=", v5Var, i10, 3);
    }

    @Override // m4.v9
    public final void a() {
        c8 c8Var = new c8((String) this.f14620e.invoke(null, this.f14616a.f11550a, Boolean.valueOf(((Boolean) jo.f10145d.f10148c.a(es.H1)).booleanValue())));
        synchronized (this.f14619d) {
            v5 v5Var = this.f14619d;
            long j3 = c8Var.f6736a;
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.r0((k6) v5Var.f9883t, j3);
            v5 v5Var2 = this.f14619d;
            long j10 = c8Var.f6737b;
            if (v5Var2.f9884u) {
                v5Var2.m();
                v5Var2.f9884u = false;
            }
            k6.Q((k6) v5Var2.f9883t, j10);
        }
    }
}
