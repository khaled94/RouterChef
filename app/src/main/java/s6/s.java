package s6;

import c5.i;
import java.util.concurrent.Callable;
import z6.c;

/* loaded from: classes.dex */
public final class s implements Callable<i<Void>> {

    /* renamed from: a */
    public final /* synthetic */ c f18311a;

    /* renamed from: b */
    public final /* synthetic */ u f18312b;

    public s(u uVar, c cVar) {
        this.f18312b = uVar;
        this.f18311a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final i<Void> call() {
        return u.a(this.f18312b, this.f18311a);
    }
}
