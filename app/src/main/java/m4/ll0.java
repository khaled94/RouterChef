package m4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class ll0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f10907s;

    public /* synthetic */ ll0(AtomicReference atomicReference) {
        this.f10907s = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ml0.j(this.f10907s);
    }
}
