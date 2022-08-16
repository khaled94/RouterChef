package f8;

import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import e.e;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4604s;

    /* renamed from: t */
    public final /* synthetic */ e f4605t;

    public /* synthetic */ g0(e eVar, int i10) {
        this.f4604s = i10;
        this.f4605t = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4604s) {
            case 0:
                DnsPornBlocker dnsPornBlocker = (DnsPornBlocker) this.f4605t;
                dnsPornBlocker.O.post(new i0(dnsPornBlocker, dnsPornBlocker.getString(R.string.pingValue, b.e(dnsPornBlocker.f3538h0)), 0));
                return;
            default:
                ((NetworkDevices) this.f4605t).U.b();
                return;
        }
    }
}
