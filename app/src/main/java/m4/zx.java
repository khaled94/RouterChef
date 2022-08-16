package m4;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zx implements lx<Object> {

    /* renamed from: s */
    public final Object f16342s = new Object();
    @GuardedBy("lock")

    /* renamed from: t */
    public final Map<String, yx> f16343t = new HashMap();

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.String, m4.yx>, java.util.HashMap] */
    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f16342s) {
            yx yxVar = (yx) this.f16343t.remove(str2);
            if (yxVar == null) {
                String valueOf2 = String.valueOf(str2);
                g1.j(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                yxVar.b(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                yxVar.c(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (g1.c()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        g1.a(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    yxVar.c(jSONObject);
                } catch (JSONException e10) {
                    yxVar.b(e10.getMessage());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, m4.yx>, java.util.HashMap] */
    public final void b(String str, yx yxVar) {
        synchronized (this.f16342s) {
            this.f16343t.put(str, yxVar);
        }
    }
}
