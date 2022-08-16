package z8;

import x8.d;
import x8.f;

/* loaded from: classes.dex */
public final class b implements d<Object> {

    /* renamed from: s */
    public static final b f21058s = new b();

    @Override // x8.d
    public final void d(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // x8.d
    public final f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
