package m4;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yi0 {

    /* renamed from: a */
    public final String f15788a;

    /* renamed from: b */
    public final r00 f15789b;

    /* renamed from: c */
    public final Executor f15790c;

    /* renamed from: d */
    public dj0 f15791d;

    /* renamed from: e */
    public final lx<Object> f15792e = new vi0(this);

    /* renamed from: f */
    public final lx<Object> f15793f = new wi0(this);

    public yi0(String str, r00 r00Var, Executor executor) {
        this.f15788a = str;
        this.f15789b = r00Var;
        this.f15790c = executor;
    }

    public static /* bridge */ /* synthetic */ boolean b(yi0 yi0Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(yi0Var.f15788a);
    }

    public final void a(dj0 dj0Var) {
        r00 r00Var = this.f15789b;
        lx<Object> lxVar = this.f15792e;
        r00Var.a();
        tz1<f00> tz1Var = r00Var.f13084b;
        q00 q00Var = new q00("/updateActiveView", lxVar);
        t90 t90Var = u90.f14299f;
        r00Var.f13084b = mz1.p(tz1Var, q00Var, t90Var);
        r00 r00Var2 = this.f15789b;
        lx<Object> lxVar2 = this.f15793f;
        r00Var2.a();
        r00Var2.f13084b = mz1.p(r00Var2.f13084b, new q00("/untrackActiveViewUnit", lxVar2), t90Var);
        this.f15791d = dj0Var;
    }
}
