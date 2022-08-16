package m4;

import a6.f;
import android.os.RemoteException;
import java.util.Collections;
import n3.g1;
import n3.s;
import n3.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class gr implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9004s;

    /* renamed from: t */
    public final /* synthetic */ Object f9005t;

    public /* synthetic */ gr(Object obj, int i10) {
        this.f9004s = i10;
        this.f9005t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9004s) {
            case 0:
                xy xyVar = ((hr) this.f9005t).f9423s;
                if (xyVar == null) {
                    return;
                }
                try {
                    xyVar.N1(Collections.emptyList());
                    return;
                } catch (RemoteException e10) {
                    g1.k("Could not notify onComplete event.", e10);
                    return;
                }
            case 1:
                oa0 oa0Var = ((na0) this.f9005t).H;
                if (oa0Var == null) {
                    return;
                }
                ta0 ta0Var = (ta0) oa0Var;
                ta0Var.f13973w.b();
                s1.f16555i.post(new s(ta0Var, 2));
                return;
            default:
                ((ck1) this.f9005t).f7014d.d(f.n(6, null, null));
                return;
        }
    }
}
