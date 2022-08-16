package f8;

import com.raouf.routerchef.Landing;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SpeedTest;
import e.e;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4663s;

    /* renamed from: t */
    public final /* synthetic */ e f4664t;

    public /* synthetic */ o0(e eVar, int i10) {
        this.f4663s = i10;
        this.f4664t = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4663s) {
            case 0:
                Landing landing = (Landing) this.f4664t;
                landing.O.setVisibility(8);
                landing.M.setVisibility(0);
                landing.P.setVisibility(0);
                return;
            default:
                SpeedTest speedTest = (SpeedTest) this.f4664t;
                if (!speedTest.S || speedTest.T) {
                    return;
                }
                speedTest.O();
                b.q(speedTest, speedTest.getString(R.string.speedTestTimeout));
                return;
        }
    }
}
