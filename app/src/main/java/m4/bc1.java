package m4;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bc1 extends w20 {

    /* renamed from: s */
    public final u20 f6447s;

    /* renamed from: t */
    public final w90<JSONObject> f6448t;

    /* renamed from: u */
    public final JSONObject f6449u;
    @GuardedBy("this")

    /* renamed from: v */
    public boolean f6450v = false;

    public bc1(String str, u20 u20Var, w90<JSONObject> w90Var) {
        JSONObject jSONObject = new JSONObject();
        this.f6449u = jSONObject;
        this.f6448t = w90Var;
        this.f6447s = u20Var;
        try {
            jSONObject.put("adapter_version", u20Var.d().toString());
            jSONObject.put("sdk_version", u20Var.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public final synchronized void O(String str) {
        if (this.f6450v) {
            return;
        }
        try {
            this.f6449u.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f6448t.a(this.f6449u);
        this.f6450v = true;
    }
}
