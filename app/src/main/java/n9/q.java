package n9;

import androidx.lifecycle.h0;
import k9.a;
import z8.d;

/* loaded from: classes.dex */
public class q<T> extends a<T> implements d {

    /* renamed from: u */
    public final x8.d<T> f16717u;

    @Override // k9.a
    public void C(Object obj) {
        this.f16717u.d(c4.a.c(obj));
    }

    @Override // z8.d
    public final d a() {
        x8.d<T> dVar = this.f16717u;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    @Override // k9.s0
    public void f(Object obj) {
        d.a(h0.b(this.f16717u), c4.a.c(obj), null);
    }

    @Override // k9.s0
    public final boolean r() {
        return true;
    }
}
