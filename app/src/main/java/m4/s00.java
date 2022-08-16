package m4;

import java.util.Objects;
import java.util.UUID;
import l3.s;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class s00 implements xy1 {

    /* renamed from: a */
    public final /* synthetic */ u00 f13476a;

    /* renamed from: b */
    public final /* synthetic */ Object f13477b;

    public /* synthetic */ s00(u00 u00Var, Object obj) {
        this.f13476a = u00Var;
        this.f13477b = obj;
    }

    @Override // m4.xy1
    public final tz1 h(Object obj) {
        u00 u00Var = this.f13476a;
        Object obj2 = this.f13477b;
        Objects.requireNonNull(u00Var);
        w90 w90Var = new w90();
        s1 s1Var = s.B.f5789c;
        String uuid = UUID.randomUUID().toString();
        kx.f10604j.b(uuid, new t00(w90Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj2);
        ((f00) obj).P0("google.afma.activeView.handleUpdate", jSONObject);
        return w90Var;
    }
}
