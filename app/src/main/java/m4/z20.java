package m4;

import android.os.RemoteException;
import f3.a;
import n3.g1;
import o2.g;
import p3.d;

/* loaded from: classes.dex */
public final class z20 implements d<g, Object> {

    /* renamed from: s */
    public final /* synthetic */ o20 f15980s;

    /* renamed from: t */
    public final /* synthetic */ l10 f15981t;

    public z20(o20 o20Var, l10 l10Var) {
        this.f15980s = o20Var;
        this.f15981t = l10Var;
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            this.f15980s.t(aVar.a());
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }
}
