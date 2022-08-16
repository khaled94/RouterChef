package m4;

import java.util.List;

/* loaded from: classes.dex */
public final class l9 extends v9 {

    /* renamed from: h */
    public List<Long> f10680h = null;

    public l9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", v5Var, i10, 31);
    }

    @Override // m4.v9
    public final void a() {
        v5 v5Var = this.f14619d;
        if (v5Var.f9884u) {
            v5Var.m();
            v5Var.f9884u = false;
        }
        k6.F0((k6) v5Var.f9883t, -1L);
        v5 v5Var2 = this.f14619d;
        if (v5Var2.f9884u) {
            v5Var2.m();
            v5Var2.f9884u = false;
        }
        k6.G0((k6) v5Var2.f9883t, -1L);
        if (this.f10680h == null) {
            this.f10680h = (List) this.f14620e.invoke(null, this.f14616a.f11550a);
        }
        List<Long> list = this.f10680h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f14619d) {
            try {
                v5 v5Var3 = this.f14619d;
                long longValue = this.f10680h.get(0).longValue();
                if (v5Var3.f9884u) {
                    v5Var3.m();
                    v5Var3.f9884u = false;
                }
                k6.F0((k6) v5Var3.f9883t, longValue);
                v5 v5Var4 = this.f14619d;
                long longValue2 = this.f10680h.get(1).longValue();
                if (v5Var4.f9884u) {
                    v5Var4.m();
                    v5Var4.f9884u = false;
                }
                k6.G0((k6) v5Var4.f9883t, longValue2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
