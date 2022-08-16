package m4;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pe1 implements dh1<Bundle> {
    @Nullable

    /* renamed from: a */
    public final JSONObject f12491a;
    @Nullable

    /* renamed from: b */
    public final JSONObject f12492b;

    public pe1(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.f12491a = jSONObject;
        this.f12492b = jSONObject2;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject = this.f12491a;
        if (jSONObject != null) {
            bundle2.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f12492b;
        if (jSONObject2 != null) {
            bundle2.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
