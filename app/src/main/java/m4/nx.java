package m4;

import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class nx implements lx<vd0> {

    /* renamed from: s */
    public final ox f11937s;

    public nx(ox oxVar) {
        this.f11937s = oxVar;
    }

    @Override // m4.lx
    public final void a(vd0 vd0Var, Map map) {
        vd0 vd0Var2 = vd0Var;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            g1.h("Fail to parse float", e10);
        }
        ox oxVar = this.f11937s;
        synchronized (oxVar) {
            oxVar.f12300a = equals;
            oxVar.f12303d.set(true);
        }
        ox oxVar2 = this.f11937s;
        synchronized (oxVar2) {
            oxVar2.f12301b = equals2;
            oxVar2.f12302c = f10;
        }
        vd0Var2.c0(equals);
    }
}
