package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.a;
import androidx.fragment.app.e;
import androidx.fragment.app.z0;
import i0.c;

/* loaded from: classes.dex */
public final class i implements c.a {

    /* renamed from: a */
    public final /* synthetic */ View f1441a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f1442b;

    /* renamed from: c */
    public final /* synthetic */ e.b f1443c;

    /* renamed from: d */
    public final /* synthetic */ z0.b f1444d;

    public i(View view, ViewGroup viewGroup, e.b bVar, z0.b bVar2) {
        this.f1441a = view;
        this.f1442b = viewGroup;
        this.f1443c = bVar;
        this.f1444d = bVar2;
    }

    @Override // i0.c.a
    public final void a() {
        this.f1441a.clearAnimation();
        this.f1442b.endViewTransition(this.f1441a);
        this.f1443c.a();
        if (g0.K(2)) {
            StringBuilder c10 = a.c("Animation from operation ");
            c10.append(this.f1444d);
            c10.append(" has been cancelled.");
            Log.v("FragmentManager", c10.toString());
        }
    }
}
