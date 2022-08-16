package m4;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class mp1 {

    /* renamed from: a */
    public final String f11271a = ht.f9445b.e();

    public final String a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f11271a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
