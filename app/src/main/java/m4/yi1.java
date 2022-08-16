package m4;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class yi1 implements dh1 {

    /* renamed from: a */
    public static final /* synthetic */ yi1 f15794a = new yi1();

    @Override // m4.dh1
    public final void h(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
        } catch (JSONException unused) {
        }
    }
}
