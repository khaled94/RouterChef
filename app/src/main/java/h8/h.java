package h8;

import com.google.android.gms.ads.AdView;
import f3.d;
import f3.e;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final AdView f5158a;

    /* renamed from: b */
    public final g f5159b;

    /* renamed from: c */
    public b f5160c;

    /* renamed from: d */
    public boolean f5161d = false;

    public h(AdView adView, e eVar) {
        this.f5158a = adView;
        g gVar = new g(this);
        this.f5159b = gVar;
        adView.setAdSize(eVar);
        adView.setAdUnitId("ca-app-pub-6362221127909922/6771111346");
        adView.setAdListener(gVar);
        adView.a(new d(new d.a()));
    }
}
