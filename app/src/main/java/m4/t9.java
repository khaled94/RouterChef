package m4;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.k1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t9 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f13966s;

    /* renamed from: t */
    public final /* synthetic */ Object f13967t;

    public /* synthetic */ t9(Object obj, int i10) {
        this.f13966s = i10;
        this.f13967t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        switch (this.f13966s) {
            case 0:
                u9 u9Var = (u9) this.f13967t;
                try {
                    n8 n8Var = u9Var.f14288a;
                    Class<?> loadClass = n8Var.f11552c.loadClass(u9Var.a(n8Var.f11554e, u9Var.f14289b));
                    if (loadClass != null) {
                        u9Var.f14291d = loadClass.getMethod(u9Var.a(u9Var.f14288a.f11554e, u9Var.f14290c), u9Var.f14292e);
                    }
                } catch (UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException | a8 unused) {
                } catch (Throwable th) {
                    u9Var.f14293f.countDown();
                    throw th;
                }
                u9Var.f14293f.countDown();
                return;
            default:
                z21 z21Var = (z21) this.f13967t;
                he0 he0Var = z21Var.f15985v;
                x21 x21Var = z21Var.f15984u;
                synchronized (x21Var) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("platform", "ANDROID");
                        jSONObject.put("internalSdkVersion", x21Var.f15198f);
                        jSONObject.put("adapters", x21Var.f15196d.a());
                        long j3 = x21Var.f15202j;
                        s sVar = s.B;
                        Objects.requireNonNull(sVar.f5796j);
                        if (j3 < System.currentTimeMillis() / 1000) {
                            x21Var.f15200h = "{}";
                        }
                        jSONObject.put("networkExtras", x21Var.f15200h);
                        jSONObject.put("adSlots", x21Var.e());
                        jSONObject.put("appInfo", x21Var.f15197e.a());
                        String str = ((k1) sVar.f5793g.c()).e().f14602e;
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("cld", new JSONObject(str));
                        }
                        yr<Boolean> yrVar = es.f8117i6;
                        jo joVar = jo.f10145d;
                        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && !TextUtils.isEmpty(x21Var.f15201i)) {
                            String valueOf = String.valueOf(x21Var.f15201i);
                            g1.e(valueOf.length() != 0 ? "Policy violation data: ".concat(valueOf) : new String("Policy violation data: "));
                            jSONObject.put("policyViolations", new JSONObject(x21Var.f15201i));
                        }
                        if (((Boolean) joVar.f10148c.a(es.f8109h6)).booleanValue()) {
                            jSONObject.put("openAction", x21Var.f15207o);
                            jSONObject.put("gesture", x21Var.f15203k);
                        }
                    } catch (JSONException e10) {
                        s.B.f5793g.f(e10, "Inspector.toJson");
                        g1.k("Ad inspector encountered an error", e10);
                    }
                }
                he0Var.f9201s.I0("window.inspectorInfo", jSONObject.toString());
                return;
        }
    }
}
