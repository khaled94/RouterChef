package m4;

import android.os.RemoteException;
import d4.b;
import java.io.IOException;
import n3.g1;

/* loaded from: classes.dex */
public final class rj implements b.a {

    /* renamed from: a */
    public final /* synthetic */ kj f13365a;

    /* renamed from: b */
    public final /* synthetic */ w90 f13366b;

    /* renamed from: c */
    public final /* synthetic */ tj f13367c;

    public rj(tj tjVar, kj kjVar, w90 w90Var) {
        this.f13367c = tjVar;
        this.f13365a = kjVar;
        this.f13366b = w90Var;
    }

    @Override // d4.b.a
    public final void e0() {
        synchronized (this.f13367c.f14080c) {
            tj tjVar = this.f13367c;
            if (tjVar.f14079b) {
                return;
            }
            tjVar.f14079b = true;
            final jj jjVar = tjVar.f14078a;
            if (jjVar == null) {
                return;
            }
            t90 t90Var = u90.f14294a;
            final kj kjVar = this.f13365a;
            final w90 w90Var = this.f13366b;
            tz1<?> a10 = t90Var.a(new Runnable() { // from class: m4.oj
                @Override // java.lang.Runnable
                public final void run() {
                    rj rjVar = rj.this;
                    jj jjVar2 = jjVar;
                    kj kjVar2 = kjVar;
                    w90 w90Var2 = w90Var;
                    try {
                        mj mjVar = (mj) jjVar2.v();
                        hj Z1 = jjVar2.E() ? mjVar.Z1(kjVar2) : mjVar.E1(kjVar2);
                        if (!Z1.v()) {
                            w90Var2.c(new RuntimeException("No entry contents."));
                            tj.a(rjVar.f13367c);
                            return;
                        }
                        qj qjVar = new qj(rjVar, Z1.t());
                        int read = qjVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        qjVar.unread(read);
                        w90Var2.a(new uj(qjVar, Z1.u(), Z1.y(), Z1.s(), Z1.x()));
                    } catch (RemoteException | IOException e10) {
                        g1.h("Unable to obtain a cache service instance.", e10);
                        w90Var2.c(e10);
                        tj.a(rjVar.f13367c);
                    }
                }
            });
            w90 w90Var2 = this.f13366b;
            w90Var2.b(new pj(w90Var2, a10, 0), u90.f14299f);
        }
    }

    @Override // d4.b.a
    public final void w(int i10) {
    }
}
