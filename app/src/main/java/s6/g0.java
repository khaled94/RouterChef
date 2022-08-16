package s6;

import e0.d;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final File f18261a;

    static {
        Charset.forName("UTF-8");
    }

    public g0(File file) {
        this.f18261a = file;
    }

    public static Map<String, String> b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public final File a(String str) {
        return new File(this.f18261a, d.a(str, "keys", ".meta"));
    }
}
