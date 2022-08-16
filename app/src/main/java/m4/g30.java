package m4;

import com.google.android.gms.internal.ads.zzcaf;
import m3.p;
import n3.g1;

/* loaded from: classes.dex */
public final class g30 implements p {

    /* renamed from: s */
    public final /* synthetic */ zzcaf f8725s;

    public g30(zzcaf zzcafVar) {
        this.f8725s = zzcafVar;
    }

    @Override // m3.p
    public final void J3() {
        g1.e("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // m3.p
    public final void Z1() {
        g1.e("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // m3.p
    public final void a() {
        g1.e("Opening AdMobCustomTabsAdapter overlay.");
        ((b20) this.f8725s.f2962b).g();
    }

    @Override // m3.p
    public final void b() {
    }

    @Override // m3.p
    public final void v2() {
        g1.e("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // m3.p
    public final void w(int i10) {
        g1.e("AdMobCustomTabsAdapter overlay is closed.");
        ((b20) this.f8725s.f2962b).a();
    }
}
