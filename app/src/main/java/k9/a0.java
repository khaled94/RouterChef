package k9;

import d.a;
import d.b;
import e9.f;
import java.util.concurrent.CancellationException;
import k9.o0;
import n9.c;
import n9.t;
import o9.g;
import o9.h;
import v8.e;
import x8.d;

/* loaded from: classes.dex */
public abstract class a0<T> extends g {

    /* renamed from: u */
    public int f5637u;

    public a0(int i10) {
        this.f5637u = i10;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable e(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar == null) {
            return null;
        }
        return mVar.f5670a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            j0.d.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        f.c(th);
        a.a(c().getContext(), new t("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        h hVar = this.f16832t;
        try {
            c cVar = (c) c();
            d<T> dVar = cVar.f16683w;
            Object obj3 = cVar.y;
            x8.f context = dVar.getContext();
            Object b10 = t.b(context, obj3);
            b1 a10 = b10 != t.f16720a ? c1.f.a(dVar, context) : null;
            x8.f context2 = dVar.getContext();
            Object h10 = h();
            Throwable e10 = e(h10);
            o0 o0Var = (e10 != null || !e9.d.h(this.f5637u)) ? null : (o0) context2.get(o0.b.f5677s);
            if (o0Var == null || o0Var.b()) {
                obj2 = e10 != null ? b.a(e10) : f(h10);
            } else {
                CancellationException L = o0Var.L();
                b(h10, L);
                obj2 = b.a(L);
            }
            dVar.d(obj2);
            Object obj4 = v8.h.f19835a;
            if (a10 != null) {
                throw null;
            }
            t.a(context, b10);
            try {
                hVar.a();
            } catch (Throwable th) {
                obj4 = b.a(th);
            }
            g(null, e.a(obj4));
        } catch (Throwable th2) {
            try {
                hVar.a();
                obj = v8.h.f19835a;
            } catch (Throwable th3) {
                obj = b.a(th3);
            }
            g(th2, e.a(obj));
        }
    }
}
