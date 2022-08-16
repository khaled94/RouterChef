package m4;

import androidx.lifecycle.q;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class pw implements lx {

    /* renamed from: s */
    public final /* synthetic */ js0 f12635s;

    public /* synthetic */ pw(js0 js0Var) {
        this.f12635s = js0Var;
    }

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        vd0 vd0Var = (vd0) obj;
        kx.b(map, this.f12635s);
        String str = (String) map.get("u");
        if (str == null) {
            g1.j("URL missing from click GMSG.");
        } else {
            mz1.t(kx.a(vd0Var, str), new q(vd0Var, 1), u90.f14294a);
        }
    }
}
