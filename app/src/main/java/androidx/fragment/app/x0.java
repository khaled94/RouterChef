package androidx.fragment.app;

import androidx.fragment.app.z0;

/* loaded from: classes.dex */
public final class x0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ z0.a f1601s;

    /* renamed from: t */
    public final /* synthetic */ z0 f1602t;

    public x0(z0 z0Var, z0.a aVar) {
        this.f1602t = z0Var;
        this.f1601s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1602t.f1613b.contains(this.f1601s)) {
            z0.a aVar = this.f1601s;
            c1.a(aVar.f1618a, aVar.f1620c.W);
        }
    }
}
