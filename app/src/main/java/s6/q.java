package s6;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ o f18309a;

    public q(o oVar) {
        this.f18309a = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        o.a(this.f18309a);
        return null;
    }
}
