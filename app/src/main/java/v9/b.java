package v9;

import ca.o;
import ca.s;
import ca.t;
import ca.x;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.logging.Logger;
import r9.c0;
import r9.g0;
import r9.w;
import s9.e;
import u9.c;

/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: a */
    public final boolean f19837a;

    public b(boolean z10) {
        this.f19837a = z10;
    }

    @Override // r9.w
    public final g0 a(w.a aVar) {
        boolean z10;
        g0.a aVar2;
        g0.a d5;
        f fVar = (f) aVar;
        c cVar = fVar.f19844c;
        if (cVar != null) {
            c0 c0Var = fVar.f19846e;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Objects.requireNonNull(cVar.f19613b);
                cVar.f19615d.e(c0Var);
                Objects.requireNonNull(cVar.f19613b);
                g0.a aVar3 = null;
                if (d.c.d(c0Var.f17312b) && c0Var.f17314d != null) {
                    if ("100-continue".equalsIgnoreCase(c0Var.b("Expect"))) {
                        try {
                            cVar.f19615d.d();
                            Objects.requireNonNull(cVar.f19613b);
                            d5 = cVar.d(true);
                            z10 = true;
                        } catch (IOException e10) {
                            Objects.requireNonNull(cVar.f19613b);
                            cVar.e(e10);
                            throw e10;
                        }
                    } else {
                        d5 = null;
                        z10 = false;
                    }
                    if (d5 == null) {
                        Objects.requireNonNull(c0Var.f17314d);
                        x c10 = cVar.c(c0Var);
                        Logger logger = o.f2862a;
                        s sVar = new s(c10);
                        c0Var.f17314d.c(sVar);
                        sVar.close();
                    } else {
                        cVar.f19612a.d(cVar, true, false, null);
                        if (!cVar.b().g()) {
                            cVar.f19615d.h().i();
                        }
                    }
                    aVar3 = d5;
                } else {
                    cVar.f19612a.d(cVar, true, false, null);
                    z10 = false;
                }
                try {
                    cVar.f19615d.c();
                    if (!z10) {
                        Objects.requireNonNull(cVar.f19613b);
                    }
                    if (aVar3 == null) {
                        aVar3 = cVar.d(false);
                    }
                    aVar3.f17380a = c0Var;
                    aVar3.f17384e = cVar.b().f19641f;
                    aVar3.f17390k = currentTimeMillis;
                    aVar3.f17391l = System.currentTimeMillis();
                    g0 a10 = aVar3.a();
                    int i10 = a10.f17375u;
                    if (i10 == 100) {
                        g0.a d10 = cVar.d(false);
                        d10.f17380a = c0Var;
                        d10.f17384e = cVar.b().f19641f;
                        d10.f17390k = currentTimeMillis;
                        d10.f17391l = System.currentTimeMillis();
                        a10 = d10.a();
                        i10 = a10.f17375u;
                    }
                    Objects.requireNonNull(cVar.f19613b);
                    if (this.f19837a && i10 == 101) {
                        aVar2 = new g0.a(a10);
                        aVar2.f17386g = e.f18399d;
                    } else {
                        aVar2 = new g0.a(a10);
                        try {
                            Objects.requireNonNull(cVar.f19613b);
                            String c11 = a10.c("Content-Type");
                            long a11 = cVar.f19615d.a(a10);
                            c.b bVar = new c.b(cVar.f19615d.b(a10), a11);
                            Logger logger2 = o.f2862a;
                            aVar2.f17386g = new g(c11, a11, new t(bVar));
                        } catch (IOException e11) {
                            Objects.requireNonNull(cVar.f19613b);
                            cVar.e(e11);
                            throw e11;
                        }
                    }
                    g0 a12 = aVar2.a();
                    if ("close".equalsIgnoreCase(a12.f17373s.b("Connection")) || "close".equalsIgnoreCase(a12.c("Connection"))) {
                        cVar.f19615d.h().i();
                    }
                    if ((i10 != 204 && i10 != 205) || a12.y.b() <= 0) {
                        return a12;
                    }
                    throw new ProtocolException("HTTP " + i10 + " had non-zero Content-Length: " + a12.y.b());
                } catch (IOException e12) {
                    Objects.requireNonNull(cVar.f19613b);
                    cVar.e(e12);
                    throw e12;
                }
            } catch (IOException e13) {
                Objects.requireNonNull(cVar.f19613b);
                cVar.e(e13);
                throw e13;
            }
        }
        throw new IllegalStateException();
    }
}
