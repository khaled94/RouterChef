package f8;

import com.raouf.routerchef.Login;
import com.raouf.routerchef.R;
import com.raouf.routerchef.WifiSettings;
import i8.g;
import i8.m;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4562s;

    /* renamed from: t */
    public final /* synthetic */ g f4563t;

    public /* synthetic */ b1(g gVar, int i10) {
        this.f4562s = i10;
        this.f4563t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.f4562s) {
            case 0:
                Login login = (Login) this.f4563t;
                if (login.f3565i0) {
                    return;
                }
                if (login.f3563g0.f5300a.getVisibility() == 8) {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
                login.P();
                b.q(login, login.getString(R.string.timeoutMsg));
                return;
            default:
                WifiSettings wifiSettings = (WifiSettings) this.f4563t;
                wifiSettings.f3648f0.setEnabled(true);
                wifiSettings.f3649g0.setEnabled(true);
                wifiSettings.f3647e0.c(wifiSettings.getString(R.string.loading));
                wifiSettings.f3647e0.b();
                m.e(wifiSettings.P);
                return;
        }
    }
}
