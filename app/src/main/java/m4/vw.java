package m4;

import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class vw implements lx {

    /* renamed from: s */
    public static final /* synthetic */ vw f14792s = new vw();

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        ue0 ue0Var = (ue0) obj;
        lx<vd0> lxVar = kx.f10595a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            w7 G = ue0Var.G();
            if (G == null) {
                return;
            }
            G.f14875b.d(parseInt, parseInt2, parseInt3);
        } catch (NumberFormatException unused) {
            g1.j("Could not parse touch parameters from gmsg.");
        }
    }
}
