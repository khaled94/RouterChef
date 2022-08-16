package f8;

import com.raouf.routerchef.Blacklist;
import com.raouf.routerchef.MacBlocker;
import com.raouf.routerchef.RouterDevices;
import i8.g;
import i8.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4553s;

    /* renamed from: t */
    public final /* synthetic */ g f4554t;

    public /* synthetic */ a0(g gVar, int i10) {
        this.f4553s = i10;
        this.f4554t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4553s) {
            case 0:
                Blacklist blacklist = (Blacklist) this.f4554t;
                blacklist.Y.setEnabled(false);
                blacklist.X.d();
                return;
            case 1:
                MacBlocker macBlocker = (MacBlocker) this.f4554t;
                macBlocker.Y.setEnabled(false);
                macBlocker.X.d();
                return;
            default:
                RouterDevices routerDevices = (RouterDevices) this.f4554t;
                routerDevices.Y.setEnabled(true);
                routerDevices.X.b();
                m.e(routerDevices.P);
                return;
        }
    }
}
