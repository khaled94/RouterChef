package ea;

import ca.e;
import da.f;
import e8.c;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import r9.d0;
import r9.f0;
import r9.x;
import x7.h;
import x7.w;

/* loaded from: classes.dex */
public final class b<T> implements f<T, f0> {

    /* renamed from: u */
    public static final x f4473u = x.a("application/json; charset=UTF-8");

    /* renamed from: v */
    public static final Charset f4474v = Charset.forName("UTF-8");

    /* renamed from: s */
    public final h f4475s;

    /* renamed from: t */
    public final w<T> f4476t;

    public b(h hVar, w<T> wVar) {
        this.f4475s = hVar;
        this.f4476t = wVar;
    }

    @Override // da.f
    public final f0 b(Object obj) {
        ca.f fVar = new ca.f();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new e(fVar), f4474v);
        h hVar = this.f4475s;
        Objects.requireNonNull(hVar);
        c cVar = new c(outputStreamWriter);
        cVar.y = hVar.f20082f;
        cVar.f4446x = false;
        cVar.A = false;
        this.f4476t.b(cVar, obj);
        cVar.close();
        return new d0(f4473u, fVar.n0());
    }
}
