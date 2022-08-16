package m4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u8 implements ye0 {

    /* renamed from: s */
    public final Object f14267s;

    /* renamed from: t */
    public final Object f14268t;

    public /* synthetic */ u8(Object obj, Object obj2) {
        this.f14267s = obj;
        this.f14268t = obj2;
    }

    @Override // m4.ye0
    public final void J(boolean z10) {
        kw0 kw0Var = (kw0) this.f14267s;
        Objects.requireNonNull(kw0Var);
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) ((Map) this.f14268t).get("id"));
        kw0Var.f10590b.b(hashMap);
    }
}
