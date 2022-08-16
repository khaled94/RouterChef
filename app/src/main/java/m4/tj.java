package m4;

import android.content.Context;
import android.os.Binder;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class tj {
    @GuardedBy("lock")

    /* renamed from: a */
    public jj f14078a;
    @GuardedBy("lock")

    /* renamed from: b */
    public boolean f14079b;

    /* renamed from: c */
    public final Object f14080c = new Object();

    public tj(Context context) {
    }

    public static /* bridge */ /* synthetic */ void a(tj tjVar) {
        synchronized (tjVar.f14080c) {
            jj jjVar = tjVar.f14078a;
            if (jjVar == null) {
                return;
            }
            jjVar.p();
            tjVar.f14078a = null;
            Binder.flushPendingCommands();
        }
    }
}
