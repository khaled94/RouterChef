package s6;

import c5.i;
import c5.j;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Callable f18275s;

    /* renamed from: t */
    public final /* synthetic */ j f18276t;

    /* loaded from: classes.dex */
    public class a implements c5.a<Object, Void> {
        public a() {
            k0.this = r1;
        }

        @Override // c5.a
        public final Void d(i<Object> iVar) {
            if (iVar.n()) {
                k0.this.f18276t.b(iVar.j());
                return null;
            }
            k0.this.f18276t.a(iVar.i());
            return null;
        }
    }

    public k0(Callable callable, j jVar) {
        this.f18275s = callable;
        this.f18276t = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((i) this.f18275s.call()).e(new a());
        } catch (Exception e10) {
            this.f18276t.a(e10);
        }
    }
}
