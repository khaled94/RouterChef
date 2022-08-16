package l3;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;
import m4.mz1;
import m4.tz1;
import m4.v80;
import m4.xy1;
import n3.k1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements xy1 {

    /* renamed from: a */
    public static final /* synthetic */ d f5749a = new d();

    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    @Override // m4.xy1
    public final tz1 h(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            String string = jSONObject.getString("appSettingsJson");
            s sVar = s.B;
            k1 k1Var = (k1) sVar.f5793g.c();
            k1Var.u();
            synchronized (k1Var.f16496a) {
                Objects.requireNonNull(sVar.f5796j);
                long currentTimeMillis = System.currentTimeMillis();
                if (string != null && !string.equals(k1Var.f16507l.f14602e)) {
                    k1Var.f16507l = new v80(string, currentTimeMillis);
                    SharedPreferences.Editor editor = k1Var.f16502g;
                    if (editor != null) {
                        editor.putString("app_settings_json", string);
                        k1Var.f16502g.putLong("app_settings_last_update_ms", currentTimeMillis);
                        k1Var.f16502g.apply();
                    }
                    k1Var.v();
                    Iterator it = k1Var.f16498c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                k1Var.f16507l.f14603f = currentTimeMillis;
            }
        }
        return mz1.m(null);
    }
}
