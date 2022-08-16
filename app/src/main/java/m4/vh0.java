package m4;

import java.util.HashMap;
import java.util.Map;
import n3.i1;

/* loaded from: classes.dex */
public final class vh0 implements th0 {

    /* renamed from: a */
    public final i1 f14692a;

    public vh0(i1 i1Var) {
        this.f14692a = i1Var;
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        this.f14692a.i(Boolean.parseBoolean((String) ((HashMap) map).get("content_url_opted_out")));
    }
}
