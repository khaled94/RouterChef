package m4;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class gi0 implements th0 {

    /* renamed from: a */
    public final bm1 f8939a;

    public gi0(bm1 bm1Var) {
        this.f8939a = bm1Var;
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        String str = (String) ((HashMap) map).get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                bm1 bm1Var = this.f8939a;
                if (Boolean.parseBoolean(str)) {
                    bm1Var.b(1, 2);
                } else {
                    bm1Var.b(2, 1);
                }
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
