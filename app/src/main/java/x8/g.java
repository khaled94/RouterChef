package x8;

import d9.p;
import java.io.Serializable;
import x8.f;

/* loaded from: classes.dex */
public final class g implements f, Serializable {

    /* renamed from: s */
    public static final g f20104s = new g();

    @Override // x8.f
    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return r10;
    }

    @Override // x8.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        e9.f.e(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // x8.f
    public final f minusKey(f.c<?> cVar) {
        e9.f.e(cVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
