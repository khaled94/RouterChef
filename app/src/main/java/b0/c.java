package b0;

import b0.f;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ f.a f2398s;

    /* renamed from: t */
    public final /* synthetic */ Object f2399t;

    public c(f.a aVar, Object obj) {
        this.f2398s = aVar;
        this.f2399t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2398s.f2411s = this.f2399t;
    }
}
