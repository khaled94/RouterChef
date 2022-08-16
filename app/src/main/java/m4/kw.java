package m4;

import android.os.Bundle;
import java.util.Map;
import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kw implements lx<Object> {

    /* renamed from: s */
    public final lw f10588s;

    public kw(lw lwVar) {
        this.f10588s = lwVar;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        if (this.f10588s == null) {
            return;
        }
        String str = map.get("name");
        if (str == null) {
            g1.i("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = s0.a(new JSONObject(map.get("info")));
            } catch (JSONException e10) {
                g1.h("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundle == null) {
            g1.g("Failed to convert ad metadata to Bundle.");
        } else {
            this.f10588s.u(str, bundle);
        }
    }
}
