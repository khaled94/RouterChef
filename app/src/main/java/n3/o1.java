package n3;

import android.content.Context;
import l3.s;
import m4.f90;
import m4.vd0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o1 implements f90 {

    /* renamed from: s */
    public final String f16543s;

    /* renamed from: t */
    public final Object f16544t;

    public /* synthetic */ o1(Context context, String str) {
        this.f16544t = context;
        this.f16543s = str;
    }

    public /* synthetic */ o1(vd0 vd0Var, String str) {
        this.f16544t = vd0Var;
        this.f16543s = str;
    }

    @Override // m4.f90
    public final void b(String str) {
        s1 s1Var = s.B.f5789c;
        s1.m((Context) this.f16544t, this.f16543s, str);
    }

    public final void c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f16543s);
            vd0 vd0Var = (vd0) this.f16544t;
            if (vd0Var == null) {
                return;
            }
            vd0Var.l("onError", put);
        } catch (JSONException e10) {
            g1.h("Error occurred while dispatching error event.", e10);
        }
    }

    public final void d(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            ((vd0) this.f16544t).l("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            g1.h("Error occurred while obtaining screen information.", e10);
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        try {
            ((vd0) this.f16544t).l("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            g1.h("Error occurred while dispatching size change.", e10);
        }
    }

    public final void f(String str) {
        try {
            ((vd0) this.f16544t).l("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            g1.h("Error occurred while dispatching state change.", e10);
        }
    }
}
