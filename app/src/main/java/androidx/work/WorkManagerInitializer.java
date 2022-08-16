package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import n1.b;
import t1.h;
import t1.o;
import u1.k;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b<o> {

    /* renamed from: a */
    public static final String f2280a = h.e("WrkMgrInitializer");

    @Override // n1.b
    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // n1.b
    public final o b(Context context) {
        h.c().a(f2280a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        k.d(context, new a(new a.C0027a()));
        return k.c(context);
    }
}
