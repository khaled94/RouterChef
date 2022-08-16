package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class jx implements lx<vd0> {
    @Override // m4.lx
    public final /* bridge */ /* synthetic */ void a(vd0 vd0Var, Map map) {
        vd0 vd0Var2 = vd0Var;
        if (map.keySet().contains("start")) {
            vd0Var2.F(true);
        }
        if (map.keySet().contains("stop")) {
            vd0Var2.F(false);
        }
    }
}
