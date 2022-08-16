package m4;

import n3.j0;

/* loaded from: classes.dex */
public final class r8 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f13190s;

    /* renamed from: t */
    public final /* synthetic */ Object f13191t;

    public /* synthetic */ r8(Object obj, int i10) {
        this.f13190s = i10;
        this.f13191t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13190s) {
            case 0:
                ((t8) this.f13191t).e();
                return;
            case 1:
                return;
            default:
                ((e41) this.f13191t).a();
                return;
        }
    }

    public r8(j0 j0Var) {
        this.f13190s = 1;
        this.f13191t = j0Var;
    }
}
