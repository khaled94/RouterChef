package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import j0.f;
import j0.g;
import j0.m;
import j0.n;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class j extends d.c {

    /* renamed from: d */
    public static final a f1332d = new a();

    /* loaded from: classes.dex */
    public static class a {
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a */
        public final Context f1333a;

        /* renamed from: b */
        public final g f1334b;

        /* renamed from: c */
        public final a f1335c;

        /* renamed from: d */
        public final Object f1336d = new Object();

        /* renamed from: e */
        public Handler f1337e;

        /* renamed from: f */
        public Executor f1338f;

        /* renamed from: g */
        public ThreadPoolExecutor f1339g;

        /* renamed from: h */
        public d.h f1340h;

        /* renamed from: i */
        public l f1341i;

        /* renamed from: j */
        public k f1342j;

        public b(Context context, g gVar) {
            a aVar = j.f1332d;
            l0.g.e(context, "Context cannot be null");
            this.f1333a = context.getApplicationContext();
            this.f1334b = gVar;
            this.f1335c = aVar;
        }

        @Override // androidx.emoji2.text.d.g
        public final void a(d.h hVar) {
            synchronized (this.f1336d) {
                this.f1340h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1336d) {
                this.f1340h = null;
                l lVar = this.f1341i;
                if (lVar != null) {
                    a aVar = this.f1335c;
                    Context context = this.f1333a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(lVar);
                    this.f1341i = null;
                }
                Handler handler = this.f1337e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1342j);
                }
                this.f1337e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1339g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1338f = null;
                this.f1339g = null;
            }
        }

        public final void c() {
            synchronized (this.f1336d) {
                if (this.f1340h == null) {
                    return;
                }
                if (this.f1338f == null) {
                    ThreadPoolExecutor a10 = androidx.emoji2.text.b.a("emojiCompat");
                    this.f1339g = a10;
                    this.f1338f = a10;
                }
                this.f1338f.execute(new androidx.activity.d(this, 1));
            }
        }

        public final n d() {
            try {
                a aVar = this.f1335c;
                Context context = this.f1333a;
                g gVar = this.f1334b;
                Objects.requireNonNull(aVar);
                m a10 = f.a(context, gVar);
                if (a10.f5414a == 0) {
                    n[] nVarArr = a10.f5415b;
                    if (nVarArr != null && nVarArr.length != 0) {
                        return nVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder c10 = androidx.activity.result.a.c("fetchFonts failed (");
                c10.append(a10.f5414a);
                c10.append(")");
                throw new RuntimeException(c10.toString());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public j(Context context, g gVar) {
        super(new b(context, gVar));
    }
}
