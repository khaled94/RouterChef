package f8;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.raouf.routerchef.Blacklist;
import com.raouf.routerchef.RouterPage;
import i8.g;
import java.util.ArrayList;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4569s;

    /* renamed from: t */
    public final /* synthetic */ g f4570t;

    /* renamed from: u */
    public final /* synthetic */ Object f4571u;

    public /* synthetic */ c0(g gVar, Object obj, int i10) {
        this.f4569s = i10;
        this.f4570t = gVar;
        this.f4571u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4569s) {
            case 0:
                Blacklist blacklist = (Blacklist) this.f4570t;
                f0 f0Var = new f0(blacklist, blacklist.f3527e0, (ArrayList) this.f4571u);
                blacklist.f3526d0 = f0Var;
                blacklist.f3525c0.setAdapter(f0Var);
                blacklist.f3525c0.setLayoutManager(new LinearLayoutManager(1));
                return;
            default:
                RouterPage routerPage = (RouterPage) this.f4570t;
                int i10 = RouterPage.f3619e0;
                routerPage.P();
                b.q(routerPage, (String) this.f4571u);
                routerPage.f3621b0.setVisibility(0);
                routerPage.f3622c0.setVisibility(0);
                routerPage.f3620a0.setVisibility(8);
                return;
        }
    }
}
