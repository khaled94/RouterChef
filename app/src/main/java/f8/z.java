package f8;

import com.raouf.routerchef.Blacklist;
import com.raouf.routerchef.RouterPage;
import i8.g;
import i8.m;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4716s;

    /* renamed from: t */
    public final /* synthetic */ g f4717t;

    public /* synthetic */ z(g gVar, int i10) {
        this.f4716s = i10;
        this.f4717t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4716s) {
            case 0:
                Blacklist blacklist = (Blacklist) this.f4717t;
                blacklist.Y.setEnabled(true);
                blacklist.X.b();
                m.e(blacklist.P);
                return;
            default:
                RouterPage routerPage = (RouterPage) this.f4717t;
                routerPage.X.b();
                routerPage.f3621b0.setVisibility(8);
                routerPage.f3622c0.setVisibility(8);
                routerPage.f3620a0.setVisibility(0);
                routerPage.f3620a0.bringToFront();
                return;
        }
    }
}
