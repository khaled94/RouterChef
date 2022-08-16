package m4;

/* loaded from: classes.dex */
public final class z8 extends v9 {
    public z8(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", v5Var, i10, 5);
    }

    @Override // m4.v9
    public final void a() {
        v5 v5Var = this.f14619d;
        if (v5Var.f9884u) {
            v5Var.m();
            v5Var.f9884u = false;
        }
        k6.s0((k6) v5Var.f9883t, -1L);
        v5 v5Var2 = this.f14619d;
        if (v5Var2.f9884u) {
            v5Var2.m();
            v5Var2.f9884u = false;
        }
        k6.t0((k6) v5Var2.f9883t, -1L);
        int[] iArr = (int[]) this.f14620e.invoke(null, this.f14616a.f11550a);
        synchronized (this.f14619d) {
            try {
                v5 v5Var3 = this.f14619d;
                long j3 = iArr[0];
                if (v5Var3.f9884u) {
                    v5Var3.m();
                    v5Var3.f9884u = false;
                }
                k6.s0((k6) v5Var3.f9883t, j3);
                v5 v5Var4 = this.f14619d;
                long j10 = iArr[1];
                if (v5Var4.f9884u) {
                    v5Var4.m();
                    v5Var4.f9884u = false;
                }
                k6.t0((k6) v5Var4.f9883t, j10);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    v5 v5Var5 = this.f14619d;
                    long j11 = i10;
                    if (v5Var5.f9884u) {
                        v5Var5.m();
                        v5Var5.f9884u = false;
                    }
                    k6.P((k6) v5Var5.f9883t, j11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
