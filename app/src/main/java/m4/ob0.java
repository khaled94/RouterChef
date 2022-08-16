package m4;

import y4.p4;

/* loaded from: classes.dex */
public final /* synthetic */ class ob0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f12078s;

    /* renamed from: t */
    public final /* synthetic */ Object f12079t;

    public /* synthetic */ ob0(Object obj, int i10) {
        this.f12078s = i10;
        this.f12079t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12078s) {
            case 0:
                oa0 oa0Var = ((sb0) this.f12079t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).e();
                return;
            case 1:
                ((k01) this.f12079t).a();
                return;
            default:
                ((p4) this.f12079t).B = null;
                return;
        }
    }
}
