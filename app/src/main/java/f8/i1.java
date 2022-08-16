package f8;

import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import com.raouf.routerchef.RouterPage;
import e.e;

/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4620s;

    /* renamed from: t */
    public final /* synthetic */ e f4621t;

    public /* synthetic */ i1(e eVar, int i10) {
        this.f4620s = i10;
        this.f4621t = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4620s) {
            case 0:
                NetworkDevices networkDevices = (NetworkDevices) this.f4621t;
                networkDevices.Q.setVisibility(8);
                networkDevices.N.setEnabled(true);
                networkDevices.N.setText(networkDevices.getString(R.string.scanAgain));
                return;
            default:
                RouterPage routerPage = (RouterPage) this.f4621t;
                routerPage.Z.setEnabled(true);
                routerPage.X.b();
                return;
        }
    }
}
