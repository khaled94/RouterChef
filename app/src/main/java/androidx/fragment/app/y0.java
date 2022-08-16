package androidx.fragment.app;

import androidx.fragment.app.z0;

/* loaded from: classes.dex */
public final class y0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ z0.a f1607s;

    /* renamed from: t */
    public final /* synthetic */ z0 f1608t;

    public y0(z0 z0Var, z0.a aVar) {
        this.f1608t = z0Var;
        this.f1607s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1608t.f1613b.remove(this.f1607s);
        this.f1608t.f1614c.remove(this.f1607s);
    }
}
