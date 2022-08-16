package o6;

import c5.j;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import s6.k0;
import s6.l0;
import s6.s;
import s6.u;
import z6.b;

/* loaded from: classes.dex */
public final class g implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ boolean f16785a;

    /* renamed from: b */
    public final /* synthetic */ u f16786b;

    /* renamed from: c */
    public final /* synthetic */ b f16787c;

    public g(boolean z10, u uVar, b bVar) {
        this.f16785a = z10;
        this.f16786b = uVar;
        this.f16787c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (this.f16785a) {
            u uVar = this.f16786b;
            b bVar = this.f16787c;
            ExecutorService executorService = uVar.f18324j;
            s sVar = new s(uVar, bVar);
            ExecutorService executorService2 = l0.f18283a;
            executorService.execute(new k0(sVar, new j()));
            return null;
        }
        return null;
    }
}
