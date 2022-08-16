package m4;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class sy0<T> implements lx<Object> {

    /* renamed from: s */
    public final WeakReference<T> f13840s;

    /* renamed from: t */
    public final String f13841t;

    /* renamed from: u */
    public final lx<T> f13842u;

    /* renamed from: v */
    public final /* synthetic */ ty0 f13843v;

    public /* synthetic */ sy0(ty0 ty0Var, WeakReference weakReference, String str, lx lxVar) {
        this.f13843v = ty0Var;
        this.f13840s = weakReference;
        this.f13841t = str;
        this.f13842u = lxVar;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        T t10 = this.f13840s.get();
        if (t10 == null) {
            this.f13843v.e(this.f13841t, this);
        } else {
            this.f13842u.a(t10, map);
        }
    }
}
