package u2;

import android.content.Context;
import u8.a;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a */
    public final a<Context> f19073a;

    /* renamed from: b */
    public final a<j> f19074b;

    public m(a<Context> aVar, a<j> aVar2) {
        this.f19073a = aVar;
        this.f19074b = aVar2;
    }

    @Override // u8.a
    public final Object get() {
        return new l(this.f19073a.get(), this.f19074b.get());
    }
}
