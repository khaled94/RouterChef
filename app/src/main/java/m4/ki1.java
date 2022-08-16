package m4;

import android.content.Context;
import java.util.Objects;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ki1 implements eh1<dh1<JSONObject>> {

    /* renamed from: a */
    public final JSONObject f10438a;

    public ki1(Context context) {
        this.f10438a = w50.n(context);
    }

    @Override // m4.eh1
    public final tz1<dh1<JSONObject>> a() {
        return mz1.m(new dh1() { // from class: m4.ji1
            @Override // m4.dh1
            public final void h(Object obj) {
                ki1 ki1Var = ki1.this;
                JSONObject jSONObject = (JSONObject) obj;
                Objects.requireNonNull(ki1Var);
                try {
                    jSONObject.put("gms_sdk_env", ki1Var.f10438a);
                } catch (JSONException unused) {
                    g1.a("Failed putting version constants.");
                }
            }
        });
    }
}
