package k9;

import d0.b;
import x8.d;
import x8.f;

/* loaded from: classes.dex */
public abstract class a<T> extends s0 implements d<T> {

    /* renamed from: t */
    public final f f5636t;

    public void C(Object obj) {
        f(obj);
    }

    @Override // k9.s0, k9.o0
    public final boolean b() {
        return super.b();
    }

    @Override // x8.d
    public final void d(Object obj) {
        Object s10 = s(c4.a.d(obj, null));
        if (s10 == b.A) {
            return;
        }
        C(s10);
    }

    @Override // x8.d
    public final f getContext() {
        return this.f5636t;
    }

    @Override // k9.s0
    public final String i() {
        return e9.f.j(getClass().getSimpleName(), " was cancelled");
    }

    @Override // k9.s0
    public final void q(Throwable th) {
        d.a.a(this.f5636t, th);
    }

    @Override // k9.s0
    public final String t() {
        return super.t();
    }

    @Override // k9.s0
    public final void w(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            Throwable th = mVar.f5670a;
            mVar.a();
        }
    }
}
