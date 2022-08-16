package j0;

import c4.a;
import d0.g;
import e0.f;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ a f5380s;

    /* renamed from: t */
    public final /* synthetic */ int f5381t;

    public b(a aVar, int i10) {
        this.f5380s = aVar;
        this.f5381t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f5380s;
        int i10 = this.f5381t;
        g.e eVar = ((f.a) aVar).f4320u;
        if (eVar != null) {
            eVar.d(i10);
        }
    }
}
