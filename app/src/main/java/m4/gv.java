package m4;

import android.content.Context;
import android.os.RemoteException;
import h3.e;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class gv implements e {

    /* renamed from: a */
    public final fv f9053a;

    public gv(fv fvVar) {
        Context context;
        this.f9053a = fvVar;
        try {
            context = (Context) b.e0(fvVar.e());
        } catch (RemoteException | NullPointerException e10) {
            g1.h("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.f9053a.Z(new b(new h3.b(context)));
            } catch (RemoteException e11) {
                g1.h("", e11);
            }
        }
    }
}
