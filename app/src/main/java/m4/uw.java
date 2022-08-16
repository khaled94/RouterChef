package m4;

import java.util.Map;
import n3.g1;
import n3.w0;

/* loaded from: classes.dex */
public final /* synthetic */ class uw implements lx {

    /* renamed from: s */
    public static final /* synthetic */ uw f14517s = new uw();

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        pe0 pe0Var = (pe0) obj;
        lx<vd0> lxVar = kx.f10595a;
        String str = (String) map.get("u");
        if (str == null) {
            g1.j("URL missing from httpTrack GMSG.");
        } else {
            new w0(pe0Var.getContext(), ((ve0) pe0Var).m().f12051s, str).b();
        }
    }
}
