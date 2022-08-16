package da;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class u extends w<Iterable<Object>> {

    /* renamed from: a */
    public final /* synthetic */ w f4082a;

    public u(w wVar) {
        this.f4082a = wVar;
    }

    @Override // da.w
    public final void a(y yVar, @Nullable Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        for (Object obj : iterable2) {
            this.f4082a.a(yVar, obj);
        }
    }
}
