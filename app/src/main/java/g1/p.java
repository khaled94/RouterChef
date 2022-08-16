package g1;

import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.NewWifiSettings;
import com.raouf.routerchef.R;
import e9.f;
import f8.g;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4845s;

    /* renamed from: t */
    public final /* synthetic */ Object f4846t;

    public /* synthetic */ p(Object obj, int i10) {
        this.f4845s = i10;
        this.f4846t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4845s) {
            case 0:
                t tVar = (t) this.f4846t;
                f.e(tVar, "this$0");
                tVar.f4855s.a();
                return;
            case 1:
                AccessBlocker accessBlocker = (AccessBlocker) this.f4846t;
                int i10 = AccessBlocker.f3489k0;
                b.q(accessBlocker, accessBlocker.getString(R.string.noConnectedDevices));
                accessBlocker.f3492c0.clear();
                accessBlocker.O.post(new g(accessBlocker, accessBlocker.f3492c0, 0));
                accessBlocker.f3493d0.setVisibility(8);
                accessBlocker.f3496g0.setVisibility(0);
                return;
            default:
                ((NewWifiSettings) this.f4846t).f3587k0.b();
                return;
        }
    }
}
