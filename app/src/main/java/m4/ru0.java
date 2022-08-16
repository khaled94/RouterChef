package m4;

import java.util.UUID;
import l3.s;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ru0 implements nd2<nh> {

    /* renamed from: a */
    public final vd2<o90> f13437a;

    public ru0(vd2 vd2Var) {
        this.f13437a = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        o90 b10 = ((vf0) this.f13437a).b();
        s1 s1Var = s.B.f5789c;
        return new nh(UUID.randomUUID().toString(), b10, "native", new JSONObject(), true);
    }
}
