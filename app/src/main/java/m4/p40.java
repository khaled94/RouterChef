package m4;

import android.os.Bundle;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import t3.j;

/* loaded from: classes.dex */
public final class p40 extends e80 {

    /* renamed from: s */
    public final /* synthetic */ j f12405s;

    public p40(j jVar) {
        this.f12405s = jVar;
    }

    @Override // m4.f80
    public final void K1(String str, String str2, Bundle bundle) {
        String str3;
        j jVar = this.f12405s;
        Objects.requireNonNull(jVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", jVar.f18595a);
            jSONObject.put("signal", str);
            str3 = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str3 = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", jVar.f18595a, str);
        }
        jVar.f18596b.f18567b.evaluateJavascript(str3, null);
    }

    @Override // m4.f80
    public final void z(String str) {
        this.f12405s.a(str);
    }
}
