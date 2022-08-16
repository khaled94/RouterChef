package da;

import d9.l;
import e9.g;
import v8.h;

/* loaded from: classes.dex */
public final class n extends g implements l<Throwable, h> {

    /* renamed from: t */
    public final /* synthetic */ b f4056t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(1);
        this.f4056t = bVar;
    }

    @Override // d9.l
    public final h c(Throwable th) {
        this.f4056t.cancel();
        return h.f19835a;
    }
}
