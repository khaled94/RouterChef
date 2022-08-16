package m4;

import d.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class en0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8014a;

    /* renamed from: b */
    public final vd2 f8015b;

    /* renamed from: c */
    public final Object f8016c;

    public en0(u8 u8Var, vd2 vd2Var) {
        this.f8014a = 2;
        this.f8016c = u8Var;
        this.f8015b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f8014a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((ti0) this.f8015b.a(), t90Var);
            case 1:
                return new kw0((yz0) this.f8015b.a(), ((qu0) ((vd2) this.f8016c)).b());
            default:
                hv0 hv0Var = (hv0) ((ou0) this.f8015b).a();
                JSONObject jSONObject = hv0Var.f9456b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(hv0Var.f9753a.A);
                } catch (JSONException unused) {
                    return null;
                }
        }
    }

    public /* synthetic */ en0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f8014a = i10;
        this.f8015b = vd2Var;
        this.f8016c = vd2Var2;
    }
}
