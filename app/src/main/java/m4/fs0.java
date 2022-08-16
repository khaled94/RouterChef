package m4;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import n3.x0;

/* loaded from: classes.dex */
public final class fs0 extends br0<rh> implements rh {
    @GuardedBy("this")

    /* renamed from: t */
    public final Map<View, sh> f8628t = new WeakHashMap(1);

    /* renamed from: u */
    public final Context f8629u;

    /* renamed from: v */
    public final cm1 f8630v;

    public fs0(Context context, Set<es0<rh>> set, cm1 cm1Var) {
        super(set);
        this.f8629u = context;
        this.f8630v = cm1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m4.sh>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<android.view.View, m4.sh>, java.util.WeakHashMap] */
    public final synchronized void O0(View view) {
        sh shVar = (sh) this.f8628t.get(view);
        if (shVar == null) {
            shVar = new sh(this.f8629u, view);
            shVar.b(this);
            this.f8628t.put(view, shVar);
        }
        if (this.f8630v.U) {
            yr<Boolean> yrVar = es.S0;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                long longValue = ((Long) joVar.f10148c.a(es.R0)).longValue();
                x0 x0Var = shVar.A;
                synchronized (x0Var.f16596c) {
                    x0Var.f16594a = longValue;
                }
                return;
            }
        }
        x0 x0Var2 = shVar.A;
        long j3 = sh.G;
        synchronized (x0Var2.f16596c) {
            x0Var2.f16594a = j3;
        }
    }

    @Override // m4.rh
    public final synchronized void x(qh qhVar) {
        M0(new rb1(qhVar, 2));
    }
}
