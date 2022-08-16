package y4;

import android.os.Bundle;
import h4.c;
import java.util.Objects;
import n3.y0;

/* loaded from: classes.dex */
public final class y5 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f20826s;

    /* renamed from: t */
    public final /* synthetic */ Bundle f20827t;

    /* renamed from: u */
    public final /* synthetic */ y0 f20828u;

    public y5(y0 y0Var, String str, Bundle bundle) {
        this.f20828u = y0Var;
        this.f20826s = str;
        this.f20827t = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h6 Q = ((a6) this.f20828u.f16602t).Q();
        String str = this.f20826s;
        Bundle bundle = this.f20827t;
        Objects.requireNonNull((c) ((a6) this.f20828u.f16602t).c());
        p t02 = Q.t0(str, "_err", bundle, "auto", System.currentTimeMillis(), false);
        Objects.requireNonNull(t02, "null reference");
        ((a6) this.f20828u.f16602t).h(t02, this.f20826s);
    }
}
