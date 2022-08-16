package o2;

import com.google.ads.mediation.AbstractAdViewAdapter;
import f3.h;
import m4.b20;
import o3.a;
import o3.b;
import p3.j;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: a */
    public final AbstractAdViewAdapter f16752a;

    /* renamed from: b */
    public final j f16753b;

    public i(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.f16752a = abstractAdViewAdapter;
        this.f16753b = jVar;
    }

    @Override // o3.b
    public final void a(h hVar) {
        ((b20) this.f16753b).d(hVar);
    }

    @Override // o3.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        a aVar = (a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f16752a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.b(new j(abstractAdViewAdapter, this.f16753b));
        ((b20) this.f16753b).f();
    }
}
