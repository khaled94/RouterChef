package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class ix implements lx<vd0> {
    @Override // m4.lx
    public final void a(vd0 vd0Var, Map map) {
        ce0 ce0Var;
        vd0 vd0Var2 = vd0Var;
        if (map.keySet().contains("start")) {
            ce0 ce0Var2 = (ce0) vd0Var2.q0();
            synchronized (ce0Var2.f6795v) {
            }
            ce0Var2.Q++;
            ce0Var2.j();
        } else if (map.keySet().contains("stop")) {
            ce0Var.Q--;
            ((ce0) vd0Var2.q0()).j();
        } else if (!map.keySet().contains("cancel")) {
        } else {
            ce0 ce0Var3 = (ce0) vd0Var2.q0();
            wj wjVar = ce0Var3.f6793t;
            if (wjVar != null) {
                wjVar.b(10005);
            }
            ce0Var3.P = true;
            ce0Var3.j();
            ce0Var3.f6792s.destroy();
        }
    }
}
