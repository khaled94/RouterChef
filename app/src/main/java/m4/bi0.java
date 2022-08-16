package m4;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bi0 implements th0 {

    /* renamed from: a */
    public final x21 f6542a;

    public bi0(x21 x21Var) {
        this.f6542a = x21Var;
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8117i6)).booleanValue()) {
            return;
        }
        String str = (String) ((HashMap) map).get("policy_violations");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        x21 x21Var = this.f6542a;
        synchronized (x21Var) {
            x21Var.f15201i = str;
        }
    }
}
