package j7;

import java.io.Writer;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final /* synthetic */ e f5479a;

    public d(e eVar) {
        this.f5479a = eVar;
    }

    public final void a(Object obj, Writer writer) {
        e eVar = this.f5479a;
        f fVar = new f(writer, eVar.f5481a, eVar.f5482b, eVar.f5483c, eVar.f5484d);
        fVar.g(obj);
        fVar.i();
        fVar.f5487b.flush();
    }
}
