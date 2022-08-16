package c4;

import b4.a;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ v f2740s;

    public u(v vVar) {
        this.f2740s = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.e eVar = this.f2740s.f2742a.f2745t;
        eVar.d(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
