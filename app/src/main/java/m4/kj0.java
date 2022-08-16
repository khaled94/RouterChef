package m4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class kj0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10449s;

    /* renamed from: t */
    public final /* synthetic */ Object f10450t;

    /* renamed from: u */
    public final /* synthetic */ Object f10451u;

    public /* synthetic */ kj0(Object obj, Object obj2, int i10) {
        this.f10449s = i10;
        this.f10450t = obj;
        this.f10451u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10449s) {
            case 0:
                ((lj0) this.f10450t).f10873s.P0("AFMA_updateActiveView", (JSONObject) this.f10451u);
                return;
            case 1:
                ((k11) this.f10450t).f10238c.b((String) this.f10451u);
                return;
            default:
                ((kl1) this.f10450t).f10478v.f10911d.d((cn) this.f10451u);
                return;
        }
    }
}
