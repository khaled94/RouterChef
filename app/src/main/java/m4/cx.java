package m4;

import java.util.Map;
import m3.n;
import n3.g1;

/* loaded from: classes.dex */
public final class cx implements lx<vd0> {
    @Override // m4.lx
    public final /* bridge */ /* synthetic */ void a(vd0 vd0Var, Map map) {
        vd0 vd0Var2 = vd0Var;
        if (vd0Var2.J() != null) {
            vd0Var2.J().zza();
        }
        n V = vd0Var2.V();
        if (V != null) {
            V.a();
            return;
        }
        n e02 = vd0Var2.e0();
        if (e02 != null) {
            e02.a();
        } else {
            g1.j("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
