package m4;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class ku0 implements lx<Object> {

    /* renamed from: s */
    public final WeakReference<lu0> f10578s;

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        lu0 lu0Var = this.f10578s.get();
        if (lu0Var == null) {
            return;
        }
        lu0Var.f11006g.zza();
    }
}