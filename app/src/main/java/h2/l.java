package h2;

import m4.h41;
import t4.b;
import t4.r;
import t4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f5006s;

    /* renamed from: t */
    public final /* synthetic */ Object f5007t;

    public /* synthetic */ l(Object obj, int i10) {
        this.f5006s = i10;
        this.f5007t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5006s) {
            case 0:
                f fVar = t.f5037l;
                r rVar = t.f18662t;
                ((g) this.f5007t).b(fVar, b.f18636w);
                return;
            default:
                ((h41) this.f5007t).a();
                return;
        }
    }
}
