package f8;

import com.raouf.routerchef.AccessControl;
import com.raouf.routerchef.PersonalizedSpeedLimit;
import i8.g;
import i8.m;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4637s;

    /* renamed from: t */
    public final /* synthetic */ g f4638t;

    public /* synthetic */ l(g gVar, int i10) {
        this.f4637s = i10;
        this.f4638t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4637s) {
            case 0:
                ((AccessControl) this.f4638t).f3503c0.b();
                return;
            default:
                PersonalizedSpeedLimit personalizedSpeedLimit = (PersonalizedSpeedLimit) this.f4638t;
                personalizedSpeedLimit.f3598c0.setEnabled(true);
                personalizedSpeedLimit.f3599d0.setEnabled(true);
                personalizedSpeedLimit.f3597b0.b();
                m.e(personalizedSpeedLimit.P);
                return;
        }
    }
}
