package y4;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import y4.i5;

/* loaded from: classes.dex */
public final class j5<T extends Context & i5> {

    /* renamed from: a */
    public final T f20520a;

    public j5(T t10) {
        Objects.requireNonNull(t10, "null reference");
        this.f20520a = t10;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f20710x.a("onRebind called with null intent");
            return;
        }
        c().F.b("onRebind called. action", intent.getAction());
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().f20710x.a("onUnbind called with null intent");
            return;
        }
        c().F.b("onUnbind called for intent. action", intent.getAction());
    }

    public final s1 c() {
        return w2.t(this.f20520a, null, null).C();
    }
}
