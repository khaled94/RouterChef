package m4;

import android.os.RemoteException;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class ly0 implements lx<Object> {

    /* renamed from: s */
    public final nv f11043s;

    /* renamed from: t */
    public final ty0 f11044t;

    /* renamed from: u */
    public final jd2<jy0> f11045u;

    public ly0(lv0 lv0Var, ev0 ev0Var, ty0 ty0Var, jd2<jy0> jd2Var) {
        this.f11043s = lv0Var.a(ev0Var.v());
        this.f11044t = ty0Var;
        this.f11045u = jd2Var;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f11043s.I3(this.f11045u.a(), str);
        } catch (RemoteException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            g1.k(sb.toString(), e10);
        }
    }
}
