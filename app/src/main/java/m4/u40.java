package m4;

import java.lang.Thread;
import n3.g1;

/* loaded from: classes.dex */
public final class u40 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f14250a;

    /* renamed from: b */
    public final /* synthetic */ v40 f14251b;

    public u40(v40 v40Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f14251b = v40Var;
        this.f14250a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f14251b.e(th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14250a;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f14250a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            g1.g("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f14250a;
            if (uncaughtExceptionHandler3 == null) {
                return;
            }
            uncaughtExceptionHandler3.uncaughtException(thread, th);
        }
    }
}
