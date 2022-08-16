package m4;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class mi0 implements th0 {

    /* renamed from: a */
    public final x21 f11212a;

    public mi0(x21 x21Var) {
        this.f11212a = x21Var;
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        String str = (String) ((HashMap) map).get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11212a.c(str.equals("true"));
    }
}
