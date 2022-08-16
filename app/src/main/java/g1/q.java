package g1;

import a3.u;
import com.google.android.gms.ads.AdView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.Landing;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SpeedTest;
import e9.f;
import k8.a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4847s;

    /* renamed from: t */
    public final /* synthetic */ Object f4848t;

    public /* synthetic */ q(Object obj, int i10) {
        this.f4847s = i10;
        this.f4848t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4847s) {
            case 0:
                t tVar = (t) this.f4848t;
                f.e(tVar, "this$0");
                tVar.f4855s.a();
                return;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f4848t;
                if (!firebaseMessaging.f3471g.b()) {
                    return;
                }
                firebaseMessaging.g();
                return;
            case 2:
                AccessBlocker accessBlocker = (AccessBlocker) this.f4848t;
                accessBlocker.Y.setEnabled(false);
                accessBlocker.X.d();
                return;
            case 3:
                Landing landing = (Landing) this.f4848t;
                landing.O.setVisibility(0);
                landing.M.setVisibility(8);
                landing.P.setVisibility(8);
                return;
            case 4:
                SpeedTest speedTest = (SpeedTest) this.f4848t;
                speedTest.Q.post(new u(speedTest, 2));
                a.a(speedTest.R);
                speedTest.S = false;
                speedTest.T = false;
                speedTest.N.setText(speedTest.getString(R.string.startTest));
                speedTest.P.setVisibility(8);
                return;
            default:
                ((AdView) this.f4848t).setVisibility(8);
                return;
        }
    }
}
