package b9;

import e9.f;

/* loaded from: classes.dex */
public class a extends a9.a {
    @Override // a9.a
    public final void a(Throwable th, Throwable th2) {
        f.e(th, "cause");
        f.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
