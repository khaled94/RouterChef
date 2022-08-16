package o6;

import android.util.Log;
import e9.d;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n6.y;
import o7.a;
import q6.a;
import r6.b;
import r6.c;
import s4.h6;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public volatile a f16779a;

    /* renamed from: b */
    public volatile b f16780b;

    /* renamed from: c */
    public final List<r6.a> f16781c = new ArrayList();

    public d(o7.a<j6.a> aVar) {
        c cVar = new c();
        l4.b bVar = new l4.b();
        this.f16780b = cVar;
        this.f16779a = bVar;
        ((y) aVar).a(new a.AbstractC0098a() { // from class: o6.a
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<r6.a>, java.util.ArrayList] */
            @Override // o7.a.AbstractC0098a
            public final void b(o7.b bVar2) {
                d dVar = d.this;
                Objects.requireNonNull(dVar);
                d dVar2 = d.f4460v;
                dVar2.d("AnalyticsConnector now available.");
                j6.a aVar2 = (j6.a) bVar2.get();
                u1.a aVar3 = new u1.a(aVar2);
                e eVar = new e();
                a.AbstractC0079a a10 = aVar2.a("clx", eVar);
                if (a10 == null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
                    }
                    a10 = aVar2.a("crash", eVar);
                    if (a10 != null) {
                        Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
                    }
                }
                if (a10 != null) {
                    dVar2.d("Registered Firebase Analytics listener.");
                    h6 h6Var = new h6(1);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    q6.c cVar2 = new q6.c(aVar3);
                    synchronized (dVar) {
                        Iterator it = dVar.f16781c.iterator();
                        while (it.hasNext()) {
                            h6Var.a((r6.a) it.next());
                        }
                        eVar.f16783b = h6Var;
                        eVar.f16782a = cVar2;
                        dVar.f16780b = h6Var;
                        dVar.f16779a = cVar2;
                    }
                    return;
                }
                dVar2.n("Could not register Firebase Analytics listener; a listener is already registered.", null);
            }
        });
    }
}
