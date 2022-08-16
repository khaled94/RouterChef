package s6;

import a7.a;
import android.util.Log;
import c5.h;
import c5.i;
import c5.l;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements h<a, Void> {

    /* renamed from: s */
    public final /* synthetic */ Executor f18273s;

    /* renamed from: t */
    public final /* synthetic */ l f18274t;

    public k(l lVar, Executor executor) {
        this.f18274t = lVar;
        this.f18273s = executor;
    }

    @Override // c5.h
    public final i<Void> a(a aVar) {
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return l.e(null);
        }
        return l.f(Arrays.asList(o.b(this.f18274t.f18282e), this.f18274t.f18282e.f18300m.f(this.f18273s)));
    }
}
