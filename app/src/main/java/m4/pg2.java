package m4;

import android.os.Handler;

/* loaded from: classes.dex */
public final class pg2 {

    /* renamed from: a */
    public final Handler f12509a;

    /* renamed from: b */
    public final qg2 f12510b;

    public pg2(Handler handler, qg2 qg2Var) {
        this.f12509a = handler;
        this.f12510b = qg2Var;
    }

    public final void a(o02 o02Var) {
        synchronized (o02Var) {
        }
        Handler handler = this.f12509a;
        if (handler != null) {
            handler.post(new mz(this, o02Var, 4));
        }
    }
}
