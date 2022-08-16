package m4;

import d.a;
import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ij0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9668a;

    /* renamed from: b */
    public final vd2 f9669b;

    /* renamed from: c */
    public final vd2 f9670c;

    /* renamed from: d */
    public final vd2 f9671d;

    public /* synthetic */ ij0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f9668a = i10;
        this.f9669b = vd2Var;
        this.f9670c = vd2Var2;
        this.f9671d = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9668a) {
            case 0:
                dj0 dj0Var = (dj0) this.f9669b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set emptySet = ((JSONObject) this.f9671d.a()) == null ? Collections.emptySet() : Collections.singleton(new es0(dj0Var, t90Var));
                a.d(emptySet);
                return emptySet;
            case 1:
                return new tl0(((mm0) this.f9669b).b(), (cp0) this.f9670c.a(), (sp0) this.f9671d.a());
            default:
                return new ky0(((nm0) this.f9669b).f11838a.f10938c, (av0) this.f9670c.a(), ((ov0) this.f9671d).b());
        }
    }
}
