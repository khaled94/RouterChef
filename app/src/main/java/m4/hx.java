package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class hx implements lx<vd0> {
    @Override // m4.lx
    public final /* bridge */ /* synthetic */ void a(vd0 vd0Var, Map map) {
        vd0 vd0Var2 = vd0Var;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            vd0Var2.M0();
        } else if (!"resume".equals(str)) {
        } else {
            vd0Var2.g();
        }
    }
}
