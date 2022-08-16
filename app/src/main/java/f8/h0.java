package f8;

import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.DnsInfo;
import e.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4611s;

    /* renamed from: t */
    public final /* synthetic */ e f4612t;

    /* renamed from: u */
    public final /* synthetic */ Object f4613u;

    public /* synthetic */ h0(e eVar, Object obj, int i10) {
        this.f4611s = i10;
        this.f4612t = eVar;
        this.f4613u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f4611s) {
            case 0:
                DnsPornBlocker dnsPornBlocker = (DnsPornBlocker) this.f4612t;
                DnsInfo dnsInfo = (DnsInfo) this.f4613u;
                int i10 = DnsPornBlocker.f3530i0;
                Objects.requireNonNull(dnsPornBlocker);
                if (!Boolean.parseBoolean(dnsInfo.ispDns)) {
                    DnsPornBlocker.a aVar = dnsPornBlocker.f3535e0;
                    ArrayList arrayList = new ArrayList(Arrays.asList(dnsInfo.dns1, dnsInfo.dns2));
                    Iterator<Map.Entry<String, ArrayList<String>>> it = aVar.f4896v.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<String, ArrayList<String>> next = it.next();
                            if (arrayList.equals(next.getValue())) {
                                str = next.getKey();
                            }
                        } else {
                            str = null;
                        }
                    }
                    String str2 = str;
                    if (str2 != null) {
                        aVar.f4893s.setSelection(aVar.f4895u.getPosition(str2));
                    } else {
                        aVar.f4893s.setSelection(0);
                    }
                    dnsPornBlocker.Z.setText(dnsInfo.dns1);
                    dnsPornBlocker.f3531a0.setText(dnsInfo.dns2);
                    return;
                }
                DnsPornBlocker.a aVar2 = dnsPornBlocker.f3535e0;
                aVar2.f4893s.setSelection(aVar2.f4895u.getPosition(aVar2.f4894t.getString(R.string.ispDns)));
                return;
            default:
                b.q(((NetworkDevices) this.f4612t).R, (String) this.f4613u);
                return;
        }
    }
}
