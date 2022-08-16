package n6;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.raouf.routerchef.RouterDevices;
import f8.b2;
import java.util.ArrayList;
import java.util.Map;
import l7.a;
import l7.b;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16652s;

    /* renamed from: t */
    public final /* synthetic */ Object f16653t;

    /* renamed from: u */
    public final /* synthetic */ Object f16654u;

    public /* synthetic */ q(Object obj, Object obj2, int i10) {
        this.f16652s = i10;
        this.f16653t = obj;
        this.f16654u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16652s) {
            case 0:
                ((b) ((Map.Entry) this.f16653t).getKey()).a((a) this.f16654u);
                return;
            default:
                RouterDevices routerDevices = (RouterDevices) this.f16653t;
                b2 b2Var = new b2(routerDevices, routerDevices.f3614d0, (ArrayList) this.f16654u);
                routerDevices.f3612b0 = b2Var;
                routerDevices.f3611a0.setAdapter(b2Var);
                routerDevices.f3611a0.setLayoutManager(new LinearLayoutManager(1));
                return;
        }
    }
}
