package f8;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.NetworkDevices;
import i8.l;
import i8.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4608s;

    /* renamed from: t */
    public final /* synthetic */ Object f4609t;

    /* renamed from: u */
    public final /* synthetic */ Object f4610u;

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f4608s = i10;
        this.f4610u = obj;
        this.f4609t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4608s) {
            case 0:
                AccessBlocker accessBlocker = (AccessBlocker) this.f4610u;
                j jVar = new j(accessBlocker, accessBlocker.f3495f0, (ArrayList) this.f4609t);
                accessBlocker.f3494e0 = jVar;
                accessBlocker.f3493d0.setAdapter(jVar);
                accessBlocker.f3493d0.setLayoutManager(new LinearLayoutManager(1));
                return;
            case 1:
                ((NetworkDevices) this.f4610u).M.i((ArrayList) this.f4609t);
                return;
            default:
                l lVar = (l) this.f4610u;
                String str = (String) this.f4609t;
                if (lVar.f5290a || str == null || !str.split(":")[0].equals("https")) {
                    return;
                }
                m.a(lVar.f5292c);
                return;
        }
    }
}
