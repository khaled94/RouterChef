package m4;

/* loaded from: classes.dex */
public final class b9 extends v9 {

    /* renamed from: h */
    public final long f6422h;

    public b9(n8 n8Var, v5 v5Var, long j3, int i10) {
        super(n8Var, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", v5Var, i10, 25);
        this.f6422h = j3;
    }

    @Override // m4.v9
    public final void a() {
        long longValue = ((Long) this.f14620e.invoke(null, new Object[0])).longValue();
        synchronized (this.f14619d) {
            try {
                v5 v5Var = this.f14619d;
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.Y((k6) v5Var.f9883t, longValue);
                long j3 = this.f6422h;
                if (j3 != 0) {
                    v5 v5Var2 = this.f14619d;
                    long j10 = longValue - j3;
                    if (v5Var2.f9884u) {
                        v5Var2.m();
                        v5Var2.f9884u = false;
                    }
                    k6.z0((k6) v5Var2.f9883t, j10);
                    v5 v5Var3 = this.f14619d;
                    long j11 = this.f6422h;
                    if (v5Var3.f9884u) {
                        v5Var3.m();
                        v5Var3.f9884u = false;
                    }
                    k6.C0((k6) v5Var3.f9883t, j11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
