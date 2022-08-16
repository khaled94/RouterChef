package k9;

import i0.b;
import i9.c;
import i9.e;
import j0.d;
import java.lang.Thread;
import java.util.List;
import x8.f;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public static final List<r> f5683a = c.w(e.v(b.b()));

    public static final void a(f fVar, Throwable th) {
        Throwable th2;
        for (r rVar : f5683a) {
            try {
                rVar.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    d.a(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            d.a(th, new y(fVar));
        } catch (Throwable th4) {
            d.b.a(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
