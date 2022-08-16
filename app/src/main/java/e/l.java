package e;

import android.view.View;
import java.util.WeakHashMap;
import m0.f0;
import m0.h0;
import m0.z;

/* loaded from: classes.dex */
public final class l extends h0 {

    /* renamed from: t */
    public final /* synthetic */ h f4242t;

    public l(h hVar) {
        this.f4242t = hVar;
    }

    @Override // m0.g0
    public final void a() {
        this.f4242t.G.setAlpha(1.0f);
        this.f4242t.J.d(null);
        this.f4242t.J = null;
    }

    @Override // m0.h0, m0.g0
    public final void d() {
        this.f4242t.G.setVisibility(0);
        if (this.f4242t.G.getParent() instanceof View) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c((View) this.f4242t.G.getParent());
        }
    }
}
