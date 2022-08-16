package m4;

import l3.s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f11218a;

    /* renamed from: b */
    public final Object f11219b;

    public /* synthetic */ mj0(Object obj, int i10) {
        this.f11218a = i10;
        this.f11219b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f11218a) {
            case 0:
                try {
                    return new JSONObject(((mm0) ((vd2) this.f11219b)).b().A);
                } catch (JSONException unused) {
                    return null;
                }
            case 1:
                return new gp0(((td2) ((vd2) this.f11219b)).a());
            default:
                return s.B.f5809x;
        }
    }
}
