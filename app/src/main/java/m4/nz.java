package m4;

import android.net.Uri;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class nz implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f11958s;

    /* renamed from: t */
    public final /* synthetic */ Object f11959t;

    /* renamed from: u */
    public final /* synthetic */ Object f11960u;

    public /* synthetic */ nz(Object obj, Object obj2, int i10) {
        this.f11958s = i10;
        this.f11960u = obj;
        this.f11959t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11958s) {
            case 0:
                ((pz) this.f11960u).f12652s.loadData((String) this.f11959t, "text/html", "UTF-8");
                return;
            case 1:
                hh0 hh0Var = ((oe0) this.f11960u).f12125b;
                Uri parse = Uri.parse((String) this.f11959t);
                ce0 ce0Var = ((ke0) ((vd0) hh0Var.f9336s)).E;
                if (ce0Var == null) {
                    g1.g("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    ce0Var.l(parse);
                    return;
                }
            case 2:
                ((bk1) this.f11960u).f6555v.f7014d.d((cn) this.f11959t);
                return;
            default:
                qg2 qg2Var = ((pg2) this.f11960u).f12510b;
                int i10 = ls1.f10971a;
                qg2Var.g((Exception) this.f11959t);
                return;
        }
    }
}
