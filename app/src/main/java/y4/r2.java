package y4;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class r2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f20688a;

    /* renamed from: b */
    public final /* synthetic */ u2 f20689b;

    public r2(u2 u2Var, String str) {
        this.f20689b = u2Var;
        this.f20688a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        ((w2) this.f20689b.f20505s).C().f20710x.b(this.f20688a, th);
    }
}
