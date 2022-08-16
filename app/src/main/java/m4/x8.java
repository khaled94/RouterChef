package m4;

import android.content.Context;
import e.o;
import java.util.concurrent.atomic.AtomicReference;
import n.a;

/* loaded from: classes.dex */
public final class x8 extends v9 {

    /* renamed from: i */
    public static final o f15243i = new o();

    /* renamed from: h */
    public final Context f15244h;

    public x8(n8 n8Var, v5 v5Var, int i10, Context context) {
        super(n8Var, "t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", v5Var, i10, 29);
        this.f15244h = context;
    }

    @Override // m4.v9
    public final void a() {
        v5 v5Var = this.f14619d;
        if (v5Var.f9884u) {
            v5Var.m();
            v5Var.f9884u = false;
        }
        k6.E0((k6) v5Var.f9883t, "E");
        AtomicReference b10 = f15243i.b(this.f15244h.getPackageName());
        if (b10.get() == null) {
            synchronized (b10) {
                if (b10.get() == null) {
                    b10.set((String) this.f14620e.invoke(null, this.f15244h));
                }
            }
        }
        String str = (String) b10.get();
        synchronized (this.f14619d) {
            try {
                v5 v5Var2 = this.f14619d;
                String d5 = a.d(str.getBytes(), true);
                if (v5Var2.f9884u) {
                    v5Var2.m();
                    v5Var2.f9884u = false;
                }
                k6.E0((k6) v5Var2.f9883t, d5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
