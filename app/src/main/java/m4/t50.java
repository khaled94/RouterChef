package m4;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import l3.s;
import m3.g;

/* loaded from: classes.dex */
public final class t50 implements Callable<s50> {

    /* renamed from: a */
    public final /* synthetic */ Context f13924a;

    /* renamed from: b */
    public final /* synthetic */ g f13925b;

    public t50(g gVar, Context context) {
        this.f13925b = gVar;
        this.f13924a = context;
    }

    @Override // java.util.concurrent.Callable
    public final s50 call() {
        s50 s50Var;
        u50 u50Var = (u50) ((WeakHashMap) this.f13925b.f5959s).get(this.f13924a);
        if (u50Var != null) {
            long longValue = dt.f7631a.e().longValue() + u50Var.f14253a;
            Objects.requireNonNull(s.B.f5796j);
            if (longValue >= System.currentTimeMillis()) {
                s50Var = new r50(this.f13924a, u50Var.f14254b).a();
                ((WeakHashMap) this.f13925b.f5959s).put(this.f13924a, new u50(s50Var));
                return s50Var;
            }
        }
        s50Var = new r50(this.f13924a).a();
        ((WeakHashMap) this.f13925b.f5959s).put(this.f13924a, new u50(s50Var));
        return s50Var;
    }
}
