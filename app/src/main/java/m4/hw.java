package m4;

import android.os.RemoteException;
import d4.m;
import h3.e;
import java.util.Objects;
import n3.g1;
import o2.k;

/* loaded from: classes.dex */
public final class hw extends pv {

    /* renamed from: s */
    public final /* synthetic */ iw f9462s;

    public /* synthetic */ hw(iw iwVar) {
        this.f9462s = iwVar;
    }

    @Override // m4.qv
    public final void L1(fv fvVar) {
        gv gvVar;
        String str;
        iw iwVar = this.f9462s;
        e.b bVar = iwVar.f9755a;
        synchronized (iwVar) {
            gvVar = iwVar.f9757c;
            if (gvVar == null) {
                gvVar = new gv(fvVar);
                iwVar.f9757c = gvVar;
            }
        }
        b20 b20Var = (b20) ((k) bVar).f16757t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        try {
            str = gvVar.f9053a.f();
        } catch (RemoteException e10) {
            g1.h("", e10);
            str = null;
        }
        String valueOf = String.valueOf(str);
        g1.e(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        b20Var.f6343c = gvVar;
        try {
            b20Var.f6341a.k();
        } catch (RemoteException e11) {
            g1.l("#007 Could not call remote method.", e11);
        }
    }
}
