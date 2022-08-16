package g1;

import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SeparatedWifiSettings;
import e9.f;
import i8.m;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4843s;

    /* renamed from: t */
    public final /* synthetic */ Object f4844t;

    public /* synthetic */ o(Object obj, int i10) {
        this.f4843s = i10;
        this.f4844t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4843s) {
            case 0:
                t tVar = (t) this.f4844t;
                f.e(tVar, "this$0");
                tVar.f4855s.a();
                return;
            case 1:
                DnsPornBlocker dnsPornBlocker = (DnsPornBlocker) this.f4844t;
                dnsPornBlocker.X.setEnabled(true);
                dnsPornBlocker.Y.setEnabled(true);
                dnsPornBlocker.f3533c0.c(dnsPornBlocker.getString(R.string.loading));
                dnsPornBlocker.f3533c0.b();
                m.e(dnsPornBlocker.P);
                return;
            case 2:
                ((NetworkDevices) this.f4844t).U.b();
                return;
            default:
                SeparatedWifiSettings separatedWifiSettings = (SeparatedWifiSettings) this.f4844t;
                separatedWifiSettings.f3631e0.setEnabled(true);
                separatedWifiSettings.f3632f0.setEnabled(true);
                separatedWifiSettings.f3633g0.setEnabled(true);
                separatedWifiSettings.f3634h0.setEnabled(true);
                separatedWifiSettings.f3635i0.c(separatedWifiSettings.getString(R.string.loading));
                separatedWifiSettings.f3635i0.b();
                m.e(separatedWifiSettings.P);
                return;
        }
    }
}
