package j0;

import android.os.Handler;
import c4.a;
import j0.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final a f5382a;

    /* renamed from: b */
    public final Handler f5383b;

    public c(a aVar, Handler handler) {
        this.f5382a = aVar;
        this.f5383b = handler;
    }

    public final void a(l.a aVar) {
        int i10 = aVar.f5413b;
        if (!(i10 == 0)) {
            this.f5383b.post(new b(this.f5382a, i10));
            return;
        }
        this.f5383b.post(new a(this.f5382a, aVar.f5412a));
    }
}
