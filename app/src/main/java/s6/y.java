package s6;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import z6.c;

/* loaded from: classes.dex */
public final class y implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final a f18336a;

    /* renamed from: b */
    public final c f18337b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f18338c;

    /* renamed from: d */
    public final p6.a f18339d;

    /* renamed from: e */
    public final AtomicBoolean f18340e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public interface a {
    }

    public y(a aVar, c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, p6.a aVar2) {
        this.f18336a = aVar;
        this.f18337b = cVar;
        this.f18338c = uncaughtExceptionHandler;
        this.f18339d = aVar2;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        } else {
            boolean z10 = true;
            if (!this.f18339d.c()) {
                return true;
            }
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r3 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r3 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        r8.f18338c.uncaughtException(r9, r10);
        r8.f18340e.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        return;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r9, java.lang.Throwable r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r1 = "FirebaseCrashlytics"
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f18340e
            r3 = 1
            r2.set(r3)
            r2 = 0
            r4 = 3
            r5 = 0
            boolean r6 = r8.a(r9, r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r6 == 0) goto L21
            s6.y$a r6 = r8.f18336a     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            z6.c r7 = r8.f18337b     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            s6.j r6 = (s6.j) r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            r6.a(r7, r9, r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            goto L31
        L1d:
            r6 = move-exception
            goto L59
        L1f:
            r6 = move-exception
            goto L3c
        L21:
            java.lang.String r6 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r7 = android.util.Log.isLoggable(r1, r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r7 == 0) goto L2b
            r7 = r3
            goto L2c
        L2b:
            r7 = r5
        L2c:
            if (r7 == 0) goto L31
            android.util.Log.d(r1, r6, r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
        L31:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L38
            goto L39
        L38:
            r3 = r5
        L39:
            if (r3 == 0) goto L4e
            goto L4b
        L3c:
            java.lang.String r7 = "An error occurred in the uncaught exception handler"
            android.util.Log.e(r1, r7, r6)     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = r5
        L49:
            if (r3 == 0) goto L4e
        L4b:
            android.util.Log.d(r1, r0, r2)
        L4e:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f18338c
            r0.uncaughtException(r9, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f18340e
            r9.set(r5)
            return
        L59:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L60
            goto L61
        L60:
            r3 = r5
        L61:
            if (r3 == 0) goto L66
            android.util.Log.d(r1, r0, r2)
        L66:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f18338c
            r0.uncaughtException(r9, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f18340e
            r9.set(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.y.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
