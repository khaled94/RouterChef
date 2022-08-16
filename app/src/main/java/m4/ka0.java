package m4;

import l3.s;

/* loaded from: classes.dex */
public final class ka0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10310s;

    /* renamed from: t */
    public final /* synthetic */ Object f10311t;

    public /* synthetic */ ka0(Object obj, int i10) {
        this.f10310s = i10;
        this.f10311t = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<m4.lc0>, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10310s) {
            case 0:
                oa0 oa0Var = ((na0) this.f10311t).H;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).e();
                ((ta0) ((na0) this.f10311t).H).h();
                return;
            default:
                s.B.f5810z.f11146s.remove((lc0) this.f10311t);
                return;
        }
    }
}
