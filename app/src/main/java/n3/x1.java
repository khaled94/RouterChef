package n3;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import l3.s;

@TargetApi(21)
/* loaded from: classes.dex */
public class x1 extends w1 {
    public final CookieManager f(Context context) {
        if (e.d()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            g1.h("Failed to obtain CookieManager.", th);
            s.B.f5793g.g(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }
}
