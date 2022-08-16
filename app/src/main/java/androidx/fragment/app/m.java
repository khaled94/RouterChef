package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.a;
import androidx.fragment.app.e;
import androidx.fragment.app.z0;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ e.d f1473s;

    /* renamed from: t */
    public final /* synthetic */ z0.b f1474t;

    public m(e.d dVar, z0.b bVar) {
        this.f1473s = dVar;
        this.f1474t = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1473s.a();
        if (g0.K(2)) {
            StringBuilder c10 = a.c("Transition for operation ");
            c10.append(this.f1474t);
            c10.append("has completed");
            Log.v("FragmentManager", c10.toString());
        }
    }
}
