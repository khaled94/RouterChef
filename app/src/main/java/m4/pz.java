package m4;

import android.content.Context;
import android.view.View;
import d.a;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.s1;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class pz implements lz, kz {

    /* renamed from: s */
    public final he0 f12652s;

    public pz(Context context, o90 o90Var) {
        ge0 ge0Var = s.B.f5790d;
        vd0 a10 = ge0.a(context, cf0.a(), "", false, false, null, null, o90Var, null, null, new wj(), null, null);
        this.f12652s = (he0) a10;
        ((View) a10).setWillNotDraw(true);
    }

    public static final void g(Runnable runnable) {
        g90 g90Var = io.f9708f.f9709a;
        if (g90.g()) {
            runnable.run();
        } else {
            s1.f16555i.post(runnable);
        }
    }

    @Override // m4.qz
    public final /* synthetic */ void I0(String str, String str2) {
        a.h(this, str, str2);
    }

    @Override // m4.qz
    public final void P0(String str, JSONObject jSONObject) {
        a.h(this, str, jSONObject.toString());
    }

    @Override // m4.jz
    public final void a(String str, Map map) {
        try {
            a.f(this, str, s.B.f5789c.F(map));
        } catch (JSONException unused) {
            g1.j("Could not convert parameters to JSON.");
        }
    }

    @Override // m4.qz
    public final void b(String str) {
        g(new mz(this, str, 0));
    }

    @Override // m4.lz
    public final void c() {
        this.f12652s.destroy();
    }

    @Override // m4.lz
    public final boolean h() {
        return this.f12652s.j0();
    }

    @Override // m4.lz
    public final g00 i() {
        return new g00(this);
    }

    @Override // m4.jz
    public final /* synthetic */ void l(String str, JSONObject jSONObject) {
        a.f(this, str, jSONObject);
    }

    @Override // m4.f00
    public final void l0(String str, lx<? super f00> lxVar) {
        this.f12652s.D0(str, new oz(this, lxVar));
    }

    @Override // m4.f00
    public final void v0(String str, lx<? super f00> lxVar) {
        this.f12652s.M(str, new fk0(lxVar, 3));
    }
}
