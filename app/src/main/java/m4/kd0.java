package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class kd0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10359s;

    /* renamed from: t */
    public final /* synthetic */ Object f10360t;

    /* renamed from: u */
    public final /* synthetic */ Object f10361u;

    public /* synthetic */ kd0(Object obj, Object obj2, int i10) {
        this.f10359s = i10;
        this.f10360t = obj;
        this.f10361u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10359s) {
            case 0:
                int i10 = ld0.N;
                ((fb0) this.f10360t).a("onGcacheInfoEvent", (Map) this.f10361u);
                return;
            default:
                fo2 fo2Var = ((eo2) this.f10360t).f8030b;
                int i11 = ls1.f10971a;
                fo2Var.a((sg0) this.f10361u);
                return;
        }
    }
}
