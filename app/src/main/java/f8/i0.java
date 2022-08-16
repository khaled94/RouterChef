package f8;

import android.widget.TextView;
import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import e.e;
import j8.c;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4617s;

    /* renamed from: t */
    public final /* synthetic */ String f4618t;

    /* renamed from: u */
    public final /* synthetic */ e f4619u;

    public /* synthetic */ i0(e eVar, String str, int i10) {
        this.f4617s = i10;
        this.f4619u = eVar;
        this.f4618t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        int i10;
        int i11;
        switch (this.f4617s) {
            case 0:
                DnsPornBlocker dnsPornBlocker = (DnsPornBlocker) this.f4619u;
                String str = this.f4618t;
                dnsPornBlocker.f3534d0.setText(str);
                if (dnsPornBlocker.f3534d0.getCurrentTextColor() == dnsPornBlocker.getColor(R.color.pingPrimary)) {
                    textView = dnsPornBlocker.f3534d0;
                    i11 = R.color.pingSecondary;
                } else if (!str.contains("--")) {
                    textView = dnsPornBlocker.f3534d0;
                    i10 = dnsPornBlocker.getColor(R.color.pingPrimary);
                    textView.setTextColor(i10);
                    return;
                } else {
                    textView = dnsPornBlocker.f3534d0;
                    i11 = R.color.pingTimeout;
                }
                i10 = dnsPornBlocker.getColor(i11);
                textView.setTextColor(i10);
                return;
            default:
                String str2 = this.f4618t;
                NetworkDevices.a aVar = ((NetworkDevices) this.f4619u).M;
                aVar.f4913c.add(new c(str2));
                aVar.f1943a.d(aVar.f4913c.size() - 1, 1);
                return;
        }
    }
}
