package f8;

import com.raouf.routerchef.Blacklist;
import com.raouf.routerchef.R;
import com.raouf.routerchef.RouterDevices;
import com.raouf.routerchef.resModels.DevicesInfo;
import i8.g;
import j8.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4559s;

    /* renamed from: t */
    public final /* synthetic */ g f4560t;

    /* renamed from: u */
    public final /* synthetic */ Object f4561u;

    public /* synthetic */ b0(g gVar, Object obj, int i10) {
        this.f4559s = i10;
        this.f4560t = gVar;
        this.f4561u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4559s) {
            case 0:
                Blacklist blacklist = (Blacklist) this.f4560t;
                blacklist.f3525c0.setVisibility(0);
                blacklist.f3528f0.setVisibility(8);
                b bVar = new b(blacklist, blacklist);
                bVar.b(((DevicesInfo) this.f4561u).devices, R.drawable.ic_delete);
                bVar.g(true);
                bVar.f();
                return;
            default:
                ((RouterDevices) this.f4560t).f3612b0.i((ArrayList) this.f4561u);
                return;
        }
    }
}
