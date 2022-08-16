package m4;

import d.a;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f13402a;

    /* renamed from: b */
    public final vd2 f13403b;

    /* renamed from: c */
    public final vd2 f13404c;

    public /* synthetic */ rn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f13402a = i10;
        this.f13403b = vd2Var;
        this.f13404c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f13402a) {
            case 0:
                return new es0((oq0) this.f13403b.a(), (Executor) this.f13404c.a());
            case 1:
                cm1 b10 = ((mm0) this.f13403b).b();
                JSONObject jSONObject = (JSONObject) ((nu0) this.f13404c).f11918a.f14267s;
                a.d(jSONObject);
                return new hv0(b10, jSONObject);
            case 2:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((p01) this.f13403b.a(), t90Var);
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new de1(t90Var2, ((en1) this.f13404c).b());
        }
    }
}
