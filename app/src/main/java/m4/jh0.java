package m4;

/* loaded from: classes.dex */
public final class jh0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10064a;

    /* renamed from: b */
    public final Object f10065b;

    public /* synthetic */ jh0(Object obj, int i10) {
        this.f10064a = i10;
        this.f10065b = obj;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        switch (this.f10064a) {
            case 0:
                return new q40();
            default:
                return ((mo0) ((vd2) this.f10065b)).b().f12214o.f12816a == 3 ? "rewarded_interstitial" : "rewarded";
        }
    }
}
