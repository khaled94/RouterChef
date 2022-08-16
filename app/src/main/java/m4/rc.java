package m4;

import a7.e;
import androidx.lifecycle.h0;
import e9.d;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rc implements ze0, cl1, v91 {

    /* renamed from: s */
    public final Object f13244s;

    public /* synthetic */ rc(Object obj) {
        this.f13244s = obj;
    }

    public /* synthetic */ rc(fg2 fg2Var) {
        this.f13244s = fg2Var;
    }

    public final e a(JSONObject jSONObject) {
        return (jSONObject.getInt("settings_version") != 3 ? new d() : new h0()).a((j0.d) this.f13244s, jSONObject);
    }

    @Override // m4.cl1
    public final eo0 b(bl1 bl1Var) {
        return ((wl1) this.f13244s).b(bl1Var);
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }

    @Override // m4.ze0, m4.tc1
    /* renamed from: zza */
    public final void mo22zza() {
        rz rzVar = (rz) this.f13244s;
        s1.f16555i.postDelayed(new v3((e00) rzVar.f13467s, (d00) rzVar.f13468t, (lz) rzVar.f13469u, 1), 10000L);
    }

    public /* synthetic */ rc(Object obj, Object obj2) {
        this.f13244s = obj;
    }
}
