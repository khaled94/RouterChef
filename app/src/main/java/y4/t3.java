package y4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ long f20739s;

    /* renamed from: t */
    public final /* synthetic */ f4 f20740t;

    public t3(f4 f4Var, long j3) {
        this.f20740t = f4Var;
        this.f20739s = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20740t.q(this.f20739s, true);
        ((w2) this.f20740t.f20505s).x().x(new AtomicReference<>());
    }
}
