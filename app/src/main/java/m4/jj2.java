package m4;

import android.os.Handler;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class jj2<T> extends ej2 {

    /* renamed from: g */
    public final HashMap<T, ij2<T>> f10101g = new HashMap<>();

    /* renamed from: h */
    public Handler f10102h;

    /* renamed from: i */
    public i01 f10103i;

    @Override // m4.ej2
    public final void k() {
        for (ij2<T> ij2Var : this.f10101g.values()) {
            ij2Var.f9674a.j(ij2Var.f9675b);
        }
    }

    @Override // m4.ej2
    public final void l() {
        for (ij2<T> ij2Var : this.f10101g.values()) {
            ij2Var.f9674a.h(ij2Var.f9675b);
        }
    }

    @Override // m4.ej2
    public void o() {
        for (ij2<T> ij2Var : this.f10101g.values()) {
            ij2Var.f9674a.e(ij2Var.f9675b);
            ij2Var.f9674a.f(ij2Var.f9676c);
            ij2Var.f9674a.g(ij2Var.f9676c);
        }
        this.f10101g.clear();
    }

    public abstract uj2 p(T t10, uj2 uj2Var);

    public abstract void s(T t10, xj2 xj2Var, z40 z40Var);

    public final void v(final T t10, xj2 xj2Var) {
        r01.f(!this.f10101g.containsKey(t10));
        wj2 wj2Var = new wj2() { // from class: m4.hj2
            @Override // m4.wj2
            public final void a(xj2 xj2Var2, z40 z40Var) {
                jj2.this.s(t10, xj2Var2, z40Var);
            }
        };
        ig1 ig1Var = new ig1(this, t10);
        this.f10101g.put(t10, new ij2<>(xj2Var, wj2Var, ig1Var));
        Handler handler = this.f10102h;
        Objects.requireNonNull(handler);
        xj2Var.a(handler, ig1Var);
        Handler handler2 = this.f10102h;
        Objects.requireNonNull(handler2);
        xj2Var.b(handler2, ig1Var);
        xj2Var.c(wj2Var, this.f10103i);
        if (!(!this.f7987b.isEmpty())) {
            xj2Var.j(wj2Var);
        }
    }
}
