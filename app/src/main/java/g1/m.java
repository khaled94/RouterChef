package g1;

import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import g1.n;
import java.util.Arrays;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4820s;

    /* renamed from: t */
    public final /* synthetic */ Object f4821t;

    public /* synthetic */ m(Object obj, int i10) {
        this.f4820s = i10;
        this.f4821t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4820s) {
            case 0:
                n nVar = (n) this.f4821t;
                synchronized (nVar) {
                    nVar.f4828f = false;
                    n.b bVar = nVar.f4830h;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f4836b, false);
                        bVar.f4838d = true;
                    }
                }
                return;
            case 1:
                DnsPornBlocker dnsPornBlocker = (DnsPornBlocker) this.f4821t;
                int i10 = DnsPornBlocker.f3530i0;
                dnsPornBlocker.P();
                b.q(dnsPornBlocker, dnsPornBlocker.getString(R.string.dnsNotSupportedDesc));
                return;
            default:
                NetworkDevices networkDevices = (NetworkDevices) this.f4821t;
                b.q(networkDevices.R, networkDevices.getString(R.string.macsNotSupported));
                return;
        }
    }
}
