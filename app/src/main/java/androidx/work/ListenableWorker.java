package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import d2.o;
import d2.p;
import d2.q;
import e2.c;
import f2.b;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import t1.d;
import t1.m;
import t1.r;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: s */
    public Context f2273s;

    /* renamed from: t */
    public WorkerParameters f2274t;

    /* renamed from: u */
    public volatile boolean f2275u;

    /* renamed from: v */
    public boolean f2276v;

    /* renamed from: w */
    public boolean f2277w;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: classes.dex */
        public static final class C0026a extends a {

            /* renamed from: a */
            public final androidx.work.b f2278a = androidx.work.b.f2305c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0026a.class == obj.getClass()) {
                    return this.f2278a.equals(((C0026a) obj).f2278a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f2278a.hashCode() + (C0026a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder c10 = androidx.activity.result.a.c("Failure {mOutputData=");
                c10.append(this.f2278a);
                c10.append('}');
                return c10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a */
            public final androidx.work.b f2279a;

            public c() {
                this.f2279a = androidx.work.b.f2305c;
            }

            public c(androidx.work.b bVar) {
                this.f2279a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f2279a.equals(((c) obj).f2279a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f2279a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder c10 = androidx.activity.result.a.c("Success {mOutputData=");
                c10.append(this.f2279a);
                c10.append('}');
                return c10.toString();
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters == null) {
                throw new IllegalArgumentException("WorkerParameters is null");
            }
            this.f2273s = context;
            this.f2274t = workerParameters;
            return;
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.f2273s;
    }

    public Executor getBackgroundExecutor() {
        return this.f2274t.f2288f;
    }

    public g6.a<d> getForegroundInfoAsync() {
        c cVar = new c();
        cVar.l(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID getId() {
        return this.f2274t.f2283a;
    }

    public final b getInputData() {
        return this.f2274t.f2284b;
    }

    public final Network getNetwork() {
        return this.f2274t.f2286d.f2295c;
    }

    public final int getRunAttemptCount() {
        return this.f2274t.f2287e;
    }

    public final Set<String> getTags() {
        return this.f2274t.f2285c;
    }

    public f2.a getTaskExecutor() {
        return this.f2274t.f2289g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f2274t.f2286d.f2293a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f2274t.f2286d.f2294b;
    }

    public r getWorkerFactory() {
        return this.f2274t.f2290h;
    }

    public boolean isRunInForeground() {
        return this.f2277w;
    }

    public final boolean isStopped() {
        return this.f2275u;
    }

    public final boolean isUsed() {
        return this.f2276v;
    }

    public void onStopped() {
    }

    public final g6.a<Void> setForegroundAsync(d dVar) {
        this.f2277w = true;
        return ((o) this.f2274t.f2292j).a(getApplicationContext(), getId(), dVar);
    }

    public g6.a<Void> setProgressAsync(b bVar) {
        m mVar = this.f2274t.f2291i;
        getApplicationContext();
        UUID id = getId();
        q qVar = (q) mVar;
        Objects.requireNonNull(qVar);
        c cVar = new c();
        ((b) qVar.f3788b).a(new p(qVar, id, bVar, cVar));
        return cVar;
    }

    public void setRunInForeground(boolean z10) {
        this.f2277w = z10;
    }

    public final void setUsed() {
        this.f2276v = true;
    }

    public abstract g6.a<a> startWork();

    public final void stop() {
        this.f2275u = true;
        onStopped();
    }
}
