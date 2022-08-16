package s6;

import c5.a;
import c5.i;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements a<Void, Object> {

    /* renamed from: s */
    public final /* synthetic */ Callable f18260s;

    public g(Callable callable) {
        this.f18260s = callable;
    }

    @Override // c5.a
    public final Object d(i<Void> iVar) {
        return this.f18260s.call();
    }
}
