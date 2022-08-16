package m4;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import d.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.w;

/* loaded from: classes.dex */
public final class nr1 implements yq1 {

    /* renamed from: f */
    public static final nr1 f11899f = new nr1();

    /* renamed from: g */
    public static final Handler f11900g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public static Handler f11901h = null;

    /* renamed from: i */
    public static final jr1 f11902i = new jr1();

    /* renamed from: j */
    public static final kr1 f11903j = new kr1();

    /* renamed from: e */
    public long f11908e;

    /* renamed from: a */
    public final List<mr1> f11904a = new ArrayList();

    /* renamed from: c */
    public final hr1 f11906c = new hr1();

    /* renamed from: b */
    public final s2 f11905b = new s2();

    /* renamed from: d */
    public final w f11907d = new w(new qr1());

    public final void a(View view, zq1 zq1Var, JSONObject jSONObject) {
        Object obj;
        if (fr1.a(view) == null) {
            hr1 hr1Var = this.f11906c;
            boolean z10 = true;
            char c10 = hr1Var.f9429d.contains(view) ? (char) 1 : hr1Var.f9433h ? (char) 2 : (char) 3;
            if (c10 == 3) {
                return;
            }
            JSONObject d5 = zq1Var.d(view);
            er1.b(jSONObject, d5);
            hr1 hr1Var2 = this.f11906c;
            if (hr1Var2.f9426a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hr1Var2.f9426a.get(view);
                if (obj2 != null) {
                    hr1Var2.f9426a.remove(view);
                }
                obj = obj2;
            }
            if (obj != null) {
                try {
                    d5.put("adSessionId", obj);
                } catch (JSONException e10) {
                    c.g("Error with setting ad session id", e10);
                }
                this.f11906c.f9433h = true;
                return;
            }
            hr1 hr1Var3 = this.f11906c;
            gr1 gr1Var = hr1Var3.f9427b.get(view);
            if (gr1Var != null) {
                hr1Var3.f9427b.remove(view);
            }
            if (gr1Var != null) {
                uq1 uq1Var = gr1Var.f9008a;
                JSONArray jSONArray = new JSONArray();
                ArrayList<String> arrayList = gr1Var.f9009b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(arrayList.get(i10));
                }
                try {
                    d5.put("isFriendlyObstructionFor", jSONArray);
                    d5.put("friendlyObstructionClass", uq1Var.f14476b);
                    d5.put("friendlyObstructionPurpose", uq1Var.f14477c);
                    d5.put("friendlyObstructionReason", uq1Var.f14478d);
                } catch (JSONException e11) {
                    c.g("Error with setting friendly obstruction", e11);
                }
            }
            if (c10 != 1) {
                z10 = false;
            }
            zq1Var.c(view, d5, this, z10);
        }
    }

    public final void b() {
        if (f11901h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f11901h = handler;
            handler.post(f11902i);
            f11901h.postDelayed(f11903j, 200L);
        }
    }
}
