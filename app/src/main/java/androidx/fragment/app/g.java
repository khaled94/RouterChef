package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.activity.result.a;
import androidx.fragment.app.z0;
import i0.c;

/* loaded from: classes.dex */
public final class g implements c.a {

    /* renamed from: a */
    public final /* synthetic */ Animator f1397a;

    /* renamed from: b */
    public final /* synthetic */ z0.b f1398b;

    public g(Animator animator, z0.b bVar) {
        this.f1397a = animator;
        this.f1398b = bVar;
    }

    @Override // i0.c.a
    public final void a() {
        this.f1397a.end();
        if (g0.K(2)) {
            StringBuilder c10 = a.c("Animator from operation ");
            c10.append(this.f1398b);
            c10.append(" has been canceled.");
            Log.v("FragmentManager", c10.toString());
        }
    }
}
