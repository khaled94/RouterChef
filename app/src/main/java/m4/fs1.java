package m4;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class fs1 {

    /* renamed from: a */
    public final Context f8631a;

    /* renamed from: b */
    public final Looper f8632b;

    public fs1(Context context, Looper looper) {
        this.f8631a = context;
        this.f8632b = looper;
    }

    public final void a(String str) {
        qs1 v10 = ss1.v();
        String packageName = this.f8631a.getPackageName();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ss1.x((ss1) v10.f9883t, packageName);
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ss1.z((ss1) v10.f9883t);
        os1 v11 = ps1.v();
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ps1.x((ps1) v11.f9883t, str);
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ps1.y((ps1) v11.f9883t);
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ss1.y((ss1) v10.f9883t, v11.k());
        gs1 gs1Var = new gs1(this.f8631a, this.f8632b, v10.k());
        synchronized (gs1Var.f9025c) {
            if (!gs1Var.f9026d) {
                gs1Var.f9026d = true;
                gs1Var.f9023a.n();
            }
        }
    }
}
