package s6;

import a7.a;
import android.util.Log;
import c5.h;
import c5.i;
import c5.l;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements h<a, Void> {

    /* renamed from: s */
    public final /* synthetic */ Executor f18284s;

    /* renamed from: t */
    public final /* synthetic */ n f18285t;

    public m(n nVar, Executor executor) {
        this.f18285t = nVar;
        this.f18284s = executor;
    }

    @Override // c5.h
    public final i<Void> a(a aVar) {
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
        } else {
            o.b(o.this);
            o.this.f18300m.f(this.f18284s);
            o.this.f18303q.d(null);
        }
        return l.e(null);
    }
}
