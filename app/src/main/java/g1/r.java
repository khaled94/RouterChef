package g1;

import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.DevicesInfo;
import e9.f;
import i8.p;
import j8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4849s;

    /* renamed from: t */
    public final /* synthetic */ Object f4850t;

    /* renamed from: u */
    public final /* synthetic */ Object f4851u;

    public /* synthetic */ r(Object obj, Object obj2, int i10) {
        this.f4849s = i10;
        this.f4850t = obj;
        this.f4851u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4849s) {
            case 0:
                t tVar = (t) this.f4850t;
                f.e(tVar, "this$0");
                f.e((String) this.f4851u, "$query");
                tVar.f4855s.a();
                return;
            case 1:
                AccessBlocker accessBlocker = (AccessBlocker) this.f4850t;
                accessBlocker.f3493d0.setVisibility(0);
                accessBlocker.f3496g0.setVisibility(8);
                b bVar = new b(accessBlocker, accessBlocker);
                bVar.b(((DevicesInfo) this.f4851u).devices, R.drawable.ic_ban);
                bVar.g(true);
                bVar.f();
                return;
            default:
                ((p) this.f4850t).f5301b.setText((String) this.f4851u);
                return;
        }
    }
}
