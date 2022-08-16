package m4;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class fd1 implements dh1 {

    /* renamed from: a */
    public final /* synthetic */ int f8427a;

    /* renamed from: b */
    public final Object f8428b;

    public /* synthetic */ fd1(Object obj, int i10) {
        this.f8427a = i10;
        this.f8428b = obj;
    }

    @Override // m4.dh1
    public final void h(Object obj) {
        switch (this.f8427a) {
            case 0:
                ((Bundle) obj).putString("ms", (String) this.f8428b);
                return;
            case 1:
                Bundle bundle = (Bundle) obj;
                if (TextUtils.isEmpty((String) this.f8428b)) {
                    return;
                }
                bundle.putString("query_info", (String) this.f8428b);
                return;
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f8428b));
                    return;
                } catch (JSONException unused) {
                    g1.a("Failed putting experiment ids.");
                    return;
                }
        }
    }
}
