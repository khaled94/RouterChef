package m4;

import android.os.Bundle;
import java.util.Map;
import l3.s;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pd1 implements dh1 {

    /* renamed from: a */
    public final /* synthetic */ int f12486a = 0;

    /* renamed from: b */
    public final Object f12487b;

    @Override // m4.dh1
    public final void h(Object obj) {
        switch (this.f12486a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Bundle) this.f12487b).isEmpty()) {
                    return;
                }
                bundle.putBundle("installed_adapter_data", (Bundle) this.f12487b);
                return;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", s.B.f5789c.F((Map) this.f12487b));
                    return;
                } catch (JSONException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    g1.a(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
                    return;
                }
        }
    }

    public pd1(Map map) {
        this.f12487b = map;
    }
}
