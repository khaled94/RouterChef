package u9;

import java.io.IOException;
import java.util.Objects;
import r9.c0;
import r9.g0;
import r9.w;
import r9.z;
import v9.f;

/* loaded from: classes.dex */
public final class a implements w {
    @Override // r9.w
    public final g0 a(w.a aVar) {
        f fVar = (f) aVar;
        c0 c0Var = fVar.f19846e;
        i iVar = fVar.f19843b;
        boolean z10 = !c0Var.f17312b.equals("GET");
        synchronized (iVar.f19671b) {
            if (iVar.f19684o) {
                throw new IllegalStateException("released");
            }
            if (iVar.f19679j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        d dVar = iVar.f19677h;
        z zVar = iVar.f19670a;
        Objects.requireNonNull(dVar);
        f fVar2 = (f) aVar;
        int i10 = fVar2.f19848g;
        int i11 = fVar2.f19849h;
        int i12 = fVar2.f19850i;
        Objects.requireNonNull(zVar);
        try {
            c cVar = new c(iVar, iVar.f19672c, iVar.f19673d, iVar.f19677h, dVar.b(i10, i11, i12, zVar.M, z10).h(zVar, aVar));
            synchronized (iVar.f19671b) {
                iVar.f19679j = cVar;
                iVar.f19680k = false;
                iVar.f19681l = false;
            }
            return fVar.b(c0Var, iVar, cVar);
        } catch (IOException e10) {
            dVar.e();
            throw new g(e10);
        } catch (g e11) {
            dVar.e();
            throw e11;
        }
    }
}
