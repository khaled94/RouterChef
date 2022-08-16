package m4;

import java.lang.Thread;
import n3.g1;

/* loaded from: classes.dex */
public final class t40 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f13922a;

    /* renamed from: b */
    public final /* synthetic */ v40 f13923b;

    public t40(v40 v40Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13923b = v40Var;
        this.f13922a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f13923b.e(th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13922a;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f13922a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            g1.g("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f13922a;
            if (uncaughtExceptionHandler3 == null) {
                return;
            }
            uncaughtExceptionHandler3.uncaughtException(thread, th);
        }
    }
}
