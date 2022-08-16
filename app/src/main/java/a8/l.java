package a8;

import e8.a;
import e8.c;
import java.util.ArrayList;
import java.util.Objects;
import x7.h;
import x7.u;
import x7.w;

/* loaded from: classes.dex */
public final class l extends w<Object> {

    /* renamed from: c */
    public static final k f317c = new k();

    /* renamed from: a */
    public final h f318a;

    /* renamed from: b */
    public final u f319b;

    public l(h hVar, u uVar) {
        this.f318a = hVar;
        this.f319b = uVar;
    }

    @Override // x7.w
    public final Object a(a aVar) {
        int b10 = s.h.b(aVar.x0());
        if (b10 == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.d0()) {
                arrayList.add(a(aVar));
            }
            aVar.H();
            return arrayList;
        } else if (b10 == 2) {
            z7.l lVar = new z7.l();
            aVar.c();
            while (aVar.d0()) {
                lVar.put(aVar.r0(), a(aVar));
            }
            aVar.I();
            return lVar;
        } else if (b10 == 5) {
            return aVar.v0();
        } else {
            if (b10 == 6) {
                return this.f319b.b(aVar);
            }
            if (b10 == 7) {
                return Boolean.valueOf(aVar.n0());
            }
            if (b10 != 8) {
                throw new IllegalStateException();
            }
            aVar.t0();
            return null;
        }
    }

    @Override // x7.w
    public final void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.Z();
            return;
        }
        h hVar = this.f318a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(hVar);
        w c10 = hVar.c(new d8.a(cls));
        if (!(c10 instanceof l)) {
            c10.b(cVar, obj);
            return;
        }
        cVar.j();
        cVar.I();
    }
}
