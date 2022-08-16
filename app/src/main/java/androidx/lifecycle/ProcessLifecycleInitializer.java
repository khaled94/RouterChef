package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n1.b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b<l> {
    @Override // n1.b
    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // n1.b
    public final l b(Context context) {
        if (!i.f1699a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new i.a());
        }
        u uVar = u.A;
        Objects.requireNonNull(uVar);
        uVar.f1720w = new Handler();
        uVar.f1721x.f(g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new v(uVar));
        return uVar;
    }
}
