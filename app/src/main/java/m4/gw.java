package m4;

import android.os.RemoteException;
import h3.e;
import java.util.Objects;
import n3.g1;
import o2.k;

/* loaded from: classes.dex */
public final class gw extends mv {

    /* renamed from: s */
    public final /* synthetic */ iw f9056s;

    public /* synthetic */ gw(iw iwVar) {
        this.f9056s = iwVar;
    }

    @Override // m4.nv
    public final void I3(fv fvVar, String str) {
        gv gvVar;
        iw iwVar = this.f9056s;
        e.a aVar = iwVar.f9756b;
        if (aVar == null) {
            return;
        }
        synchronized (iwVar) {
            gvVar = iwVar.f9757c;
            if (gvVar == null) {
                gvVar = new gv(fvVar);
                iwVar.f9757c = gvVar;
            }
        }
        b20 b20Var = (b20) ((k) aVar).f16757t;
        Objects.requireNonNull(b20Var);
        try {
            b20Var.f6341a.W2(gvVar.f9053a, str);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
