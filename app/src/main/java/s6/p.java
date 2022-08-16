package s6;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ long f18306a;

    /* renamed from: b */
    public final /* synthetic */ String f18307b;

    /* renamed from: c */
    public final /* synthetic */ o f18308c;

    public p(o oVar, long j3, String str) {
        this.f18308c = oVar;
        this.f18306a = j3;
        this.f18307b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        y yVar = this.f18308c.f18301n;
        if (!(yVar != null && yVar.f18340e.get())) {
            this.f18308c.f18296i.f18675c.c(this.f18306a, this.f18307b);
            return null;
        }
        return null;
    }
}
