package y4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f20772s;

    /* renamed from: t */
    public final /* synthetic */ String f20773t;

    /* renamed from: u */
    public final /* synthetic */ String f20774u;

    /* renamed from: v */
    public final /* synthetic */ f4 f20775v;

    public v3(f4 f4Var, AtomicReference atomicReference, String str, String str2) {
        this.f20775v = f4Var;
        this.f20772s = atomicReference;
        this.f20773t = str;
        this.f20774u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 x10 = ((w2) this.f20775v.f20505s).x();
        AtomicReference atomicReference = this.f20772s;
        String str = this.f20773t;
        String str2 = this.f20774u;
        x10.g();
        x10.h();
        x10.s(new a5(x10, atomicReference, str, str2, x10.p(false)));
    }
}
