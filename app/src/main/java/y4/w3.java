package y4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f20793s;

    /* renamed from: t */
    public final /* synthetic */ String f20794t;

    /* renamed from: u */
    public final /* synthetic */ String f20795u;

    /* renamed from: v */
    public final /* synthetic */ boolean f20796v;

    /* renamed from: w */
    public final /* synthetic */ f4 f20797w;

    public w3(f4 f4Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f20797w = f4Var;
        this.f20793s = atomicReference;
        this.f20794t = str;
        this.f20795u = str2;
        this.f20796v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 x10 = ((w2) this.f20797w.f20505s).x();
        AtomicReference atomicReference = this.f20793s;
        String str = this.f20794t;
        String str2 = this.f20795u;
        boolean z10 = this.f20796v;
        x10.g();
        x10.h();
        x10.s(new c5(x10, atomicReference, str, str2, x10.p(false), z10));
    }
}
