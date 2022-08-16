package m4;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class hu0 implements lx<Object> {

    /* renamed from: s */
    public final WeakReference<lu0> f9451s;

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        lu0 lu0Var = this.f9451s.get();
        if (lu0Var != null && "_ac".equals(map.get("eventName"))) {
            lu0Var.f11007h.N();
            if (!((Boolean) jo.f10145d.f10148c.a(es.C6)).booleanValue()) {
                return;
            }
            lu0Var.f11008i.B0();
        }
    }
}
