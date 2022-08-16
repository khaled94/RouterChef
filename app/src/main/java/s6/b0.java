package s6;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b0 extends c {

    /* renamed from: s */
    public final /* synthetic */ String f18233s;

    /* renamed from: t */
    public final /* synthetic */ ExecutorService f18234t;

    /* renamed from: u */
    public final /* synthetic */ long f18235u = 2;

    /* renamed from: v */
    public final /* synthetic */ TimeUnit f18236v;

    public b0(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f18233s = str;
        this.f18234t = executorService;
        this.f18236v = timeUnit;
    }

    @Override // s6.c
    public final void a() {
        boolean z10 = false;
        try {
            String str = "Executing shutdown hook for " + this.f18233s;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            this.f18234t.shutdown();
            if (this.f18234t.awaitTermination(this.f18235u, this.f18236v)) {
                return;
            }
            String str2 = this.f18233s + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            this.f18234t.shutdownNow();
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f18233s);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", format, null);
            }
            this.f18234t.shutdownNow();
        }
    }
}
