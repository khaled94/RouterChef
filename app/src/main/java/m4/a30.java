package m4;

import android.os.RemoteException;
import f3.a;
import n3.g1;
import p3.d;

/* loaded from: classes.dex */
public final class a30 implements d<Object, Object> {

    /* renamed from: s */
    public final /* synthetic */ r20 f6032s;

    /* renamed from: t */
    public final /* synthetic */ l10 f6033t;

    public a30(r20 r20Var, l10 l10Var) {
        this.f6032s = r20Var;
        this.f6033t = l10Var;
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            this.f6032s.t(aVar.a());
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }
}
