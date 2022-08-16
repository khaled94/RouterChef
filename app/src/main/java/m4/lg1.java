package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import k4.b;
import n3.g1;
import org.json.JSONObject;
import u1.a;

/* loaded from: classes.dex */
public final class lg1 implements eh1<mg1> {

    /* renamed from: a */
    public final uz1 f10827a;

    /* renamed from: b */
    public final ScheduledExecutorService f10828b;

    /* renamed from: c */
    public final zb1 f10829c;

    /* renamed from: d */
    public final Context f10830d;

    /* renamed from: e */
    public final om1 f10831e;

    /* renamed from: f */
    public final yb1 f10832f;

    /* renamed from: g */
    public final h01 f10833g;

    /* renamed from: h */
    public final String f10834h;

    public lg1(uz1 uz1Var, ScheduledExecutorService scheduledExecutorService, String str, zb1 zb1Var, Context context, om1 om1Var, yb1 yb1Var, h01 h01Var) {
        this.f10827a = uz1Var;
        this.f10828b = scheduledExecutorService;
        this.f10834h = str;
        this.f10829c = zb1Var;
        this.f10830d = context;
        this.f10831e = om1Var;
        this.f10832f = yb1Var;
        this.f10833g = h01Var;
    }

    @Override // m4.eh1
    public final tz1<mg1> a() {
        return mz1.n(new a(this), this.f10827a);
    }

    public final tz1<JSONObject> b(String str, List<Bundle> list, Bundle bundle, boolean z10, boolean z11) {
        w90 w90Var = new w90();
        u20 u20Var = null;
        if (z11) {
            yb1 yb1Var = this.f10832f;
            Objects.requireNonNull(yb1Var);
            try {
                yb1Var.f15649a.put(str, yb1Var.f15650b.a(str));
            } catch (RemoteException e10) {
                g1.h("Couldn't create RTB adapter : ", e10);
            }
            yb1 yb1Var2 = this.f10832f;
            if (yb1Var2.f15649a.containsKey(str)) {
                u20Var = yb1Var2.f15649a.get(str);
            }
        } else {
            try {
                u20Var = this.f10833g.a(str);
            } catch (RemoteException e11) {
                g1.h("Couldn't create RTB adapter : ", e11);
            }
        }
        u20 u20Var2 = u20Var;
        Objects.requireNonNull(u20Var2);
        bc1 bc1Var = new bc1(str, u20Var2, w90Var);
        if (z10) {
            u20Var2.i1(new b(this.f10830d), this.f10834h, bundle, list.get(0), this.f10831e.f12204e, bc1Var);
        } else {
            synchronized (bc1Var) {
                if (!bc1Var.f6450v) {
                    bc1Var.f6448t.a(bc1Var.f6449u);
                    bc1Var.f6450v = true;
                }
            }
        }
        return w90Var;
    }
}
